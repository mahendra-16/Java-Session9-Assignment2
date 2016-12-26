package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderDemo
 */
public class HeaderDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HeaderDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2 align = 'center'> HTTP Header Request Example</h2>");
				
		out.println("<html><body><table width = 100%  border = 1 align = center>" +  "<tr><th> Header Name</th><th> Header Value </th></tr>");
		
		Enumeration<String> headernames = request.getHeaderNames();
		while(headernames.hasMoreElements()){
			String headername = headernames.nextElement();
			
			out.println("<tr><td>" + headername + "</td><td>" + request.getHeader(headername)  + "</td></tr>");
			
			//out.println(headername);
			//out.println(request.getHeader(headername));
		}
		
		out.println("</table></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
