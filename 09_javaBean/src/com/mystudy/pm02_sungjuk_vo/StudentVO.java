package com.mystudy.pm02_sungjuk_vo;

//��(Bean) ��ü �����
//VO(Value Object) : ���� �����ϱ� ���� Ŭ����(��ü)
//DTO(Data Transfer Object) : ���� ���� �����ϱ� ���� ��ü
//StudentVO, StudentDTO, StudentVo, StudentDto
public class StudentVO {
	private String name; //�̸�
	private int kor; //��������
	private int eng; //��������
	private int math; //��������
	private int tot; //����
	private double avg; //���
	
	//---- �ǽ� -----------
	//������ �̸�,����,����,���� ������ �Է¹޴� ������(tot, avg �ڵ����)
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	//toString() �������̵�
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}

	//��� �ʵ�(�������)�� setter, getter �ۼ�
	//(����,����,���� ������ �ٲ�� tot, avg �ڵ� ���� �ǵ��� ó��)
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor < 0 || kor > 100) {
			System.out.println("[���ܹ߻�] ����(0<=����<=100)�� ���");
			return;
		}
		this.kor = kor;
		computeTotAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		computeTotAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		computeTotAvg();
	}

	public String getName() {
		return name;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}

	//tot, avg ����ϴ� �޼ҵ� �ۼ�
	public void computeTotAvg() {
		this.tot = kor + eng + math;
		this.avg = (tot * 100) / 3 / 100.0;
	}
	
	//printData �޼ҵ� �߰�
	//(�̸�\t����\t����\t...)
	public void printData() {
		System.out.println(name +"\t"+ kor +"\t"+ eng +"\t"+ 
				math +"\t"+ tot +"\t"+ avg);
	}
	
	public String getData() {
		return name +"\t"+ kor +"\t"+ eng +"\t"+ 
				math +"\t"+ tot +"\t"+ avg;
	}
	
}
