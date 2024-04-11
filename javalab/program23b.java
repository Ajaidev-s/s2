import java.io.*;
import java.util.Scanner;
class program23b
	{
	  public static void main(String args[])
	  	{
	  	  try
	  	  	{
	  	  	   int temp;
	  	  	   File myfile=new File("evenodd.txt");
	  	  	   File odd=new File("odd.txt");
	  	  	   odd.createNewFile();
	  	  	   FileWriter owriter=new FileWriter(odd,true);
	  	  	   even.createNewFile();
	  	  	   FileWriter ewriter=new FileWriter(even,true);
	  	  	   File even=new File("even.txt");
	  	  	   
	  	  	   Scanner s=new Scanner(myfile);
	  	  	   while(s.hasNextLine())
	  	  	   	{
	  	  	   	  temp=Interger.ParseInt(s.nextLine());
	  	  	   	  if(temp%2==0)
	  	  	   	  	{
	  	  	   	  	  owriter.write(temp+"\n");
	  	  	   	  	}
	  	  	   	  else
	  	  	   	  	{
	  	  	   	  	 ewriter.write(temp+"\n");
	  	  	   	  	}
	  	  	   	}
	  	  	}
	  	  catch(Exception e)
	  	  	{
	  	  	 System.out.println(e);
	  	  	}
	  	}
	}
