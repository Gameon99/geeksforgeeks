class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        int zero = 0;

        for(int i = 0;i < N;i++){
            if(A[i] == 0){
                zero++;
            }
        }
        for(int i = 0;i < zero;i++){
            A[i] = 0;
        }
        for(int i = zero;i < N;i++){
            A[i] = 1;
        }
    }
}
