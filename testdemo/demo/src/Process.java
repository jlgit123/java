public class Process {
	public static void main(String[] args){
//		System.out.println(1 + 2 * 3);
//		System.out.println(2 * (3 % 2));
		//����ʹ��()���������Ҫ�ȼ�����ǲ��ֱ��ʽ�����ȼ�

		//1. ˳��ṹ
//		int i = 0;
//		int k = i;
		
		//2. ��֧�ṹ
//		int i = 1;
//		int k = 2;
//		if(i == 1 && k != 2){
//			System.out.println(i);
//		}
		
		
		//3. �ж�һ����������������ż����������
//		int i = 3;
//		
//		if(i % 2 == 0){
//			System.out.println("ż��");
//		}else{
//			System.out.println("����");
//		}
		
		//4. ���������1���������һ��2������ڶ���3�����������
//		int i = 3;
//		
//		if(i == 1){
//			System.out.println("����һ");
//		}else if(i == 2){
//			System.out.println("���ڶ�");
//		}else if(i == 3){
//			System.out.println("������");
//		}
//		
//		//5. ���������1���������һ��2������ڶ���3�����������,�������1,2,3�е��κ�һ�����֣��������֪�����ڼ�
//		int i = 10;
//		
//		if(i == 1){
//			System.out.println("����һ");
//		}else if(i == 2){
//			System.out.println("���ڶ�");
//		}else if(i == 3){
//			System.out.println("������");
//		}else{
//			System.out.println("��֪�����ڼ�");
//		}
		
		//6. �Էֶ���
//		int score = 81;
//		
//		if(score == 100){
//			System.out.println("����һ��BMW");
//		}else if(score > 80 && score <=99){//��80��99]
//			System.out.println("����һ��̨iphone5s");
//		}else if(score >= 60 && score <= 80){
//			System.out.println("����һ���ο���"); 
//		}else{
//			System.out.println("ʲô����Ҳû��"); 
//		}
		
		//7. ����Ƕ��
//		int x = 4;
//		int y = 1;
//		if (x > 2) {//x=4,������if�ķ�֧
//		       if (y > 2) {//�ж�y�ǲ��Ǵ���2������������������֧
//		            System.out.println(x + y);
//		            System.out.println("atguigu");
//		        }
//		} else{
//		       System.out.println("x is " + x);
//		}

//		//8. if-else����Ƕ��ʹ�ã�����if-else�ﻹ�����ж��if-else
//		if(false){
//			//�����ǿ���д�κδ���Σ�������if-else����
//		}else{
//			//�����ǿ���д�κδ���Σ�������if-else����
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
		
		//switch case���÷�
//		//���������1���������һ�����ֶ�������ڶ�������1��2��ʱ�������֪�����ڼ�
//		int i = 3;
//		
//		switch(i){
//		case 1://if(i == 1)
//			System.out.println("����һ");
//			break;
//		case 2://else if(i == 2)
//			System.out.println("���ڶ�");
//			break;
//		default://else
//			System.out.println("��֪�����ڼ�");
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
