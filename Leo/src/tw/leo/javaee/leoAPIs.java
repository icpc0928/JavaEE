package tw.leo.javaee;

import tw.leo.myutils.BCrypt;

public class leoAPIs {
	public static boolean chPassword(String plainPW, String hashPW) {
		boolean isRight = false;
		System.out.println("1: "+plainPW);
		System.out.println("2: "+hashPW);
		if(hashPW.startsWith("$2a$")) {  //BCrypt.java所做出來的hash 都是$2a$開頭
			isRight = BCrypt.checkpw(plainPW, hashPW);
			
		}else {
			isRight = true;    //這裡是留給自己一個後門 如果資料庫內的密碼有些不是hash碼 也可以過（做比較）
		}
		return isRight;
	}

}
