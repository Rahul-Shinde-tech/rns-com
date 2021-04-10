// Write a program to remove dupplicate array elements 

// Important program

public class DupArrayElements{
	public static void main(String[] args){
		int[] a= {1,2,3,4,1,2,2,4};
		int[] res= new int[a.length];
				
		System.out.println("Given Array Elements area;");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]);
		System.out.println();
		// Replacing Duplicates by Zero
		for(int i=0; i<res.length;i++){
			for(int j=0;j<res.length;j++){
				if(a[i]==a[j] && i==j){
					res[i]=a[i];
					
				}else if(a[i]==a[j] && i!=j)
				{
					res[i]=0;
				}
			}
		}
		//Array elements after removed Duplicates 
		System.out.println("Array Elements by Removed Duplicates;");
		for(int i=0;i<a.length;i++)
		System.out.print(res[i]);
		System.out.println();
		
		
		// Sorting of an array
		int temp =0;
		for(int i=0; i<res.length;i++){
			for(int j=0;j<res.length;j++){
				if(res[i]<res[j]){
					temp = res[i];
					res[i]= res[j];
					res[j]= temp;
				}
			}
		}
		int count=0;
		System.out.println("Array Elements by After Sorting:");
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]);
			if(res[i]==0){
				count = count +1;
			}
		}
		System.out.println();
		System.out.println("Array Elements by removed all duplicates :");
		for(int i=count;i<res.length;i++)
		System.out.print(res[i]);
		
	}
	
} 
/*
D:\JWingDeveloper>javac DupArrayElements.java

D:\JWingDeveloper>java DupArrayElements
Given Array Elements area;
12341224
Array Elements by Removed Duplicates;
00301024
Array Elements by After Sorting:
00001234
Array Elements by removed all duplicates :
1234
D:\JWingDeveloper>
*/


