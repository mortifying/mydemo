/*
package com.mydemotest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;

*/
/**
 * mydemo
 * Created by yusb on 2019-04-01
 *//*

public class CXFWSTest {
    public static void main(String[] args) {

        //File file = Paths.get(System.getProperty("user.dir"), "EntryPointWebService.asmx?wsdl").toFile();
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();

        System.out.println("===========  " + dcf);
        String url_ = "http://219.143.244.183:82/PsMonitorEntryPoint/EntryPointWebService.asmx?wsdl";
        Client client = dcf.createClient(url_);
        String url = "http://10.87.10.31:82/PsMonitorCloudData_ljfs/PsMonitorWebService.asmx";
        //String url = "http://10.50.1.21:5006/PsMonitorCloudData/PsMonitorWebService.asmx";
        String key = "NM_3E21VX97T";
        //String procName = "srv.Proc_GetGasFacTenMinsData_ServiceUtil";
        String procName = "srv.Proc_GetData";
        //String paraJson = "{\"startDate\":\"2019-04-22 14:00:00\",\"endDate\":\"2019-04-22 16:00:00\",\"psCode\":\"610800000047\"}";
        //String sql = "SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [UpdateDate]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select PSCode,OutputCode,PollutantCode,MonitorTime,AvgStrength,RevisedStrength,UpdateDate From AutoMonitorDBV3.MonitorOperationData.GasFacDayData Where MonitorTime > '2019-01-01' and UpdateDate >= '2019-04-01 00:00:00' and UpdateDate < '2019-04-01 01:00:00' and pscode in (500000000085)) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 0) ORDER BY [X_SEQUEL_ROW_NUMBER_X]";
        String sql = "select 1";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sql", sql);
        //System.out.println(jsonObject.toString());
        //String paraJson = "{\"sql\":\"SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [UpdateDate]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select PSCode,OutputCode,PollutantCode,MonitorTime,AvgStrength,RevisedStrength,UpdateDate From AutoMonitorDBV3.MonitorOperationData.GasFacDayData Where MonitorTime > '2019-01-01' and UpdateDate >= '2019-04-01 00:00:00' and UpdateDate < '2019-04-01 01:00:00' and pscode in (340200000035,610800000047)) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 1) ORDER BY [X_SEQUEL_ROW_NUMBER_X]\"}";
        //String[] paras = new String[]{url,key,procName,paraJson};
        Object[] result = null;
        try {
            result = client.invoke("GetPsMonitor",url,key,procName,jsonObject.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(result.length);
        //System.out.println(result[0]);
        System.out.println(JSON.parseArray(result[0].toString()));

        //System.out.println(DateUtil.date());
        */
/*//*
/System.out.println(subList);
        JSONObject json = (JSONObject)subList.get(0);
        //json.put("111", "2222222222");
        System.out.println(json);*//*


    }
}
*/
