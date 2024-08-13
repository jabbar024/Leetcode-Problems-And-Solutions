class Solution {
    
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] resultArray = new int[r][c];

        int length = mat.length* mat[0].length;
        int length2 = resultArray.length * resultArray[0].length;
        if(length == length2)
        {
            int array1D[] = new int[length];
            int k=0;
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[0].length; j++){
                    array1D[k++] = mat[i][j];
                }
            }
            
            k=0;
            for(int i=0; i<resultArray.length; i++){
                for(int j=0; j<resultArray[0].length; j++){
                    resultArray[i][j] = array1D[k++];
                }
            }
            return resultArray;
        }
        return mat;
    }
}