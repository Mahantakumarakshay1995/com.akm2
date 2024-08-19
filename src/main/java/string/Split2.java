package string;

public class Split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am Grrot";
		
		String[]a=s.trim().split(" ");
		
		String temp=" ";
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+"");
			 temp=a[i];
		}
	
	}

}
