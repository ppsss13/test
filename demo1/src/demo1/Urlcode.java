package demo1;

public class Urlcode {
 
	
	public static void main(String args[])
	{
		Urlcode ob1=new Urlcode();
		ob1.check("UP");
	}
	void check(String a)
	{int p=0;
	int q=0;
	int g;
	int h;
	for(int i=0;i<200;i++)
	{
		if(a=="UP")
		{
			p=p+1;
		}
		else
		{
			q=q+1;
		}
		
	}
	 g=p/200*100;
	 h=q/200*100;
	 System.out.println("The percentage of up is "+g);
	 System.out.println("The percentage of down is "+h);
	}
	
}
