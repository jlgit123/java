
public class Wei {
	public static void main(String[] args){
		System.out.println(3<<3);//3 * 2^3 = 24
		System.out.println(1<<2);//1 * 2^2 = 4
		
		System.out.println(8>>2);//8 / 2^2 = 2
		System.out.println(8>>>2); //2
		System.out.println(-8>>2); //-2
		System.out.println(-8>>>2); //1073741822
		// �з��ŵ������ǿ�����֮�����λ��0����1����0ǰ���λ��0����1�Ͳ�1
		// �޷��ŵ����ƣ��ƶ�֮�󲻹���λ��0����1����λ����ֱ�Ӳ�0
		System.out.println(~12); //-13
	}
}
 