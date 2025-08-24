class Solution {
    public int nextGreaterElement(int n) {
        int len = Integer.toString(n).length();
        int arr[] = new int[len];
        int temp_num = n , idx = arr.length - 1;
        while(idx>=0){
            arr[idx] = temp_num % 10;
            temp_num /= 10;
            idx--;
        }
        
        int temp_n = arr.length;
        int found_idx = -1;
        for(int i = temp_n-1;i>0;i--){
            if(arr[i] > arr[i-1]){
                found_idx = i;
                break;
            }
        }

        if(found_idx == -1) return -1;


        for(int i = temp_n-1;i>=found_idx;i--){
            if(arr[i] > arr[found_idx-1]){
                swap(arr, found_idx-1, i);
                break;
            }
        }

       
        reverse(arr, found_idx, temp_n-1);

        long ans = 0;
        for(int i = 0;i<temp_n;i++){
            ans = ans*10 + arr[i];
        }

        return (ans > Integer.MAX_VALUE) ? -1 : (int)ans;
    }

    public static void swap(int[] arr, int i, int j){
        if(i!=j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }

    public static void reverse(int[] arr, int st, int end){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;end--;
        }
    }
}
