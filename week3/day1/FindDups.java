package week3.day1;

public class FindDups {

	public static void main(String[] args) {
		//input -int[] num={2, 5, 7, 7, 5, 9, 2, 3};
//		output :2,5,7
//		num.length=8;i[0]=2;i<8;i++
		
		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
		//int i= 0 means value is 2;2 < 8;
		for (int i = 0; i < num.length; i++) {
//
			for (int j = i+1; j < num.length; j++) {
                   if (num[j]==num[i]) {
					System.out.println(num[i]);
				}
			}
		}
		
	}

}
//Outer loop → Pick one number
//Inner loop → Compare with rest
//If match → Print
//Break → Stop inner loop