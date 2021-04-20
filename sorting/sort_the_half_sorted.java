class Solution
{
    public static void sortHalves (int arr[], int n)
    {
        
        int count = 0;
        for(int i = 0;i < n;i++){
            if(i == 0){
                i++;
            }else{
                if(arr[i] < arr[i-1]){
                count++;
                }else break;
            }
        }
        
        int[] first_half = new int[count];
        int[] second_half = new int[n-count];
        
        for(int i = 0;i < count;i++){
            first_half[i] = arr[i];
        }
        for(int i = count;i < n;i++){
            second_half[i] = arr[i];
        }
        
        int j = 0;
        int k = count;
        for(int i = 0;i < n;i++){
            if(first_half[j] > second_half[k]){
                arr[i] = second_half[k];
                i++;
                k++;
            }else if(first_half[j] < second_half[k]){
                arr[i] = first_half[j];
                j++;
                k++;
            }else{
                arr[i] = first_half[j];
                arr[i+1] = second_half[k];
                i++;
                i++;
                j++;
                k++;
            }
        }
        }
    }
    
