package com.sunwx.dtsproductor.impl;

import java.util.ArrayList;
import java.util.List;

import com.sunwx.dtscommon.interfaces.UserInterface;
import com.sunwx.dtscommon.model.User;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass=UserInterface.class)
@Component
public class UserInterImpl implements UserInterface {

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		User user = new User("张三", "21");
		User user1 = new User("李四", "22");
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(user1);
		arrayList.add(user);
		System.out.println(arrayList.toString());
		return arrayList;
	}

	@Override
	public List<String> getString() {
		return null;
	}

}
