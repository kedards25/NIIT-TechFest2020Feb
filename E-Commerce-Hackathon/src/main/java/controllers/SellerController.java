package controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import models.CustomerModel;
import services.ICustomerDAO;

public class SellerController {
	
	@Autowired
	ICustomerDAO dao;
	
	@GetMapping("/")
	public String getCustById(@RequestParam("sellerId") int sellerId, @RequestParam("pwd") String sellerPass)
	{
		Optional<CustomerModel> custModel=dao.findById(sellerId);
		return "home";
	}

	@PostMapping("/register")
	public String createSeller(CustomerModel model)
	{
		dao.save(model);
	}
	
	

}
