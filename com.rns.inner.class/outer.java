public class outer {
   static class Nested_Demo {
      public void my_method() {
         System.out.println("This is my static nested class");
      }
   }
   
   public static void main(String args[]) {
      outer.Nested_Demo nested = new outer.Nested_Demo();	 
      nested.my_method();
   }
}

/* >>>> OUTPUT <<<<
* Microsoft Windows [Version 10.0.18363.1440]
* (c) 2019 Microsoft Corporation. All rights reserved.
* 
* D:\MyPracticePrograms\com.rns.inner.class>javac outer.java
* 
* D:\MyPracticePrograms\com.rns.inner.class>java outer
* This is my nested class
* 
* D:\MyPracticePrograms\com.rns.inner.class>javac outer.java
* 
* D:\MyPracticePrograms\com.rns.inner.class>java outer
* This is my static nested class
* 
* D:\MyPracticePrograms\com.rns.inner.class>
* 
*/

