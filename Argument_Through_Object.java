import java.util.*;
class Rectangle
{
	int x;
	int y;
	int height;
	int widht;
	Rectangle(int a,int b,int h,int w)
	{
		x=a;
		y=b;
		height=h;
		widht=w;
	}
	
}
class School
{
	String name;
	String subject,roll_no,surname;
	School(String n,String s,String r,String sur)
	{
		name=n;
		subject=s;
		roll_no=r;
		surname=sur;
	}
}
class Box
{
	int feet;
	int inche;
	Box(int f,int i)
	{
		feet=f;
		inche=i;
	}
}
class Display
{
	static void show(Rectangle rect)
	{
		System.out.println("---------Object One of Rectangle-------- ");
		System.out.println("X="+rect.x);
		System.out.println("Y="+rect.y);
		System.out.println("Height="+rect.height);
		System.out.println("Width="+rect.widht);
	}
	static void Show(Rectangle rect1)
	{
		System.out.println("-------Object Two of Rectangle----------");
		System.out.println("X="+rect1.x);
		System.out.println("Y="+rect1.y);
		System.out.println("Height="+rect1.height);
		System.out.println("width="+rect1.widht);
	}
	static void add(Rectangle rect,Rectangle rect1)
	{
		System.out.println("----Addition of Object one and two of Rectangle------");
		System.out.println("Addition of X="+(rect.x+rect1.x));
		System.out.println("Addition of Y="+(rect.y+rect1.y));
		System.out.println("Addition of Height="+(rect.height+rect1.height));
		System.out.println("Additon of Widht="+(rect.widht+rect1.height));
	}
	static void show(School school)
	{
		System.out.println("---BioData Of First Student---");
		System.out.println("Name is:"+school.name);
		System.out.println("Subject is:"+school.subject);
		System.out.println("Roll_No is:"+school.roll_no);
		System.out.println("Surname is:"+school.surname);
	}
	static void Show(School school1)
	{
		System.out.println("---BioData is Second Student---");
		System.out.println("Name is:"+school1.name);
		System.out.println("Subject is:"+school1.subject);
		System.out.println("Roll_No is:"+school1.roll_no);
		System.out.println("Surname is:"+school1.surname);
	}
	static void show(Box box)
	{
		System.out.println("---- First Object of Box----");
		System.out.println("Feet is="+box.feet);
		System.out.println("Inches is="+box.inche);
		
	}
	static void Show(Box box1)
	{
		System.out.println("Second Object of Box");
		System.out.println("Feet is="+box1.feet);
		System.out.println("Inches is="+box1.inche);
	}
	static void add(Box box,Box box1)
	{
		System.out.println("----Addition of One and Two Object of Box------");
		System.out.println("Feets are="+(box.feet+box1.feet));
		System.out.println("Inches are="+(box.inche+box1.inche));
	}
	
	
}
class Argument_Through_Object
{
	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);
		Rectangle rect=new Rectangle(10,20,30,40);
		Rectangle rect1=new Rectangle(20,30,40,50);
		School school=new School("Bilal","Java","63","Janwari");
		School school1=new School("Aziz","Java","116","Rind");
		Box box=new Box(20,30);
		Box box1=new Box(40,50);
		System.out.println("1.Rectangle");
		System.out.println("2.School");
		System.out.println("3.Box");
		System.out.println("Enter Your Choice");
		int choice=obj.nextInt();
		if(choice==1)
		{
		Display.show(rect);
		Display.Show(rect1);
		Display.add(rect,rect1);
		}
		if(choice==2)
		{
		Display.show(school);
		Display.Show(school1);
		}
		if(choice==3)
		{
		Display.show(box);
		Display.Show(box1);
		Display.add(box,box1);
		}
	}
}






