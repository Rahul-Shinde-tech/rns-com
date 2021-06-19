public class DiamondProblem{
	public static void main(String[] args){
		int rows;
		int columns;
		int star =1;
		int height = 9;
		int space = height-1;
		for(rows=1;rows<=height;rows++){
			for(columns=1;columns<=space;columns++){
				System.out.print(" ");
			}
			space--;
			for(columns= 1; columns<=star;columns++){
				System.out.print("*");
			}
			star =star+2;
			System.out.println();
		}
	}
}

/*   ====>> OUTPUT <<====

D:\rns-com\com.rns.patterns\Diamonds>javac DiamondProblem.java

D:\rns-com\com.rns.patterns\Diamonds>java DiamondProblem
     *
    ***
   *****
  *******
 *********
 
 
 
 D:\rns-com\com.rns.patterns\Diamonds>javac DiamondProblem.java

D:\rns-com\com.rns.patterns\Diamonds>java DiamondProblem
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
*****************
 
 */