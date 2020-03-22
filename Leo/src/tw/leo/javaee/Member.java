package tw.leo.javaee;

public class Member {

	private String account , realname;
	private int age;
	
	public Member(String account , String realname, int age) {
		this.account = account;
		this.realname = realname;
		this.age = age;
	}
	
	public String getAccount() {
		return this.account;
	}
	public String getRealname() {
		return this.realname;
	}
	public int getAge() {
		return this.age;
//		return age;  一樣的
	}
	
	public void addAge() {
		//每叫一次addAge()年紀就多一歲
		age++;
	}
	
}
