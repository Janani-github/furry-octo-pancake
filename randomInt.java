import java.io.*;

class randomInt

{
	public static void main(String x[])throws IOException

	{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("RandomInt.txt"));
		
		int rx;
		for(int i=1;i<=30;i++)
		{
			rx=(int)Math.random()*100;
			dos.writeInt(rx);
		}
	dos.close();

		DataInputStream dis=new DataInputStream(new FileInputStream("RandomInt.txt"));

		int rw;
		for(int i=1;i<=30;i++)
		{
			rw=dis.readInt();
			System.out.print(+i + "\t");
		}
	dis.close();
	}
}