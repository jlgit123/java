
public class FuZhi {
	public static void main(String[] args){
		//二、赋值运算符
		int i1 = 1;
		short s1 = 2;
		
		i1 = s1;//自动类型转换
		s1 = (short)i1;
		//1. 强制类型转换
		
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		i2 = i3 = i4 = 1;
		//2. =可以连续赋值
		
		// i4 = i4 + 2;
		i4 += 2;
		i4 -= 2;
		System.out.println(i4);//1
		
		short s2 =2 ;
		s2 = (short)(s2 + 1); //变量参与运算的时候，java程序不知道具体的这个变量在做完运算后会不会超出当前变量的范围
		// 所以会先把变量转换为一个更大长度的类型，在这个例子中，short是一个短整形数据，会转化为默认的int。
		s2 += 3;
		//3. +=就不用强制类型转换了！！！
		
		boolean b1 = false;
        //4. 区分好==和=的区别。
        if(b1==true) 
        	System.out.println("结果为真");//=
        else
        	System.out.println("结果为假");//==
		
		int i5 = 1;
		i5 *= 0.1;
		System.out.println(i5);//0
		i5++;
		System.out.println(i5);//1
		//5. 默认会做强制转换
		

	}
}
