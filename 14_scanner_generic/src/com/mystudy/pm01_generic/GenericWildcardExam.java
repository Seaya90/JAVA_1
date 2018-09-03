package com.mystudy.pm01_generic;

class BoxT<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}
public class GenericWildcardExam {

	public static void main(String[] args) {
		//제너릭(Generic) 와일드카드
		//1. <?> : 모든 클래스(객체)자료형에 대한 대표문자를 의미
		//2. <? extends 자료형> : 자료형을 상속받은 자녀(sub)클래스 타입 사용 
		//3. <? super 자료형> : 자료형의 부모(super)클래스 타입을 사용 
		//---------------------------------------
		BoxT<String> box1 = new BoxT<String>();
		box1.setObj("문자열");
		BoxT<Integer> box2 = new BoxT<>();
		//box2.setObj("문자열"); //타입미스매치
		
		//<?> 모든 것을 담을 수 있는 형태
		BoxT<?> box3 = new BoxT<String>();
		box3 = new BoxT<Integer>();
		box3 = new BoxT<StringBuilder>();
		
		//<? extends 자료형> 
		BoxT<? extends Number> box10 = null;
		box10 = new BoxT<Number>();
		box10 = new BoxT<Integer>();
		box10 = new BoxT<Double>();
		
		//[컴파일오류] Character가 Number 상속(extends)받지 않았기 때문
		//box10 = new BoxT<Character>(); 
		
		//<? super 자료형>
		BoxT<? super Number> box20 = null;
		box20 = new BoxT<Number>();
		box20 = new BoxT<Object>();
		
		//[컴파일오류] Integer가 Number의 부모클래스 타입이 아니기 때문
		//box20 = new BoxT<Integer>();
		
	}

}
