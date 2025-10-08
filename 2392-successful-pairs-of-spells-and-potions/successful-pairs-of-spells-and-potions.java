class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        Arrays.sort(potions);
        for(int i = 0;i<n;i++){
            spells[i] = ishelper(spells[i], potions, success);
        }
    return spells;
    }

    public int ishelper(int spell, int[] potions, long success){
        int l = 0, r = potions.length-1;
        long temp = (long)potions[r] * spell;
        if(temp<success) return 0;

        while(l<=r){
            int mid = l + (r-l)/2;
            temp = (long)potions[mid] * spell;

            if(success<=temp){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return potions.length - l;
    }
}
