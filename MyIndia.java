/*------------------------------------------------Instructions to run the Program-------------------------------------------------------
1. Select and copy this whole code.
2. Now you may goto any online Java complier OR just goto the link below:
   "https://www.tutorialspoint.com/compile_java_online.php"
3. Clear the default "Hello World" program there.
4. Now paste this code there.
5. Click on Execute and enjoy the Beauty of Programming!!
---------------------------------------------------------------------------------------------------------------------------------------*/
/**
 * A character encoded java program to print the figure of India.
 * 
 * @author G Ajeet 
 * @version (12 / 12 / 2019)
 */

import java.io.*;
public class MyIndia
{
	public static void main(String[] args) throws IOException
	{
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));

		String code="3$T\n3)P\n4.J\n6-I\n4.J\n5+L\n5+L\n7+J\n7\'N\n7)L\n6-I\n4/I\n3/A$#"
			   +"\n12>)\n060 ()!\n+=-!$+#\n*D\'!%\'&\n+\\%\n,M +&\n-K!+&\n&% J\'%\'\n%T%"
			   +"$(\n)O\'\")\n\'S\' )\n)% F6\n*$ D8\n1B9\n0B:\n1=>\n1=>\n1;@\n19B\n18C"
			   +"\n27C\n33F\n32G\n4/I\n5/H\n5.I\n6-I\n7+J\n7+J\n7+J\n9\'L\n9%N\n:#N\n;!N";
		
		int l=code.length();
		char ch;
		for(int i=0, j=0 ; i<l ; i++, j++)
		{
			ch=code.charAt(i);
			if(ch=='\n')
			{
				w.write("\n");
				if(j%2==0)j--;
			}
			else if(j%2==0)
			{
				for(int k=0 ; k<(int)ch-31; k++)
					w.write(" ");
			}
			else
			{
				for(int k=0 ; k<(int)ch-31 ; k++)
					w.write("#");
			}
		}
		w.flush();
	}
}
