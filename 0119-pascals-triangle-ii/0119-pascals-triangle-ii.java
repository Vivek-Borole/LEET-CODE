class Solution {
    public List<Integer> getRow(int rowIndex) {
        int k = rowIndex;
        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        
        for (int i = 1; i <= k; i++) 
            for (int j = i; j > 0; j--) 
                arr[j] = arr[j] + arr[j - 1];
        
        return Arrays.asList(arr);
    }
}
    
  // }
// }
// vector<int> getRow(int rowIndex) {
//         if(rowIndex==0){ 
//             return {1};//0th index element will always be 1
//         }
//         vector<int> curr = {1};//first element of any row would be always 1
//         vector<int> prev = getRow(rowIndex-1);//recursive call for previous row
//         for(int i = 1 ; i<rowIndex ;i++){
//             curr.push_back(prev[i]+prev[i-1]);//current element is the sum of the element present at the same i and element present at i-1
//         }
//         curr.push_back(1);//last element of every row would always be 1 too
//         return curr;
