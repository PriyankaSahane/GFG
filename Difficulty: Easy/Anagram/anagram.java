class Solution {
    // Function is to check whether two strings are anagram of
    //each other or not.
    
    //s1="geeks" & s2="kseeg"
    
    
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        
        String str1 = s1.replaceAll("\\s","");
        String str2 = s2.replaceAll("\\s","");
        
        if(str1.length() != str2.length()){
            return false;
        }else{
            char ch1[] = str1.toLowerCase().toCharArray();
            char ch2[]= str2.toLowerCase().toCharArray();
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            return Arrays.equals(ch1,ch2);
        }
        
        //return false;
        
    }
}