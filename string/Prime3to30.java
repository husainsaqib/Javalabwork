package com.string;

public class Prime3to30 {

	public static void main(String[] args) {
		Prime3to30 r=new Prime3to30();
		r.prime();
		

	}
	void prime()
	{
		int count=0;
		for(int i=3;i<=30;i++)
		{   count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i+" is prime number");
		}

	}

}
