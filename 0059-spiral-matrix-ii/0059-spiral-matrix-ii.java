class Solution {
    public int[][] generateMatrix(int n) {
        int[][] resultArray = new int[n][n];

        int element = 1;

        int startRow = 0;
        int endRow = resultArray.length-1; 
        int startCol =0;
        int endCol = resultArray[0].length-1;
        
        while(startRow<=endRow && startCol<=endCol){

            for(int i=startRow; i<=endRow; i++){
                resultArray[startRow][i] = element++;
            }

            for(int i=startCol+1; i<=endCol; i++){
                resultArray[i][endCol] = element++;
            }

            for(int i=endRow-1; i>=startRow; i--){
                resultArray[endRow][i] = element++;
            }

            for(int i=endCol-1; i>=startCol+1; i--){
                resultArray[i][startCol] = element++;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return resultArray;
    }
}