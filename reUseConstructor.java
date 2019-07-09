class Stu
{
	int rollno;
	String name,courseName;
	double fee;

	Stu(int rollno,String name, String courseName)
	{
	this.rollno=rollno;
	this.name=name;
	this.courseName=courseName;
	}
	Stu(int rollno,String name,String courseName,double fee)
	{
	this(rollno,name,courseName);
	this.fee=fee;
	}
	void display()
	{
	System.out.println(rollno+" "+name+" "+courseName+" "+fee);
	}
}

class reUseConstructor

{

	public static void main(String args[])
	{
	Stu s1=new Stu(101,"Janu","JAVA");
	Stu s2=new Stu(102,"Rupesh","Onboarding",1000.98);
	s1.display();
	s2.display();	
}
}