
public class LuoJi {
	public static void main(String[] args){
		System.out.println(4 == 4 & 1 == 1);
		System.out.println(4 == 4 | 1 == 1);
		System.out.println(4 == 4 ^ 1 == 1); //false
		System.out.println(4 == 4 && 1 == 1);
		System.out.println(4 == 4 || 1 == 1);
		
		// 1. �����ж�
		int x = 4;
//		System.out.println(3 < x < 6);//java�в���������д
		System.out.println(x > 3 && x < 6);//true  ֻ������д

		// 2. &��&&������
		int i = 0;
		int k = 1;
//		System.out.println(++k ==2);//true
		System.out.println(i != 0 & ++k ==2);
		System.out.println(k);//2
		// ����&ʱ�����߶���������

		System.out.println(i != 0 && ++k ==2);
		System.out.println(k);//2��û�н���++k�Ĳ���
		// 2��&ʱ��������Ϊtrue���ұ߲������㣻������Ϊfalse���ұ߲��������㡣
		//ͬ������|ʱ��������Ϊfalse���ұ߲������㣻������Ϊtrue���ұ߲��������㡣
		
		// 3. ������
		int a = 1;
		int b = 1;
		if(a++ == 2 & ++b == 2){
			//a++ == 2,��ȡֵ�����㣬1==2�������false���ټ���++֮��x��ֵ��2��
			//++b == 2,�������ȡֵ���ȼ���++�õ�y��ֵΪ2�����߼��ж�2 == 2�������true��
			//false & true,�õ��Ľ�����false
			System.out.println("ִ��");
		}
		
		System.out.println("a="+a+",b="+b);//a=2,b=2
		//&���&&�أ� ��a=2,b=1��
	}
}
