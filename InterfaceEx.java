package com.chapter3;
interface Volume // interface defined
{
final static float pi = 3.14F;
final static float q = 1.33F; // q=4/3
float compute (float x, float y, float z);
}
class Cuboid implements Volume // interface implemented
{
public float compute (float x, float y, float z)
{
return (x*y*z);
}
}
class Sphere implements Volume
{
public float compute (float x, float y, float z)
{
return (q*pi*x*x*x);
}
}
public class InterfaceEx
{
public static void main (String args[])
{
Cuboid c = new Cuboid();
Sphere s = new Sphere();
Volume v; // interface object
v = c; // v refers to cuboid object c 
System.out.println("Area of Cuboid = " + v.compute(11,9,8));
v = s; // v refers to sphere object s
System.out.println("Area of Sphere = " + v.compute(10,0,0));
}
}