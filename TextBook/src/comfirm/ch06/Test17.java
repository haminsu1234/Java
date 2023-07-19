package comfirm.ch06;

class Printer1 {

	private int num;
	private boolean bool;
	private double db;
	private String str;
	
	public static void println(int num) {

		System.out.println(num);

	}
	
	public static void println(boolean bool) {

		System.out.println(bool);
	}
	
	public static void println(double db) {
	
		System.out.println(db);
	}
	
	public static void println(String str) {

		System.out.println(str);
	}
	
}

public class Test17  {

		public static void main(String[] args) {
			
			Printer1.println(10);
			Printer1.println(true);
			Printer1.println(5.7);
			Printer1.println("홍길동");
		}
	
}
