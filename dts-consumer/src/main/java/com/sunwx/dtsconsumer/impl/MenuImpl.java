package com.sunwx.dtsconsumer.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sunwx.dtscommon.interfaces.MenuInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Service
@Service(interfaceClass=MenuInterface.class)
public class MenuImpl implements MenuInterface {

    @Override
    public List<String> getMenuList() {

        List<String> temp  = new ArrayList<>();
        temp.add("comsumer1");
        temp.add("consumer2");
        return temp;
    }
}
