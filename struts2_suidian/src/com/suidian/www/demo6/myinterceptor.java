package com.suidian.www.demo6;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class myinterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invaocation) throws Exception {
		
		System.out.println("������1ִ���ˡ�����");
		String obj = invaocation.invoke();
		System.out.println("������1ִ�н���������");
		return obj;
	}

}
