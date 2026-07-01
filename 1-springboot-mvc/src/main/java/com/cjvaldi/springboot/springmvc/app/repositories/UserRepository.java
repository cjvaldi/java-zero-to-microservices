package com.cjvaldi.springboot.springmvc.app.repositories;


import com.cjvaldi.springboot.springmvc.app.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
