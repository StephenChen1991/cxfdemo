
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package live.chenchen.cxf4;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2017-05-02T13:33:42.681+08:00
 * Generated source version: 2.3.3
 * 
 */

@javax.jws.WebService(
                      serviceName = "MyServiceImplService",
                      portName = "MyServiceImplPort",
                      targetNamespace = "http://cxf2.chenchen.live/",
                      wsdlLocation = "file:///D://tmp//workspace//acars//cxf//myservice.wsdl",
                      endpointInterface = "live.chenchen.cxf2.MyService")
                      
public class MyServiceImpl implements MyService {

    private static final Logger LOG = Logger.getLogger(MyServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see live.chenchen.cxf2.MyService#hello(java.lang.String  username ,)java.lang.String  password )*
     */
    public java.lang.String hello(java.lang.String username,java.lang.String password) { 
        LOG.info("Executing operation hello");
        System.out.println(username);
        System.out.println(password);
        try {
            java.lang.String _return = "hello is invoked";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
