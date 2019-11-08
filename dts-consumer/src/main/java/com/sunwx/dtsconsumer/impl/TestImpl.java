package com.sunwx.dtsconsumer.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sunwx.dtscommon.interfaces.TestInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service(interfaceClass=TestInterface.class)
@Component
public class TestImpl implements TestInterface {

    @Override
    public List<String> getString() {

        List<String> temp  = new ArrayList<String>();

        return temp;
    }
}
