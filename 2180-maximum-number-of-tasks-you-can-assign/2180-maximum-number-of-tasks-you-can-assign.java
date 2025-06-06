class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);

        int left = 0, right = Math.min(tasks.length, workers.length);
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canAssign(tasks, workers, pills, strength, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    private boolean canAssign(int[] tasks, int[] workers, int pills, int strength, int k) {
        Deque<Integer> taskDeque = new ArrayDeque<>();
        for(int i = k - 1; i >= 0; i--) taskDeque.addFirst(tasks[i]);

        TreeMap<Integer, Integer> workerMap = new TreeMap<>();
        for(int i = workers.length - k; i < workers.length; i++){
            workerMap.put(workers[i], workerMap.getOrDefault(workers[i], 0) + 1);
        }

        int remainingPills = pills;

        while(!taskDeque.isEmpty()){
            int task = taskDeque.pollLast();

            Integer worker = workerMap.ceilingKey(task);
            if(worker != null){
                removeWorker(workerMap, worker);
                continue;
            }

            if (remainingPills == 0) return false;
            worker = workerMap.ceilingKey(task - strength);
            if (worker == null) return false;

            removeWorker(workerMap, worker);
            remainingPills--;
        }
        return true;
    }
    private void removeWorker(TreeMap<Integer, Integer> map, int key) {
        if (map.get(key) == 1) {
            map.remove(key);
        } else {
            map.put(key, map.get(key) - 1);
        }
    }
}