
public class SanYuan {
	public static void main(String[] args){
		int i =-1;
		int k = i > 0 ? 1 : 0;
		System.out.println(k);//0
		
		// 1. 获取两个数中的较大数
		int m = 1;
		int n = 2;
		System.out.println(m > n ? m : n);//2
		
		// 2. 获取三个数中的较大数
		int s = 0; 
		System.out.println(m > n ? (m > s ? m : s) : (n > s ? n : s));//2
		//(条件表达式)？表达式1：表达式2
		//表达式1 (m > s ? m : s)
		//表达式2 (n > s ? n : s)
	}
}
