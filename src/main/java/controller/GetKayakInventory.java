package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BuyKayakQuote;
import model.KayakColor;
import model.KayakInventory;

/**
 * Servlet implementation class GetKayakInventory
 */
@WebServlet("/getKayakInventory")
public class GetKayakInventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetKayakInventory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response4) throws ServletException, IOException {
		int userNumber = Integer.parseInt(request.getParameter("userNumber"));
		int userColor = Integer.parseInt(request.getParameter("userColor"));
		KayakInventory check = new KayakInventory(userNumber, userColor);
		KayakColor check2 = new KayakColor(userNumber, userColor);
		request.setAttribute("availability", check);
		request.setAttribute("availability2", check2);
		getServletContext().getRequestDispatcher("/response4.jsp").forward(request, response4);
		
	}

}
