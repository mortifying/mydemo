package com.mydemotest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.webservice.AutoMonitorService;
import com.webservice.EntryPointWebServiceSoap;

/**
 * mydemo
 * Created by yusb on 2019-04-24
 */
public class WSTest {
    public static void main(String[] args) {

        String url_ = "http://219.143.244.183:82/PsMonitorEntryPoint/EntryPointWebService.asmx?wsdl";
        String url = "http://10.61.32.219:800/PsMonitorWebService.asmx";
        String key = "NM_3E21VX97T";
        String procName = "srv.Proc_GetData";
        String sql = "select 1";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sql", sql);
        EntryPointWebServiceSoap service = AutoMonitorService.getService(url_);
        String result = service.getPsMonitor(url, key, procName, jsonObject.toJSONString());
        System.out.println(JSON.parseArray(result));
    }
}
