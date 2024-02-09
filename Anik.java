class Anik 
{
	public static void main(String[] args) 
	{
	int[] numbers = {1,5,3,8,5,2,7,9};
	int target = 10;
	for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]+numbers[j]==target)
				{
					System.out.println(numbers[i]+" "+numbers[j]);
				}
			}
		}
	}
}
