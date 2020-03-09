
public class Costfactory {
public Specialization getPhone(String s)
{
	if (s.equals("Iphone_6s"))
{
	return new Iphone_6s();
}
	else if(s.equals("Iphone_7s"))
			{
		return new Iphone_7s();
				
			}
	else if(s.equals("Iphone_11"))
	{
		return new Iphone_11();
		
	}
	else
	{
		return(null);
	}
	
	
	
	
}
}
