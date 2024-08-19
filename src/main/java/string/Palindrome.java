package string;

public class Palindrome {
	
	public static String checkPali(String s) 
	{
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp+=s.charAt(i);
		}
		
		realCheck(s,temp);
		return temp;
	}
	
	public static void realCheck(String s,String tem)
	{
		// String tem=checkPali(s);
		if(s.equals(tem))
		{
			System.out.println(s+" word is pali");
		}
		else
		{
			System.out.println(s+" word is not pali");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPali("mam" );
	}

}
