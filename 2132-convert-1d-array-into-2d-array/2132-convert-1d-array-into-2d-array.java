class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length)
        {
            return new int[0][0];
        }
        int index = 0;
        int array[][] = new int[m][n];
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array[0].length; j++)
            {
                array[i][j] = original[index++];
            }
        }
        return array;
    }
}