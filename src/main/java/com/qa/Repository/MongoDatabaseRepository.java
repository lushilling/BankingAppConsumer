package com.qa.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qa.entity.SentAccount;

public interface MongoDatabaseRepository extends MongoRepository<SentAccount, Long> {

}
