package com.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自动监控服务（根据ws获取数据）
 * @author Simon
 *
 */
public class AutoMonitorService {
	/**
	 * 日志
	 */
	private final static Logger logger = LoggerFactory.getLogger(AutoMonitorService.class);
	
	private static EntryPointWebServiceSoap entryPointWebServiceSoap;
	
	public static EntryPointWebServiceSoap getService(String url) {
		
		if(entryPointWebServiceSoap==null) {
			EntryPointWebService service;
			try {
				service = new EntryPointWebService(new URL(url));
			} catch (MalformedURLException e) {
				try {
					service = new EntryPointWebService(new URL("http://219.143.244.183:82/PsMonitorEntryPoint/EntryPointWebService.asmx?wsdl"));
				} catch (MalformedURLException e1) {
					service = new EntryPointWebService();
					e1.printStackTrace();
				}
				logger.info(e.getMessage());
			}
			entryPointWebServiceSoap = service.getEntryPointWebServiceSoap();
		}
		return entryPointWebServiceSoap;
	}

}
