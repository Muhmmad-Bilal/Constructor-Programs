import java.util.*;
class Marksheet
{
	int java, orcale,vb,c,cpp,csharp,ob,total,p;
	Marksheet(int j,int o,int v,int c,int cplus,int cs)
	{
		java=j;
		orcale=o;
		this.c=c;
		cpp=cplus;
		vb=v;
		csharp=cs;
		total=600;
		
	}
	
	void obtain()
	{
		ob=java+orcale+c+cpp+vb+csharp;
		
	}
	
	void per()
	{
		p=ob*100/total;
	}
	
	void grade()
	{
		if(p>=90&&p<=100)
			System.out.println("A-1 Grade");
			if(p>=80&&p<90)
				System.out.println("A Grade");
			if(p>=60&&p<80)
				System.out.println("B Grade");
			if(p>=40&&p<60)
				System.out.println("C Grade");
			if(p>=1&&p<40)
				System.out.println("You are fail");
				
	}
	
	void showob()
	{
		obtain();
		System.out.println("Obtain marks is:"+ob);
	}
	
	void showper()
	{
		
		per();
		System.out.println("Percentage is:"+p);
	}
	
	void showgrade()
	{
		
		grade();
	}
	
}


class Loop
{
	int num;
	int fact;
	int i;
	int temp;
	
	Loop(int n)
	
	{
		num=n;
		fact=1;
		int i=0;
	}
	
	void even()
	{
		
		for(i=0;i<=num;i+=2)
		{
				System.out.println("Even Series is:"+i);
		}
			
	}
	
	
	void odd()
	{
		for( i=1;i<=num;i+=2)
		{
			System.out.println("Odd Series is:"+i);
		}
	}
	void factorial()
	{
		
		for( i=1;i<=num;i++)
		{
			fact=fact*i;
			System.out.println("Factorial is:"+fact);
		}
	}
	void  fibonic()
	{
		
	//	int temp;
		int a=0;
		int b=1;
		for(i=1;i<=num;i++)
		{
			if(i<=1)
				temp=i;
			else
			{
				temp=a+b;
				a=b;
				b=temp;
			}
			System.out.println("Fibonic Series is:"+temp);
				
		}
	}
	void show_even()
	{
		even();
		
	}
	void show_odd()
	{
		odd();
		//System.out.println(i);
	}
	void show_factorial()
	{
		factorial();
	//	System.out.println("fact is"+fact);
	}
	void show_fib()
	{
		fibonic();
		
	}
	
}
class Mini_Project
{
	int load;
	int basicpay;
	int age1,age2,age3;
	int income;
	int driver;
	int discel;
	int tax;
	int profit;
	int house;
	int medical;
	double	zakwat;
	int convence;
	int incometax;
	double salary;
	int gross;
	int bouns;
	
	Mini_Project(int lo,int b,int a1,int a2,int a3)
	{
		load=lo;
		basicpay=b;
		age1=a1;
		age2=a2;
		age3=a3;
	}
	void troly()
	{
		income=load*800;
		driver=load*150;
		discel=load*110;
		tax=(income/100)*10;
		profit=income-(+driver+discel+tax);
		
	}
	void salary()
	{
		house=(basicpay/100)*45;
		medical=(basicpay/100)*15;
		bouns=(basicpay/100)*5;
		 gross=house+medical+bouns+basicpay;
		 convence=basicpay/100*10;
		 zakwat=basicpay/100*2.5;
		 incometax=basicpay/100*8;
		 salary=gross-(zakwat+convence+incometax);
	}
	void ages()
	{
		if(age1>age2&&age1>age3)
			System.out.println("Age one is Greater");
		if(age2>age1&&age2>age3)
			System.out.println("Age two is Greater");
		if(age3>age1&&age3>age2)
			System.out.println("Age three is Greater");
	}
	
	
	void show_troly()
	{
	System.out.println("Income is:"+income);
		System.out.println("Driver earning is:"+driver);
		System.out.println("Discel expence is:"+discel);
		System.out.println("Tax is:"+tax);
		System.out.println("Profit is:"+profit);
		
		//System.out.println(income);
	}	
	void show_salary()
	{
		System.out.println("Basic Pay is:"+basicpay);
		System.out.println("House Rent is:"+house);
		System.out.println("Medical is:"+medical);
		System.out.println("Bouns is:"+bouns);
		System.out.println("gross Pay is:"+gross);
		System.out.println("Convence"+convence);
		System.out.println("Zakwat is:"+zakwat);
		System.out.println("incometax:"+incometax);
	}
	void show_age()
	{
		ages();
	}
}
class Menu
{
	
	void show()
	{ Scanner obj=new Scanner(System.in);
		System.out.println("1.Marksheet");
		System.out.println("2.Loop Series");
		System.out.println("3.Mini Project");
		System.out.println("Enter choice");
		int ch=obj.nextInt();
		if(ch==1)
		{
			System.out.println("Enter Java Marks");
			int java=obj.nextInt();
			System.out.println("Enter Orcale Marks");
			int orcale=obj.nextInt();
			System.out.println("Enter VB Marks");
			int vb=obj.nextInt();
			System.out.println("Enter C Marks");
			int c=obj.nextInt();
			System.out.println("Enter C++ Marks");
			int cpp=obj.nextInt();
			System.out.println("Enter C# Marks ");
			int csharp=obj.nextInt();
			Marksheet m=new Marksheet(java,orcale,vb,c,cpp,csharp);
			m.showob();
			m.showper();
			m.showgrade();
			
		}
		if(ch==2)
		{
			System.out.println("1.Even Series");
			System.out.println("2.Odd Series");
			System.out.println("3.Factorial");
			System.out.println("4.Fibonic series");
			System.out.println("Enter your choice");
			int choice=obj.nextInt();
			if(choice==1)
			{
				System.out.println("Enter number for Even series");
				int number=obj.nextInt();
				Loop l=new Loop(number);
				l.even();
			}
			if(choice==2)
			{
				System.out.println("Enter Number for Odd Series");
				int num=obj.nextInt();
				Loop l=new Loop(num);
				l.odd();
				
			}
			if(choice==3)
			{
				System.out.println("Enter For Factorial");
				int num=obj.nextInt();
				Loop l=new Loop(num);
				l.factorial();
			}
			if(choice==4)
			{
				System.out.println("Enter For Fibonic Series");
				int num=obj.nextInt();
				Loop l=new Loop(num);
				l.fibonic();
			}
		}
		if(ch==3)
		{
			System.out.println("1.Troly Load");
			System.out.println("2.Salary");
			System.out.println("3.Ages");
			System.out.println("Enter Your Selection");
			int select=obj.nextInt();
			if(select==1)
			{
				System.out.println("Enter Troly Load");
				int load=obj.nextInt();
				Mini_Project mi=new Mini_Project(load,0,0,0,0);
				mi.troly();
			}
			if(select==2)
			{
				System.out.println("Enter Basic Pay");
				int pay=obj.nextInt();
				Mini_Project mi=new Mini_Project(0,pay,0,0,0);
				mi.salary();
			}
			if(select==3)
			{
				System.out.println("Enter Age one");
				int age1=obj.nextInt();
				System.out.println("Enter Age two");
				int age2=obj.nextInt();
				System.out.println("Enter Age Three");
				int age3=obj.nextInt();
				Mini_Project mi=new Mini_Project(0,0,age1,age2,age3);
				mi.ages();
			}
		}
	}
}




class Constructor_Project
{
	public static void main(String arrg[])
	{
		
		Menu me=new Menu();
		me.show();
		
		
	}
}