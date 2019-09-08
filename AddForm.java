import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/Html");
		
		String formstr="<html>"
				+"<body>"
				+"<form  action='/Quiz_App1/addNum' method='GET'>"
				+"Enter number1: <input type='text' name= 'num1'/>"
				+"Enter number2: <input type='text' name= 'num2'/>"
				+"<input type ='submit'/>"
				+"</form>"		
				+"</body>"
				+"</html>";
		
		PrintWriter out = resp.getWriter();
		out.println(formstr);
		out.close();
	}

}
