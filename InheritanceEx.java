package com.chapter3;

class X 
{
int a, b;
void display1 ()
{
System.out.println ("a and b: " + a + " " + b);
}
}
// Create a subclass by extending class A.
class Y extends X
{
int c;
void display2 ()
{
System.out.println ("c: " + c);
}
void add ()
{
System.out.println ("a+b+c: " + (a + b + c));
}
}
public class InheritanceEx
{
public static void main (String args[])
{
X base = new X ();
Y derived = new Y ();
// The superclass may be used by itself.
base.a = 15;
base.b = 25;
System.out.println ("Contents of base class : ");
base.display1 ();
System.out.println ();
/* The subclass has access to all public members of
its superclass. */
derived.a = 11;
derived.b = 22;
derived.c = 33;
System.out.println ("Contents of derived class : ");
derived.display1 ();
derived.display2 ();
System.out.println ();
System.out.println ("Sum of a, b and c in derived class :");
derived.add();
}
}
