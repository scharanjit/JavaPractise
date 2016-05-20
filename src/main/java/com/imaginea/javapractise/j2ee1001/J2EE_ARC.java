package j2ee1001;

public class J2EE_ARC {
	final static int b = 1;  //final value shud be initialised
	{
		//  b++;//Compilation error because a final variable can not be modified in the code
	}

	public static void main(String[] args) {
		int a[] = new int[]{0,2,4};
		//b++;
		System.out.println("a[1] : "+a[1]);

	}
}

/*
 * SOA--> DOA-->CORBA-->J2EE(n tier architecture)
 * 
 1.) Client Layer--> Browser,Java Message Service,Web service client,Application Client server
 2.)Presentation Layer--> JSP,Servlet, HTML
 3.)Business Layer--> EJB(Enterprise beans represent persistent objects, such as a database row. Entity beans are likely to call a full range of JDBC interfaces),POJO CLASSES,Session Beans(encapsulate the business processes and rules logic.)
 4.)Data Access Layer--> JDBC client,connector
 5.)DATA LAyer--> RDBMS

 * 
 * 
 * 
 * 
 * EJB are primarily of three types which are briefly described below:

Type	Description
Session Bean	Session bean stores data of a particular user for a single session. It can be stateful or stateless. It is less resource intensive as compared to entity beans. Session bean gets destroyed as soon as user session terminates.

Entity Bean	Entity beans represents persistent data storage. User data can be saved to database via entity beans and later on can be retrived from the database in the entity bean.

Message Driven Bean	Message driven beans are used in context of JMS (Java Messaging Service). Message Driven Beans can consumes JMS messages from external entities and act accordingly.

 * 
 * */
