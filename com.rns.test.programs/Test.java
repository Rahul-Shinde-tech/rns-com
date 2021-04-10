import java.util.Scanner;

interface ISwitch{
	void switchOn();
	void switchOff();
}
//Implement Class No 1

class LedLightImplements implements ISwitch{
	public void switchOn(){
		System.out.println("Led Light ON");
	}
	
	public void switchOff(){
		System.out.println("Led Light Off:");
	}
}

class SolarLightImplements implements ISwitch{
	public void switchOn(){
		System.out.println("Solar Light ON");
	}
	
	public void switchOff(){
		System.out.println("Solar Light Off:");
	}
}

class OtherLightImplements implements ISwitch{
	public void switchOn(){
		System.out.println("Other or Murcurry Light ON");
	}
	
	public void switchOff(){
		System.out.println("Other or Murcurry Light Off:");
	}
}

class LightFactory{
	public static ISwitch getLigth(String typeOfLight){
		if(typeOfLight. equals("LED")){
			return new LedLightImplements();
		}
		else if(typeOfLight.equals("Solar")){
			return new SolarLightImplements();
		}
		else{
			return new OtherLightImplements();
		}
	}
}


class User{
	public void actionPrint(){
		
		System.out.println("Enter the light you want:");
		System.out.println("LED"+"\tSolar"+"\t Other\n");
		Scanner scan = new Scanner(System.in);
		
		String typeOfLight = scan.next();
		ISwitch sw = LightFactory.getLigth(typeOfLight);
		sw.switchOn();
		sw.switchOff();
	}
	
}



public class Test{
	public static void main(String[] args){
	
		User use = new User();
		use.actionPrint();
	}
}

/*..............Output.............
D:\MyPracticePrograms>javac Test.java

D:\MyPracticePrograms>java Test
Enter the light you want:
LED     Solar    Other

LED
Led Light ON
Led Light Off:

D:\MyPracticePrograms>java Test
Enter the light you want:
LED     Solar    Other

Solar
Solar Light ON
Solar Light Off:

D:\MyPracticePrograms>java Test
Enter the light you want:
LED     Solar    Other

Other
Other or Murcurry Light ON
Other or Murcurry Light Off:

D:\MyPracticePrograms>

*/