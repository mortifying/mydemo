
package com.webservice;

import com.webservice.GetPsDataEffectiveTransferRate;
import com.webservice.GetPsDataEffectiveTransferRateResponse;
import com.webservice.GetPsMonitor;
import com.webservice.GetPsMonitorResponse;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.automonitor.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.automonitor.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPsDataEffectiveTransferRateResponse }
     * 
     */
    public GetPsDataEffectiveTransferRateResponse createGetPsDataEffectiveTransferRateResponse() {
        return new GetPsDataEffectiveTransferRateResponse();
    }

    /**
     * Create an instance of {@link GetPsMonitorResponse }
     * 
     */
    public GetPsMonitorResponse createGetPsMonitorResponse() {
        return new GetPsMonitorResponse();
    }

    /**
     * Create an instance of {@link GetPsMonitor }
     * 
     */
    public GetPsMonitor createGetPsMonitor() {
        return new GetPsMonitor();
    }

    /**
     * Create an instance of {@link GetPsDataEffectiveTransferRate }
     * 
     */
    public GetPsDataEffectiveTransferRate createGetPsDataEffectiveTransferRate() {
        return new GetPsDataEffectiveTransferRate();
    }

}
