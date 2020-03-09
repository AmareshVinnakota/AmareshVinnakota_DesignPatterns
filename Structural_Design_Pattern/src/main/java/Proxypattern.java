import java.util.Scanner;

public class Proxypattern {

	public static void main(String args[])
	{Scanner ama=new Scanner(System.in);
	System.out.println("Enter the doc to be shared");
	String s=ama.next();
		fileaccess s1=new Duplicate(s);
		s1.share();
		
	}
}
