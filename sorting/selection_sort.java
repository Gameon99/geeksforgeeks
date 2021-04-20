class Solution
{
	int  select(int arr[], int i)
	{
        return arr[i];
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i = 0;i < n;i++){
	        for(int j = 0;j < n;j++){
	            int min = arr[i];
	            if(arr[j] > arr[i]){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	}
}
