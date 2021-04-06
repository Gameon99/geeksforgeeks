class Solution {
    int count(int[] arr, int n, int x) {
        int total = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] == x){
                total++;
            }
        }
        return total;
    }
}
