package org.hm;

public class prasanth {
	public static void main(String[] args) {
		int n,a,s,r,t,sum;
		for(int i=0;i<=500;i++)
		{
		    if(9<=i&&i<=99)
		    {
		        n=i%10;
		        s=i/10;
		        if(n==s)
		        {
		                sum=s+n;
		                if(sum<=5)
		                {
		                    System.out.println(i);
		                }
		        }
		    }
		    else if(100<=i&&i<=500)
		    {
		        n=i%10;
		        a=i/10;
		        s=a%10;
		        r=a/10;
	            if(n==s||s==r||r==n)
	            {
	                sum=n+r+s;
	                if(sum<=5)
	                {
	                    System.out.println(i);
	                }
	            } 
		    }
	    }
	}
}




