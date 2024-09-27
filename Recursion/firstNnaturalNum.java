 public class FirstNnaturalNum
{
// print N  natural number

	public static void  Nnatural(int n)
	{
		if(n==0)
		{
			return ;
		}


		Nnatural(n-1);
		System.out.println(n);
	}




	public static void main(String[] args) 
	{
		Nnatural(5);

		
	}
}