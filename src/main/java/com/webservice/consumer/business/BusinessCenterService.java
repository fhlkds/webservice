
package com.webservice.consumer.business;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BusinessCenterService", targetNamespace = "http://export.service.joyoung.com/", wsdlLocation = "http://soa.joyoung.com/gateway/export/BusinessCenterService?wsdl")
public class BusinessCenterService
    extends Service
{

    private final static URL BUSINESSCENTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUSINESSCENTERSERVICE_EXCEPTION;
    private final static QName BUSINESSCENTERSERVICE_QNAME = new QName("http://export.service.joyoung.com/", "BusinessCenterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://soa.joyoung.com/gateway/export/BusinessCenterService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUSINESSCENTERSERVICE_WSDL_LOCATION = url;
        BUSINESSCENTERSERVICE_EXCEPTION = e;
    }

    public BusinessCenterService() {
        super(__getWsdlLocation(), BUSINESSCENTERSERVICE_QNAME);
    }

    public BusinessCenterService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BUSINESSCENTERSERVICE_QNAME, features);
    }

    public BusinessCenterService(URL wsdlLocation) {
        super(wsdlLocation, BUSINESSCENTERSERVICE_QNAME);
    }

    public BusinessCenterService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BUSINESSCENTERSERVICE_QNAME, features);
    }

    public BusinessCenterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BusinessCenterService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BusinessCenterServiceInterface
     */
    @WebEndpoint(name = "BusinessCenterServicePort")
    public BusinessCenterServiceInterface getBusinessCenterServicePort() {
        return super.getPort(new QName("http://export.service.joyoung.com/", "BusinessCenterServicePort"), BusinessCenterServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BusinessCenterServiceInterface
     */
    @WebEndpoint(name = "BusinessCenterServicePort")
    public BusinessCenterServiceInterface getBusinessCenterServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://export.service.joyoung.com/", "BusinessCenterServicePort"), BusinessCenterServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUSINESSCENTERSERVICE_EXCEPTION!= null) {
            throw BUSINESSCENTERSERVICE_EXCEPTION;
        }
        return BUSINESSCENTERSERVICE_WSDL_LOCATION;
    }

}
