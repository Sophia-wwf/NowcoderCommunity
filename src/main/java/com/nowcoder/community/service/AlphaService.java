package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化 AlphaService");
    }

    // 这个方法在构造器之后调用
    @PostConstruct
    public void init(){
        System.out.println("初始化 AlphaService");
    }

    // 在销毁对象之前调用这个方法
    @PreDestroy
    public void destroy(){
        System.out.println("销毁 AlphaService");
    }

    public String find(){
        return alphaDao.select();
    }
}
