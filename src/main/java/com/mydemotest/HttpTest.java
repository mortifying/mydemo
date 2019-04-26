package com.mydemotest;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * mydemo
 * Created by yusb on 2019-04-26
 */
public class HttpTest {

    public static void main(String[] args) {

        HashMap<String, Object> paramMap = new HashMap<>();
        //Map<String, Object> ps = new HashMap<>();
        //ps.put("1", "2");
        paramMap.put("classType", "2");
        //paramMap.put("1", new HashMap<>().put("2", "3"));
        String result = HttpUtil.post("http://192.168.3.214:7077/jiashan/psinfo/page", paramMap);
        System.out.println(result);
    }
}
