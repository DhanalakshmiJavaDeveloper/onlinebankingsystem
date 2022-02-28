package com.liveproject.pckg.dao;

	import java.util.List;

import org.springframework.data.repository.CrudRepository;

	import com.liveproject.pckg.entity.Bank;


	public interface BankRepo extends CrudRepository<Bank, Integer> 
	{

		Object findById(int cusid);

		List<Bank> findAll();

		void save(Bank b);

		void deleteById(int cusid);

	}


