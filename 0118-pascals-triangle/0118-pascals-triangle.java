class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> main = new ArrayList<>();
        for(int i=0; i<numRows; i++)
        {
            List<Integer> sub = new ArrayList<>();
            int number = 1;
            for(int j=0; j<=i; j++)
            {
                sub.add(number);
                number = number * (i-j)/(j+1);
            }     
            main.add(sub);       
        }
        return main;
    }
}