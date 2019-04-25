package com.xx.www.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class AccountTest {
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo() {
		accountService.tranferMoney("Lusy", "Tom", 1000d);
	}
	
}
