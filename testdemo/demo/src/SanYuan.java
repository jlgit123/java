
public class SanYuan {
	public static void main(String[] args){
		int i =-1;
		int k = i > 0 ? 1 : 0;
		System.out.println(k);//0
		
		// 1. ��ȡ�������еĽϴ���
		int m = 1;
		int n = 2;
		System.out.println(m > n ? m : n);//2
		
		// 2. ��ȡ�������еĽϴ���
		int s = 0; 
		System.out.println(m > n ? (m > s ? m : s) : (n > s ? n : s));//2
		//(��������ʽ)������ʽ1������ʽ2
		//����ʽ1 (m > s ? m : s)
		//����ʽ2 (n > s ? n : s)
	}
}