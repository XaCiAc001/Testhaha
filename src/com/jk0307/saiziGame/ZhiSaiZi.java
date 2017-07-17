package com.jk0307.saiziGame;


import java.util.Random;
import java.util.Scanner;


public class ZhiSaiZi {

	public static void main(String[] args) {
		
		System.out.println("请输非o的键，开始游戏");
		//控制游戏
		Scanner scan = new Scanner(System.in);
		String read1 = scan.nextLine();
		while(!read1.equals("o")){

		System.out.println("你要买大还是小（小输入：s或S，大输入：b或B，豹子输入：a或A）");
		//从键盘输入到控制台
		String read = scan.nextLine();
		/*System.out.println("输入数据："+read);*/
		//产生随机数
		int seiZi[] = new int[3];
		int b = 0;
		for (int i = 0; i < seiZi.length;) {
			Random r = new Random();
			//产生0-6的数字
			int temp = r.nextInt(7);
			if(temp>3){
				b++;
			}
           if(temp != 0){
        	  seiZi[i] = temp;
        	  System.out.println(seiZi[i]);
        	  i++;
           }
		}
	
		//保存结果
		String result;
		String result2;
		if(seiZi[0]==seiZi[1]&&seiZi[1]==seiZi[2]){
			result = "a";
			result2 = "A";
			System.out.println("结果是：豹子");
		}else{
			if(b>1){
				result = "b";
				result2 = "B";
				   System.out.println("结果是：大");
			  }else{
				  result = "s";
				  result2 = "S";
				   System.out.println("结果是：小");
			  }
		}

		//计算输赢
		if(read.equals(result)||read.equals(result2)){
			System.out.println("恭喜你赢了！");
		}else{
			System.out.println("请再接再厉！");
		}
		System.out.println("如果想结束游戏,请按o键");
		read1 = scan.nextLine();
		
		}
		System.out.println("游戏结束!");
	}
}
