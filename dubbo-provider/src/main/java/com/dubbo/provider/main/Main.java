/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.dubbo.provider.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author george.mo
 * @version $Id: Main.java, v 0.1 2018/11/16 19:32 george.mo Exp $$
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
