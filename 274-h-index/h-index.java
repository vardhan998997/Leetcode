class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] countSort = new int[n+1];
        for(int i = 0;i<n;i++){
            if(citations[i]>=n){
                countSort[n]++;
            }else{
                countSort[citations[i]]++;
            }
        }

        int count = 0;
        for(int i = n; i>=0 ;i--){
                count += countSort[i];
                    if(count >= i){
                        return i;
                    }
        }
        return 0;
    }
}
