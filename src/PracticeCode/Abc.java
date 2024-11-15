package PracticeCode;

public class Abc {
      int x=20;       //instance variable
      static int o=90;   //static variable
	public static void main(String[] args)
	{
		int a=10;        //local variable
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		Abc y=new Abc();
		System.out.println(y.x);
		
		System.out.println(Abc.o);

	}

}
