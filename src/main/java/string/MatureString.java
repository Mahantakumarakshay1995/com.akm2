package string;

public class MatureString {
	
	public static String stringConcat(String concatValue)
	{
		String s="Wanted to append new"+concatValue;
		System.out.println(s);

		return s;
				
	}


	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		String ss="I am groot";
		System.out.println(ss);
		MatureString.stringConcat(ss);
	}

}
