package org.test;

import java.io.BufferedReader;
import java.io.FileReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FileTest {
	static GameTable gameTable = null;
	static String vltId = "";
	static StringBuffer sb = new StringBuffer();
	public static void FileInput(String fileUrl) throws Exception {
		FileReader fr = new FileReader(fileUrl);
		BufferedReader br = new BufferedReader(fr);
		int countLine = 0;
		String s;
		while ((s=br.readLine()) != null) {
			
			countLine += 1;
			System.out.println("countLine:" + countLine);
			if (countLine >= 6) {
				//String s = br.readLine();
				String[] str = SingleLine(s);
				sb.append(str[1]);
				if (str[1]==" ") {
					//str[1] = vltId.toString();
					str[1]= sb.toString();
				}
				System.out.println("My Line First Elemet:" + str[0]);
				System.out.println();
				if ("1".equals(str[0])) {
					System.out.println("Calling Table Column :1");
					gameTable = FileTest.getInstance();
					gameTable.setRecordType(str[0]);
					gameTable.setVLTID(str[1]);
					gameTable.setLogSequence(str[2]);
					gameTable.setDeviceID(str[3]);
					gameTable.setTransactionID(str[4]);
					gameTable.setGameTime(str[5]);
					gameTable.setPlayState(str[6]);
					gameTable.setPlayResult(str[7]);
					gameTable.setDenom(str[8]);
					gameTable.setInitialWager(str[9]);
					gameTable.setInitialWin(str[10]);
					gameTable.setSecondaryPlayed(str[11]);
					gameTable.setSecondaryWin(str[12]);
					gameTable.setFinalWin(str[13]);
					gameTable.setPaytableId(str[14]);
					gameTable.setThemeId(str[15]);
					gameTable.setInitialStartTime(str[16]);
					gameTable.setInitialPlayerCashableAmount(str[17]);
					gameTable.setInitialPlayerNonCashableAmount(str[18]);
					gameTable.setInitialPlayerPromoAmount(str[19]);
					gameTable.setPlayerCashableAmount(str[20]);
					gameTable.setPlayerNonCashableAmount(str[21]);
					gameTable.setPlayerPromoAmount(str[22]);
					gameTable.setPlayerSessionID(str[23]);
					gameTable.setPlayerID(str[24]);
					FileTest.saveUser(gameTable);
					System.out.println("Submitted to Database:");
					gameTable=null;
				} else if ("2".equals(str[0])) {
					System.out.println("Calling Table Column :2");
					gameTable = FileTest.getInstance();
					gameTable.setRecordType(str[0]);
					gameTable.setValidationID(str[1]);
					gameTable.setWinLevelIndex(str[2]);
					gameTable.setWinLevelCombo(str[3]);
					gameTable.setProgressiveAllowed(str[4]);
					FileTest.saveUser(gameTable);
					System.out.println("Submitted to Database:");
					gameTable=null;
				} else if ("3".equals(str[0])) {
					System.out.println("Calling Table Column :3");
					gameTable = FileTest.getInstance();
					gameTable.setRecordType(str[0]);
					gameTable.setDeviceClass(str[1]);
					gameTable.setTransactionID(str[2]);
					gameTable.setLogSequence(str[3]);
					gameTable.setCashableAmount(str[4]);
					gameTable.setPromoAmount(str[5]);
					gameTable.setNonCashableAmount(str[6]);
					FileTest.saveUser(gameTable);
					System.out.println("Submitted to Database:");
					gameTable=null;
				} else if ("4".equals(str[0])) {
					System.out.println("Calling Table Column :4");
					gameTable = FileTest.getInstance();
					gameTable.setRecordType(str[0]);
					gameTable.setVLTID(str[1]);
					gameTable.setCreationDateTime(str[2]);
					gameTable.setDeviceID(str[3]);
					gameTable.setTransactionID(str[4]);
					gameTable.setCurrencyID(str[5]);
					gameTable.setDenomID(str[6]);
					gameTable.setBaseCashableAmt(str[7]);
					gameTable.setNoteDateTime(str[8]);
					FileTest.saveUser(gameTable);
					System.out.println("Submitted to Database:");
					gameTable=null;
				} else if ("5".equals(str[0])) {
					System.out.println("Calling Table Column :5");
					gameTable = FileTest.getInstance();
					gameTable.setRecordType(str[0]);
					gameTable.setVLTID(str[1]);
					gameTable.setCreationDateTime(str[2]);
					gameTable.setDeviceID(str[3]);
					gameTable.setTransactionID(str[4]);
					gameTable.setValidationID(str[5]);
					gameTable.setVoucherSequence(str[6]);
					gameTable.setVoucherAmt(str[7]);
					gameTable.setTransferDateTime(str[8]);
					FileTest.saveUser(gameTable);
					
					System.out.println("Submitted to Database:");
					gameTable=null;
				}
			}
		}
		br.close();
		fr.close();
		gameTable=null;
		
	}

	public static GameTable getInstance() {
		if (gameTable == null) {
			return new GameTable();
		}
		return null;
	}

	public static String[] SingleLine(String s) {

		//System.out.println(2);
		String opLine = s;
		String[] resLine = opLine.split(" ");
		// String[] newStr = null;
		int i = 0;
		StringBuffer sb = new StringBuffer();
		for (i = 0; i < resLine.length; i++) {
			sb.append(resLine[i]);
		}

		String str = sb.toString();
		String[] newStr = str.split("\\|", 50);

		return newStr;

	}

	public static void saveUser(GameTable gameTable) {
		try (Session session= HibernateUtil.getSession()) {
			session.beginTransaction();
			session.save(gameTable);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
