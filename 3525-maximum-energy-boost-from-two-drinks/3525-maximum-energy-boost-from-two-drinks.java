class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n = energyDrinkA.length;
        long prevA = energyDrinkA[0];
        long prevB = energyDrinkB[0];

        for (int i = 1; i < n; i++) {
            long currA = Math.max(prevA + energyDrinkA[i], prevB);
            long currB = Math.max(prevB + energyDrinkB[i], prevA);
            prevA = currA;
            prevB = currB;
        }

        return Math.max(prevA, prevB);
    }
}