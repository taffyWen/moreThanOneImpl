package com.demo.controller;


import com.demo.service.Persion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DemoController {

//    @Resource
    @Autowired
//    @Qualifier("japPersion")
    private Persion persion;

    @Autowired
    private List<Persion> personList;

    private Map personMap = new HashMap();

    @RequestMapping("/say")
    public String say(){

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
        System.out.println("========s");

        System.out.println(personMap);
        return persion.say();
    }


    @PostConstruct
    public void getAllPerson(){
        personList.forEach(persion -> personMap.put(persion.getType(),persion));
    }
}
