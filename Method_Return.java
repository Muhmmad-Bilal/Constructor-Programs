import java.util.*;
class Box
{
	int feet;
	int inche;
	Box()
	{
		feet=0;
		inche=0;
	}
	Box(int a,int b)
	{
		feet=a;
		inche=b;
	}
	
	void show()
	{
		System.out.println("Feet is:"+feet);
		System.out.println("Inche is:"+inche);
	}
}
class Rectangles
{
	int x;
	int y;
	int width;
	int heigth;
	Rectangles()
	{
		x=0;
		y=0;
		width=0;
		heigth=0;
	}
	Rectangles(int a,int b,int w,int h)
	{
		x=a;
		y=b;
		width=w;
		heigth=h;
		
	}
	void show()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("Width="+width);
		System.out.println("Height="+heigth);
	}
}
class Display
{
	static Box add(Box obj1,Box obj2)
	{
		Box ob=new Box();
		ob.feet=obj1.feet+obj2.feet;
		ob.inche=obj1.inche+obj2.inche;
		return ob;
	}
	static Box add(Box obj1,Box obj2,Box obj3)
	{
		Box ob=new Box();
		ob.feet=obj1.feet+obj2.feet+obj3.feet;
		ob.inche=obj1.inche+obj2.inche+obj2.inche;
		return ob;
	}
	static Box multi(Box obj1,Box obj2)
	{
		Box ob=new Box();
		ob.feet=obj1.feet*obj2.feet;
		ob.inche=obj1.inche*obj2.inche;
		return ob;
	}
	static Box multi(Box obj1,Box obj2,Box obj3)
	{
		Box ob=new Box();
		ob.feet=obj1.feet*obj2.feet*obj3.feet;
		ob.inche=obj1.inche*obj2.inche*obj3.inche;
		return ob;
	}


	static Rectangles add(Rectangles ob1,Rectangles ob2)
	{
		Rectangles rec=new Rectangles();
		rec.x=ob1.x+ob2.x;
		rec.y=ob1.y+ob2.y;
		rec.width=ob1.width+ob2.width;
		rec.heigth=ob1.heigth+ob2.heigth;
		return rec;
	}
	
	static Rectangles add(Rectangles ob1,Rectangles ob2,Rectangles ob3)
	{
		
		Rectangles rec=new Rectangles();
		rec.x=ob1.x+ob2.x+ob3.x;
		rec.y=ob1.y+ob2.y+ob3.y;
		rec.width=ob1.width+ob2.width+ob3.width;
		rec.heigth=ob1.heigth+ob2.heigth+ob3.heigth;
		return rec;
	
	}
	static Rectangles multi(Rectangles ob1,Rectangles ob2)
	{
		Rectangles rec=new Rectangles();
		rec.x=ob1.x*ob2.x;
		rec.y=ob1.y*ob2.y;
		rec.width=ob1.width*ob2.width;
		rec.heigth=ob1.heigth*ob2.heigth;
		return rec;
		
	}
	static Rectangles multi(Rectangles ob1,Rectangles ob2,Rectangles ob3)
	{
		Rectangles rec=new Rectangles();
		rec.x=ob1.x*ob2.x*ob3.x;
		rec.y=ob1.y*ob2.y*ob3.y;
		rec.y=ob1.width*ob2.width*ob3.width;
		rec.y=ob1.heigth*ob2.heigth*ob3.heigth;
		return rec;
	}
	
	
}

class Method_Return
{
	public static void main(String arg[])
	{
		Scanner object=new Scanner(System.in);
		System.out.println("1.Boxes");
		System.out.println("2.Rectangles");
		System.out.println("Enter Your Choice");
		int choice=object.nextInt();
		if(choice==1)
		{
		Box ob1=new Box(10,20);
		Box ob2=new Box(30,40);
		Box ob3=new Box(50,60);
		
	Box ob4=Display.add(ob1,ob2);
	Box ob5=Display.add(ob1,ob2,ob3);
	System.out.println("------Multipliaction-----");
	Box ob6=Display.multi(ob1,ob2);
	Box ob7=Display.multi(ob1,ob2,ob3);
	//Box ob8=Display.multi(ob1)
		ob4.show();
		ob5.show();
		ob6.show();
		ob7.show();
		
		}
		if(choice==2)
		{
		Rectangles rect=new Rectangles(60,70,80,90);
		Rectangles rect1=new Rectangles(100,200,300,400);
		Rectangles rect2=new Rectangles(500,600,700,800);
		Rectangles rect3=Display.add(rect,rect1);
		Rectangles rect4=Display.add(rect,rect1,rect2);
		System.out.println("------Multipliaction-----");
		Rectangles rect5=Display.multi(rect,rect1);
		Rectangles rect6=Display.multi(rect,rect1,rect2);
		rect3.show();
		rect4.show();
		rect5.show();
		rect6.show();
		}
	}
}