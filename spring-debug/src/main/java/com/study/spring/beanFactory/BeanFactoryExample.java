package com.study.spring.beanFactory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author:Zhangchi
 * @date:2021-03-29 9:03 上午
 * BeanFactory和FactoryBean其实没有什么比较性的，只是两者的名称特别接近，
 * 所以有时候会拿出来比较一番，BeanFactory是提供了IOC容器最基本的形式，
 * 给具体的IOC容器的实现提供了规范，FactoryBean可以说为IOC容器中Bean的实现提供了更加灵活的方式，
 * FactoryBean在IOC容器的基础上给Bean的实现加上了一个简单工厂模式和装饰模式，我们可以在getObject()方法中灵活配置。
 * 其实在Spring源码中有很多FactoryBean的实现类，要想深入准确的理解FactoryBean,只有去读读Spring源码了。
 **/
public class BeanFactoryExample  implements FactoryBean<BeanFactoryExample> {
	@Override
	public BeanFactoryExample getObject() throws Exception {
		System.out.println("BeanFactoryExample -> getObject()");
		return new BeanFactoryExample();
	}

	@Override
	public Class<BeanFactoryExample> getObjectType() {
		return BeanFactoryExample.class;
	}
}
