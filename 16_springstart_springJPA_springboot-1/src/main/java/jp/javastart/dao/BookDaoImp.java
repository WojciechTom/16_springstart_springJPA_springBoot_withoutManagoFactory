package jp.javastart.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import jp.javastart.model.Book;

@Repository
public class BookDaoImp implements BookDao{

	@PersistenceContext
	private EntityManager manago;
	
	BookDaoImp(){}
	
	@Override
	@Transactional
	public void save(Book book) {
		manago.persist(book);
	}

	

	@Override
	@Transactional
	public Book get(Long id) {
		return manago.find(Book.class, id);
		
	}

}
