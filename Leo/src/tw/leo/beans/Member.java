package tw.leo.beans;
//這個比原本leo.javaee內的Member.java還多一個無傳參數的建構式

public class Member {

	private String account , realname;
	private int age;
	
	public Member() {
		this("","",0);
		//為避免無傳參數跑出的值為null 所以實踐一個預設值（如果屬性都沒有值的話就是空的字串跟0）
	}
	
	private Member(String account , String realname, int age) {
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
	
	public void setAccount(String account) {
		this.account = account;
	}
	//因為我account跟realname都是private 所以我要多一個public方式去set這兩個屬性的值
	public void setRealname(String realname) {
		this.realname= realname;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	
	//改寫member物件的toString  (原本是物件類別加上記憶體位置）
	@Override
	public String toString() {
		return account +"("+age+")";
	}
}
