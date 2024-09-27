public class LinearSearch
{
	public static int Search(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}



	public static void main(String[] args) 
	{
		int arr[]={2,8,7,7,5,4,8,7};
		int key=5;

		int result=Search(arr,key);

		System.out.println(result);

		
	}
}