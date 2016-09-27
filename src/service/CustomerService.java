package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customers;

	public CustomerService() {
		customers = new HashMap<String, Customer>();
		addCustomer(new Customer("id001","pw001", "Alice", "alice.hansung.ac.kr"));
		addCustomer(new Customer("id002","pw002", "Bob", "Bob.hansung.ac.kr"));
		addCustomer(new Customer("id003","pw003", "Charlie", "Charlie.hansung.ac.kr"));
		addCustomer(new Customer("id004","pw004", "David", "David.hansung.ac.kr"));
		addCustomer(new Customer("id005","pw005", "Edison", "Edison.hansung.ac.kr"));

	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getId(),customer);
	}
	
	public Customer findCustomer(String id){
		if(id != null)
			return(customers.get(id.toLowerCase()));
		else
			return null;
	}
}
