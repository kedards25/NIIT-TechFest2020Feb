package controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import models.CustomerModel;
import services.ICustomerDAO;

@Controller
public class CustomerController {

		@Autowired
		ICustomerDAO dao;
		
		@GetMapping("/")
		public String getCustById(@RequestParam("customerId") int custId, @RequestParam("pwd") String custPass)
		{
			Optional<CustomerModel> custModel=dao.findById(custId);
			return "home";
		}
	
		@PostMapping("/register")
		public String createCustomer(CustomerModel model)
		{
			dao.save(model);
		}
		
}
