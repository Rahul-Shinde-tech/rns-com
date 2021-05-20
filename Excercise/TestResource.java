import java.util.Arrays;


public class TestResource {

	public static void main(String[] args) {
		int[] num = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		// Inserting Elements in Array list Interaoperatability 

		int indPos = 2;
		int newval = 5;

		int[] numArr = new int[num.length+1];
		for (int i = 0; i < indPos; i++) {
			numArr[i] = num[i];
		}
		for (int i = num.length-1; i >= indPos; i--) {
			numArr[i+1] = num[i];
		}
		numArr[indPos] = newval;
		System.out.println("New Array after adding into Array " + Arrays.toString(numArr));
	}

}
/* OUTPUT

[25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
[14, 15, 18, 25, 29, 36, 49, 56, 56, 77]
New Array after adding into Array [14, 15, 5, 18, 25, 29, 36, 49, 56, 56, 77]


*/
