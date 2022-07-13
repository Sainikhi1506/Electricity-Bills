package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.ConnectionDao;
import com.example.model.Connection;

import com.example.repository.ConnectionRepository;

public class ConnectionService implements ConnectionDao<Connection, Integer>{

	@Autowired
	 private ConnectionRepository connectionRepository;
	
	@Override
    public Connection save(Connection connection) {
        
		connection = connectionRepository.save(connection);
        return connection;
    }

    @Override
    public List<Connection> findAll() {
        List<Connection> connections = (List<Connection>) connectionRepository.findAll();
        return connections;
    }
    
}
