
public class For {
	public static void main(String[] args){
		//1. 连续输出5次helloworld
//		for(int i = 0;i<5;i++){ //初始化表达式①; 布尔值测试表达式②; 更改表达式
//			System.out.println(i);
//			System.out.println("hello world");
//		}
//		//初始化变量，咱们这里的变量是i，判断i < 5，如果是，执行代码块{},执行更改表达式i++给i重新赋值，值就变为1
//		//判断变量i < 5，当前的i是1，如果是，执行代码块{},执行更改表达式i++给i重新赋值，i值就变为2
//		//判断变量i < 5，当前的i是2，如果是，执行代码块{},执行更改表达式i++给i重新赋值，i值就变为3
//		//判断变量i < 5，当前的i是3，如果是，执行代码块{},执行更改表达式i++给i重新赋值，i值就变为4
//		//判断变量i < 5，当前的i是4，如果是，执行代码块{},执行更改表达式i++给i重新赋值，i值就变为5
//		//判断变量i < 5，当前的i是5，判断结果是false，不再往下执行，结束循环
		
		//2. 累加求和
		int result = 0;
        for(int i=1; i<=100; i++) {
        	result += i;
        }
        System.out.println("result=" + result);//result=5050
        
        //3.FooBizBaz，从1循环到150并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。
		for(int i = 1; i <= 150; i++){
			String str = "";
			str += i;
			if(i % 3 == 0){
				str += " foo";
			}
			if(i % 5 == 0){
				str += " biz";
			}
			if(i % 7 == 0){
				str += " baz";
			}
			System.out.println(str);
		}
		
		//4.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
	    for(int i = 100; i <= 999; i++){
	    	//145,145/100=1,(145-1*100)/10=4,145 - 1*100 - 4-10 = 5
	    	int m = i/100;//得到百位数
	    	int n = (i - m*100)/10;//得到十位数
	    	int k = i - m*100 - n*10;//得到各位数字
	//    	System.out.println(i);
	//    	System.out.println(m + " " + n + " " + k);
	    	int res = m*m*m + n*n*n + k*k*k;//各个位上数字立方和
	    	if(res == i){//判断是不是水仙花数
	    		System.out.println(i);
	    	}
	    }

	}
}
