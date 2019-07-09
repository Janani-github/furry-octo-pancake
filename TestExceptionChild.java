import java.io.*;  
class Parent
{  
  	void msg()
	{
		System.out.println("This is parent class");
	}  
}  
  
class TestExceptionChild extends Parent
{  
  	void msg()
	{  
    		System.out.println("TestExceptionChild");  
  	}  
  
	public static void main(String args[])
	{  
   		Parent p=new TestExceptionChild();  
   		p.msg();  
	}  	
}