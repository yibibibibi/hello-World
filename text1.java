class Person
{
	private String name = "Lise";
	private int age = 3;
	public void setAge(int a)
	{
		if(a>0 && a<130)
		{
             age = a;
			 run();
		}
		else
			System.out.println("feifa age")
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String b)
	{
	    name = b;
	}
	public String getName()
	{
		return name;
	}
	void run()
	{
	    System.out.println(name+"ÒÑ¾­"+age+"ËêÁË£¡");
	}
}
class text1 
{
	public static void main(String[] args) 
	{
		Person a = new Person();
	    a.setAge(20);
		a.setName("bobby");
		a.run();
		/* //a.run();
		 a.name="surui";
		 Person b = new Person();
		 //a.run();
		// b.run();
		// new Person().age=4;
		// new Person().run();
		 kill(new Person());
	}
	public static void kill(Person p)
	{
	  p.age = 0 ;
	  p.name = "dead man";
	  p.run();
	}*/
	
	
	}
}
