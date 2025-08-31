package com.id.retailsoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.id.retailsoft.bean.TIdProductBean;
import com.id.retailsoft.repo.TIdProductRepo;

@Service
public class ProductService {
	
	
	TIdProductRepo tIdProductRepo;
	
	public ProductService(TIdProductRepo tIdProductRepo) {
		this.tIdProductRepo = tIdProductRepo;
	}


	public List<TIdProductBean> getAllProducts(){
		
		List<TIdProductBean> productList = null;
		
		productList = tIdProductRepo.findAll();
		
		return productList;
	}
	
    public List<TIdProductBean> saveAllProducts(List<TIdProductBean> listOfProducts){
		
		List<TIdProductBean> productList = null;
		
		productList = tIdProductRepo.saveAll(listOfProducts);
		
		return productList;
	}
	
	

}
