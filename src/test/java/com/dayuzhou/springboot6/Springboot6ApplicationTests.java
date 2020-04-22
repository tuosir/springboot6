package com.dayuzhou.springboot6;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot6ApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        System.out.print("数据哈哈哈哈哈"+dataSource.getClass());
        Connection connection =dataSource.getConnection();
        System.out.print("数据哈哈哈哈哈22222"+connection);
        connection.close();
    }

}
