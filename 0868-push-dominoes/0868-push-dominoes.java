class Solution {
    public String pushDominoes(String dominoes) {
        char[] domi = dominoes.toCharArray();
        int n = dominoes.length();
        // Queue<int[]> queue = new LinkedList<>(); 
        Deque<int[]> queue = new ArrayDeque<>();
        for(int i = 0; i < n ; i++){
            if(domi[i] != '.'){
                if(domi[i] == 'R'){
                    queue.offerLast(new int[]{i, 1});
                }else{
                    queue.offerLast(new int[]{i, 0});
                }
            }
        }

        while(!queue.isEmpty()){
            int[] current = queue.pollFirst();
            int i = current[0]; 
            char ch = current[1] == 1 ? 'R' : 'L';

            if(ch == 'L' && i > 0 && domi[i - 1] == '.'){
                queue.offerLast(new int[]{i - 1, 0});
                domi[i - 1] = 'L';
            }else if(ch == 'R' && i + 1 < n && domi[i + 1] == '.'){
                if(i + 2 < n && domi[i + 2] == 'L'){
                    queue.pollFirst();
                }else{
                    queue.offerLast(new int[]{i + 1, 1});
                    domi[i + 1] = 'R';
                }
            }
        }
        return new String(domi);
    }
}