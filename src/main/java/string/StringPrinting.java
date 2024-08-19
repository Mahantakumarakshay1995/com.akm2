package string;

public class StringPrinting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="welcome bosso";
		String emp=" ";
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='o')
			{
				count++;
			}
			
			System.out.print(s.charAt(i));
			
		}
		System.out.println(count);

	}

}
