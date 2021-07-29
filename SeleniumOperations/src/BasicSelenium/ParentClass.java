package BasicSelenium;

public class ParentClass 
{
	
	String name;
	int id;
	String bname,bauthor;
	
	public ParentClass(String name)
	{
		this.name = name;
	}
	
	public int GetInterestRate()
	{
		return 0;
	}
	
	
	public ParentClass(int id,String bname,String bauthor)
	{
		this.id = id;
		this.bname = bname;
		this.bauthor = bauthor;
	}
	
	
}
