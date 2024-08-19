package string;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to india";
int count=0;
 String[] a = s.split(" ");
		char[] ch=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
			count++;
		}
			
		System.out.println(count);
	}

}
