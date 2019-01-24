package com.djn.cn.sboot.mybatis.master.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/************************************
 * 解释：https://blog.csdn.net/u012501054/article/details/79799241
 
 * 当运行 Spring Boot 应用程序测试时，
 * 它会自动的从当前测试类所在的包起一层一层向上搜索，
 * 直到找到一个@SpringBootApplication或@SpringBootConfiguration注释类为止。
 * 以此来确定如何装载 Spring 应用程序的上下文资源。
 * 只要你以合理的方式组织你的代码，你项目的主配置通常是可以被发现的。
 *
 *************************************/
@SpringBootTest
@RunWith(SpringRunner.class)  
public abstract class AbstractTestCase {
	Logger logger = LoggerFactory.getLogger(getClass());
}
