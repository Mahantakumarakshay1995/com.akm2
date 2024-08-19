package ty;

import java.util.LinkedHashSet;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to mandya welcome to welcome";
	    String[] wrd = s.split(" ");
	    
	    LinkedHashSet<String> h=new LinkedHashSet<String>();
	    for(int i=0;i<wrd.length;i++)
	    {
	    	h.add(wrd[i]);
	    }
	    System.out.println(h);
	    for(String ss:h)
	    {
	    	int count=0;
	    	for(int i=0;i<wrd.length;i++)
	    	{
	    		if(ss.equals(wrd[i]))
	    		{
	    			count++;
	    		}
	    		
	    	}
	    	System.out.println(wrd+"="+count);
	    }

	}

}
