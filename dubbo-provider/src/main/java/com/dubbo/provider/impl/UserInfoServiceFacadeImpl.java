/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.dubbo.provider.impl;

import com.dubbo.api.UserInfoServiceFacade;

/**
 * @author george.mo
 * @version $Id: UserInfoServiceFacadeImpl.java, v 0.1 2018/11/16 19:25 george.mo Exp $$
 */
public class UserInfoServiceFacadeImpl implements UserInfoServiceFacade {

    @Override
    public String getLoginInfo(String userName) {
        return "你好：" + userName;
    }
}
