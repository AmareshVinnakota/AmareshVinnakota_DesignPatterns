import java.util.Scanner;

public class FactoryDesignPattern {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the model phone you want to check");
		String s=sc.next();
		
		Costfactory e=new Costfactory();
		Specialization w=e.getPhone(s);
		
		w.camera();
		w.storagecapacity();
		
		w.cost();
	}

}
