package org.sample;

public class NonAbstract1 extends AbstractClass2 implements interface2, Interface1 {

	public void method31() {

		System.out.println("method31");
	}

	public void method32() {

		System.out.println("method32");
	}

	@Override
	public void method22() {
		method21();
		System.out.println("ment21");
	}

	@Override
	public void method2() {
		method1();
	}

	public void method61() {
		method31();
	}

	public void method62() {
		method32();
	}

	public void method11() {
		// TODO Auto-generated method stub

	}

	public void method12() {
		// TODO Auto-generated method stub

	}

}
