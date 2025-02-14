class ProductOfNumbers {
    ArrayList<Integer> list;
    public ProductOfNumbers() {
        this.list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int n = list.size();
        int i = n - 1;
        int prod = 1;
        while(k > 0){
            prod *= this.list.get(i);
            i--;
            k--;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */