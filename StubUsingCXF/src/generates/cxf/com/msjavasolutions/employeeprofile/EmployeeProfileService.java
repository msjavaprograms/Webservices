package com.msjavasolutions.employeeprofile;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-02-02T08:54:44.595-05:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "EmployeeProfileService",
                  wsdlLocation = "file:/C:/Users/Achu/git/Webservices/StubUsingCXF/src/main/resources/wsdl/EmployeeProfile.wsdl",
                  targetNamespace = "http://msjavasolutions.com/employeeProfile")
public class EmployeeProfileService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://msjavasolutions.com/employeeProfile", "EmployeeProfileService");
    public final static QName EmployeeProfilePort = new QName("http://msjavasolutions.com/employeeProfile", "EmployeeProfilePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Achu/git/Webservices/StubUsingCXF/src/main/resources/wsdl/EmployeeProfile.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EmployeeProfileService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Achu/git/Webservices/StubUsingCXF/src/main/resources/wsdl/EmployeeProfile.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmployeeProfileService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmployeeProfileService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeProfileService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EmployeeProfileService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EmployeeProfileService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EmployeeProfileService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EmployeeProfilePortType
     */
    @WebEndpoint(name = "EmployeeProfilePort")
    public EmployeeProfilePortType getEmployeeProfilePort() {
        return super.getPort(EmployeeProfilePort, EmployeeProfilePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeProfilePortType
     */
    @WebEndpoint(name = "EmployeeProfilePort")
    public EmployeeProfilePortType getEmployeeProfilePort(WebServiceFeature... features) {
        return super.getPort(EmployeeProfilePort, EmployeeProfilePortType.class, features);
    }

}
