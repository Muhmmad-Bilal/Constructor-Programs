import java.util.*;
class Box
{
	int feet;
	int inch;
	
	Box(){
		feet=0;
		inch=0;
	}
	
	Box(int a,int b)
	{
	feet=a;
	inch=b;	
	}
	void show()
	{
		System.out.println("Feets are :"+feet);
		System.out.println("Inches are :"+inch);
	}
	
}
class Rectangles
{
	int x;
	int y;
	int width;
	int height;
	Rectangles(){
		x=0;
		y=0;
		width=0;
		height=0;
	}
	Rectangles(int a,int b,int w,int h)
	{
		x=a;
		y=b;
		width=w;
		height=h;
	}
	
	void show_rect()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("Widht="+width);
		System.out.println("height"+height);
	}
}

class Display
{
	
	
	static Box add(Box ob1,Box ob2)
	{
	Box b=new Box();
	b.feet=ob1.feet+ob2.feet;
	b.inch=ob1.inch+ob2.inch;
	return b;
	}
	static Box add(Box ob1,Box ob2,Box ob3)
	{
		Box b=new Box();
		b.feet=ob1.feet+ob2.feet+ob3.feet;
		b.inch=ob1.inch+ob2.inch+ob3.inch;
		return b;		
	}
	static Box add(Box ob1,Box ob2,Box ob3,Box ob4)
	{
		Box b=new Box();
		b.feet=ob1.feet+ob2.feet+ob3.feet+ob4.feet;
		b.inch=ob1.inch+ob2.inch+ob3.inch+ob4.inch;
		return b;
	}
	static Box sub(Box ob1,Box ob2)
	{
	Box b=new Box();
	b.feet=ob1.feet-ob2.feet;
	b.inch=ob1.inch-ob2.inch;
	return b;
	}
	static Box sub(Box ob1,Box ob2,Box ob3)
	{
		Box b=new Box();
		b.feet=ob1.feet-ob2.feet-ob3.feet;
		b.inch=ob1.inch-ob2.inch-ob3.inch;
		return b;		
	}
	static Box sub(Box ob1,Box ob2,Box ob3,Box ob4)
	{
		Box b=new Box();
		b.feet=ob1.feet-ob2.feet-ob3.feet-ob4.feet;
		b.inch=ob1.inch-ob2.inch-ob3.inch-ob4.inch;
		return b;
	}
	static Box multi(Box ob1,Box ob2)
	{
		Box b=new Box();
		b.feet=ob1.feet*ob2.feet;
		b.inch=ob1.inch*ob2.inch;
		return b;
	}
	static Box multi(Box ob1,Box ob2,Box ob3)
	{
		Box b=new Box();
		b.feet=ob1.feet*ob2.feet*ob3.feet;
		b.inch=ob1.inch*ob2.inch*ob3.inch;
		return b;
	}
	static Box multi(Box ob1,Box ob2,Box ob3,Box ob4)
	{
		Box b=new Box();
		b.feet=ob1.feet*ob2.feet*ob3.feet*ob4.feet;
		b.inch=ob1.inch*ob2.inch*ob3.inch*ob4.inch;
		return b;
	}
	
	static Rectangles add(Rectangles rect1,Rectangles rect2)
	{
		Rectangles rect=new Rectangles();
		rect.x=rect1.x+rect2.x;
		rect.y=rect1.y+rect2.y;
		rect.width=rect1.width+rect2.width;
		rect.height=rect1.height+rect2.height;
		return rect;
	}
	static Rectangles add(Rectangles rect1,Rectangles rect2,Rectangles rect3)
	{
		Rectangles rect=new Rectangles();
		rect.x=rect1.x+rect2.x+rect3.x;
		rect.y=rect1.y+rect2.y+rect3.y;
		rect.width=rect1.width+rect2.width+rect3.width;
		rect.height=rect1.height+rect2.height+rect3.height;
		return rect;
	}
	static Rectangles add(Rectangles rect1,Rectangles rect2,Rectangles rect3,Rectangles rect4)
	{
		Rectangles rect=new Rectangles();
		rect.x=rect1.x+rect2.x+rect3.x+rect4.x;
		rect.y=rect1.y+rect2.y+rect3.y+rect4.y;
		rect.width=rect1.width+rect2.width+rect3.width+rect4.width;
		rect.height=rect1.height+rect2.height+rect3.height+rect4.height;
		return rect;
	
	}
	static Rectangles multi(Rectangles rect1,Rectangles rect2)
	{
		Rectangles rect=new Rectangles();
		rect.x=rect1.x*rect2.x;
		rect.y=rect1.y*rect2.y;
		rect.width=rect1.width*rect2.width;
		rect.height=rect1.height*rect2.height;
		return rect;
	}
	static Rectangles multi(Rectangles rect1,Rectangles rect2,Rectangles rect3)
	{
		Rectangles rect=new Rectangles();
		rect.x=rect1.x*rect2.x*rect3.x;
		rect.y=rect1.y+rect2.y*rect3.y;
		rect.width=rect1.width*rect2.width*rect3.width;
		rect.height=rect1.height*rect2.height*rect3.height;
		return rect;
	}
	static Rectangles multi(Rectangles rect1,Rectangles rect2,Rectangles rect3,Rectangles rect4)
	{
		Rectangles rect=new Rectangles();
		rect.x=rect1.x*rect2.x*rect3.x*rect4.x;
		rect.y=rect1.y*rect2.y*rect3.y*rect4.y;
		rect.width=rect1.width+rect2.width+rect3.width+rect4.width;
		rect.height=rect1.height+rect2.height+rect3.height+rect4.height;
		return rect;
	}
}


