public class RepeatArray
{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,1,2,2,4};
		int[] res = new int[arr.length];
		
		System.out.println("Given Arrya is:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		// Removing Duplicate Array Elements 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]&& i==j){
					res[i]= arr[i];
				}else if (arr[i]==arr[j]&& i!=j){
					res[i]=0;
				}
			}
		}
		System.out.println("Array Elements after Removing Duplicates:");
		for(int k=0;k<arr.length;k++)
		System.out.print(res[k]);
		System.out.println();
		
	//Sorting array into Decreament 		
	int temp=0;
	for(int i=0;i<res.length;i++){
		for(int j=0;j<res.length;j++){
			if(res[i]<res[j]){
				temp= res[i];
				res[i]=res[j];
				res[j]=temp;
			}
		}
	}
	int count =0;
	System.out.println("Array Elements After Sort:");
	for(int i=0;i<res.length;i++){
		System.out.print(res[i]);
		if(res[i]==0){
			count=count+1;
		}
	}
	System.out.println();
	//process for RepeatArray elemts 
	System.out.println("Array Elements after remove Value 0");
	for(int i=count;i<res.length;i++){
		System.out.print(res[i]);
	}
	
	}	
}