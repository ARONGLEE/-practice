package spring.aop.advice;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis(); //시작 시간 체크 보조업무
		
		Object result = invocation.proceed(); //주업무를 가지고있는 것을 호출해주는 역할
		
		long end = System.currentTimeMillis(); //끝나는 시간 체크 보조업무
		
		String message = (end - start) + "ms 시간이 걸렸습니다.";
		System.out.println(message);
		return result;
	}

}
