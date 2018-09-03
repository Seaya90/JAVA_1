package com.mystudy.pm01_generic;

class BoxT<T> {
	T obj;
	void setObj(T obj) { this.obj = obj; }
	T getObj() { return obj; }
}
public class GenericWildcardExam {

	public static void main(String[] args) {
		//���ʸ�(Generic) ���ϵ�ī��
		//1. <?> : ��� Ŭ����(��ü)�ڷ����� ���� ��ǥ���ڸ� �ǹ�
		//2. <? extends �ڷ���> : �ڷ����� ��ӹ��� �ڳ�(sub)Ŭ���� Ÿ�� ��� 
		//3. <? super �ڷ���> : �ڷ����� �θ�(super)Ŭ���� Ÿ���� ��� 
		//---------------------------------------
		BoxT<String> box1 = new BoxT<String>();
		box1.setObj("���ڿ�");
		BoxT<Integer> box2 = new BoxT<>();
		//box2.setObj("���ڿ�"); //Ÿ�Թ̽���ġ
		
		//<?> ��� ���� ���� �� �ִ� ����
		BoxT<?> box3 = new BoxT<String>();
		box3 = new BoxT<Integer>();
		box3 = new BoxT<StringBuilder>();
		
		//<? extends �ڷ���> 
		BoxT<? extends Number> box10 = null;
		box10 = new BoxT<Number>();
		box10 = new BoxT<Integer>();
		box10 = new BoxT<Double>();
		
		//[�����Ͽ���] Character�� Number ���(extends)���� �ʾұ� ����
		//box10 = new BoxT<Character>(); 
		
		//<? super �ڷ���>
		BoxT<? super Number> box20 = null;
		box20 = new BoxT<Number>();
		box20 = new BoxT<Object>();
		
		//[�����Ͽ���] Integer�� Number�� �θ�Ŭ���� Ÿ���� �ƴϱ� ����
		//box20 = new BoxT<Integer>();
		
	}

}
