package com.mrwho.androidtestdemo;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import org.junit.Test;

/**
 * Created by mr.gao on 2018/5/3.
 * Package:    com.mrwho.androidtestdemo
 * Create Date:2018/5/3
 * Project Name:AndroidTestDemo
 * Description:
 */
public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {


    private Intent mLoginIntent;
    Button loginButton;

    public LoginActivityTest() {
        super(LoginActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        loginButton = (Button) getActivity().findViewById(R.id.loginBtn);
    }

    //测试：确保每个控件都不为空
    @Test
    public void testPreCondition() {
        assertNotNull(loginButton);
    }

    //测试登录界面的按钮是否为
    @Test
    public void testLoginButtonLabel() {

        final String buttonText = "跳转到主界面";
        assertEquals("Unexpected button ladel text", buttonText, loginButton.getText().toString());
    }


}