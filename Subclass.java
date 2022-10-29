package tutorial3;

class ParentClass
{
	public void parentmethod()
	{
		System.out.println("This is parent class");
	}
}
class ChildClass extends ParentClass
{
	public void childmethod()
	{
		System.out.println("Ths is Child Class");
	}
}
public class Subclass {

	public static void main(String[] args) 
	{
		ParentClass p=new ParentClass();
		ChildClass c=new ChildClass();
		p.parentmethod();
		c.childmethod();
		c.parentmethod();
	}

}
