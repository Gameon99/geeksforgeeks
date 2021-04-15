class Solution
{
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
        
        // int zeroes = 0;
        // int ones = 0;
        // for(int i = 0;i < n;i++){
        //     if(a[i] == 0){
        //         zeroes++;
        //     }else if(a[i] == 1){
        //         ones++;
        //     }
        // }
        
        // for(int i = 0;i < zeroes;i++){
        //     a[i] = 0;
        // }
        
        // for(int i = zeroes;i < ones;i++){
        //     a[i] = 1;
        // }
        
        // for(int i = zeroes+ones;i < n;i++){
        //     a[i] = 2;
        // }
        
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends
