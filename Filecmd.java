import java.io.*;

class Filecmd
{
	public static void main(String x[])throws IOException
	{
		FileInputStream fis=new FileInputStream(x[0]);
		
		int ch;
		
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}
	fis.close();
	}
}