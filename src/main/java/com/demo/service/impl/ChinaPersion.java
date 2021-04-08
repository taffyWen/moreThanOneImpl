package com.demo.service.impl;

import com.demo.service.Persion;
import com.demo.util.PersonTypeEnum;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChinaPersion implements Persion {
    @Override
    public String say() {
        return "我是中国人";
    }

    @Override
    public String getType() {
        return PersonTypeEnum.CHINA.name();
    }
}
