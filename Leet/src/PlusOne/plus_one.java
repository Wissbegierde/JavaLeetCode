package PlusOne;

class Solution {
    public int[] plusOne(int[] digits) {

        int n= digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            } 
            digits[i]=0;
        }
        int[] new_number = new int[n+1];
        new_number[0]=1;
        return new_number;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] solution=obj.plusOne(digits); // Output: [1, 2, 4]
        for(int i=0; i<solution.length; i++){
            System.out.print(solution[i]+" ");
        }
    }
}
