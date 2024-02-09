class  Armstrong
{
	public static void main(String[] args) 
	{
		int[]numbers={3,5,153,51,370,23};
		for (int i=0;i<numbers.length;i++)
		{
			int temp=numbers[i];
			int count=0;
			int sum=0;
			while (temp!=0)
			{
			  count++;
			  temp=temp/10;
			}
			int temp1=numbers[i];
			int power=1;
			while (temp1!=0)
			{
				power=1;
				int digit=temp1%10;
				for (int j=count;j>0;j--)
				{
					power = power*digit;
				}
				sum =sum+power;
                temp1 =temp1/10;
			}
			if (numbers[i]==sum)
			{
				System.out.println("Armstrong numbers"+numbers[i]);
			}

		}
	}
}
