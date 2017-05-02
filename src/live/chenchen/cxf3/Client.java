package live.chenchen.cxf3;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client
{
	public static void main(String[] args)
	{
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		
		factory.setAddress("http://localhost:5555/myservice");
		factory.setServiceClass(MyService.class);
		
		MyService myService = (MyService)factory.create();
		
		System.out.println(myService.getClass() + ", " + myService.getClass().getSuperclass());
		
		System.out.println(myService.hello("zhangsan", "123456"));
		
		//System.out.println(myService.add(1, 2));
	}
}
