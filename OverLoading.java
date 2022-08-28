import java.util.*;
class Demo
{
	Demo()
	{
		System.out.println("No arg Constructor");
	}
	Demo(int a)
	{
		System.out.println("One Arg Constructor");
	}
	Demo(int a,int b)
	{
		System.out.println("Two Argu Constructor");
		
	}
	Demo(int a,int b,int c)
	{
		System.out.println("Three  Argument");
	}
	Demo(int a,int b,int c,int d)
	{
		System.out.println("Four Argument");
	}
	
	
}
class OverLoading
{
	public static void main(String arg[])
	{
		Demo obj=new Demo();
		Demo obj1=new Demo(5);
		Demo obj2=new Demo(4,10);
		Demo obj3=new Demo(4,10,7);
		Demo obj4=new Demo(4,10,7,8);
	}
}