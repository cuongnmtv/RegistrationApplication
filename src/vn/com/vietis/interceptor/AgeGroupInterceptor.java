package vn.com.vietis.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeGroupInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("AgeGroupInterceptor - Preprocessing");
		ValueStack stack = ai.getStack();
		Integer age = (Integer) stack.findValue("age");
		String ageGroup = "";
		if (age <= 20) {
			ageGroup = "intern";
		} else if (age > 21 && age < 25) {
			ageGroup = "junior";
		} else {
			ageGroup = "senior";
		}
		stack.set("age", age + "(" + ageGroup + ")");
		String result = ai.invoke();
		System.out.println("AgeGroupInterceptor - Postprocessing");
		return null;
	}

}
