import java.io.*;

class BufferExample
{
	public static void main(String args[])throws IOException
	{
		
		FileInputStream file1=new FileInputStream("lusumoo.txt");
		FileInputStream file2=new FileInputStream("lusu.txt");
		SequenceInputStream file3=new SequenceInputStream(file1,file2);
		BufferedInputStream inBuffer=new BufferedInputStream(file3);
		BufferedOutputStream outBuffer=new BufferedOutputStream(System.out);  

		int ch;

		while((ch=inBuffer.read())!=-1)
		{
			 outBuffer.write(ch);
		}//while
		System.out.println("File copied");
		
		inBuffer.close();
		outBuffer.close();
		file1.close();
		file2.close();
		file3.close();
		
	}//main
}//class