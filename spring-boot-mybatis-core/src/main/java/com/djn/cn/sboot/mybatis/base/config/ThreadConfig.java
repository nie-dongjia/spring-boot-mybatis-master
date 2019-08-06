package com.djn.cn.sboot.mybatis.base.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync // 启用异步任务
public class ThreadConfig {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Bean
	public Executor asyncServiceExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		// 配置核心线程数
		executor.setCorePoolSize(5);
		// 配置最大线程数
		executor.setMaxPoolSize(10);
		// 配置队列大小
		executor.setQueueCapacity(400);
		// 配置线程池中的线程的名称前缀
		executor.setThreadNamePrefix("thread-pool-");
		// rejection-policy：当pool已经达到max size的时候，如何处理新任务
		// CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
		// 执行初始化
		executor.initialize();
		logger.info("线程pool启动完毕");
		return executor;
	}
}
