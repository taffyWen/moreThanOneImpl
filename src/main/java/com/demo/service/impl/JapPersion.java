package com.demo.service.impl;

import com.demo.service.Persion;
import com.demo.util.PersonTypeEnum;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Qualifier
public class JapPersion implements Persion {
    @Override
    public String say() {
        return "我说日语";
    }

    @Override
    public String getType() {
        return PersonTypeEnum.JAPAN.name();
    }
}
