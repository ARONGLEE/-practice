package spring.aop;

import spring.aop.entity.NewlecExam;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.ArongDiConfig;
import spring.aop.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				//new AnnotationConfigApplicationContext(ArongDiConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml"); //setting.xml의 경로가 di라는 패키지안에 있기 때문에 패키지명도 함께 작성한다. 
		
		Exam proxy = (Exam) context.getBean("proxy");
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
		
		/*
		 * Exam exam = new NewlecExam(1,1,1,1);
		 * 
		 * 
		 * Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),
		 * new Class[] {Exam.class}, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable {
		 * 
		 * long start = System.currentTimeMillis(); //시작 시간 체크 보조업무
		 * 
		 * Object result = method.invoke(exam, args);
		 * 
		 * long end = System.currentTimeMillis(); //끝나는 시간 체크 보조업무
		 * 
		 * String message = (end - start) + "ms 시간이 걸렸습니다.";
		 * System.out.println(message);
		 * 
		 * return result; } } );
		 */
		
	
	}

}
