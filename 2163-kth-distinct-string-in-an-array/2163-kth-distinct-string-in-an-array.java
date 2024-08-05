class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        String outputArray[] = new String[arr.length];
        int m =0;
        for(int i =0; i < arr.length; i++){
             int count =0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count == 1){
                outputArray[m] = arr[i];
                m++;
            }

        }
        if(outputArray.length<k){
            return "";
        }else if(outputArray[k-1]==null){
            return "";
        }
        
        return outputArray[k-1];
        
    }
}