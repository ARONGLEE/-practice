package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole() {
		
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	@Autowired //자동으로 객체를 연결해달라는 의미
	@Qualifier("exam1") //exam1에 해당하는 이름을 찾아서 밑에 exam에 연결해 달라고 할 수 있다.
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
