
public class Test {
	public static void main(String[] args){
//		System.out.println("hello world!!!");
		int i = 0;//��������ʼ������
		i = 1;
		int k = 10;
		i = k;
		System.out.println(i);

		short s = 9;
		short sh = 11;
		sh = s;
		System.out.println(sh);
		
	
		int i0 = 1;
		short s0 = 2; 
		byte b0 = 3;
		int res0 = i0 + s0 + b0;//���⣬���õ�������6��ʲô���ͣ��ڼ�������У�i��s��b��3�����������������͵�ת����
		// 1. �ڼ�������У�����������int�ķ�Χ�������s0��b0���ֱ���ת��Ϊint����Ȼ����мӺ����㣬���ս����int���͵�����
		
		char c1 = 'a'; //2. char���͵������������ֽ������������ʱ������ת��Ϊ���Ӧ��ascll���ֵȻ���ٽ������㡣
		byte b1 = 1;
		int res1 = c1 + b1;
		System.out.println(res1);
		
		String str2 = "abc";
		int i2 = 1;
		System.out.println(str2+i2); //abc1
		System.out.println(str2+i2+b1+s0+c1);//abc112a
		System.out.println(i2+b1+s0+c1+str2);//101abc
		System.out.println(i2+b1+str2+c1+s0);//2abca2

		//3. �κλ������͵�ֵ���ַ���ֵ������������ʱ(+)�����л������͵�ֵ���Զ�ת��Ϊ�ַ������͡�
		//��ǰ�����ַ����ڵĻ����������Ͷ�ת���ַ�����
		//������Ƿֲ�ʽ���㣬�����ǰ��ģ��ٺ��ַ���ƴ��������

		byte b = 1;
		int m = b ;
		// 4.����������������������ʽת��
		System.out.println(m);
		
		int in = 2;
//		byte by = in; //���ֵ��쳣�����������쳣��ֻ����javac��ʱ����Է���
		byte by = (byte)in;
		//5.�������ǿ��ת���������ͣ�ת������������Ҫ��Ӣ�ĵ�С����������
		// ������ʽ����ǿ��ת��������Ҫ��Ի������͡�
		    
	}
}