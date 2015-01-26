package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Most simple servlet example. Servlet writes full html response to the output stream
 * 
 * @author java
 *
 */
@WebServlet("/welcome")
public class WelcomeApp extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// We write a html content to the output stream
		String docType = "<!DOCTYPE HTML>\n";
		out.println(docType + "<HTML>\n" + "<HEAD><TITLE>Hello students from GroepT-  OMJ</TITLE></HEAD>\n"
				+ "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1>Hello students</H1>\n" + "</BODY></HTML>");
	}

}