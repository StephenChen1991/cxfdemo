package live.chenchen.cxf2;

public class MyServiceImpl implements MyService
{
	@Override
	public String hello(String username, String password)
	{
		System.out.println("hello is invoked!!");
		
		return "hello: " + username + ", " + password;
	}
	
	@Override
	public int add(int a, int b)
	{
		return a + b;
	}

}
