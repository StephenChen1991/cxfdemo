package live.chenchen.cxf3;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface MyService
{
	@WebResult(name = "helloResult")
	public String hello(
			@WebParam(name = "username")
			String username,
			@WebParam(name = "password")
			String password);

	//public int add(int a, int b);
}
