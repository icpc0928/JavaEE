package tw.leo.myutils;

import java.util.HashSet;

public class leoAPI {
	public static String createLottery() {
		
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		
		return set.toString();
	}

	public static String sayHello(String name) {
		return "是在哈佛, " +name;
	}
	
	public static String calc(String x, String y , String op) {
		String ret ="";
		try {
			int xValue =Integer.parseInt(x);
			int yValue =Integer.parseInt(y);
			
			
			switch(op) {
			case "1":  ret += (xValue + yValue);break;
			case "2":  ret += (xValue - yValue);break;
			case "3":  ret += (xValue * yValue);break;
			case "4":  ret += (xValue / yValue);break;
			}
		}catch(Exception e) {
			
		}
		
		return ret ;
	}
	public static int randomScore() {
		return (int)(Math.random()*101);
		
	}
	
	
	
}