class Box_Rectangle
{
	public static void main(String arg[])
	{
		Box ob1=new Box(10,20);
		Box ob2=new Box(30,40);
		Box ob3=new Box(50,60);
		Box ob4=new Box(70,80);
		Rectangles rect1=new Rectangles(100,200,300,400);
			Rectangles rect2=new Rectangles(500,600,700,800);
			Rectangles rect3=new Rectangles(900,1000,1100,1200);
			Rectangles rect4=new Rectangles(1300,1400,1500,1600);
		Scanner obj=new Scanner(System.in);
		System.out.println("1.Box");
		System.out.println("2.Rectangles");
		System.out.println("enter Your choice");
		int choice=obj.nextInt();
		if(choice==1)
		{
			System.out.println("1.addition");
			System.out.println("2.subtraction");
			System.out.println("3.Multiplication");
			System.out.println("enter your choice");
			int ch=obj.nextInt();
			if(ch==1)
			{
			
			Box ob5=Display.add(ob1,ob2);
			Box ob6=Display.add(ob1,ob2,ob3);
			Box ob7=Display.add(ob1,ob2,ob3,ob4);
			System.out.println("Object one and two");
			ob5.show();
			System.out.println("Object one two and three");
			ob6.show();
			System.out.println("Object one two three and four");
			ob7.show();
			}
			if(ch==2)
			{
				Box ob11=Display.sub(ob1,ob2);
			Box ob12=Display.sub(ob1,ob2,ob3);
			Box ob13=Display.sub(ob1,ob2,ob3,ob4);
			System.out.println("Object one and two")
				ob11.show();
				System.out.println("Object one two and three");
			ob12.show();
			System.out.println("Object one two three and four");
			ob13.show();
			}
			if(ch==3)
			{
			Box ob8=Display.multi(ob1,ob2);
			Box ob9=Display.multi(ob1,ob2,ob3);
			Box ob10=Display.multi(ob1,ob2,ob3,ob4);
			System.out.println("Object one and two");
			ob8.show();
			System.out.println("Object one two and three");
			
			ob9.show();
			System.out.println("Object one two three and four");
			ob10.show();
			}
			if(ch==2)
			{
				
			}
		}
		if(choice==2)
		{
			
			System.out.println("1.addition");
			System.out.println("2.multiplication");
			System.out.println("enter choice");
			int select=obj.nextInt();
			if(select==1)
			{
			
			Rectangles rect5=Display.add(rect1,rect2);
			Rectangles rect6=Display.add(rect1,rect2,rect3);
			Rectangles rect7=Display.add(rect1,rect2,rect3,rect4);
			System.out.println("Object one and two");
			rect5.show_rect();
			System.out.println("Object one two and three");
			rect6.show_rect();
			System.out.println("Object one two three and four");
			rect7.show_rect();}
			if(select==2)
			{
				Rectangles rect8=Display.multi(rect1,rect2);
			Rectangles rect9=Display.multi(rect1,rect2,rect3);
			Rectangles rect10=Display.multi(rect1,rect2,rect3,rect4);
			System.out.println("Object one two");
			rect8.show_rect();
			System.out.println("Object one two and three");
			rect9.show_rect();
			System.out.println("Object one two three and four");
			rect10.show_rect();
			}	
		}
			
	}
}