package com.study.spring.entity;

import com.study.spring.beanFactory.BeanFactoryExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Zhangchi
 * @date:2021-03-28 4:59 下午
 **/
public class StartTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("text.xml");
		A a = (A) ac.getBean("a");
		System.out.println(a);

		BeanFactoryExample example = (BeanFactoryExample) ac.getBean("BeanFactoryExample");
		System.out.println(example);
		BeanFactoryExample example2 = (BeanFactoryExample) ac.getBean("BeanFactoryExample");
		System.out.println(example2);
	}
}
