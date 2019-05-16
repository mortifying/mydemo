package com.mydemotest;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.log.StaticLog;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * mydemo
 * Created by yusb on 2019-04-29
 */
public class PasreTime {
    public static void main(String[] args) {

        /*String time = "2020-05-01 00:00:00";
        System.out.println(DateUtil.date().toString("yyyy-MM-dd HH:mm:ss.SSS"));

        System.out.println(DateUtil.parse(time).year());

        System.out.println(DateUtil.date().year());


        String str = "Select mp_id,CONVERT(varchar,data_time,121) data_time,pollutant_code,avg_value,revise_flag,data_status,CONVERT(varchar,updated_time,121) updated_time From ([AMDB].md.hour_furnace) a Where data_time > '2019-01-01' and updated_time >= :sql_last_value and updated_time < :end_time and mp_id in (:ps_str)";

        if(str.contains(",revise_flag,")){
            System.out.println(str.replace(",revise_flag,",","));
        }*/
        /*String jsonStr = "{\"companyPollutant\" : [{\"psCode\":\"130400000482\",\"pollutantCode\":\"002\",\"pollutantName\":\"二氧化硫\",\"weekRanking\":1253,\"weekAvg\":24.35,\"pollutantScore\":100.0,\"yearRanking\":1248,\"yearAvg\":20.72,\"companyXLineValue\":[2.3946,7.1838,11.973,16.7622,21.5514,26.340600000000002,31.1298,35.919000000000004,40.7082,45.4974,50.2866,55.0758,59.865,64.6542,69.4434,74.2326,79.0218,83.811,88.6002,93.38940000000001,98.1786,102.9678,107.757,112.5462,117.3354,122.1246,126.91380000000001,131.703,136.4922,141.2814,146.0706,150.8598,155.649,160.4382,165.22740000000002,170.0166,174.8058,179.595,184.3842,189.17340000000002,193.9626,198.7518,203.541,208.33020000000002,213.1194,217.9086,222.6978,227.487,232.27620000000002,237.0654],\"companyYLineValue\":[19,39,39,51,41,31,22,17,15,15,12,4,4,5,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}]}";
        //JSONObject jsonObject = JSON.parseArray(jsonStr).getJSONObject(0);
        JSONObject jsonObject1 = JSONObject.parseObject(jsonStr);
        System.out.println(jsonObject1.getString("companyPollutant"));*/
        /*String str = "dddd";
        StaticLog.info("ss {} sss", str);*/
        String str = "rbdata_md_day_flow_water";

        System.out.println(str.replace("md","region_md"));
    }

}
