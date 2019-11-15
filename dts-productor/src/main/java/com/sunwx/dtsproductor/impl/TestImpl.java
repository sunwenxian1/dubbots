package com.sunwx.dtsproductor.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.sunwx.dtscommon.interfaces.TestInterface;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Service(interfaceClass=TestInterface.class)
public class TestImpl implements TestInterface {


    @Override
    public List<String> getString() {
        return null;
    }
}
