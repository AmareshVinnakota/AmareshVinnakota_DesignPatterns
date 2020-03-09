import java.util.Scanner;

public class Strategy_Design_Pattern {
public static void main(String args[])
{Scanner ama=new Scanner(System.in);
System.out.println("Enter the values of a and b");
int a1=ama.nextInt();
int b1=ama.nextInt();

	Accessfactor a = new Accessfactor(new Addition());		
    a.accessing(a1,b1);
    Accessfactor a3 = new Accessfactor(new Modulus());		
    a3.accessing(a1,b1);
    Accessfactor a4 = new Accessfactor(new power());		
    a4.accessing(a1,b1);
    
	
}
}
