import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	
	   @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		   
		   PrintWriter out= resp.getWriter();
		   
			String num1 = req.getParameter("num1");
			String num2 = req.getParameter("num2");
			
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			String action = req.getParameter("action");
			
			
				out.println(functionCal(action, n1, n2));
		}
	   
	   public int functionCal(String action,int n1,int n2) {
		   int answer = 0;
		   if(action.equals("add")) {
			  answer=n1+n2; 
		   }else if(action.equals("sub")) {
			   answer=n1-n2;
		   }else if(action.equals("mul")) {
			   answer=n1*n2;
			  
		   }else if(action.equals("div")) {
			   answer=n1/n2;
		   }
		   
		return answer;
		   
	   }

		

	}
