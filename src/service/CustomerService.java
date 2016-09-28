package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customers;

	private static final CustomerService instance = new CustomerService();
	
	private CustomerService() {
		customers = new HashMap<String, Customer>();
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer) {
		System.out.println("user registered" + customer.getId() + " " + customer.getPassword());
		customers.put(customer.getId(),customer);
	}
	
	public Customer login(String id, String password){
		//System.out.println("get id = " + id + "get pw =" + password);
		//System.out.println("real id = " + customers.get(id).getId() + "real pw =" + customers.get(id).getPassword());
		if(id != null && customers.get(id.toLowerCase()).getPassword().equals(password)){
			return(customers.get(id.toLowerCase()));
		}
		else
			return null;
	}
}
