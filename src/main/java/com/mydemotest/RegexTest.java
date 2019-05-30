package com.mydemotest;


import cn.hutool.setting.dialect.Props;

import java.util.regex.Pattern;

/**
 * mydemo
 * Created by yusb on 2019-05-30
 */
public class RegexTest {

    public static void main(String[] args) {

        Props props = new Props("regex.properties");
        String regexStr = props.getStr("regexstr");
        String matchStr = "data_gas";
        //Pattern pattern = Pattern.compile(regexStr);
        System.out.println(Pattern.matches(regexStr, matchStr));
    }
}
