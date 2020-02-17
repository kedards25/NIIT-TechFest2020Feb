package services;

import org.springframework.data.repository.CrudRepository;

import models.CustomerModel;

public interface ICustomerDAO extends CrudRepository<CustomerModel, Integer> {

}
