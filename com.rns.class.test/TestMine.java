public class TestMine{
		public static void main(String ARGS[]){
		
			final Integer i =10;
			//i=i+2;
			
			final String name = "Ram";
			name.concat("Sham");
			System.out.println(name);
			
			final StringBuffer nm = new StringBuffer("Ram");
			nm.append(" Sham");
			System.out.println(nm);
			
			StringBuffer ab= new StringBuffer("ads");
			nm=ab;
			
		}
}