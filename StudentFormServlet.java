

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class StudentFormServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/Html");
		String formstr="<html>"
				+"<body>"
				+"<form  action='/Quiz_App1/addNum' method='GET'>"
				+"Enter Name: <input type='text' name= 'student_name'/>"
				+"<br/>"
				+"Enter Maths Marks: <input type='text' name= 'mark_maths'/>"
				+"<br/>"
				+"Enter Science Marks: <input type='text' name= 'mark_science'/>"
				+"<br/>"
				+"Enter ICT Marks: <input type='text' name= 'mark_ict'/>"
				+"<br/>"
				+"<input type ='submit'/>"
				+"</form>"		
				+"</body>"
				+"</html>";

		PrintWriter out = resp.getWriter();
		out.println(formstr);
		out.close();
		
	}
	

}
