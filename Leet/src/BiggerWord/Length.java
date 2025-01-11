package BiggerWord;

import java.util.HashMap;

class Solution 
{

    public String BiggerWord(String s) 
    {

        String[] words = s.split(" ");
        
        HashMap<Integer, String> Bword = new HashMap<Integer, String>();
        int count = 0;

        for (String word : words) 
        {
            count++;
            Bword.put(count, word);
        }

        
        int maxKey = Integer.MIN_VALUE;
        for (Integer key : Bword.keySet()) 
        {
            if (key > maxKey) 
            {
                maxKey = key;
            }
        }

       
        String LWord = Bword.get(maxKey);

        return LWord;
    }
 
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        String s = "Hola cottorina ornitorrinco";
        System.out.println(solution.BiggerWord(s));
    }
}