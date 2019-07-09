import java.io.*;

class FileInStr1
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("lusumoo.txt");
		FileOutputStream fos=new FileOutputStream("lusu.txt");
		byte ch;

		while((ch=(byte)fis.read())!=-1)
		{
			fos.write(ch);
		}//while

		System.out.println("File copied");
		
		fis.close();
		fos.close();
	}//main
}//class