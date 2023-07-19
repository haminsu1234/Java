package comfirm.ch06;

class ShopService {

	private static ShopService instance = new ShopService();
	
	public static ShopService getInstance() {
		return instance;
	}
	
	
}

public class Test18  {

	public static void main(String[] args) {
		
		ShopService obj1 =ShopService.getInstance();
		ShopService obj2 =ShopService.getInstance();
		
			
		if(obj1==obj2) {
			System.out.println("같은 객체입니다");
		}else {
			System.out.println("다른객체입니다");
		}
		
	}
	
}
