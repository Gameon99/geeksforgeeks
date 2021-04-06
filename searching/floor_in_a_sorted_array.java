class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int i = 0;
        for(i = 0; i < n; i++){
            if(arr[i] > x){
                return i-1;
            }
        }
        return i-1;
    }
    
}
