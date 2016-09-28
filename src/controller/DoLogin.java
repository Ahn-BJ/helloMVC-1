package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("id");
		String passWord = request.getParameter("password");
		System.out.println("login id : " + customerId + "pw : " + passWord);
		CustomerService service =  CustomerService.getInstance();
		Customer customer = service.login(customerId, passWord);
		request.setAttribute("customer", customer);
		
		//we can iterate over lists using foreach in jstl
		//List<Customer> customers = new ArrayList<>();

		//request.setAttribute("customerList", customers);
		String page;
		
		if(customer == null)
			page="/view/loginFail.jsp";
		else
			page="/view/success.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
