package tutorial3;

class Base
{
	public void foo()
	{
		System.out.println("Base");
	}

}
class Derived extends Base
{
	public void foo()
	{
		System.out.println("Derived");
	}
}

public class Ten {

	public static void main(String[] args) {
		Base b = new Derived();
		b.foo();
	}

}
