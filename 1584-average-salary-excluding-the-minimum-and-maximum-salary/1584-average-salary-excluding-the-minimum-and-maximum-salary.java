class Solution {
    public double average(int[] salary) {
        int length = salary.length;
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < length; i++){
            if(salary[i] < min){
                min = salary[i];
            }
            if(salary[i] > max){
                max = salary[i];
            }
            sum += salary[i];
        }
        return (double)(sum - min - max)/(length - 2);
    }
}