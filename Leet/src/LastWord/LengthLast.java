package LastWord;
import java.util.*;
class Solution
{
    public int LengthLast(String s)
    {
        String[] words = s.split(" ");
        List<Integer> list=new ArrayList<Integer>(); 

        for(String word: words)
        {
            list.add(word.length());
        }


    return list.get(list.size()-1);
    }

 public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hola cottorina ornitorrinco";
        System.out.println(solution.LengthLast(s));
 }
}