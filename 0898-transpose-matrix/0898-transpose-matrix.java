class Solution {
    public int[][] transpose(int[][] matrix) {

        if(matrix[0].length == matrix.length){

            for(int i=0; i<matrix.length; i++){
                for(int j=i; j<matrix[0].length; j++ ){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            return matrix;
        }

        int resultArray[][] = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++ ){
                    resultArray[j][i] = matrix[i][j];
                }
            }
            return resultArray;
    }
}