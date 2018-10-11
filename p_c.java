class buffer
{
	int a[][];
	int f[];
	buffer()
	{
		a=new int[3][2];
		f=new int[3];
			for(int i=0;i<3;i++)
			{
					f[i]=0;
			}
	}
	synchronized void put(int p_id,int c_id,int info,String m)
	{
		System.out.println("IN PUT");
		while(f[p_id]==1)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("you are in consumer thread "+e);
			}
		}
						System.out.println("PUT COMPLETE "+m);
		a[p_id][1]=c_id;
		a[p_id][0]=info;
		f[p_id]=1;
		notifyAll();
	}
	synchronized void get(int c_id,String m)
	{
		System.out.println("IN GET");
		int i;
		for(i=0;i<3;i++)
		{
			if(a[i][1]==c_id)
			{
				break;
			}
		}
		try
		{
			while(f[i]==0)
			{	
				wait();
			}
		}
			catch(InterruptedException e)
			{
				System.out.println("you are in consumer thread "+e);
			}
		int y=a[i][0];
		f[i]=1;
		System.out.println("your thread have info "+y);
		notifyAll();
	}
}
class producer extends Thread
{
	String msg;
	buffer b_ref;
	int p_;
	int c_;
	producer(int i,int j,buffer b,String m)
	{
		super();
		msg=m;
		p_=i;
		c_=j;
		b_ref=b;
		start();
	}
	public void run()
	{
		try
		{
			System.out.println("you are in producer thread "+msg);
			b_ref.put(p_,c_,5,msg);
			sleep(00);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
	}
}
class consumer extends Thread
{
	int c_;
	String msg;
	buffer b_ref;
	consumer (int c,buffer b,String m)
	{
		super();
		msg=m;
		c_=c;
		b_ref=b;
		start();
	}
	public void run()
	{
		try
		{
			System.out.println("you are in consumer thread "+msg);
			b_ref.get(c_,msg);
			sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
	}
}
class p_c
{
	public static void main(String s[])
	{
		buffer b1=new buffer();
		producer p1=new producer(0,0,b1,"First producer");
		producer p2=new producer(1,1,b1,"Second producer");
		producer p3=new producer(2,0,b1,"Third producer");
		consumer c1=new consumer(0,b1,"First consumer");
		consumer c2=new consumer(1,b1,"Second consumer");
		try
		{
			p1.join();
			p2.join();
			p3.join();
			c1.join();
			c2.join();
		}catch(InterruptedException e){
			System.out.println("Exception");
		}
	}
}