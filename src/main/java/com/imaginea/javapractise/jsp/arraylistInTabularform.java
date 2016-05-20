package jsp;

//public class arraylistInTabularform {
//
//}


//chk dis :- http://stackoverflow.com/questions/19625962/printing-mutiple-array-list-on-jsp-page-in-tabular-formatresolved


/*
 * 
 * Stack Exchange sign up log in tour help  stack overflow careers  


Stack Overflow
Questions
 
Tags
 
Users
 
Badges
 
Unanswered
 
Ask Question
Take the 2-minute tour × Stack Overflow is a question and answer site for professional and enthusiast programmers. It's 100% free, no registration required.
Printing mutiple array list on jsp page in tabular format(resolved)

up vote
0
down vote
favorite
I have been trying to print 5 array list on my jsp page using scriplets in tabular format but I am unable to do so. I would be really glad if someone could suggest what's wrong with my code. In my output page, I am just seeing the heading printed. The data in the arraylist is not printed. Also, I am not seeing any error/exception information displayed.

1)view.jsp(My jsp page)

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.AppUtils.*"%>
<%@page import="java.util.ArrayList"%>
<%Utils utils = new Utils(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Page</title>
</head>
<body>
    <form action="registerForm.jsp">
    <table border="1">
        <tr><td>Cuid</td>
        <td>First Name</td><td>Last Name</td>
        <td>Mobile</td><td>Desk</td></tr>

    <%for(int i=0; i<utils.getCount();i++){%>
        <tr>
            <td><%out.print(utils.getCuid().get(i));%></td>
            <td><%out.print(utils.getFname().get(i));%></td>
            <td><%out.print(utils.getLname().get(i));%></td>
            <td><%out.print(utils.getMobile().get(i));%></td>
            <td><%out.print(utils.getDesk().get(i));%></td>
        </tr>
    <%} %>

    </table>
    <input type="submit" value="Register"/>
    </form>

</body>
</html>
2)Utils.java(My java class)

    package com.AppUtils;

import java.util.ArrayList;

public class Utils {

    public ArrayList getCuid() {
        return cuid;
    }
    public void setCuid(ArrayList cuid) {
        this.cuid = cuid;
    }
    public ArrayList getFname() {
        return fname;
    }
    public void setFname(ArrayList fname) {
        this.fname = fname;
    }
    public ArrayList getLname() {
        return lname;
    }
    public void setLname(ArrayList lname) {
        this.lname = lname;
    }
    public ArrayList getMobile() {
        return mobile;
    }
    public void setMobile(ArrayList mobile) {
        this.mobile = mobile;
    }
    public ArrayList getDesk() {
        return desk;
    }
    public void setDesk(ArrayList desk) {
        this.desk = desk;
    }
    ArrayList cuid = new ArrayList();
    ArrayList fname = new ArrayList();
    ArrayList lname = new ArrayList();
    ArrayList mobile = new ArrayList();
    ArrayList desk = new ArrayList();
    int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }


}
3)ViewServlet.java(servlet where I added the values to all 5 arraylists)

import java.io.*;
import com.AppUtils.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


/**
 * Servlet implementation class ViewServlet
 
public class ViewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("Logining in..");
        // retrieving values entered in form
        String uname = (String)request.getParameter("uname");
        String pwd = (String) request.getParameter("pwd");

        if (uname.equals("admin") && pwd.equals("admin")) {

            try {
                viewDetails();
                System.out.println("Redirecting to view page..");
                response.sendRedirect("view.jsp");
            } catch (Exception e) {
                e.printStackTrace(); 
            }
        } 
            }

    public void viewDetails() throws Exception{
        System.out.println("Reading Data..");
        BufferedReader input = new BufferedReader(new FileReader("H:/Workspace/teamRecordsApp/WebContent/records.txt"));
        String record;
        String[] split =new String[5];

        ArrayList cuid = new ArrayList();
        ArrayList fname = new ArrayList();
        ArrayList lname = new ArrayList();
        ArrayList mobile = new ArrayList();
        ArrayList desk = new ArrayList();
        int count = 0;
        while((record=input.readLine()) != null){
            split = record.split(",");
            System.out.println("Record is : "+split[0]+","+split[1]+","+split[2]+","+split[3]+","+split[4]);
            cuid.add(split[0]);
            fname.add(split[1]);
            lname.add(split[2]);
            mobile.add(split[3]);
            desk.add(split[4]);
            count = count+1;

        }
        input.close();
        System.out.println("Reading Done...");
        Utils utils = new Utils();
        utils.setCuid(cuid);
        utils.setFname(fname);
        utils.setLname(lname);
        utils.setMobile(mobile);
        utils.setDesk(desk);
        utils.setCount(count);
        System.out.println("Total records : "+count);


    }
}
java jsp arraylist
shareimprove this question
edited Oct 28 '13 at 2:50

asked Oct 28 '13 at 1:35

user2889968
87
  	 	
What do you mean by unable to do so? –  Sotirios Delimanolis Oct 28 '13 at 1:36
  	 	
@SotiriosDelimanolis : I edited my post to include answer to your reply :-) –  user2889968 Oct 28 '13 at 1:42
add a comment
2 Answers
activeoldestvotes
up vote
0
down vote
accepted
Multiple things wrong with this.

Your servlet is not actually passing anything to your JSP. Your viewDetails method is constructing an instance of the Utils object but that instance just disappears at the end of the method. Somehow you need to stick it in request scope (request.setAttribute("utils", utils))

Even if you do that, response.sendRedirect to your JSP is generating a whole new request, round-trip from the browser, which would lose any request-scoped attributes. You probably want to forward rather than redirect.

Finally, your JSP is currently getting a new, empty instance of Utils - that should be replaced with request.getAttribute("utils") that you set from your servlet.

shareimprove this answer
answered Oct 28 '13 at 1:46

wrschneider99
5,82522265
  	 	
I was able to implement this.Thank you so much!:) –  user2889968 Oct 28 '13 at 2:49
add a comment
up vote
0
down vote
There are two issues

You are not forwarding to the JSP, you are sending a redirect with response.sendRedirect("view.jsp"). This will send a 302 response to the http client, possibly a browser, which will then send a new http request to view.jsp. As such, any attributes you set in the request will not be available in the new request.
In your jsp, you declare <%Utils utils = new Utils(); %>. When you then try to iterate with utils.getCount(), you are referring to this newly created object, not the object you declared locally in the viewDetails() method. As such, utils.getCount() returns 0 and your loop doesn't do anything.
Look into HttpServletRequest#setAttribute(String, Object) if you are going to use RequestDispatcher#forward() or HttpSession#setAttribute(String, Object) if you are going to use HttpServletResponse#sendRedirect(String).

shareimprove this answer
answered Oct 28 '13 at 1:45

Sotirios Delimanolis
112k12108205
  	 	
This did the trick. Thanks a lot for helping! :) –  user2889968 Oct 28 '13 at 2:49
add a comment
Your Answer


 
Sign up or log in

Sign up using Google
Sign up using Facebook
Sign up using Stack Exchange
Post as a guest

Name

Email

 
By posting your answer, you agree to the privacy policy and terms of service.

Not the answer you're looking for?	Browse other questions tagged java jsp arraylist or ask your own question.

asked

1 year ago

viewed

1696 times

active

1 year ago

Related

-1 how can i pass more than one array list from single servlet to two more jsp or servlets?
0 how to create an array list of objects in JSP
3 Import and print arraylist to JSP
0 JSP access methods of objects in a list
-1 reusing Text field value in same jsp page
1 How to iterate through an array list on a JSP without JSTL
-2 displaying arraylist item in jsp page one by one
0 Use an ArrayList in Java on JSP Page
-1 print an arraylist while passing it from a controller to a jsp
Hot Network Questions


 */



