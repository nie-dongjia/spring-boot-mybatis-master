package com.djn.cn.sboot.mybatis.base.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
 
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
 
@Configuration
@MapperScan("com.djn.cn.sboot.mybatis.*.dao")
public class DruidConfig {
	private Logger logger = LoggerFactory.getLogger(getClass());
 
	@Value("${spring.datasource.url}")
	private String dbUrl;
 
	@Value("${spring.datasource.username}")
	private String username;
 
	@Value("${spring.datasource.password}")
	private String password;
 
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
 
	@Value("${spring.datasource.initialSize}")
	private int initialSize;
 
	@Value("${spring.datasource.minIdle}")
	private int minIdle;
 
	@Value("${spring.datasource.maxActive}")
	private int maxActive;
 
	@Value("${spring.datasource.maxWait}")
	private int maxWait;
 
	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;
 
	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;
 
	@Value("${spring.datasource.validationQuery}")
	private String validationQuery;
 
	@Value("${spring.datasource.testWhileIdle}")
	private boolean testWhileIdle;
 
	@Value("${spring.datasource.testOnBorrow}")
	private boolean testOnBorrow;
 
	@Value("${spring.datasource.testOnReturn}")
	private boolean testOnReturn;
 
	@Value("${spring.datasource.poolPreparedStatements}")
	private boolean poolPreparedStatements;
 
	@Value("${spring.datasource.filters}")
	private String filters;
 
	@Bean
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean reg = new ServletRegistrationBean();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/druid/*");
		reg.addInitParameter("loginUsername", "root");
		reg.addInitParameter("loginPassword", "root");
		return reg;
	}
 
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		filterRegistrationBean.addInitParameter("profileEnable", "true");
		filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
		filterRegistrationBean.addInitParameter("principalSessionName", "USER_SESSION");
		return filterRegistrationBean;
	}
 
	@Bean // 声明其为Bean实例
	@Primary // 在同样的DataSource中，首先使用被标注的DataSource
	public DataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
 
		druidDataSource.setUrl(this.dbUrl);
		druidDataSource.setUsername(username);
		druidDataSource.setPassword(password);
		druidDataSource.setDriverClassName(driverClassName);
		druidDataSource.setInitialSize(initialSize);
		druidDataSource.setMinIdle(minIdle);
		druidDataSource.setMaxActive(maxActive);
		druidDataSource.setMaxWait(maxWait);
		druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		druidDataSource.setValidationQuery(validationQuery);
		druidDataSource.setTestWhileIdle(testWhileIdle);
		druidDataSource.setTestOnBorrow(testOnBorrow);
		druidDataSource.setTestOnReturn(testOnReturn);
		druidDataSource.setPoolPreparedStatements(poolPreparedStatements);
		try {
			druidDataSource.setFilters(filters);
		} catch (SQLException e) {
			logger.error("druid configuration initialization filter", e);
		}
		return druidDataSource;
	}
}