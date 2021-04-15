class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        boolean sort = false;
        for(int i = 1;i < n;i++){
            if(arr[i] < arr[i-1]){
                return sort;
            }
        }
        sort = true;
        return sort;
    }
}
