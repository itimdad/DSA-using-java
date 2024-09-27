//Ceil and floor of sorted array

public class CielAndFloor
{

	public static int Ceil(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=0;

		while(low<=high)
		{
			 mid=(low+high)/2;

			if(key==arr[mid])
			{
				return arr[mid];
			}
			else if(key<arr[mid])
			{
				high=mid-1;

			}
			else 
			{
				low=mid+1;
			}
		}

		if(low<arr.length)
		{
			return arr[low];

		}
		else 
		{
			return -1;
		}

	}

	public static int floor(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=0;

		while(low<=high)
		{
			mid=(low+high)/2;

			if(key==arr[mid])
			{
				return arr[mid];
			}
			else if(key<arr[mid])
			{
				high=mid-1;

			}
			else 
			{
				low=mid+1;
			}
		}

			if(high>=0)
		{
			return arr[high];

		}
		else 
		{
			return -1;
		}
	}



	public static void main(String[] args) 
	{
		int arr[]={19,23,56,61,72,88,92};
		int key=100;


		System.out.println(Ceil(arr,key));
		System.out.println(floor(arr,key));
	}
}