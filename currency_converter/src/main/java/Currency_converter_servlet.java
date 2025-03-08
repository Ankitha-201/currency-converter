

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Currency_converter_servlet
 */
@WebServlet("/Currency_converter_servlet")
public class Currency_converter_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Currency_converter_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int dollar=Integer.parseInt(request.getParameter("currency"));
		int rupees=87*dollar;
		PrintWriter pw=response.getWriter();
		String tbl="<table border=1><tr><td> $ "+dollar+"</td></tr>";
		tbl = tbl + "<tr><td> Rs."+rupees+"</td></tr></table>";
		//pw.println("rupees rs="+rupees);
		pw.println(tbl);
		pw.close();
	}

}