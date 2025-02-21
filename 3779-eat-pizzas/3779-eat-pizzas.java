class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n = pizzas.length;
        int days = n / 4;

        long weight = 0;
        int ind = n - 1;

        while (days > 0) {
            weight += pizzas[ind];
            ind -= 1;
            days-=2;
        }

        days = n / 4 - 1;
        ind--;
        while (days > 0) {
            weight += pizzas[ind];
            ind -= 2;
            days-=2;
        }

        return weight;
    }
}