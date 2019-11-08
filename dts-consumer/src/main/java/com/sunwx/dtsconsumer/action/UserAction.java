package com.sunwx.dtsconsumer.action;

import java.util.List;

import com.sunwx.dtscommon.interfaces.UserInterface;
import com.sunwx.dtscommon.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
@ResponseBody
public class UserAction {
	@Reference
	public UserInterface userInterface;
	
	@RequestMapping(path = "/user")
	public List<User> getUsers(){

	System.out.println("111111");	
	 return userInterface.getUsers();
	}
}




































































