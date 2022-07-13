package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Connection;



@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Integer>{

	Connection findByConnetionidAndConsumernum(int connetionid, Long consumernum);
}
