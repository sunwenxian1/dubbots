package com.sunwx.dtsproductor.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sunwx.dtscommon.interfaces.TestInterface;
import com.sunwx.dtscommon.interfaces.UserInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class TestAction {
    @Reference
    public TestInterface testInterface;

    @RequestMapping("/test")
    public List<String> getString(){

        System.out.println("222222222");
     return  testInterface.getString();
    }
}
