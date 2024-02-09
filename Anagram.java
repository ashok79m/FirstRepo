class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "peek";
		String s2 = "keep";
		int count = 0;
		if (s1.length()==s2.length())
		{
			for (int i =0;i<s1.length();i++ )
			{
				char ch = s1.charAt(i);
				for (int j=0;j<s2.length(); j++)
				{
					if (ch==s2.charAt(j))
					{
						count++;
						s1.charAt(j);
						break;
					}
				}
			}
			
			
			
			else{
				System.out.println(" it is a anagram");
			}
			
				if (count==s1.length())
				{
					System.out.println(" it is a anagram");
				}
					else {
						System.out.println(" it is not a anagram");
					}
	    }
	}
}
