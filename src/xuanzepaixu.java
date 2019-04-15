public class xuanzepaixu {
    public static void main(String[] args) {
        int[]nums=new int[]{11,23,14,25,15};
        for (int i = 0; i <nums.length; i++) {
            int min = nums[i];
            int minIndex =i;
            for (int j=i+1; j<nums.length ; j++){
                if (min> nums[j]){
                    min = nums[j];
                    minIndex = j;
                }
            }
            if (i!=minIndex){
                int temp =nums[i];
                nums[i]=nums[minIndex];
                nums[minIndex]=temp;
            }
        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
