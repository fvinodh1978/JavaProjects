package com.oops.java;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
		//Servelets are server side programs developed by Java and deployed in webserver or App Server
		//in CGI, for each request a new CGI process instance is created reducing the performance and bad memory usage and there are high level of system crash
		//a servlet will get instantiated once even if there are 100 request only new thread will be created by the webserver for each request but only one servelet process
		//when a new thread is created, memory is not utilised
		//Client request is received by wenserver and send to appropriate servelet
		//every webserver is identified by port ranging from 0 to 65535, default is 8080 
		//No two Application wont work in one port so different ports has to be used
		//to start tomcat, just use D:>tomcat8
		//3 applications are already available in tomcat : Root, docs, manager, 
		//all the webapplications should be placed in webapps folder
		//for deploying our code, create a folder inside webapps say edureka
		//inside edureka create a folder WEB-INF , inside which we should have web.xml ()
		//<web-app>
		//<display-name>Welcome to edureka</display-name>
		//</web-app>
		//lib - where we place all the jars
		//servelet - all the servelet programs should be placed
		//lifecycle of a serveet is declared in javax.servelet.Servelet(Interface
		//initialisation - public void init(ServeletConfig) throws ServeletException
		//	When the request comes, if servelet instance is not available, WS load the servelet class, create a new inistance(alot memory) and call the init method and then service and destroy
		//  when the 2nd request comes, it will call the service and destory method, so service method multiple thread is created based on the number of request
		//Servicing - public void service(ServeletRequest, ServeletResponse) throws ServeletException, IOException
		//Destroying - public void destory() -- this will be called once the webserver is stopped

		public class ServletsDemo extends GenericServlet{
			public void init(ServletConfig config) throws ServletException{
				super.init(config);
				System.out.println("Inside Init Method");
			}
			public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
				res.setContentType("text/plain");
				PrintWriter out=res.getWriter();
				System.out.println("Inside Init Method");
			}
			public void destroy(){
				System.out.println("Inside Destroy Method");
			}
	}
