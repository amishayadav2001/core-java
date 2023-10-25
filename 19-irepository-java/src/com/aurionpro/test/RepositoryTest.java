package com.aurionpro.test;

import com.aurionpro.model.IRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {
	public static void main(String[] args) {
		ProductRepository repository = new ProductRepository();
		repository.create();
		repository.read();
		repository.update();
		repository.delete();
		
		repository.showGreetings();
		
		IRepository.printWelcomeMessage();
	}

}
