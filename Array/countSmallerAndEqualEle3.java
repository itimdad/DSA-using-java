

//Case2= if  k is not exist;

class countSmallerAndEqualEle3
{

	public static int CountElem(int arr[], int key)
	{
		int low=0;
		int high=arr.length-1;

		int mid=0 ;
		while(low<=high)
		{
			  mid=(low+high)/2;

			if(arr[mid]==key)
			{

				//case 2 duplicate exist

				while(arr[mid]>arr.length-1 && arr[mid]==key)
				{
					break;	
				}
			
			}
			else if(arr[mid]<=key)
			{
				low=mid+1;

			}
			else
			{
				high=mid-1;

			}
		}


		if(arr[mid]>key)
		{
			return mid;
		}
		else  
		{
			return mid+1;
		}
		

	}

	public static void main(String[] args) 
	{
		int arr[]={2,6,12,24,26,26,28,30};
		int key=25;

		System.out.println(CountElem(arr,key));

		
	}
}