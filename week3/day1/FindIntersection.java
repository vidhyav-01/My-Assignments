package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		
int[] array1 = {3, 2, 11, 4, 6, 7};//array1 has 6 elements
int[] array2 = {1, 2, 8, 4, 9, 7};//array2 has 6 elements

//Outer loop for first array
//starts at index 0(i=0) 
//ends at array1.length-1 (6-1) which is index

for (int i = 0; i < array1.length; i++) 
	{
	//use inside for loop for second array
	//Compares of current element of array1 with every element of array2
	for (int j = 0; j < array2.length; j++) {
		//checks array1=array2 if it is equal print array1
		if (array1[i]==array2[j]) 
		{
			System.out.println(array1[i]);
		}
	}
}
//execution flow
//int[] array1(i) = {3, 2, 11, 4, 6, 7};//array1 has 6 elements
//int[] array2(j) = {1, 2, 8, 4, 9, 7};//array2 has 6 elements

//i=0 array1[0]=3;3==1,2,8,4,9,7 (checks with every element of j)-->no match
//i=1 array1[1]=2;2==1,2,8,4,9,7 (checks with every element of j)--->match
//i=2 array1[2]=11;11==1,2,8,4,9,7 (checks with every element of j)--->no match
//i=3 array1[3]=4;4==1,2,8,4,9,7 (checks with every element of j)-->match
//i=4 array1[4]=6;6==1,2,8,4,9,7 (checks with every element of j)-->no match
//i=5 array1[5]=7;7==1,2,8,4,9,7 (checks with every element of j)-->match

	}

}
