class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max_ene = Integer.MIN_VALUE;
        int n = energy.length;

        for(int i = n-1;i>=n-k;i--){
            max_ene = Math.max(max_ene, energy[i]);
        }

        for(int i = n-k-1;i>=0;i--){
            energy[i] += energy[i+k];
            max_ene = Math.max(max_ene, energy[i]);
        }

        return max_ene;
    }
}
