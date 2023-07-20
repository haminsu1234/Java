package comfirm.ch08;
/*
 *1.2
 *2.1
 *3.
 *4.
 *5.
 *6.
 *7.
 *8.
 *9.
 *10.
 *
 */
public class Test05 {
	public String name;
	public Test05(String name) {
		this.name = name;
	}
}

class Child extends Test05 {
	public int studentNo;
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}
