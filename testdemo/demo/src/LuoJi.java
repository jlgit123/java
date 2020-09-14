
public class LuoJi {
	public static void main(String[] args){
		System.out.println(4 == 4 & 1 == 1);
		System.out.println(4 == 4 | 1 == 1);
		System.out.println(4 == 4 ^ 1 == 1); //false
		System.out.println(4 == 4 && 1 == 1);
		System.out.println(4 == 4 || 1 == 1);
		
		// 1. 区间判断
		int x = 4;
//		System.out.println(3 < x < 6);//java中不可以这样写
		System.out.println(x > 3 && x < 6);//true  只能这样写

		// 2. &与&&的区别
		int i = 0;
		int k = 1;
//		System.out.println(++k ==2);//true
		System.out.println(i != 0 & ++k ==2);
		System.out.println(k);//2
		// 单个&时，两边都参与运算

		System.out.println(i != 0 && ++k ==2);
		System.out.println(k);//2，没有进行++k的操作
		// 2个&时，如果左边为true，右边参与运算；如果左边为false，右边不参与运算。
		//同理，两个|时，如果左边为false，右边参与运算；如果左边为true，右边不参与运算。
		
		// 3. 测试题
		int a = 1;
		int b = 1;
		if(a++ == 2 & ++b == 2){
			//a++ == 2,先取值后运算，1==2，结果是false，再计算++之后x的值是2；
			//++b == 2,先运算后取值，先计算++得到y的值为2，再逻辑判断2 == 2，结果是true。
			//false & true,得到的结论是false
			System.out.println("执行");
		}
		
		System.out.println("a="+a+",b="+b);//a=2,b=2
		//&变成&&呢？ 【a=2,b=1】
	}
}
