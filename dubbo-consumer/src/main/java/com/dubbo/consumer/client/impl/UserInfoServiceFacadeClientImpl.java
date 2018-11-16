package com.dubbo.consumer.client.impl;

import com.dubbo.api.UserInfoServiceFacade;
import com.dubbo.consumer.client.UserInfoServiceFacadeClient;


public class UserInfoServiceFacadeClientImpl implements UserInfoServiceFacadeClient {


    private UserInfoServiceFacade userInfoServiceFacade;

    public void setUserInfoServiceFacade(UserInfoServiceFacade userInfoServiceFacade) {
        this.userInfoServiceFacade = userInfoServiceFacade;
    }

    @Override
    public String getLoginInfo(String userName) {
        return userInfoServiceFacade.getLoginInfo(userName);
    }
}
