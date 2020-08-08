package com.maple.ch3.fortest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //1 在jUnit环境下提供 Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class}) //2加载配置
@ActiveProfiles("prod") //3 声明活动的profile
public class DemoBeanIntegrationTests {
	@Autowired //4 注入
	private TestBean testBean;

	@Test //5 测试代码
	public void prodBeanShouldInject() {
		String expected = "from production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}


}
