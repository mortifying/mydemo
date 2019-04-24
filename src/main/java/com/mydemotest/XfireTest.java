package com.mydemotest;

import com.alibaba.fastjson.JSONObject;
import org.codehaus.xfire.client.Client;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * mydemo
 * Created by yusb on 2019-04-24
 */
public class XfireTest {

    public static void main(String[] args){
        System.out.println("data："+loadData());
    }

    public static String loadData()
    {
        String data = null;
        String url_ = "http://10.87.10.31:82/PsMonitorCloudData_ljfs/PsMonitorWebService.asmx";
        String key = "NM_3E21VX97T";
        String procName = "srv.Proc_GetData";
        String sql = "select 1";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sql", sql);
        Object[] params = new Object[]{url_, key, procName, jsonObject.toJSONString()};
        try {
            URL url = new URL("http://219.143.244.183:82/PsMonitorEntryPoint/EntryPointWebService.asmx?wsdl");
            Client c = new Client(url);
            Object[] datas = c.invoke("GetPsMonitor", params);
            if (datas != null) {
                data = datas[0].toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
