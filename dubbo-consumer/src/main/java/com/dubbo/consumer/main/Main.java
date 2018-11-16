package com.dubbo.consumer.main;

import com.dubbo.consumer.client.UserInfoServiceFacadeClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)throws Exception {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        context.start();
        System.out.println("consumer start");
        UserInfoServiceFacadeClient userInfoServiceFacade = context.getBean(UserInfoServiceFacadeClient.class);
        System.out.println("consumer");
        System.out.println(userInfoServiceFacade.getLoginInfo("莫先森"));
        System.in.read();

    }
}
