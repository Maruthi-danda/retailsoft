package com.id.retailsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.id.retailsoft.bean.TIdProductBean;

public interface TIdProductRepo extends JpaRepository<TIdProductBean, Long>{
	
	

}
