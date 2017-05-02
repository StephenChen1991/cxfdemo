package live.chenchen.cxf2;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MyServer
{
	public static void main(String[] args)
	{
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		
		factory.setServiceClass(MyServiceImpl.class);
		factory.setAddress("http://localhost:5555/myservice");
		
		factory.getInInterceptors().add(new LoggingInInterceptor());
		
		factory.getOutFaultInterceptors().add(new LoggingOutInterceptor());
		
		Server server = factory.create();
		
		server.start();
	}
}
