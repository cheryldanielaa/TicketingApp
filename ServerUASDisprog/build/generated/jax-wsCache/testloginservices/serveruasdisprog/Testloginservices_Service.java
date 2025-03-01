
package serveruasdisprog;

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
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "testloginservices", targetNamespace = "http://services.testlogin.com/", wsdlLocation = "http://localhost:8080/TestLoginWS/testloginservices?wsdl")
public class Testloginservices_Service
    extends Service
{

    private final static URL TESTLOGINSERVICES_WSDL_LOCATION;
    private final static WebServiceException TESTLOGINSERVICES_EXCEPTION;
    private final static QName TESTLOGINSERVICES_QNAME = new QName("http://services.testlogin.com/", "testloginservices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TestLoginWS/testloginservices?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TESTLOGINSERVICES_WSDL_LOCATION = url;
        TESTLOGINSERVICES_EXCEPTION = e;
    }

    public Testloginservices_Service() {
        super(__getWsdlLocation(), TESTLOGINSERVICES_QNAME);
    }

    public Testloginservices_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TESTLOGINSERVICES_QNAME, features);
    }

    public Testloginservices_Service(URL wsdlLocation) {
        super(wsdlLocation, TESTLOGINSERVICES_QNAME);
    }

    public Testloginservices_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TESTLOGINSERVICES_QNAME, features);
    }

    public Testloginservices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Testloginservices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Testloginservices
     */
    @WebEndpoint(name = "testloginservicesPort")
    public Testloginservices getTestloginservicesPort() {
        return super.getPort(new QName("http://services.testlogin.com/", "testloginservicesPort"), Testloginservices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Testloginservices
     */
    @WebEndpoint(name = "testloginservicesPort")
    public Testloginservices getTestloginservicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.testlogin.com/", "testloginservicesPort"), Testloginservices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TESTLOGINSERVICES_EXCEPTION!= null) {
            throw TESTLOGINSERVICES_EXCEPTION;
        }
        return TESTLOGINSERVICES_WSDL_LOCATION;
    }

}
