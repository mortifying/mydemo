
package com.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2017-07-25T15:30:04.369+08:00
 * Generated source version: 2.5.9
 * 
 */
public final class EntryPointWebServiceSoap_EntryPointWebServiceSoap12_Client {
	/**
	 * 日志
	 */

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "EntryPointWebService");

    private EntryPointWebServiceSoap_EntryPointWebServiceSoap12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = EntryPointWebService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
				e.printStackTrace();
            }
        }
      
        EntryPointWebService ss = new EntryPointWebService(wsdlURL, SERVICE_NAME);
        EntryPointWebServiceSoap port = ss.getEntryPointWebServiceSoap12();  
        
        {
        System.out.println("Invoking getPsMonitor...");
        String _getPsMonitor_url = "";
        String _getPsMonitor_key = "";
        String _getPsMonitor_procName = "";
        String _getPsMonitor_paramJson = "";
        String _getPsMonitor__return = port.getPsMonitor(_getPsMonitor_url, _getPsMonitor_key, _getPsMonitor_procName, _getPsMonitor_paramJson);
        System.out.println("getPsMonitor.result=" + _getPsMonitor__return);


        }
        {
        System.out.println("Invoking getPsDataEffectiveTransferRate...");
        String _getPsDataEffectiveTransferRate_key = "";
        String _getPsDataEffectiveTransferRate_procName = "";
        String _getPsDataEffectiveTransferRate_paramJson = "";
        String _getPsDataEffectiveTransferRate__return = port.getPsDataEffectiveTransferRate(_getPsDataEffectiveTransferRate_key, _getPsDataEffectiveTransferRate_procName, _getPsDataEffectiveTransferRate_paramJson);
        System.out.println("getPsDataEffectiveTransferRate.result=" + _getPsDataEffectiveTransferRate__return);


        }

        System.exit(0);
    }

}
