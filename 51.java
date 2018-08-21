/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		String c=String.valueOf(a);
		int b =c.length();
		for(int i=0;i<b;i++)
		{
			if(i==b)
				System.out.print(c.charAt(i));
			else
				System.out.print(c.charAt(i)+" ");
		}
	}
}
