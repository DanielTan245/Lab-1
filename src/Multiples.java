public class Multiples {
    public static void main(String[] args) {
        int[] nums = {3,5,6,9};
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 1000 &&  (nums[i]%3 == 0 || nums[i]%5 == 0)){
                total++;
            }
        }
        System.out.println(total);
    }

}
