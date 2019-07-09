import java.io.*;

class FileInStr
{
	public static void main(String args[])
	{
		try{
		FileInputStream fis=new FileInputStream("lusumoo.txt");
		FileOutputStream fos=new FileOutputStream("lusu.txt");
		byte ch;

		while((ch=(byte)fis.read())!=-1)
		{
			fos.write(ch);
		}//while
		System.out.println("File copied");}//try
		
		catch(Exception e)
		{System.out.println(e.getMessage());}//catch

		finally
		{
			try{
				fis.close();
				fos.close();
			}//try
			catch(Exception e)
		{}//catch
		}//finally
	}//main
}//class