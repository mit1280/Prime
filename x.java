import java.util.*;
interface my_interface
{
	void m1();
	void m2();
}
public class x implements my_interface
{
	int p,q;
	public x(int d_p,int d_q)
	{
		p=d_p;
		q=d_q;
	}
	public void m1()
	{
		int w;
		w=p+q;
		System.out.println("Summation is"+w);
	}
	public void m2()
	{
		int w;
		w=p-q;
		System.out.println("Subtraction is"+w);
	}
	public static void main(String []s)
	{
		x y=new x(2,3);
		y.m1();
		y.m2();
	}
}