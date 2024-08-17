class Solution {
    public int arrangeCoins(int n) {
        // return (int)(Math.sqrt(1 + 8 * (long)n ) - 1) / 2;
        // // Concept used is triangulation of numbers: https://www.youtube.com/watch?v=X3_h4w3jVsk
        // // https://chatgpt.com/share/4e6b9642-25e7-4c73-af81-1f9ddccd267e
        // // also known as the sum of first n natural numbers

        int i = 1;
        while(n > 0){
            i++;
            n -= i;
        }
        return i - 1;
    }
}