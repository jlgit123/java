
public class Arr {
	public static void main(String[] args){
		//һ��һά����
//		int i = 0;
//		int k = 1;
//		int m = 2;
		//��Ѷ�������ݷŵ�һ�������ʹ�����飬�ʹ�Ŷ�����ݵļ���
		//���磬��Ŷ��int����������
//		int[] ii;//1. ����һ��int������
//		int iii[];
		
		//2. ��̬��ʼ��
//		int[] ii = new int[4];//����һ���ܷ�4��int�������ݵ�����
		
		//3.��̬��ʼ��
//		int[] ii0 = new int[]{1,2,3,4};//3. ������һ�������1��2��3��4��4����������
		
		//4.��������
//		String[] strs = new String[]{"c","a","b"} ;//�����ڵ�Ԫ�ض���1�����õ�Ԫ���±꣬������±��Ǹ����֣������Ǵ����Ҵ�0��ʼ
//		System.out.println(strs[1]); //a
//		//���鳤�� .length
//		System.out.println("strs�����鳤���ǣ�" + strs.length);//3

		//5. ��̬��ʼ��Ĭ��ֵ		
//		int[] ii = new int[2];//ʹ�ö�̬��ʼ����ʱ�������Ԫ�ػ���Ĭ��ֵ���������͵�Ĭ��ֵ��0�������Ĭ��������null
//		System.out.println(ii[0]);//��ӡ0
		
		//6. �ı��ʼֵ
//		int[] ii = new int[4];
//		System.out.println(ii[0]);
		
		//������ά����
//		ii[0] = 2;
//		System.out.println(ii[0]);
		
		//
//		//1. ����һά������ÿһ��Ԫ�ض���һ�����飬����������Ƕ�ά����
//		//2. ��̬��ʼ��
//		int[][] ii = new int[][]{
//				{1,2},//��0��Ԫ��
//				{4,2}//��1��Ԫ��
//		};
//		
//		int[][] ii0 = new int[2][3];//��һά���ֵĳ�����2���ڶ�άҲ�͵�һά��ÿ��Ԫ�صĳ�����3
//		//{
//		// {1,23,4},
//		// {2,4,6}
//		//}
//		int[][] ii1 = new int[2][];//ֻ�����һά�ĳ��ȣ��ڶ�ά������
//		
//		System.out.println(ii[1][0]);//ȡ��4Ԫ��
//		
//		int[] x,y[]; //����д����x��һά���飬y�Ƕ�ά����
//		
		//3. ������ά����
//		int[][] arr = new int[][]{
//				{3,8,2},
//				{2,7},
//				{9,0,1,6}
//				};
//		
		// 3.1 ����д��
//		int len = arr.length;//�����һά�ĳ���
//		int res = 0;
//		for(int i = 0; i < len; i++){
//			int[] arr0 = arr[i];
//			int llen = arr0.length;//��ά����ĳ���
//			for(int j = 0; j < llen; j++){
//				res += arr0[j];
//			}
//		}
//		System.out.println(res);
		// 3.2 ��д��
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr[i].length; j++){
//				res += arr[i][j];
//			}
//		}
		
//		//�����������漰�ĳ����㷨
//		//1. ���ֵ����Сֵ���ܺ�ƽ����
//		int[] arr = new int[]{4,2,7,1,3,5};
//		//���ֵ
//		int max = arr[0];//����arr[0]��Ŀǰ���ֵ
//		for(int i = 0; i < arr.length; i++){
//			if(max < arr[i]){
//				max = arr[i];//���Ŀǰ���ֵ
//			}
//		}
//		System.out.println("max:" + max); //max:7
//		
//		//��Сֵ
//		int min = arr[0];//����arr[0]��Ŀǰ����Сֵ
//		for(int i = 0; i < arr.length; i++){
//			if(min > arr[i]){
//				min = arr[i];//��Ŀǰ��С��ֵ��ֵ��min
//			}
//		}
//		System.out.println("min:" + min); //min:1
//		
//		//�ܺͣ�ƽ����
//		int res = 0;
//		for(int i = 0; i < arr.length; i++){
//			res += arr[i];
//		}
//		System.out.println("�ܺͣ�" + res);
//		System.out.println("ƽ������" + (res / arr.length));
//		//�ܺͣ�22  ƽ������3
//		
//		//2. ���ơ���ת
//		//ע�⣺���Ʋ��Ǹ�ֵ
////		int[] aa = arr;//��ֵ
//		int[] copy = new int[arr.length];//����һ����arr����һ�µ�����
//		for(int i = 0; i < arr.length; i++){//����
//			copy[i] = arr[i];//����arr����arr��ÿһ��Ԫ�ذ�װ˳���ó�������copy��ÿһ��Ԫ�ظ�ֵ���������i����copy��arr��Ԫ���±�
//		}
//		
//		//int[] arr = new int[]{4,2,7,1,3,5};
//		//��������һ������temp������temp�ĳ�����arr�ĳ���һ�£����ǵ���ѭ��arr�����Ÿ�temp��Ԫ�ظ�ֵ
//		// temp[0] = arr[5],temp[1] = arr[4],temp[2] = arr[3],temp[3] = arr[2],temp[4] = arr[1],temp[5] = arr[0]
//		//temp����arr�ĵ�������飬Ȼ���ٰ�temp��ֵ��arr��arr = temp��
//		//һ����������һ��Ԫ�أ������±��������ĳ���-1����ΪԪ�ص��±��Ǵ�0��ʼ
//		int[] temp = new int[arr.length];
//		int k = 0;//�������temp��Ԫ���±�
//		for(int i = arr.length - 1; i >= 0; i--){
////			System.out.println(arr[i]);
//			temp[k] = arr[i];//��һ��ѭ����k=0,i=5,�൱��temp[0] = arr[5]
//			k++;
//		}
//		arr = temp;
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);//5 3 1 7 2 4
//		}
		
