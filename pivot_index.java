public class pivot_index {
    public static void main(String[] args) {
        int [] nums = {1, 7, 3, 6, 5, 6};
        int index = pivot(nums);
        System.out.println("The pivot index is: " + index);
    }

    public static int pivot(int [] nums) {
        int sum = 0;
        int temp = 0;
        for(int i=0 ; i < nums.length; i++)
        {
            sum = sum  + nums[i];
        }
        for(int j=0; j < nums.length; j++)
        {
            sum = sum - nums[j];
            if(temp == sum)
            {
                return j;
            }
            temp = temp + nums[j];
        }
        return 0;
    }
}
