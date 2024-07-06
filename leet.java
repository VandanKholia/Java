public class leet {
    public static void main(String[] args) {
        int nums[] = {3,2,2,4};
        int val=3;
        int idx=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val) {
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            }
        }
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
