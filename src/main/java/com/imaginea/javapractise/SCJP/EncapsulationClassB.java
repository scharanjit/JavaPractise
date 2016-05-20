package SCJP;

//private variables...public getter setter...no body can access basic value name & email..they r encapsulated

public class EncapsulationClassB {

	private String name;
	private String eMail;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getEMail()
	{
		return eMail;
	}
	
	public void setEMail(String eMail)
	{
		this.eMail=eMail;
	}
	
}
