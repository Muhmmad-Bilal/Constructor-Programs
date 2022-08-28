class Box{
	
		int feet;
		int inch;
	
	
	Box(int f,int i)
	{
		feet=f;
		inch=i;
	}
	
	void add()
	{
		System.out.println("Addition of Both Feet and Inch:"+(feet+inch));
		
	}
	void add(Box ob)
	{
		System.out.println("Feets: "+(feet+ob.feet));
		System.out.println("Inchs: "+(inch+ob.feet));
	}
	void add(Box ob,Box ob1)
	{
		System.out.println("Feets: "+(feet+ob.feet+ob1.feet));
		System.out.println("Inchs: "+(inch+ob.inch+ob1.inch));
	}
	void add(Box ob,Box ob1,Box ob2)
	{
		System.out.println("Feets: "+(feet+ob.feet+ob1.feet+ob2.feet));
		System.out.println("Inch:  "+(inch+ob.inch+ob1.inch+ob2.inch));
	}
	void multi()
	{
	System.out.println("Multiplication of feet and inch"+feet*inch);
	}
	void multi(Box ob)
	{
		System.out.println("Feet is:"+feet*ob.feet);
		System.out.println("Inch is:"+inch*ob.inch);
	}
	void multi(Box ob,Box ob1)
	{
		System.out.println("Feet is:"+feet*ob.feet*ob1.feet);
		System.out.println("Inch is:"+inch*ob.inch*ob1.inch);		
	}
	void multi(Box ob,Box ob1,Box ob2)
	{
		System.out.println("Feet is:"+feet*ob.feet*ob1.feet*ob2.feet);
		System.out.println("Inch is:"+feet*ob.inch*ob1.inch*ob2.inch);
	}	
	public static void main(String arg[])
	{
		Box ob=new Box(10,5);
		Box ob1=new Box(15,10);
		Box ob2=new Box(20,15);
		ob.add();
		ob.add(ob1);
		ob.add(ob1,ob2);
		ob.add(ob,ob1,ob2);
		ob.multi();
		ob.multi(ob);
		ob.multi(ob,ob1);
		ob.multi(ob,ob1,ob2);
		ob1.add();
		ob1.add(ob1);
		
	}

}