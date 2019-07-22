package com.oops.java;

public class WebApplicationDemo {

	public static void main(String[] args) {
		//Web Application is a request and response application or client and Server application
		//Server is a machine which provide service to the client, and Client is an Aplication or Server which accessing the service
		//All the web applications, we have server side and client side programs
		//Programs in the client m/c are used to send the request to server and receive the response thru HTTP protocol
		//Programs in Server is to receive the request and send the response back
		//Client Side programs example Web Browser
		//Server Side Programs -- html/Servelets/jsp/ASP/ASP.NET/CGI
		//Server Side programs with Java is called Servelet
		//All Server side programs should be installed/placed in webserveer 
		//Example of webserver is IIS, Apache Tomcat etc
		//Webservewr is a server capable of receiving the request from any client based on HTTP protocol/TCP/IP
		//each webserver is identified by a port #
		//Anything in the Webserver that can be accessed by client is called webresource
		//Any webresource can be requested by the client
		//URL : protocol://domain/webresource
		//Application Server is an extension of WebServer  which provide Load Balancing, Resoiucre Management, State Management
		//Application Server example : JBOSS...
		//Methods of HTTP get, put...
		//Form is used to specify where to submit the request : <form action="login.jsp" name = "login" method="get/post">
		//method="get/post" is used to tell , how to submit to server side program
		//get is the default method if we dont give explicitly
		//get                                               | post 
		//used to submit limited/less amount of data( 2kb)  | submitting more amount of data
		//String Type                                       | anythype of data , for uploading a file use post
		//request is send as Query string in the URL itself | http request object
		//example http:////login.jsp?userid=123&pwd=123     | anythype of data , for uploading a file use post
		//Book Marking is possible                          | Not Possible
		//not secured as the details are send in the url    | secured
		//stored in browser history                         | not stored
	}

}
