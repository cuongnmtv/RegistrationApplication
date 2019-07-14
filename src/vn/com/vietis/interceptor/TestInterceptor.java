package vn.com.vietis.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() called");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init() called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("pre-processing");
		String result = ai.invoke();
		System.out.println("post-processing");
		return result;
	}

}
