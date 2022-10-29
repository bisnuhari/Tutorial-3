package tutorial3;

class Base1
{
	public void Print()
	{
		System.out.println("Base");
	}
}
class Derived1 extends Base1
{
	public void Print()
	{
		System.out.println("Derived");
	}
}
public class Eleven {
	public static void DoPrint(Base1 o)
	{
		o.Print();
	}

	public static void main(String[] args) {
		Base1 x = new Base1 ();
		Base1 y= new Derived1();
		Derived1 z=new Derived1();
		DoPrint(x);
		DoPrint(y);
		DoPrint(z);
		
	}
}
