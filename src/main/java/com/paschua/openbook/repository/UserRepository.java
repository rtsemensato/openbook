package com.paschua.openbook.repository;

import com.paschua.openbook.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByEmail(String email);

    List<User> findByPassword(String password);

    List<User> findByName(String name);
}
