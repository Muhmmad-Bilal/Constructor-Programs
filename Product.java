import java.util.*;

class Product
{
	String productName;
	int price;
	int quantityStock;
	Product( String productName,int price,int quantityStock)
	{
		this.productName=productName;
		this.price=price;
		this.quantityStock=quantityStock;
		
	}
	void Print()
	{
		System.out.println("Product Name:"+productName);
		System.out.println("Price of Product:"+price);
		System.out.println("Stock is:"+quantityStock);
		
	}
	void IncreasePrice(int inPrice)
	{
		price+=inPrice;
		
	}
	int CheckStock()
	{
		return quantityStock;
		
		}
public static void main(String arg[])
{


	
	Product product=new Product("Milk",55,20);
	product.Print();
	product.IncreasePrice(2);
	System.out.println(product.CheckStock());
	product.Print();
	
}	
}