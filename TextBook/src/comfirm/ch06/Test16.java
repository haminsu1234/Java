package comfirm.ch06;

class Printer {

	private int num;
	private boolean bool;
	private double db;
	private String str;
	
	public void println(int num) {
		this.num=num;
		System.out.println(num);

	}
	
	public void println(boolean bool) {
		this.bool=bool;
		System.out.println(bool);
	}
	
	public void println(double db) {
		this.db=db;
		System.out.println(db);
	}
	
	public void println(String str) {
		this.str=str;
		System.out.println(str);
	}
	
}

public class Test16 {

		public static void main(String[] args) {
			Printer printer =new Printer();
			printer.println(10);
			printer.println(true);
			printer.println(5.7);
			printer.println("홍길동");
		}
	
}
