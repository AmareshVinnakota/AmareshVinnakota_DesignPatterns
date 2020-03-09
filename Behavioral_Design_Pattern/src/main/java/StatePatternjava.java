
public class StatePatternjava {
public static void main(String args[])
{
	A d=new A();
	
	
	
	 ss s = new ss();
     s.action(d);

     System.out.println(d.getState().toString());
     ms s1 = new ms();
     s1.action(d);

     System.out.println(d.getState().toString());
     es s2 = new es();
     s2.action(d);

     System.out.println(d.getState().toString());
     
     	
	
}
}
