package tutorial3;
class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle (int l, int b)
	{
	length=l;
	breadth=b;
	}
	public void PrintArea()
	{
	System.out.println(length*breadth);
	}
	public void printPerimeter()
	{	
	System.out.println(2*(length+breadth));	
	}
}
class Square extends Rectangle
	{
	int side;
	public Square(int s)
	{
		super(s,s);
	}
}

public class Eight {

	public static void main(String[] args) {
	Rectangle r=new Rectangle(5,7);
	r.PrintArea();
	r.printPerimeter();
	
	Square s= new Square(7);
	s.PrintArea();
	s.printPerimeter();
	}

}
