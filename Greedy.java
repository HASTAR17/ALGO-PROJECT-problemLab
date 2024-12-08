public class Greedy {

   
        public boolean canJump(int[] nums) {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (i > max) return false;
                max = Math.max(max, i + nums[i]);
            }
            return true;
        }
    
        public static void main(String[] args) {
            Greedy solution = new Greedy();
            
            // Example input array
            int[] nums = {2, 3, 1, 1, 4}; // Expected output: true
            boolean result = solution.canJump(nums);
            
            System.out.println("Can jump to the last index: " + result);
        }
    }
    
    

