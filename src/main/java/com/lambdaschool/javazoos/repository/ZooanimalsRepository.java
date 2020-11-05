package com.lambdaschool.javazoos.repository;

import com.lambdaschool.javazoos.models.Zooanimals;
import org.springframework.data.repository.CrudRepository;

public interface ZooanimalsRepository extends CrudRepository<Zooanimals, Long> {
}
