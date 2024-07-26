class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // int[] newArray = new int[nums.length];
        // int highestIndex = 0;
        // for(int i = 0; i < index.length; i++){
        //     if(highestIndex < index[i]){
        //         highestIndex = index[i];
        //     }

        // }

        // I think this method is inferior
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            list.add(index[i], nums[i]);
        }
        int target [] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            target[i] = list.get(i);
        }
        return target;
    }
}