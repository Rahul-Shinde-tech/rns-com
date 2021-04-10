public class DecSort{
public static void main(String[] args){
int[] arr= {0,0,13,2,3,4};
	
	int temp=0;
	
	System.out.println("Array Elements Before Sort:");
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]);
	
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){
			if(arr[i]<arr[j]){
				temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Array Elements After Sort:");
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]);

	}
}


/**** >>>>>>OUTPUT <<<<<<<< ****
* Microsoft Windows [Version 10.0.18363.1440]
* (c) 2019 Microsoft Corporation. All rights reserved.
* 
* D:\MyPracticePrograms>javac DecSort.java
* 
* D:\MyPracticePrograms>java DecSort
* Array Elements Before Sort:
* 0013234Array Elements After Sort:
* 0023413
* D:\MyPracticePrograms>
1
2
3
3
3

*/