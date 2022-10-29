package tutorial3;

class Grandparent
{
	public void Print()
	{
		System.out.println("Grandparent's Print()");
	}
}
class Parent extends Grandparent
{
	public void Print()
	{
		System.out.println("Parent's Print()");
	}
}
class Child extends Parent
{
	public void print()
	{
		super.Print();
		System.out.println("Child's Print()");
	}
}
public class Twelve {

	public static void main(String[] args) 
	{
	Child c= new Child();
	c.Print();
	}
}
