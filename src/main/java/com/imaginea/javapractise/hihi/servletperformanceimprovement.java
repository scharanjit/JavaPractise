package hihi;
//The init method is designed to be called only once. It is called when the servlet is first created, and
//not called again for each user request.
//So, it is used for one-time initializations, just as with the init method of applets
//Use the servlet init() method to cache static data, and release them in the destroy() method.
//Use StringBuffer rather than using + operator when you concatenate multiple strings.
//Use the print() method rather than the println() method.
//Automatic Database synchronization is not possible in SERVLETS we need to code for that manually..response.setHeader("Refresh",5); 



//jsp can handle run time exxception <%@ page inlude="error.jsp" /%>"
public class servletperformanceimprovement {
	public void init() throws ServletException {
		  // Initialization code...
		}
}
