package com.mydemotest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.transport.http.CommonsHttpMessageSender;
import sun.net.www.protocol.http.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * mydemo
 * Created by yusb on 2019-04-24
 */
public class XfireTest {

    public static void main(String[] args){
        try {
            System.out.println(JSON.parseArray(loadData()).get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String loadData() throws Exception
    {
        String data = "datas is null";
        String url_ = "http://119.60.9.17/PsMonitorCloudData/PsMonitorWebService.asmx";
        String url64 = "http://10.87.10.31:82/PsMonitorCloudData_ljfs/PsMonitorWebService.asmx";
        String url61 = "http://10.61.32.219:800/PsMonitorWebService.asmx";
        String url1406 = "http://10.126.80.3:800/PsMonitorWebService.asmx";
        String urlTest = "http://10.61.112.216:800/PsMonitorWebService.asmx";
        String url50 = "http://10.50.1.21:5006/PsMonitorCloudData/PsMonitorWebService.asmx";
        String url4404 = "http://10.182.4.129:30601/PsMonitorWebService.asmx";
        String key = "NM_3E21VX97T";
        String procName = "srv.Proc_GetData";
        String testSql = "SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [UpdateDate]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select PSCode,OutputCode,ParameterCode,MonitorTime,AvgValue,UpdateDate From AutoMonitorDBV3.MonitorOperationData.GasFacDayZsParameter Where MonitorTime > '2019-01-01' and UpdateDate >= '2019-04-29 11:47:25' and UpdateDate < '2019-04-29 11:47:35' and pscode in (610500000039,610500000037,610500000040,610500000041)) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 0) ORDER BY [X_SEQUEL_ROW_NUMBER_X]";
        String sql64 = "SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [updated_time]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select mp_id,data_time,pollutant_code,avg_value,updated_time From [AMDB].md.day_flow_air Where data_time > '2019-01-01' and updated_time >= '2019-01-01 00:00:00' and updated_time < '2019-01-01 01:00:00' and mp_id in ('6400000000096400000000091255','6400000000096400000000091355','640000000009640000000009255','640000000009640000000009955')) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 0) ORDER BY [X_SEQUEL_ROW_NUMBER_X]";
        String sql61 = "SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [UpdateDate]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select PSCode,OutputCode,PollutantCode,MonitorTime,AvgZsStrength,RevisedStrength,UpdateDate From AutoMonitorDBV3.MonitorOperationData.GasFacDayZsData Where MonitorTime > '2019-01-01' and UpdateDate >= '2019-04-29 07:00:00' and UpdateDate < '2019-04-29 08:00:00' and pscode in (610100000357,610100000324,610100000320,610100000331,610100000329,610161800007,610100000307,610161800008,610000000011,610000000050,610100000016,610125000004,610100000358,610125111146,610112000011)) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 0) ORDER BY [X_SEQUEL_ROW_NUMBER_X]";
        String sql50 = "SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [UpdateDate]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select PSCode,OutputCode,PollutantCode,MonitorTime,AvgStrength,RevisedStrength,UpdateDate From AutoMonitorDBV3.MonitorOperationData.WaterFacHourData Where MonitorTime > '2019-01-01' and UpdateDate >= '2019-04-29 01:00:00' and UpdateDate < '2019-04-29 02:00:00' and pscode in (500000000085)) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 0) ORDER BY [X_SEQUEL_ROW_NUMBER_X]";
        String sql1406 = "SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [UpdateDate]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select PSCode,OutputCode,PollutantCode,MonitorTime,Strength,RevisedStrength,UpdateDate From AutoMonitorDBV3.MonitorOperationData.GasFacRTData Where MonitorTime > '2019-01-01' and UpdateDate >= '2019-04-29 07:00:00' and UpdateDate < '2019-04-29 18:00:00' and pscode in (140600000062,140600000080)) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 0) ORDER BY [X_SEQUEL_ROW_NUMBER_X]";
        String sql4404 = "SELECT TOP 10000 * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY [UpdateDate]) AS [X_SEQUEL_ROW_NUMBER_X] FROM (Select PSCode,OutputCode,PollutantCode,MonitorTime,AvgZsStrength,RevisedStrength,UpdateDate From AutoMonitorDBV3.MonitorOperationData.GasFacTenMinsZsData Where MonitorTime > '2019-01-01' and UpdateDate >= '2019-01-01 00:00:00' and UpdateDate < '2019-01-01 01:00:00' and pscode in (440400000424)) AS [T1]) AS [T1] WHERE ([X_SEQUEL_ROW_NUMBER_X] > 0) ORDER BY [X_SEQUEL_ROW_NUMBER_X]";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sql", sql4404);
        Object[] params = new Object[]{url4404, key, procName, jsonObject.toJSONString()};
        URL url = new URL("http://219.143.244.183:82/PsMonitorEntryPoint/EntryPointWebService.asmx?wsdl");

        /*HttpClientParams connParams = new HttpClientParams();
        connParams.setParameter(HttpClientParams.USE_EXPECT_CONTINUE, Boolean.FALSE);
        connParams.setParameter(HttpClientParams.CONNECTION_MANAGER_TIMEOUT, 60000L);//单位是毫秒
        c.setProperty(CommonsHttpMessageSender.HTTP_CLIENT_PARAMS, connParams);*/

        HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
        httpConnection.setReadTimeout(600000);//设置http连接的读超时,单位是毫秒
        httpConnection.connect();
        Client c = new Client(httpConnection.getInputStream(),null);
        c.setProperty(CommonsHttpMessageSender.HTTP_TIMEOUT, String.valueOf(600000));//设置发送的超时限制,单位是毫秒;
        c.setProperty(CommonsHttpMessageSender.DISABLE_KEEP_ALIVE, "true");
        c.setProperty(CommonsHttpMessageSender.DISABLE_EXPECT_CONTINUE, "true");

        System.out.println(c.getTimeout());
        Object[] datas = c.invoke("GetPsMonitor", params);
        if (datas != null) {
            data = datas[0].toString();
        }
        if(!data.contains("[")){
            throw new Exception(data);
        }
        return data;
    }
}
