package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BuyKayakQuote;

/**
 * Servlet implementation class GetKayakPrice
 */
@WebServlet("/getKayakPrice")
public class GetKayakPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetKayakPrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int userBuyNumber = Integer.parseInt(request.getParameter("userBuyNumber"));
		BuyKayakQuote buy = new BuyKayakQuote(userBuyNumber);
		request.setAttribute("buyKayaks", buy);
		getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
		
		
		
	}

}
