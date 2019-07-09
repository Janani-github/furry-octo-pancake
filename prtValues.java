import java.io.*;

class prtValues

{
	public static void main(String x[])throws IOException
	{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("primitive.txt"));

		dos.writeChar('X');
		dos.writeInt(1000);
		dos.writeBoolean(false);
		dos.writeDouble(125.12);

		dos.close();
		
		DataInputStream dis=new DataInputStream(new FileInputStream("primitive.txt"));

		System.out.println("Character Value is:" +dis.readChar());
		System.out.println("Integer Value is:" +dis.readInt());
		System.out.println("Boolean Value is:" +dis.readBoolean ());
		System.out.println("Double Value is:" +dis.readDouble());

		dis.close();

		
	}
	
}