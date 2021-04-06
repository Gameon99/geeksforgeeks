class Solution {
    int countBuildings(int h[], int n) {
        int count = 1;
        int start = h[0];
        for(int i = 1;i < n;i++){
            if(h[i] > start){
                count++;
                start = h[i];
            }
        }
        return count;
    }
}
