
public class While {
	public static void main(String[] args){
		//ѭ�����1��100������
//		int i = 1;
//		while(i <= 100){
//			//��ȡ����i <= 100�ļ���������true����false�������true��ִ��while�Ĵ���������Ĵ��룬�����false��ִ��
//			
//			System.out.println(i);
//			i++;//���ϵĸı����i��ֵ
////			i = 101;
//		}

		//�������while�ǵ�ͬ��
		for(int k = 1; k <= 100; k++){
			
		}
		
		int m = 1;
		do{
			System.out.println(m);
			m++;
		}while(m <= 100);
		
		
		
		//��1��100֮������ż���ĺ͡���for��while���ֱ����
		int res = 0;
		for(int i = 1; i < 101; i++){
			if(i % 2 == 0){
				res += i;
			}
		}
		System.out.println(res);//Ҫ��forѭ��֮��������Ľ������Ϊֻ��ȫ��ѭ��������ϲ���1��100֮������ż���ĺ�
		
		int res0 = 0;
		int k = 1;
		while(k <= 100){
			if(k % 2 == 0){
				res0 += k;
			}
			k++;
		}
		
		System.out.println(res0);
		
//		for(;;){//forѭ��������ѭ��
//			
//		}
//		
//		while(true){//while������ѭ��
//			
//		}
	}
}