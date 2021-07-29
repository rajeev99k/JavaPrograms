package BasicSelenium;

import java.util.HashSet;

public class ChildClass extends ParentClass
{
	String childname;

	public ChildClass(String name,String childname) 
	{
		super(name);
		this.childname = childname;
		
	}

	public int GetInterestRate()
	{
		
		return 5;
	}
	
	public int ParentClassDetails()
	{
		int interest = super.GetInterestRate();
		return interest;
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		/*HashSet<ParentClass> set = new HashSet<ParentClass>();
		ParentClass b1 = new ParentClass(1, "Algebra", "Simon");
		ParentClass b2 = new ParentClass(2, "Bio", "Mini");
		
		set.add(b1);
		set.add(b2);
		
		for(ParentClass itr: set)
		{
			System.out.println(itr.id + " "+itr.bname+ " "+itr.bauthor);
		}*/
		
		ChildClass child = new ChildClass("A","B");
		System.out.println(child.GetInterestRate());
		
		//ChildClass child2 = new ParentClass("Z");
		
		ParentClass parent1 = new ParentClass("Z");
		ParentClass parent2 = new ChildClass("A", "b");
		
		System.out.println(parent1.GetInterestRate());
		System.out.println(parent2.GetInterestRate());
		
	}
	
}
