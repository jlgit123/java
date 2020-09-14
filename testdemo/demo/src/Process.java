public class Process {
	public static void main(String[] args){
//		System.out.println(1 + 2 * 3);
//		System.out.println(2 * (3 % 2));
		//可以使用()来提高你想要先计算的那部分表达式的优先级

		//1. 顺序结构
//		int i = 0;
//		int k = i;
		
		//2. 分支结构
//		int i = 1;
//		int k = 2;
//		if(i == 1 && k != 2){
//			System.out.println(i);
//		}
		
		
		//3. 判断一个数组是奇数还是偶数，输出结果
//		int i = 3;
//		
//		if(i % 2 == 0){
//			System.out.println("偶数");
//		}else{
//			System.out.println("奇数");
//		}
		
		//4. 如果是数字1，输出星期一，2输出星期二，3就输出星期三
//		int i = 3;
//		
//		if(i == 1){
//			System.out.println("星期一");
//		}else if(i == 2){
//			System.out.println("星期二");
//		}else if(i == 3){
//			System.out.println("星期三");
//		}
//		
//		//5. 如果是数字1，输出星期一，2输出星期二，3就输出星期三,如果不是1,2,3中的任何一个数字，就输出不知道星期几
//		int i = 10;
//		
//		if(i == 1){
//			System.out.println("星期一");
//		}else if(i == 2){
//			System.out.println("星期二");
//		}else if(i == 3){
//			System.out.println("星期三");
//		}else{
//			System.out.println("不知道星期几");
//		}
		
		//6. 以分定奖
//		int score = 81;
//		
//		if(score == 100){
//			System.out.println("奖励一辆BMW");
//		}else if(score > 80 && score <=99){//（80，99]
//			System.out.println("奖励一个台iphone5s");
//		}else if(score >= 60 && score <= 80){
//			System.out.println("奖励一本参考书"); 
//		}else{
//			System.out.println("什么奖励也没有"); 
//		}
		
		//7. 条件嵌套
//		int x = 4;
//		int y = 1;
//		if (x > 2) {//x=4,所以走if的分支
//		       if (y > 2) {//判断y是不是大于2的数，如果是走这个分支
//		            System.out.println(x + y);
//		            System.out.println("atguigu");
//		        }
//		} else{
//		       System.out.println("x is " + x);
//		}

//		//8. if-else可以嵌套使用，就是if-else里还可以有多个if-else
//		if(false){
//			//这里是可以写任何代码段，包括了if-else这种
//		}else{
//			//这里是可以写任何代码段，包括了if-else这种
////			if(){
////				
////			}
////			int i = 0;
////			if(){
////				
////			}else{
////				
////			}
////			
////			if(){
////				
////			}else if(){
////				
////			}else{
////				
////			}
//		}
		
		//switch case的用法
//		//如果是数字1，输出星期一，数字二输出星期二，不是1和2的时候，输出不知道星期几
//		int i = 3;
//		
//		switch(i){
//		case 1://if(i == 1)
//			System.out.println("星期一");
//			break;
//		case 2://else if(i == 2)
//			System.out.println("星期二");
//			break;
//		default://else
//			System.out.println("不知道星期几");
//			break;
//		}
//		
//		String str = "bcd";
//		
//		switch(str){
//		case "a":
//			System.out.println("a");
//			break;
//		case "bcd":
//			System.out.println("bcd");
//			break;
//		default:
//			System.out.println("unkonwn");
//			break;
//		}
		
//		char c = 'f';
//		
//		switch(c){
//		case 'a':
//			System.out.println("A");
//			break;
//		case 'b':
//			System.out.println("B");
//			break;
//		case 'c':
//			System.out.println("C");
//			break;
//		case 'd':
//			System.out.println("D");
//			break;
//		case 'e':
//			System.out.println("E");
//			break;
//		default:
//			System.out.println("other");
//			break;
//		}
		
		 int a = 3;
	 	 int x = 100;
	 	 if(a==1){//case 1
			x+=5;
	 	 }else if(a==2){//case 2
			x+=10;
	 	 }else if(a==3){//case 3
			x+=16;
	 	 }else{//defailt		
			x+=34;
	 	 }

	 	 switch(a){
	 	 case 1:
	 		 x += 5;
	 		 break;
	 	 case 2:
	 		 x += 10;
	 		 break; 
	 	 case 3:
	 		 x += 16;
	 		 break;
	 	 default:
	 		 x += 34;
	 		 break;
	 	 }
	 	 
	}
}
