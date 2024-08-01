class Solution {

    public static int calculateAge(String personDetails){
        int age = 0;
        for(int i=11; i<personDetails.length()-2; i++){
            age = (personDetails.charAt(i)-'0')+(age*10);   
        }return age;
    }
    public int countSeniors(String[] details) {
        int count =0;
        for (int i=0; i<details.length; i++){
            int age = calculateAge(details[i]); 
            if(age>60){
                count++;
            }
        }return count;
    }
}