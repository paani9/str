package strg;

public class main3 {
	public  static void main(String[] args)
	{System.out.println("**Main starts**");
	int[] arr={20,10,50,60};
	try{
		System.out.println(arr[8]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("caught..");
	}
	catch(ArithmeticException e)
	{
		System.out.println("handled..");
	}
	System.out.println("**main ends**");
	}

}

