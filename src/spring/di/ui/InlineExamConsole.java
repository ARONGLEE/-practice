package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	@Autowired(required = false)
	@Qualifier("exam1")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	//@Autowired
	//@Qualifier("exam1")
	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0); //exam이 null일 경우 total과 avg를 0, 0.0으로 출력
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	//@Autowired //자동으로 객체를 연결해달라는 의미
	//@Qualifier("exam1") //exam1에 해당하는 이름을 찾아서 밑에 exam에 연결해 달라고 할 수 있다.
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
		
	}

}
