package services;

import org.springframework.data.repository.CrudRepository;

import models.SellerModel;

public interface ISellerDAO extends CrudRepository<SellerModel, Integer>{

}
