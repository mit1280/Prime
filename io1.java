import java.io.*;
class io1
{
	public static void main(String s1[]) throws IOException
	{ 
	     FileReader f=new FileReader("1.txt");    
          BufferedReader b=new BufferedReader(f);    
          int i;    
          while((i=b.read())!=-1){  
          System.out.print((char)i);  
          }  
          b.close();    
          f.close();           
	}
}