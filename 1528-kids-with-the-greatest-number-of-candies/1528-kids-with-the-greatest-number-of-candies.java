class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] array = new boolean[candies.length];
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                array[i] = true;
            } else {
                array[i] = false;
            }
        } 
        List<Boolean> myList = new ArrayList<>();
        for (boolean value : array) {
            myList.add(value);
        }
        return myList;
    }
}