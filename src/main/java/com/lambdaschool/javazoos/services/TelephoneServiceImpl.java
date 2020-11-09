package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TelephoneServiceImpl implements TelephoneService
{
    @Autowired
    private TelephoneRepository telephoneRepository;
}
