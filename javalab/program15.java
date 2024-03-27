class Fibanoci implements Runnable
	{
	   private int count;
	   public Fibanoci(int count)
	   	{
	   	  this.count=count;
		}
	   @Override
	   public void run()
	   	{
	   	  int a=0,b=1,temp;
	   	  System.out.println("Fibonacci numbers: ");
	   	  for(int i=0;i<count;i++)
	   	  	{
	   	  	  System.out.println("Fibanacci series: ");
	   	  	  temp=a+b;
	   	  	  a=b;
	   	  	  b=temp;
	   	  	}
	   	}
	}
class program15
	{
	   public static void main(String args[])
	   
	}
	
	
/*
class FibonacciGenerator implements Runnable {
    private int count;

    public FibonacciGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        long a = 0, b = 1;
        System.out.println("Fibonacci numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            long temp = a + b;
            a = b;
            b = temp;
        }
    }
}

class EvenNumberDisplay implements Runnable {
    private int start;
    private int end;

    public EvenNumberDisplay(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("\nEven numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int fibonacciCount = 10; // Number of Fibonacci numbers to generate
        int evenStart = 1; // Start of the even number range
        int evenEnd = 20; // End of the even number range

        // Create threads
        Thread fibonacciThread = new Thread(new FibonacciGenerator(fibonacciCount));
        Thread evenNumberThread = new Thread(new EvenNumberDisplay(evenStart, evenEnd));

        // Start threads
        fibonacciThread.start();
        evenNumberThread.start();
    }
}

*/
