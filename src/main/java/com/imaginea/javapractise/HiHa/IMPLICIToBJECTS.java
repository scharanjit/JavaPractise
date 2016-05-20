//JSP Implicit Objects are the Java objects that the JSP Container makes available
// to developers in each page 
//and developer can call them directly without being explicitly declared.
//JSP Implicit Objects are also called pre-defined variables.

/*request	 This is the HttpServletRequest object associated with the request.
response	 This is the HttpServletResponse object associated with the response to the client.
out	         This is the PrintWriter object used to send output to the client.
session	     This is the HttpSession object associated with the request.
application	 This is the ServletContext object associated with application context.
config	     This is the ServletConfig object associated with the page.
pageContext	 This encapsulates use of server-specific features like higher performance JspWriters.
page	     This is simply a synonym for this, and is used to call the methods defined by the translated servlet class.
Exception	 The Exception object allows the exception data to be accessed by designated JSP.
*/

// page is used to get servlet information
//page context is used to get  page-related information, attributes session
//application = pageContext.getServletContext();
  // config = pageContext.getServletConfig();
  //session = pageContext.getSession();
   //out = pageContext.getOut();

// <%= ((Servlet)page).getServletInfo () %> used as type cast to page

//request.getParameter()--. frm backhand table//// to extract request parameters (i.e. data sent by posting a html form ). The request.getParameter() always returns String value and the data come from client.
//request.getAttribute()--> user enter the data///// to get an object added to the request scope on the server side i.e. using request.setAttribute().

package HiHa;

public class IMPLICIToBJECTS {

}
