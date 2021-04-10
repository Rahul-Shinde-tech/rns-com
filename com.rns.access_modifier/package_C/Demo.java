class Demo {
		public int k =20;
	
	/*public abstract int a =20;  // Illegal modifier for the field a; only public, 
		//protected, private, static, final, transient & volatile are 
		 //permitted
*/	    void show() {
	      System.out.println("i am in show method of super class");
	   }
	   public static void main(String[] args){
		   Demo d = new Demo() 
		   {
			       void show() {
			           
			           System.out.println("i am in Flavor1Demo class");
			       }    
		   };
		   d.show();
	   }
}	   