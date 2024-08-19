package string;

public class Split3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to India";
		for(int i=s.length()-1;i>=0;i--)
		{
			for(int j=s.length()-1;j>=0;j--)
			{
				System.out.print(s.charAt(j));
			}
		}
		
		

	}

}
