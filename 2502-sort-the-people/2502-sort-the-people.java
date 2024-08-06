class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                if(heights[i]<heights[j]){

                    int temp = heights[i];
                    String str = names[i];

                    heights[i] = heights[j];
                    names[i] = names[j];

                    heights[j] = temp;
                    names[j] = str;
                }
            }
        }return names;
    }
}