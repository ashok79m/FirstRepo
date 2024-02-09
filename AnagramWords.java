class AnagramWords
{
	public static void main(String[] args) 
	{
		String s = "listen java demo in silent mode";
		String [] words = s.split(" ");
		for (int i=0; i<words.length; i++)
		{
			String s2 = "";
			String s1 = words[i];		
			for (int j=i+1; j<words.length; j++)
			{
				int count = 0;
				s2 = words[j];
				if (s1.length()==s2.length())
				{
					for (int k=0; k<s1.length(); k++)
					{
						char ch = s1.charAt(k);
						for (int l=0; l<s2.length(); l++)
						{
							char ch1 = s2.charAt(l);
							if (ch==ch1)
							{
								count++;
								ch1 = ' ';
								break;
							}
						}
					}
				}
				if (count==s1.length())
				{
					System.out.println(s1+" "+s2);
				}
				
			}
		}
	}
}
