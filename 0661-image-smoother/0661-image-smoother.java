class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;

        int rowPattern[] = {-1,-1,-1,0,0,0,1,1,1};
        int colPattern[] = {-1,0,1,-1,0,1,-1,0,1}; 

        int resultArray[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                int sum =0;
                int element =0;
                for(int k=0; k<9; k++){
                    int rowIndex = i+rowPattern[k];
                    int colIndex = j+colPattern[k];
                    if(rowIndex>=0 && rowIndex<row && colIndex>=0 && colIndex<col){
                        sum+=img[rowIndex][colIndex];
                        element++;
                    }
                }
                resultArray[i][j] = sum/element;
            }
        }

        return resultArray;

    }
}