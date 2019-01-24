package com.djn.cn.sboot.mybatis.master;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;




/**
 * 
 * @ClassName Application
 * @Description  主入口
 * @author 聂冬佳
 * @date 2017年7月29日 下午2:36:16
 *
 */
@EnableTransactionManagement // 开启事务
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
