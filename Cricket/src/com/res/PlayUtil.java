package com.res;

import java.util.Scanner;

public class PlayUtil {
	static int TotalWicket=0;
	static int TotalWicket2=0;
	static int numBall = 6;
	int totalOvers =2;
	static int FirstTeamTotalInningsRuns=0;
	static int SecondTeamTotalInningsRuns =0;
		
	public static void getOverRecord1(int totalOvers) {
		for (int i = 0; i < totalOvers; i++) {
			int j=i;
			System.out.println("Started with Over No."+(j+1));
			
			if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
				System.out.println("Second Team won The match");
				break;
			}else {
				int h=i;
				System.out.println("Total Runs of Second Team:"+SecondTeamTotalInningsRuns);
				System.out.println("Total Runs First Innings: First Team is"+FirstTeamTotalInningsRuns);
				System.out.println("Current Run rate of Second Team :"+SecondTeamTotalInningsRuns/(h+1));
				System.out.println("Required Runs to Win :"+(FirstTeamTotalInningsRuns-SecondTeamTotalInningsRuns));
				System.out.println("Required Run rate per Over :"+FirstTeamTotalInningsRuns/totalOvers);
				System.out.println("Innings Wickets: of Second Team"+TotalWicket2);
				getRunsPerOver1();
				
			}
			
		}
		if(FirstTeamTotalInningsRuns>SecondTeamTotalInningsRuns==true) {
			System.out.println("First Team won The match");
			
		}
		System.out.println("=== =====");
}

	public static void getRunsPerOver1() {
		int totalOverRuns2=0;
		numBall = 6;
		for (int j = 1; j <= numBall; j++) {
			System.out.println("Ball No." + j);
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
				System.out.println("Second Team won The match");
				break;
			}else {
			if (s.trim().isEmpty()) {
				System.out.println("Enter run or wicket should not be empty or blank");
			} else if ("0".equals(s)) {
				totalOverRuns2=totalOverRuns2+0;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			}else if ("wk".equals(s)) {
				TotalWicket2=TotalWicket2+1;
				if(TotalWicket2 ==10) {
					if(FirstTeamTotalInningsRuns>SecondTeamTotalInningsRuns==true) {
						System.out.println("First Team won the Match");
						break;
					}
					
				}
				totalOverRuns2=totalOverRuns2+0;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("wd".equals(s)) {
				totalOverRuns2=totalOverRuns2+1;
				numBall++;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+1;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("nb".equals(s)) {
				totalOverRuns2=totalOverRuns2+1;
				numBall++;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+1;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("1".equals(s)) {
				totalOverRuns2=totalOverRuns2+1;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+1;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("2".equals(s)) {
				totalOverRuns2=totalOverRuns2+2;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+2;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("3".equals(s)) {
				//getRunsList.add(3);
				totalOverRuns2=totalOverRuns2+3;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+3;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("4".equals(s)) {
				totalOverRuns2=totalOverRuns2+4;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+4;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("6".equals(s)) {
				totalOverRuns2=totalOverRuns2+6;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+6;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else {
				System.out.println("Enter correct Line:");
				numBall++;
			}
			}
		}
		System.out.println("Runs per Over :"+totalOverRuns2);
		
	}
	public static void getOverRecord(int totalOvers) {
		for (int i = 0; i < totalOvers; i++) {
			int j=i;
			System.out.println("Started with Over No."+(j+1));
			getRunsPerOver();
			
			System.out.println("Total Runs in First Innings"+FirstTeamTotalInningsRuns);
			System.out.println("Run rate per Over"+FirstTeamTotalInningsRuns/(j+1));
			System.out.println("Innings Wickets:"+TotalWicket);
		}
		System.out.println("Total Innings Records:");
		System.out.println("Total Runs in First Innings"+FirstTeamTotalInningsRuns);
		System.out.println("Run rate per Over"+FirstTeamTotalInningsRuns/totalOvers);
		System.out.println("Innings Wickets: of First Team : "+TotalWicket);
		
	}

	public static void getRunsPerOver() {
		//List getRunsList = new ArrayList<>();
		int totalOverRuns=0;
		numBall = 6;
		for (int j = 1; j <= numBall; j++) {
			System.out.println("Ball No." + j);
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			
			if (s.trim().isEmpty()) {
				System.out.println("Enter run or wicket should not be empty or blank");
			} else if ("0".equals(s)) {
				
				totalOverRuns=totalOverRuns+0;
			}else if ("wk".equals(s)) {
				TotalWicket=TotalWicket+1;
				if(TotalWicket ==10) {
					break;
				}
				totalOverRuns=totalOverRuns+0;
			} else if ("wd".equals(s)) {
				totalOverRuns=totalOverRuns+1;
				numBall++;
			} else if ("nb".equals(s)) {
				totalOverRuns=totalOverRuns+1;
				numBall++;
			} else if ("1".equals(s)) {
				totalOverRuns=totalOverRuns+1;
			} else if ("2".equals(s)) {
				totalOverRuns=totalOverRuns+2;
			} else if ("3".equals(s)) {
				totalOverRuns=totalOverRuns+3;
			} else if ("4".equals(s)) {
				totalOverRuns=totalOverRuns+4;
			} else if ("6".equals(s)) {
				totalOverRuns=totalOverRuns+6;
			} else {
				System.out.println("Enter correct Line:");
				numBall++;
			}

		}
		System.out.println("Runs per Over :"+totalOverRuns);
		
		FirstTeamTotalInningsRuns=FirstTeamTotalInningsRuns+totalOverRuns;

	}
	
}
