package com.lambdaschool.javazoos.repository;

import com.lambdaschool.javazoos.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {
}
