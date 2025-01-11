package Search_Insert_Position;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calcula el índice medio
            
            if (nums[mid] == target) {
                return mid; // Si encontramos el target, devuelve su índice
            } else if (nums[mid] < target) {
                low = mid + 1; // Busca en la mitad derecha
            } else {
                high = mid - 1; // Busca en la mitad izquierda
            }
        }

        // Cuando termina el bucle, 'low' es el índice de inserción
        return low;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(obj.searchInsert(nums, target)); // Output: 2
    }
}
