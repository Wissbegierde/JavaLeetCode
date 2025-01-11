package Firts_Ocurrence;



class Solution {
    public int strStr(String haystack, String needle) {

       return  haystack.indexOf(needle);

    }
}

public class Ocurrence {
    public static void main(String[] args) {
        String revisar="sadbutsad";
        String revisar2="sad";
        Solution s = new Solution();
        System.out.println(s.strStr(revisar,revisar2));
    }
}   