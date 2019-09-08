import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoopingNumber extends  HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		String param = request.getParameter("num");
		int loopNum = Integer.parseInt(param);
		
		PrintWriter out= resp.getWriter();
		for(int i=0;i<=loopNum;i++) {
			out.println(i);
		}
	}
}
