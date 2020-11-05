package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ZooServiceImpl implements ZooService
{
    @Autowired
    private ZooRepository zooRepository;
}
