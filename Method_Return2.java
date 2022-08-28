class Box
{
	int feet;
	int inch;
	Box(int a,int b)
	{
		feet=a;
		inch=b;
	}
	void show()
	{
		System.out.println("Feet ar:"+feet);
		System.out.println("Inches are:"+inch);
	}
	Box add(Box ob)
	{
		Box b=new Box();
		b.feet=feet+ob.feet;
		b.inch=inch+ob.inch;
		return b;
	}
	Box add(Box ob,Box ob1)
	{
		Box b=new Box();
		b.feet=feet+ob.feet+ob1.feet;
		b.inch=inch+ob.inch+ob1.inch;
		return b;
	}
	Box add(Box ob,Box ob1,Box ob2)
	{
		Box b=new Box();
		b.feet=feet+ob.feet+ob1.feet+ob2.feet;
		b.feet=feet+ob.feet+ob1.inch+ob2.inch;
		return b;
	}
	
}
class Rectangle
{
	int x;
	int y;
	int width;
	int height;
	Rectangle(int a,int b,int w,int h)
	{
		x=a;
		y=b;
		width=w;
		height=h;
	}
	void show_rect()
	{
		System.out.println("X is"+x);
		System.out.println("y is:"+y);
		System.out.println("Width is:"+width);
		System.out.println("Height is:"+height);
	}
	Rectangle add(Rectangle rect1)
	{
		Rectangle rect=new Rectangle();
		rect.x=x+rect1.x;
		rect.y=y.rect1.y;
		rect.width=width+rect1.width;
		rect.height=height+rect1.height;
		return rect;
	}
	Rectangle add(Rectangle rect1,Rectangle rect2)
	{
		Rectangle rect=new Rectangle();
		rect.x=x+rect1.x+rect2.x;
		rect.y=y+rect1.y+rect2.y;
		rect.width=width+rect1.width+rect2.width;
		rect.height=height+rect1.height+rect2.height;
		return rect;
	}
	Rectangle add(Rectangle rect1,Rectangle rect2,Rectangle rect3)
	{
		Rectangle rect=new Rectangle();
		rect.x=x+rect1.x+rect2.x+rect3.x;
		rect.y=y+rect1.y+rect2.y+rect3.y
		rect.width=width+rect1.width+rect2.width+rect3.width;
		rect.height=height+rect1.height+rect2.height+rect3.height;
		return rect;
	}
	
}
class MethodReturn2
{
	public static void main(String arg[])
	{
		Box ob=new Box(10,20);
		Box ob1=new Box(30,40);
		Box ob2=new Box(50,60);
		Rectangle rect1=new Rectangle(20,40,60,80);
		Rectangle rect2=new Rectangle(10,30,50,70);
		Rectangle rect3=new Rectangle(30,50,70,90);
		Box ob3=ob.add(ob1);
		Box ob4=ob1.add(ob1,ob2);
		Box ob5=ob1.add(ob1,ob1);
		Box ob6=ob3.add(ob1,ob1,ob1);
		Box ob7=ob8.add(ob1,ob2,ob3);
		ob3.show();
		ob4.show();
		ob5.show();
		ob7.show();
		Rectangle rect3=rect1.add(rect1);
		Rectangle rect4=rect2.add(rect1,rect2);
		Rectangle rect5=rect2.add(rect1,rect1);
		Rectangle rect6=rect3.add(rect1,rect2,rect3);
		rect3.show_rect();
		rect4.show_rect();
		rect5.show_rect();
		rect6.show_rect();
	}
}
