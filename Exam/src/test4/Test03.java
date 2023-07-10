package test4;


public class Test03 {
	
	public static void main(String[] args) {
		String fileName ="자바 프로그래밍.pdf";
		
		int idx = fileName.indexOf(".");// 지금예제에서는 indexof를 써도 되지만 나중에 실제 확장자 찾을떄는 뒤에서부터 찾아야하기때문에 last 씀
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
		
	}
	
	
}
