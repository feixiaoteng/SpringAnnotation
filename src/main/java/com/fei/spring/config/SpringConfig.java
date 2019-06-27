package com.fei.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * @author feixiaoteng
 * @create 2019-06-24 22:13
 */
@Configuration
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED
)
/**
 * Transactional:spring默认对所有的运行时异常进行回滚
 * propagation:事务传播行为
 * isolation:事务隔离级别
 */
@ComponentScan(value = "com.fei",includeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},useDefaultFilters = false)//扫描指定的包
public class SpringConfig {
}
