
public class Arr {
	public static void main(String[] args){
		//一、一维数组
//		int i = 0;
//		int k = 1;
//		int m = 2;
		//想把多个的数据放到一个变量里？使用数组，就存放多个数据的集合
		//例如，存放多个int的类型数据
//		int[] ii;//1. 声明一个int的数组
//		int iii[];
		
		//2. 动态初始化
//		int[] ii = new int[4];//声明一个能放4个int类型数据的数组
		
		//3.静态初始化
//		int[] ii0 = new int[]{1,2,3,4};//3. 声明了一个存放了1、2、3、4这4个数的数组
		
		//4.数据类型
//		String[] strs = new String[]{"c","a","b"} ;//数组内的元素都有1个引用的元素下标，这个的下标是个数字，数字是从左到右从0开始
//		System.out.println(strs[1]); //a
//		//数组长度 .length
//		System.out.println("strs的数组长度是：" + strs.length);//3

		//5. 动态初始化默认值		
//		int[] ii = new int[2];//使用动态初始化的时候，数组的元素会有默认值，数字类型的默认值是0，对象的默认类型是null
//		System.out.println(ii[0]);//打印0
		
		//6. 改变初始值
//		int[] ii = new int[4];
//		System.out.println(ii[0]);
		
		//二、二维数组
//		ii[0] = 2;
//		System.out.println(ii[0]);
		
		//
//		//1. 定义一维数组中每一个元素都是一个数组，这样数组就是二维数组
//		//2. 静态初始化
//		int[][] ii = new int[][]{
//				{1,2},//第0个元素
//				{4,2}//第1个元素
//		};
//		
//		int[][] ii0 = new int[2][3];//第一维部分的长度是2，第二维也就第一维的每个元素的长度是3
//		//{
//		// {1,23,4},
//		// {2,4,6}
//		//}
//		int[][] ii1 = new int[2][];//只定义第一维的长度，第二维不定义
//		
//		System.out.println(ii[1][0]);//取出4元素
//		
//		int[] x,y[]; //特殊写法，x是一维数组，y是二维数组
//		
		//3. 遍历二维数组
//		int[][] arr = new int[][]{
//				{3,8,2},
//				{2,7},
//				{9,0,1,6}
//				};
//		
		// 3.1 复杂写法
//		int len = arr.length;//数组的一维的长度
//		int res = 0;
//		for(int i = 0; i < len; i++){
//			int[] arr0 = arr[i];
//			int llen = arr0.length;//二维数组的长度
//			for(int j = 0; j < llen; j++){
//				res += arr0[j];
//			}
//		}
//		System.out.println(res);
		// 3.2 简单写法
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr[i].length; j++){
//				res += arr[i][j];
//			}
//		}
		
//		//三、数组中涉及的常见算法
//		//1. 最大值、最小值、总和平均数
//		int[] arr = new int[]{4,2,7,1,3,5};
//		//最大值
//		int max = arr[0];//假设arr[0]是目前最大值
//		for(int i = 0; i < arr.length; i++){
//			if(max < arr[i]){
//				max = arr[i];//存放目前最大值
//			}
//		}
//		System.out.println("max:" + max); //max:7
//		
//		//最小值
//		int min = arr[0];//假设arr[0]是目前的最小值
//		for(int i = 0; i < arr.length; i++){
//			if(min > arr[i]){
//				min = arr[i];//把目前最小的值赋值给min
//			}
//		}
//		System.out.println("min:" + min); //min:1
//		
//		//总和，平均数
//		int res = 0;
//		for(int i = 0; i < arr.length; i++){
//			res += arr[i];
//		}
//		System.out.println("总和：" + res);
//		System.out.println("平均数：" + (res / arr.length));
//		//总和：22  平均数：3
//		
//		//2. 复制、反转
//		//注意：复制不是赋值
////		int[] aa = arr;//赋值
//		int[] copy = new int[arr.length];//声明一个与arr长度一致的数组
//		for(int i = 0; i < arr.length; i++){//复制
//			copy[i] = arr[i];//遍历arr，把arr的每一个元素安装顺序拿出来，给copy的每一个元素赋值，在这里的i就是copy和arr的元素下标
//		}
//		
//		//int[] arr = new int[]{4,2,7,1,3,5};
//		//考虑声明一个数组temp，数组temp的长度与arr的长度一致，我们倒着循环arr，正着给temp的元素赋值
//		// temp[0] = arr[5],temp[1] = arr[4],temp[2] = arr[3],temp[3] = arr[2],temp[4] = arr[1],temp[5] = arr[0]
//		//temp就是arr的倒序的数组，然后再把temp赋值给arr（arr = temp）
//		//一个数组的最后一个元素，它的下标等于数组的长度-1，因为元素的下标是从0开始
//		int[] temp = new int[arr.length];
//		int k = 0;//这个就是temp的元素下标
//		for(int i = arr.length - 1; i >= 0; i--){
////			System.out.println(arr[i]);
//			temp[k] = arr[i];//第一次循环，k=0,i=5,相当于temp[0] = arr[5]
//			k++;
//		}
//		arr = temp;
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);//5 3 1 7 2 4
//		}
		
		//3.数组元素的排序
		//正序，从小到大
		//4,7,3,1
		//4,3,1,7第一轮得到一个最大的数字，放在倒数第一位
		//3,1,4,7第二轮得到除最后一个数字之外的最大数字，放在倒数第二位
		//1,3,4,7第三轮得到除最后两个个数字之外的最大数字，放在倒数第三位
		
//		int[] arr = new int[]{4,7,3,1};
////		int[] arr = new int[]{2,56,33,1,8,5,64,34};
//		int temp = 0;
//		for(int i = 0; i < arr.length - 1; i++){//外层循环是循环轮次，轮次循环的次数是数字长度-1
//			for(int j = 0; j < arr.length - 1 - i; j++){//每一轮次的数字对比排序,每轮次的循环依次4,3,2，轮次长度-1-i
//				if(arr[j] > arr[j + 1]){//如果要是两个相邻的元素，前面的大于后面的，前后两个值交换
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
//		//从大到小排序
//		for(int i = 0; i < arr.length - 1; i++){//外层循环是循环轮次，轮次循环的次数是数字长度-1
//			for(int j = 0; j < arr.length - 1 - i; j++){//每一轮次的数字对比排序,每轮次的循环依次4,3,2，轮次长度-1-i
//				if(arr[j] < arr[j + 1]){//如果要是两个相邻的元素，前面的大于后面的，前后两个值交换
//					//正序与倒序排序，其他的都是一致的，在判断两个相邻的元素在声明情况下做交换不一样
//					//如果是正序，前面的大于后面，交换
//					//如果是倒序，前面的小于后面，交换
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
