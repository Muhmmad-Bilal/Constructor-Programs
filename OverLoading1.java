class Box
{
	int feet;
	int inche;
	Box()
	{
		feet=0;
		inche=0;
		System.out.println("No Argument Constractor");
	}
	Box(int a,int b)
	{
		feet=a;
		inche=b;
		System.out.println("Two Argument Constractor");
	}
	void show()
	{
		System.out.println("feets:"+feet);
		System.out.println("Inches:"+inche);
	}
}
class OverLoading1
{
	public static void main(String arg[])
	{
		Box b=new Box();
		Box b1=new Box(5,60);
		b.show();
		b1.show();
	}
}