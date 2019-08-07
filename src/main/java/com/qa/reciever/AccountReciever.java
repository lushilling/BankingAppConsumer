package com.qa.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.Repository.MongoDatabaseRepository;
import com.qa.entity.SentAccount;

@Component
public class AccountReciever {

	private MongoDatabaseRepository repo;

	@Autowired
	public AccountReciever(MongoDatabaseRepository repo) {
		this.repo = repo;
	}

	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(SentAccount sentAccount) {
		repo.save(sentAccount);
	}
}
