class buffer
{
	int f[];
	buffer()
	{
		f=new int[5];
		for(int i=0;i<5;i++)
		{
			f[i]=0;
		}
		f[0]=1;
	}
	synchronized void sort(int p_id,String m)
	{
		System.out.println("Thread is"+m);
		try
		{
			while(f[p_id]==0)
			{	
				wait();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("you are in consumer thread "+e);
		}
		int l=p_id*0;
		int u=l+10;
		for(int i=l;i<u;i++)
			System.out.println(i);
		f[(p_id+1)%5]=1;
		notifyAll();
		System.out.println("Thread done"+m);
	}
}
class ascending extends Thread
{
	String msg;
	buffer b_ref;
	int id;
	ascending(int i,buffer b,String m)
	{
		super();
		msg=m;
		id=i;
		b_ref=b;
		start();
	}
	public void run()
	{
		try
		{
			System.out.println("you are in producer thread "+msg);
			b_ref.sort(id,msg);
			sleep(00);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
	}
}

class t_sort
{
	public static void main(String s[])
	{
		buffer b1=new buffer();
		ascending p1=new ascending(0,b1,"First Thread");
		ascending p2=new ascending(1,b1,"Second Thread");
		ascending p3=new ascending(2,b1,"Third Thread");
		ascending p4=new ascending(3,b1,"Forth Thread");
		ascending p5=new ascending(4,b1,"Fifth Thread");
		try
		{
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();
		}catch(InterruptedException e){
			System.out.println("Exception");
		}
	}
}