		//3.����Ԫ�ص�����
		//���򣬴�С����
		//4,7,3,1
		//4,3,1,7��һ�ֵõ�һ���������֣����ڵ�����һλ
		//3,1,4,7�ڶ��ֵõ������һ������֮���������֣����ڵ����ڶ�λ
		//1,3,4,7�����ֵõ����������������֮���������֣����ڵ�������λ
		
//		int[] arr = new int[]{4,7,3,1};
////		int[] arr = new int[]{2,56,33,1,8,5,64,34};
//		int temp = 0;
//		for(int i = 0; i < arr.length - 1; i++){//���ѭ����ѭ���ִΣ��ִ�ѭ���Ĵ��������ֳ���-1
//			for(int j = 0; j < arr.length - 1 - i; j++){//ÿһ�ִε����ֶԱ�����,ÿ�ִε�ѭ������4,3,2���ִγ���-1-i
//				if(arr[j] > arr[j + 1]){//���Ҫ���������ڵ�Ԫ�أ�ǰ��Ĵ��ں���ģ�ǰ������ֵ����
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);//1 3 4 7
//		}
//		
//		//�Ӵ�С����
//		for(int i = 0; i < arr.length - 1; i++){//���ѭ����ѭ���ִΣ��ִ�ѭ���Ĵ��������ֳ���-1
//			for(int j = 0; j < arr.length - 1 - i; j++){//ÿһ�ִε����ֶԱ�����,ÿ�ִε�ѭ������4,3,2���ִγ���-1-i
//				if(arr[j] < arr[j + 1]){//���Ҫ���������ڵ�Ԫ�أ�ǰ��Ĵ��ں���ģ�ǰ������ֵ����
//					//�����뵹�����������Ķ���һ�µģ����ж��������ڵ�Ԫ���������������������һ��
//					//���������ǰ��Ĵ��ں��棬����
//					//����ǵ���ǰ���С�ں��棬����
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;//7 4 3 1
//				}
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[3];
//		System.out.println(arr[4]);
		
//		int[] arr = null;
//		System.out.println(arr[0]);
	}
}