package methodOverloadingdemo;

class MyClass
{
	int addition()
	{
		return(10);
	}
	int addition(int i, int j)
	{
		return i + j ;
	}
	
	int addition(int i, int j, int k)
	{
		return i + j - k ;
	}

	String addition(String s1, String s2)
	{
		return s1 + s2;   
	}

	double addition(double d1, double d2)
	{
		return d1 + d2;   
	}

	public static void main(String args[])
	{
		MyClass Obj = new MyClass();

		System.out.println(Obj.addition());
		System.out.println(Obj.addition(2,5));
		System.out.println(Obj.addition("Hello ","World"));
		System.out.println(Obj.addition(1.5,2));
		System.out.println(Obj.addition(10,3,3));
		
	}
}

