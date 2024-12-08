class Solution {
    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        List<List<Integer>> newEvents = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> eventStr = new ArrayList<>();
            List<Integer> eventEnd = new ArrayList<>();
            eventStr.add(events[i][0]);
            eventStr.add(-1);
            eventStr.add(events[i][2]);

            eventEnd.add(events[i][1] + 1);
            eventEnd.add(1);
            eventEnd.add(events[i][2]);

            newEvents.add(eventStr);
            newEvents.add(eventEnd);
        }

        int[][] stops = new int[newEvents.size()][3]; 
        for (int i = 0; i < newEvents.size(); i++) {
            List<Integer> row = newEvents.get(i);
            stops[i] = row.stream().mapToInt(Integer::intValue).toArray();
        }

        // Arrays.sort(stops, (a, b) -> Integer.compare(a[0], b[0])); // WRONG if times ties
        Arrays.sort(stops, (a, b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        
        int maxVal = 0;
        int maxSeen = 0;
        for(int i = 0; i < stops.length; i++){
            int status = stops[i][1]; 
            if(status == -1){
                int val = maxSeen + stops[i][2];
                maxVal = Math.max(val, maxVal);
            }else{
                maxSeen = Math.max(stops[i][2], maxSeen);
            }
        }
        return maxVal;
    }
}