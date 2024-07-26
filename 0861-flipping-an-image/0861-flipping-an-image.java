class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int length = image.length;
        for(int i = 0; i < length; i++){
            int start = 0;
            int end = length - 1;
            while(start <= end){
                if(image[i][start] == image[i][end]){
                    if(image[i][start] == 0){
                        image[i][start] = 1;
                        image[i][end] = 1;
                    }else{
                        image[i][start] = 0;
                        image[i][end] = 0;
                    }
                }
                start++;
                end--;
            }
        }
        return image;
    }
}