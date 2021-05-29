package com.res;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlayUtil {
	static int TotalWicket=0;
	static int numBall = 6;
	int totalOvers =2;
	static int FirstTeamTotalInningsRuns=0;
	static int SecondTeamTotalInningsRuns =0;
	/*public static void main(String[] args) {
		Object[][] getOverRecords= new Object[2][10];
		getOverRecords=getOverRecord(2);
		
		
	}*/
	
	public static void getOverRecord1(int totalOvers) {
		//Object[][] overRecords= new Object[totalOvers][10];
		//List getRunsRecList = new LinkedList();
		for (int i = 0; i < totalOvers; i++) {
			int j=i;
			System.out.println("Started with Over No."+(j+1));
			
			if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
				System.out.println("Second Team won The match");
				break;
			}else {
				getRunsPerOver1();
				System.out.println("Total Runs Second Team"+SecondTeamTotalInningsRuns);
				System.out.println("Total Runs First Innings: First Team"+FirstTeamTotalInningsRuns);
				System.out.println("Current Run rate of Second Team"+SecondTeamTotalInningsRuns/(j+1));
				System.out.println("Required Runs to Win"+(FirstTeamTotalInningsRuns-SecondTeamTotalInningsRuns));
				System.out.println("Required Run rate per Over"+FirstTeamTotalInningsRuns/totalOvers);
				System.out.println("Innings Wickets:"+TotalWicket);
			}
			
		}
		System.out.println("=== =====");
		//System.out.println("Total Runs Second Innings"+SecondTeamTotalInningsRuns);
		//System.out.println("Required Runs to Win"+(FirstTeamTotalInningsRuns-SecondTeamTotalInningsRuns));
		//System.out.println("Required Run rate per Over"+FirstTeamTotalInningsRuns/totalOvers);
		//System.out.println("Innings Wickets:"+TotalWicket);
		
		//return overRecords;
	}

	public static void getRunsPerOver1() {
		//List getRunsList = new ArrayList<>();
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
				//getRunsList.add(0);
				
				// getWicket(count,j);
				totalOverRuns2=totalOverRuns2+0;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			}else if ("wk".equals(s)) {
				//getRunsList.add(0);
				TotalWicket=TotalWicket+1;
				if(TotalWicket ==10) {
					if(FirstTeamTotalInningsRuns>SecondTeamTotalInningsRuns==true) {
						System.out.println("First Team won the Match");
						break;
					}
					
				}
				// getWicket(count,j);
				totalOverRuns2=totalOverRuns2+0;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("wd".equals(s)) {
				//getRunsList.add(1);
				totalOverRuns2=totalOverRuns2+1;
				numBall++;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("nb".equals(s)) {
				//getRunsList.add(1);
				totalOverRuns2=totalOverRuns2+1;
				numBall++;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("1".equals(s)) {
				//getRunsList.add(1);
				totalOverRuns2=totalOverRuns2+1;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("2".equals(s)) {
				//getRunsList.add(2);
				totalOverRuns2=totalOverRuns2+2;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("3".equals(s)) {
				//getRunsList.add(3);
				totalOverRuns2=totalOverRuns2+3;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("4".equals(s)) {
				//getRunsList.add(4);
				totalOverRuns2=totalOverRuns2+4;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
				if(FirstTeamTotalInningsRuns<SecondTeamTotalInningsRuns==true) {
					System.out.println("Second Team won The match");
					break;
				}
			} else if ("6".equals(s)) {
				//getRunsList.add(6);
				totalOverRuns2=totalOverRuns2+6;
				SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
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
		
		//SecondTeamTotalInningsRuns=SecondTeamTotalInningsRuns+totalOverRuns2;
		//return getRunsList;

	}
	public static void getOverRecord(int totalOvers) {
		//Object[][] overRecords= new Object[totalOvers][10];
		//List getRunsRecList = new LinkedList();
		for (int i = 0; i < totalOvers; i++) {
			int j=i;
			System.out.println("Started with Over No."+(j+1));
			
			//getRunsRecList = 
				
					getRunsPerOver();
			
			/*for (int k = 0; k < overRecords.length; k++) {
				overRecords[i][k] = getRunsRecList.get(k);
			}*/
			System.out.println("Total Runs in First Innings"+FirstTeamTotalInningsRuns);
			System.out.println("Run rate per Over"+FirstTeamTotalInningsRuns/(j+1));
			System.out.println("Innings Wickets:"+TotalWicket);
		}
		System.out.println("Total Innings Records:");
		System.out.println("Total Runs in First Innings"+FirstTeamTotalInningsRuns);
		System.out.println("Run rate per Over"+FirstTeamTotalInningsRuns/totalOvers);
		System.out.println("Innings Wickets:"+TotalWicket);
		
		//return overRecords;
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
				//getRunsList.add(0);
				
				// getWicket(count,j);
				totalOverRuns=totalOverRuns+0;
			}else if ("wk".equals(s)) {
				//getRunsList.add(0);
				TotalWicket=TotalWicket+1;
				if(TotalWicket ==10) {
					break;
				}
				// getWicket(count,j);
				totalOverRuns=totalOverRuns+0;
			} else if ("wd".equals(s)) {
				//getRunsList.add(1);
				totalOverRuns=totalOverRuns+1;
				numBall++;
			} else if ("nb".equals(s)) {
				//getRunsList.add(1);
				totalOverRuns=totalOverRuns+1;
				numBall++;
			} else if ("1".equals(s)) {
				//getRunsList.add(1);
				totalOverRuns=totalOverRuns+1;
			} else if ("2".equals(s)) {
				//getRunsList.add(2);
				totalOverRuns=totalOverRuns+2;
			} else if ("3".equals(s)) {
				//getRunsList.add(3);
				totalOverRuns=totalOverRuns+3;
			} else if ("4".equals(s)) {
				//getRunsList.add(4);
				totalOverRuns=totalOverRuns+4;
			} else if ("6".equals(s)) {
				//getRunsList.add(6);
				totalOverRuns=totalOverRuns+6;
			} else {
				System.out.println("Enter correct Line:");
				numBall++;
			}

		}
		System.out.println("Runs per Over :"+totalOverRuns);
		
		FirstTeamTotalInningsRuns=FirstTeamTotalInningsRuns+totalOverRuns;
		//return getRunsList;

	}
	
}
