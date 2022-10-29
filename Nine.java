package tutorial3;

class Shape
{
	public void Sha()
		{
		System.out.println("This is shape");
		}
}
class Rectangle1 extends Shape
	{
		public void Rec()
		{
			System.out.println("This is rectangle shape");
		}
	}
class Circle extends Shape
	{
	public void Cir()
	{
		System.out.println("This is circular shape");}
	}
class Square1 extends Rectangle1
	{
	public void Sqa()
	{
		System.out.println("Square is rectangle");}
	}
	public class Nine
	{
		public static void main(String[] args)
		{
			Square1 sq=new Square1();
			sq.Sha();
			sq.Rec();
		}
	}
