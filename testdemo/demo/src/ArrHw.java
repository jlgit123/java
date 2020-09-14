
public class ArrHw {
	public static void main(String[] args){
		int[] array1 = new int[]{2,3,5,7,11,13,17,19};
		int[] array2 = new int[array1.length];
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
			array2[i]=array1[i];
			// 2 3 5 7 11 13 17 19
		}
		for(int j=0;j<array2.length;j++){
			if(j%2==0){
				array2[j]=j;
			}
			System.out.println(array2[j]);
			// 0 3 2 7 4 13 6 19
		}
	}
}
