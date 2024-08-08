class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int direction[][]={
            {0,1},{1,0},{0,-1},{-1,0}
        };

        int n = rows*cols;
        int resultArray[][] = new int[n][2];
        resultArray[0][0] = rStart;
        resultArray[0][1] = cStart;

        int index=0;
        int steps = 1;
        int count =1;
        while (count<n){
            for(int times=0; times<2; times++){
                int dr = direction[index%4][0];
                int dc = direction[index%4][1];
                
                for(int i=0; i<steps; i++){
                    rStart+=dr;
                    cStart+=dc;
                    if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){
                        resultArray[count][0] = rStart;
                        resultArray[count][1] = cStart;
                        count++;
                    }
                }index++;
            }
            steps++;
        }

    return resultArray;
        
    }
}