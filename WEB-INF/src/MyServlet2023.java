import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2023 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String song1 = request.getParameter("song1");
		String song2 = request.getParameter("song2");
		String song3 = request.getParameter("song3");


		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Thanks for your vote!</h1><p><h3>Here are you details!:</h3>Email: "+ email + "<br>Name: " + name + "<br>Top 3 Favourite Songs of All Time: " + song1 + ", " + song2 + " and  " + song3 +" </p></body></html>");

	}

}
