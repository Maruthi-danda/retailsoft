package com.id.retailsoft.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.id.retailsoft.bean.TIdProductBean;
import com.id.retailsoft.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProcuctController {
	
	Logger log = LoggerFactory.getLogger(ProcuctController.class);
	
	@Autowired
	ProductService productService;
	
	
	
	
	@PostMapping("/saveProducts")
	public ResponseEntity<List<TIdProductBean>> saveProducts(@RequestBody List<TIdProductBean> saveAllProducts){
		List<TIdProductBean> productList =  null;
		try {
			log.info("saveProducts method calling..");
		productList = productService.saveAllProducts(saveAllProducts);
		}catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity<>(productList,HttpStatus.METHOD_FAILURE);
		}
		
		return new ResponseEntity<>(productList,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<TIdProductBean>> getAllProducts(){
		List<TIdProductBean> productList =  null;
		try {
			log.info("getAllProducts method calling..");
		productList = productService.getAllProducts();
		}catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity<>(productList,HttpStatus.METHOD_FAILURE);
		}
		
		return new ResponseEntity<>(productList,HttpStatus.OK);
	}

}
