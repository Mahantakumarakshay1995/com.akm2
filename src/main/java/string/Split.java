package string;

import org.testng.annotations.Test;

public class Split {
	
	@Test
	public void split()
	{
		String s="   I am Grrot ram is sita mood    ";
		
		String[]a=s.trim().split(" ");
		String temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
		
				
	}

