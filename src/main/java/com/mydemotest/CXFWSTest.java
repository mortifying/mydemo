package com.mydemotest;

import com.alibaba.fastjson.JSON;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * mydemo
 * Created by yusb on 2019-04-01
 */
public class CXFWSTest {
    public static void main(String[] args) throws Exception{

        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://219.143.244.183:82/PsMonitorEntryPoint/EntryPointWebService.asmx?wsdl");
        String url = "http://10.61.176.219:800/PsMonitorWebService.asmx";
        String key = "NM_3E21VX97T";
        String procName = "srv.Proc_GetGasFacTenMinsData_ServiceUtil";
        String paraJson = "{\"startDate\":\"2019-04-03 15:00:00\",\"endDate\":\"2019-04-03 17:00:00\",\"psCode\":\"610800000047\"}";
        //String[] paras = new String[]{url,key,procName,paraJson};
        Object[] result = client.invoke("GetPsMonitor",url,key,procName,paraJson);
        System.out.println(result[0]);
        System.out.println(JSON.parseArray(result[0].toString()));
    }
}
