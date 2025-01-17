package Two_sums;

import java.util.Arrays;

class Solution{
    public int[] twoSum(int[] nums, int target) {

        
        int left =  0;
        int right = nums.length-1;
        int[] solution = new int[2];


        while(left<right){
            if(sum(nums[left],nums[right],target)){
                solution[0] = left;
                solution[1] = right;
                return solution;
            }
        
       /*
        como es un array ordenado, si la suma es menor que el target, entonces
        pasemos al siguiente numero que es mayor y comprobemos si da el target
        */
        
            if(nums[left]+nums[right] < target){
                left++; // dejamos un puntero quieto y movemos el otro
            }else{
                //el numero es mayor al target por lo cual hay que disminuir el numero
                right--;
            }
        }

        return new int[] {};
        
    }


    public boolean sum(int number_1, int number_2, int target){
        if(number_1+number_2 == target){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0, 1, 3, 6};
        int target = 9;
        int[] result = s.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
         
        
    }
}

