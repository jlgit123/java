
public class FuZhi {
	public static void main(String[] args){
		//������ֵ�����
		int i1 = 1;
		short s1 = 2;
		
		i1 = s1;//�Զ�����ת��
		s1 = (short)i1;
		//1. ǿ������ת��
		
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		i2 = i3 = i4 = 1;
		//2. =����������ֵ
		
		// i4 = i4 + 2;
		i4 += 2;
		i4 -= 2;
		System.out.println(i4);//1
		
		short s2 =2 ;
		s2 = (short)(s2 + 1); //�������������ʱ��java����֪�������������������������᲻�ᳬ����ǰ�����ķ�Χ
		// ���Ի��Ȱѱ���ת��Ϊһ�����󳤶ȵ����ͣ�����������У�short��һ�����������ݣ���ת��ΪĬ�ϵ�int��
		s2 += 3;
		//3. +=�Ͳ���ǿ������ת���ˣ�����
		
		boolean b1 = false;
        //4. ���ֺ�==��=������
        if(b1==true) 
        	System.out.println("���Ϊ��");//=
        else
        	System.out.println("���Ϊ��");//==
		
		int i5 = 1;
		i5 *= 0.1;
		System.out.println(i5);//0
		i5++;
		System.out.println(i5);//1
		//5. Ĭ�ϻ���ǿ��ת��
		

	}
}