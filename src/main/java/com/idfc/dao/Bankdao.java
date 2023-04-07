package com.idfc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.idfc.dto.BankDto;
@Component
public class Bankdao {
EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
EntityManager entityManager = entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction =entityManager.getTransaction();

public void insert(BankDto bankDto) {
	entityTransaction.begin();
	entityManager.persist(bankDto);
	entityTransaction.commit();
}
public void remove(int id) {
	BankDto bankDto=entityManager.find(BankDto.class, id);
	entityTransaction.begin();
	entityManager.remove(bankDto);
	entityTransaction.commit();
	
}
public List<BankDto> fetch(){
	Query query=entityManager.createQuery("select data from BankDto data");
	List<BankDto> dtos=query.getResultList();
	return dtos;
}
}
