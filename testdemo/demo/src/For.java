
public class For {
	public static void main(String[] args){
		//1. �������5��helloworld
//		for(int i = 0;i<5;i++){ //��ʼ������ʽ��; ����ֵ���Ա���ʽ��; ���ı���ʽ
//			System.out.println(i);
//			System.out.println("hello world");
//		}
//		//��ʼ����������������ı�����i���ж�i < 5������ǣ�ִ�д����{},ִ�и��ı���ʽi++��i���¸�ֵ��ֵ�ͱ�Ϊ1
//		//�жϱ���i < 5����ǰ��i��1������ǣ�ִ�д����{},ִ�и��ı���ʽi++��i���¸�ֵ��iֵ�ͱ�Ϊ2
//		//�жϱ���i < 5����ǰ��i��2������ǣ�ִ�д����{},ִ�и��ı���ʽi++��i���¸�ֵ��iֵ�ͱ�Ϊ3
//		//�жϱ���i < 5����ǰ��i��3������ǣ�ִ�д����{},ִ�и��ı���ʽi++��i���¸�ֵ��iֵ�ͱ�Ϊ4
//		//�жϱ���i < 5����ǰ��i��4������ǣ�ִ�д����{},ִ�и��ı���ʽi++��i���¸�ֵ��iֵ�ͱ�Ϊ5
//		//�жϱ���i < 5����ǰ��i��5���жϽ����false����������ִ�У�����ѭ��
		
		//2. �ۼ����
		int result = 0;
        for(int i=1; i<=100; i++) {
        	result += i;
        }
        System.out.println("result=" + result);//result=5050
        
        //3.FooBizBaz����1ѭ����150����ÿ�д�ӡһ��ֵ��������ÿ��3�ı������ϴ�ӡ����foo��,��ÿ��5�ı������ϴ�ӡ��biz��,��ÿ��7�ı������ϴ�ӡ�����baz����
		for(int i = 1; i <= 150; i++){
			String str = "";
			str += i;
			if(i % 3 == 0){
				str += " foo";
			}
			if(i % 5 == 0){
				str += " biz";
			}
			if(i % 7 == 0){
				str += " baz";
			}
			System.out.println(str);
		}
		
		//4.������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾����
	    for(int i = 100; i <= 999; i++){
	    	//145,145/100=1,(145-1*100)/10=4,145 - 1*100 - 4-10 = 5
	    	int m = i/100;//�õ���λ��
	    	int n = (i - m*100)/10;//�õ�ʮλ��
	    	int k = i - m*100 - n*10;//�õ���λ����
	//    	System.out.println(i);
	//    	System.out.println(m + " " + n + " " + k);
	    	int res = m*m*m + n*n*n + k*k*k;//����λ������������
	    	if(res == i){//�ж��ǲ���ˮ�ɻ���
	    		System.out.println(i);
	    	}
	    }

	}
}