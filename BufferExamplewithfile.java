import java.io.*;

class BufferExamplewithfile
{
	public static void main(String args[])throws IOException
	{
		
		FileInputStream file1=new FileInputStream("Records.txt");
		FileInputStream file2=new FileInputStream("simple.txt");
		SequenceInputStream file3=new SequenceInputStream(file1,file2);
		BufferedInputStream inBuffer=new BufferedInputStream(file3);
		
		FileOutputStream file4=new FileOutputStream("final.txt");
		
		BufferedOutputStream outBuffer=new BufferedOutputStream(file4);  

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
		file4.close();
		
	}//main
}//class