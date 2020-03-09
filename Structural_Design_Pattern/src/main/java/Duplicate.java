
public class Duplicate implements fileaccess {
	private String doc;
	 private Original o;
	  
	Duplicate(String doc)
	{
		this.doc=doc;
		
	}
	public void share()
	{
		
		
		if(o==null)
		{
			o =new Original(doc);
		}
		o.share();
	}

}
