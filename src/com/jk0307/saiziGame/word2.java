package com.jk0307.saiziGame;

import java.util.Random;
import java.util.Scanner;

//猜数游戏。每一次由程序随机生成一个小于10的数，
//用户输入一个数，如果用户输入的数和随机数相等就成功。否则就失败
public class word2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		while(true){
		System.out.println("输入任意一个1-10");
		String read = scan.nextLine();
		Random r = new Random();
		int a = r.nextInt(11);
		String a1 = String.valueOf(a);
		
		System.out.println("随机数是" + a1);
		
		if(read.equals(a1) ){
			System.out.println("恭喜你成功了");
			
		}else{System.out.println("你输了");
			
		}
		
		
		
		
		
		}
		
		
	
	}

}
