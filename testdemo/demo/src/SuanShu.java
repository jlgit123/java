
public class SuanShu {
	public static void main(String[] args){
		//һ�����������
		int i0 = -3;
		System.out.println(+i0); //-3
		System.out.println(-i0); //3

		System.out.println(1 + 2); //3
		System.out.println(7 / 2); //3
		//1. ����������������ʱ�򣬻�ѽ����С������������ֻ������������
		System.out.println(7.00 / 2); //3.5
		System.out.println(7 % 2);  //1
		
		int i = 0;
//		i++; //��ȡֵ
//		++i; //������
		int k = i++;
		System.out.println(k);//0
		System.out.println(i);//1

		int m = ++i;
		System.out.println(m);//2
		System.out.println(i);//2
		//2. ++��--�ֱ��Ǽ�1�ͼ�1�����㣬++����--�����ڱ���֮ǰ���ȶԱ�����������Ȼ����ȡ������ֵ��
		//���++����--�����ڱ���֮�󣬾���ȡ������ֵ���ٶԱ����������㡣

		String str="h"+"e"+"llo";
		System.out.println(str);//�ַ����ļӺ����ַ���ƴ��

		System.out.println(5%-2);//1
		System.out.println(-5%2);//-1
		//3. ����Ը���ȡģ�����԰�ģ�����ź��Բ��ǣ��磺5%-2=1�� 
		//����ģ���Ǹ����򲻿ɺ��ԡ����⣬ȡģ����Ľ����һ������������

		System.out.println("5+5="+5+5);
		//4. ��+�����ַ�����ӹ����⣬���ܰѷ��ַ���ת�����ַ���
	
		System.out.println('*'+'\t'+'*');//93
		//5. char���������ǿ�������ѧ����ģ�������ѧ�����ʱ����ַ�ת��ΪASCII����м���
		
		System.out.println("*"+'\t'+'*');//*
		//6. �ַ��������������������ʱ��ʵ�����ǰ�����������ת��Ϊ�ַ��������ַ�����ƴ��
	}
}