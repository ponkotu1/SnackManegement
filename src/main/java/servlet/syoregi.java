package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.meso;
import dto.Snack;
/**
 * Servlet implementation class syoregi
 */
@WebServlet("/syoregi")
public class syoregi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public syoregi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String syousai = request.getParameter("syousai");
		String name = request.getParameter("name");
		String nedan = request.getParameter("nedan");
		
		Snack emp = new Snack(-1,syousai,name,nedan);
		
		int result = meso.regiesna(emp);
		
		String view = "";
		if(result == 0) {
			view = "WEB-INF/view/syoregi.jsp?error=1";
		}else {
			view = "WEB-INF/view/successregi.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
