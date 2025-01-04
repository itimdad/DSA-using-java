class MinMaxValue{

	public static void  MinMax(int nums[])
	{
		int min=nums[0];
		int max=nums[0];

	

		for(int i=1;i<nums.length; i++)
		{
			if(nums[i]>max){
				max=nums[i];
			}
			if(nums[i]<min){
				min=nums[i];
			}
		}

		System.out.println("max value = "+ max + "\n" + "min value="+ min);
	}

	public static void main(String args []){
		int nums[] = {2,5,7,4,1};

		MinMax(nums);

	}
}