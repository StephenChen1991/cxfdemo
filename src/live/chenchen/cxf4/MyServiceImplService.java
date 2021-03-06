
/*
 * 
 */

package live.chenchen.cxf4;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2017-05-02T13:33:42.782+08:00
 * Generated source version: 2.3.3
 * 
 */


@WebServiceClient(name = "MyServiceImplService", 
                  wsdlLocation = "file:///D://tmp//workspace//acars//cxf//myservice.wsdl",
                  targetNamespace = "http://cxf2.chenchen.live/") 
public class MyServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cxf2.chenchen.live/", "MyServiceImplService");
    public final static QName MyServiceImplPort = new QName("http://cxf2.chenchen.live/", "MyServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:///D://tmp//workspace//acars//cxf//myservice.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:5555/myservice?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public MyServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyServiceImplPort")
    public MyService getMyServiceImplPort() {
        return super.getPort(MyServiceImplPort, MyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyServiceImplPort")
    public MyService getMyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(MyServiceImplPort, MyService.class, features);
    }

}
