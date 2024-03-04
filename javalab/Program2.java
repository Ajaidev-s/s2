import java.util.Scanner;
class Product
	{
	  int pcode;
	  String pname;
	  double price;
	  void getproduct(int code,String name,double pric)
	  	{
	  	  pcode=code;
	  	  pname=name;
	  	  price=pric;
	  	  
	  	}
	}
class program2
	{
	  public static void main(String args[])
	  	{
	  	   Scanner s=new Scanner(System.in);
	  	   int i=0,code;
	  	   String name;
	  	   double price;
	  	   //declaring array of product
	  	   
	  	   Product[] pro;
	  	   pro=new Product[3];
	  	   for(;i<3;i++)
	  	   	{
	  	   	  System.out.println("enter the pcode of"+(i+1)+"th product");
	  	   	  code=s.nextInt();
	  	   	  s.nextLine();
	  	   	  System.out.println("enter the name of"+(i+1)+"th product");
	  	   	  name=s.nextLine();
	  	   	  System.out.println("enter the price of"+(i+1)+"th product");
	  	   	  price=s.nextDouble();
	  	   	  s.nextLine();
	  	   	  pro[i].getproduct(code,name,price);
	  	   	  
	  	   	}
	  	   Double min=pro[0].price;
	  	   name=pro[0].pname;
	  	   for(i=1;i<3;i++)
	  	   	{
	  	   	  if(min>pro[i].price)
	  	   	  	{
	  	   	  	   min=pro[i].price;
	  	   	  	   name=pro[i].pname;
	  	   	  	}
	  	   	}
	  	   	
	  	   System.out.println("The product having minimum price is \n name "+name+"\t having price "+min);
	  	   
	  	}
	}
