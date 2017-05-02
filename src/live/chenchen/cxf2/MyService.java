package live.chenchen.cxf2;

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

	public int add(int a, int b);
}
