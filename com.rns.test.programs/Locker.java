
/* Note :1. Write a simple class with 2 static and 2 instance methods 
and call all these 4 methods in a chain, 
starting from main method*/

class Locker
{
     
    void Locker1()
     {
		System.out.println(" we are in locker 1...");
		Locker lck1= new Locker();
		lck1.Locker2();
     }
      void Locker2()
     {
		System.out.println("we are in locker 2..");
		Locker3();
     }
      static void Locker3()
     {
		System.out.println("we are in locker 3..");
		Locker4();
     }
      static void Locker4()
     {
		System.out.println("we are in locker 4..");
     }
		public static void main(String[] args) {
		//Locker lck = new Locker();
		//lck.Locker1();
		new Locker().Locker1();
     }
}