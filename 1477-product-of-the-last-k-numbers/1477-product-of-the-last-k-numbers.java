class ProductOfNumbers {
    ArrayList<Integer> list;
    int prod = 1;
    public ProductOfNumbers() {
        this.list = new ArrayList<>();
    }
    
    public void add(int num) {
        if(num == 0){
            list = new ArrayList<>();
            prod = 1;
            return;
        }
        prod *= num;
        list.add(prod);
    }
    
    public int getProduct(int k) {
        int n = list.size();
        if(n < k) return 0;
        int ans = list.get(n - 1);
        if(n == k) return ans;
        return ans/list.get(n - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */