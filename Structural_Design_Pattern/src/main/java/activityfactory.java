
public class activityfactory {
public  Branch c;
public  Branch e;
public  Branch m;
public  Branch r;

activityfactory()
{
	c=new cse();
	e=new ece();
	m=new mec();
	r=new civil();
}
public void csecount()
{
	c.count();
	
}
public void ececount()
{
	e.count();
}
public void meccount()
{
	m.count();
	
}
public void civilcount()
{
	r.count();
	
}


}
