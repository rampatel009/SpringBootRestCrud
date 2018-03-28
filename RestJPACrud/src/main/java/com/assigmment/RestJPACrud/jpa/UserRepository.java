package com.assigmment.RestJPACrud.jpa;

import javax.transaction.Transactional;

import com.assigmment.RestJPACrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


@Transactional
public interface UserRepository extends JpaRepository<User, String> {

}
