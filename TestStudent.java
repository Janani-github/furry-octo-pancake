class Student
{  
	 int id;  
 	String name;  
}  

class TestStudent
{  
 	public static void main(String args[])
	{  
 		 	//Creating objects  
 		Student s1=new Student();  
  		Student s2=new Student(); 
		Student s3=new Student();  
  			//Initializing objects  
  		s1.id=101;  
  		s1.name="Janu";  
  		s2.id=102;  
  		s2.name="Praju";  
		s3.id=103;  
  		s3.name="Sarvi";  
		
  			//Printing data  
  		System.out.println(s1.id+" "+s1.name);  
  		System.out.println(s2.id+" "+s2.name);
		System.out.println(s3.id+" "+s3.name);  
 	}  
}  