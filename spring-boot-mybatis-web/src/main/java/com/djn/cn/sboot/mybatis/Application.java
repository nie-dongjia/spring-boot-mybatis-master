package com.djn.cn.sboot.mybatis;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * 
 * <b>类   名：</b>Application<br/>
 * <b>类描述：</b>主入口<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年1月24日 下午10:26:35<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年1月24日 下午10:26:35<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@EnableTransactionManagement // 开启事务
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
