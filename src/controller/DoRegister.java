package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String customerId = request.getParameter("id");
		String passWord = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		System.out.println("id = " + request.getParameter("id") );
		String page = null;
		
		if( customerId.isEmpty() || passWord.isEmpty() || name.isEmpty() || gender.isEmpty() || email.isEmpty()){
			page="/view/registerFail.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			dispatcher.forward(request, response);
			return;
		}

		
		Customer customer = new Customer(customerId, passWord, name, gender, email);
		CustomerService.getInstance().addCustomer(customer);
		page="/view/registerSuccess.jsp";
		request.setAttribute("customer", customer);
		
		if(CustomerService.getInstance().login(customerId, passWord) != null)
			System.out.println("id = " + CustomerService.getInstance().login(customerId, passWord).getId());
		else
			System.out.println("fail");
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

	}

}
