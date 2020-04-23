package com.dayuzhou.springboot6.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

// 使用jpa注解，映射关系
@Entity  //告诉jpa这是一个实体类型（和数据表映射的类）
@Table(name = "tbl_user")  //和哪个数据表映射,如果没有默认表名是类名小写user
public class User {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50)
    private String lastName;
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
