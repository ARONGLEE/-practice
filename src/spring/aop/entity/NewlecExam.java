package spring.aop.entity;


public class NewlecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewlecExam() {
		
	}
	
	
	public NewlecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}


	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		//long start = System.currentTimeMillis(); //시작 시간 체크 보조업무
		
		int result = kor+eng+math+com; //실질적인 사용자에 의해 만들어진 주업무
		
		try {
			Thread.sleep(200); //일부로 쓰레드로 시간을 좀 잡아둠 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	//	long end = System.currentTimeMillis(); //끝나는 시간 체크 보조업무
		
	//	String message = (end - start) + "ms 시간이 걸렸습니다.";
	//	System.out.println(message);
		
		return result;
	}

	@Override
	public float avg() {
		
		float result = total() / 4.0f;
		
		return result;
	}


	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

	
	
}
