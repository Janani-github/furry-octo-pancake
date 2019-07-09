class calculate
{
	static int cube;
	static void cube(int x)
	{
	 cube=x;
	}
	static void display()
	{
	System.out.println(cube*cube*cube);
	}
	
}

class cubicNumber
{
	public static void main(String args[])
	{
	calculate.cube(94);
	calculate.display();
	}
}