package com.dayuzhou.springboot6.repository;

import com.dayuzhou.springboot6.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
//继承JpaReposity来对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {

}
