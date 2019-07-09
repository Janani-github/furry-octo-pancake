//import java.util.*;
import java.io.*;

class inventoryData
{
	public static void main(String x[])throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		
		System.out.println("Enter your Product code");
		int code=Integer.parseInt(dis.readLine());
	
		System.out.println("Enter the Quantity of product");
		int qty=Integer.parseInt(dis.readLine());

		System.out.println("Enter the Product price");
		double price=new Double(dis.readLine()).doubleValue();

		DataOutputStream dos=new DataOutputStream(new FileOutputStream("Inventory.txt"));

		dos.writeInt(code);
		dos.writeInt(qty);
		dos.writeDouble(price);

		dos.close();

		DataInputStream disx=new DataInputStream(new FileInputStream("Inventory.txt"));	

		int c=disx.readInt();
		int q=disx.readInt();
		double p=disx.readDouble();
		disx.close();

		System.out.println("Product Details");
		System.out.println("=============================================");
		System.out.println("Your Product code is:" +c);
		System.out.println("Quantity of the product is:" +q);
		System.out.println("Product price is:"+p);
		System.out.println("Total Cost:"+(p*q));
	}
}