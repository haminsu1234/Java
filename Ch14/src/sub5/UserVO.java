package sub5;

public class UserVO {

	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {

		if( uid== null) {// 없는 id 를 집어넣으면 리턴값이 null 이되기에  검색결과가 없으면 이걸반환
			return "해당하는 사용자가 없습니다";
		}else {
			return uid+","+name+","+hp+","+age;
				
		}

	}
	
	
}
