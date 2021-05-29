package com.res;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlayCricket {

	static PlayCricket crInstance = null;
	private final int TOTALPLAYERS = 11;

	public static void main(String[] args) {
		int countInn = 0;
		int countTeam = 2;
		String teamName1;
		String teamName2;

		crInstance.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two team Name:");
		String teamName;

		while (countTeam != 0) {
			teamName = scan.nextLine();

			if (teamName.trim().isEmpty() || teamName.trim().contains("null") || teamName.trim().contains("Null")) {
				System.out.println("Should not be Empty or Null:");

				System.out.println("Please Enroll 2 team Name Correctly:");

			} else {
				if (countTeam == 2) {
					teamName1 = teamName;
					countTeam--;
				} else if (countTeam == 1) {
					teamName2 = teamName;
					countTeam--;
					System.out.println("Two Teams are Enrolled:");
					System.out.println("Please enter the number of overs:");
					Scanner scanOver = new Scanner(System.in);
					try {

						final int totalOver = scanOver.nextInt();
						for (int inn = 0; inn < 2; inn++) {

							if (totalOver > 0) {
								// String[] str=null;
								// Map<Integer, String> map= new LinkedHashMap<Integer, String>();
								if (countInn <= 0) {
									System.out.println("Inning 1 Started:");
									for (int i = 0; i < 1; i++) {
										countInn++;
										PlayUtil.getOverRecord(totalOver);
										
									}
									System.out.println("First Innins of First Team is Completed :");
								} else if (countInn == 1) {
									System.out.println("\n\n====>>>><<<<<<======");
									System.out.println("Inning 2 Started:");
									for (int i = 0; i < 1; i++) {
										countInn++;
										PlayUtil.getOverRecord1(totalOver);
										
									}
									System.out.println("Second Innings of Second Team is Completed :");
								} else if (countInn > 1) {
									System.out.println("Both the Innings are Over:");
									System.out.println("Result will Be:");
								}
							} else {
								System.out.println("Please Enroll Over greter than zero:");

							}
						}
						/*
						 * if (totalOver>0) {
						 * 
						 * }else { System.out.println(" Enrolled Over should be greater than zero!"); }
						 */
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}

		}
		scan.close();

	}

	public static PlayCricket getInstance() {
		if (crInstance == null) {
			crInstance = new PlayCricket();
		}
		return crInstance;
	}

}
