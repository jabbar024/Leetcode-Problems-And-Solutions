class Solution {

    public int[] findEvenNumbers(int[] digits) 
    {
        // boolean isEmpty = true

        // for(int value : digits)
        // {
        //     if(value != 0)
        //     {
        //         b = false ;
        //     }
        // }
        int minValue  = 1 ;
        int maxValue = 1 ;

        Arrays.sort(digits) ;

        ArrayList<Integer> list = new ArrayList<>() ;

        for(int i=0; i<digits.length; i++)
        {
            if(digits[i]!=0)
            {
                minValue = Math.min(minValue, digits[i]) ;
            }

            maxValue = Math.max(maxValue, digits[i]) ;
        }

        for(int i=minValue*100; i<=maxValue*111; i++)
        {
            if(i%2==0 && isContains(i, digits))
            {
                list.add(i) ;
            }
        }

        int ansArray[] = new int[list.size()] ;
        
        for(int i=0; i<ansArray.length; i++)
        {
            ansArray[i] = list.get(i) ;
        }

        return ansArray ;
    }

    public static boolean isContains(int num, int[] digits)
    {
        int newArray[] = new int[digits.length] ;
        boolean b = false ;

        while(num>0)
        {
            int temp = num%10 ;
            for(int i=0; i<digits.length; i++)
            {
                if(temp == digits[i] && newArray[i] != -1)
                {
                    newArray[i] = -1 ;
                    b = true ;
                    break ;
                }
                
            }
            if(b == false)
            {
                return false ;
            }
            else
            {
                b = false ;
            }

            num/=10 ;
        }

        return true ;
    }
}