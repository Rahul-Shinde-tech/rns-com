package org.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GameTable")
public class GameTable {
	@Id
	@Column(name="RecordType")
	String RecordType;
	@Column
	String VLTID;
	@Column
	String CreationDateTime;
	@Column
	String LogSequence;
	@Column
	String DeviceID;
	@Column
	String TransactionID;
	@Column
	String GameTime;
	@Column
	String PlayState;
	@Column
	String PlayResult;
	@Column
	String Denom;
	@Column
	String InitialWager;
	@Column
	String FinalWager;
	@Column
	String InitialWin;
	@Column
	String SecondaryPlayed;
	@Column
	String SecondaryWager;
	@Column
	String SecondaryWin;
	@Column
	String FinalWin;
	@Column
	String PaytableId;
	@Column
	String ThemeId;
	@Column
	String InitialStartTime;
	@Column
	String InitialPlayerCashableAmount;
	@Column
	String InitialPlayerNonCashableAmount;
	@Column
	String InitialPlayerPromoAmount;
	@Column
	String PlayerCashableAmount;
	@Column
	String PlayerNonCashableAmount;
	@Column
	String PlayerPromoAmount;
	@Column
	String PlayerSessionID;
	@Column
	String PlayerID;
	@Column
	String WinLevelIndex;
	@Column
	String WinLevelCombo;
	@Column
	String ProgressiveAllowed;
	@Column
	String DeviceClass;
	@Column
	String CashableAmount;
	@Column
	String PromoAmount;
	@Column
	String NonCashableAmount;
	@Column
	String CurrencyID;
	@Column
	String DenomID;
	@Column
	String BaseCashableAmt;
	@Column
	String NoteDateTime;
	@Column
	String ValidationID;
	@Column
	String VoucherSequence;
	@Column
	String VoucherAmt;
	@Column
	String TransferDateTime;
	@Column
	String SessionID;
	@Column
	String FileName;
	public String getRecordType() {
		return RecordType;
	}
	public void setRecordType(String recordType) {
		RecordType = recordType;
	}
	public String getVLTID() {
		return VLTID;
	}
	public void setVLTID(String vLTID) {
		VLTID = vLTID;
	}
	public String getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(String creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public String getLogSequence() {
		return LogSequence;
	}
	public void setLogSequence(String logSequence) {
		LogSequence = logSequence;
	}
	public String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}
	public String getGameTime() {
		return GameTime;
	}
	public void setGameTime(String gameTime) {
		GameTime = gameTime;
	}
	public String getPlayState() {
		return PlayState;
	}
	public void setPlayState(String playState) {
		PlayState = playState;
	}
	public String getPlayResult() {
		return PlayResult;
	}
	public void setPlayResult(String playResult) {
		PlayResult = playResult;
	}
	public String getDenom() {
		return Denom;
	}
	public void setDenom(String denom) {
		Denom = denom;
	}
	public String getInitialWager() {
		return InitialWager;
	}
	public void setInitialWager(String initialWager) {
		InitialWager = initialWager;
	}
	public String getFinalWager() {
		return FinalWager;
	}
	public void setFinalWager(String finalWager) {
		FinalWager = finalWager;
	}
	public String getInitialWin() {
		return InitialWin;
	}
	public void setInitialWin(String initialWin) {
		InitialWin = initialWin;
	}
	public String getSecondaryPlayed() {
		return SecondaryPlayed;
	}
	public void setSecondaryPlayed(String secondaryPlayed) {
		SecondaryPlayed = secondaryPlayed;
	}
	public String getSecondaryWager() {
		return SecondaryWager;
	}
	public void setSecondaryWager(String secondaryWager) {
		SecondaryWager = secondaryWager;
	}
	public String getSecondaryWin() {
		return SecondaryWin;
	}
	public void setSecondaryWin(String secondaryWin) {
		SecondaryWin = secondaryWin;
	}
	public String getFinalWin() {
		return FinalWin;
	}
	public void setFinalWin(String finalWin) {
		FinalWin = finalWin;
	}
	public String getPaytableId() {
		return PaytableId;
	}
	public void setPaytableId(String paytableId) {
		PaytableId = paytableId;
	}
	public String getThemeId() {
		return ThemeId;
	}
	public void setThemeId(String themeId) {
		ThemeId = themeId;
	}
	public String getInitialStartTime() {
		return InitialStartTime;
	}
	public void setInitialStartTime(String initialStartTime) {
		InitialStartTime = initialStartTime;
	}
	public String getInitialPlayerCashableAmount() {
		return InitialPlayerCashableAmount;
	}
	public void setInitialPlayerCashableAmount(String initialPlayerCashableAmount) {
		InitialPlayerCashableAmount = initialPlayerCashableAmount;
	}
	public String getInitialPlayerNonCashableAmount() {
		return InitialPlayerNonCashableAmount;
	}
	public void setInitialPlayerNonCashableAmount(String initialPlayerNonCashableAmount) {
		InitialPlayerNonCashableAmount = initialPlayerNonCashableAmount;
	}
	public String getInitialPlayerPromoAmount() {
		return InitialPlayerPromoAmount;
	}
	public void setInitialPlayerPromoAmount(String initialPlayerPromoAmount) {
		InitialPlayerPromoAmount = initialPlayerPromoAmount;
	}
	public String getPlayerCashableAmount() {
		return PlayerCashableAmount;
	}
	public void setPlayerCashableAmount(String playerCashableAmount) {
		PlayerCashableAmount = playerCashableAmount;
	}
	public String getPlayerNonCashableAmount() {
		return PlayerNonCashableAmount;
	}
	public void setPlayerNonCashableAmount(String playerNonCashableAmount) {
		PlayerNonCashableAmount = playerNonCashableAmount;
	}
	public String getPlayerPromoAmount() {
		return PlayerPromoAmount;
	}
	public void setPlayerPromoAmount(String playerPromoAmount) {
		PlayerPromoAmount = playerPromoAmount;
	}
	public String getPlayerSessionID() {
		return PlayerSessionID;
	}
	public void setPlayerSessionID(String playerSessionID) {
		PlayerSessionID = playerSessionID;
	}
	public String getPlayerID() {
		return PlayerID;
	}
	public void setPlayerID(String playerID) {
		PlayerID = playerID;
	}
	public String getWinLevelIndex() {
		return WinLevelIndex;
	}
	public void setWinLevelIndex(String winLevelIndex) {
		WinLevelIndex = winLevelIndex;
	}
	public String getWinLevelCombo() {
		return WinLevelCombo;
	}
	public void setWinLevelCombo(String winLevelCombo) {
		WinLevelCombo = winLevelCombo;
	}
	public String getProgressiveAllowed() {
		return ProgressiveAllowed;
	}
	public void setProgressiveAllowed(String progressiveAllowed) {
		ProgressiveAllowed = progressiveAllowed;
	}
	public String getDeviceClass() {
		return DeviceClass;
	}
	public void setDeviceClass(String deviceClass) {
		DeviceClass = deviceClass;
	}
	public String getCashableAmount() {
		return CashableAmount;
	}
	public void setCashableAmount(String cashableAmount) {
		CashableAmount = cashableAmount;
	}
	public String getPromoAmount() {
		return PromoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		PromoAmount = promoAmount;
	}
	public String getNonCashableAmount() {
		return NonCashableAmount;
	}
	public void setNonCashableAmount(String nonCashableAmount) {
		NonCashableAmount = nonCashableAmount;
	}
	public String getCurrencyID() {
		return CurrencyID;
	}
	public void setCurrencyID(String currencyID) {
		CurrencyID = currencyID;
	}
	public String getDenomID() {
		return DenomID;
	}
	public void setDenomID(String denomID) {
		DenomID = denomID;
	}
	public String getBaseCashableAmt() {
		return BaseCashableAmt;
	}
	public void setBaseCashableAmt(String baseCashableAmt) {
		BaseCashableAmt = baseCashableAmt;
	}
	public String getNoteDateTime() {
		return NoteDateTime;
	}
	public void setNoteDateTime(String noteDateTime) {
		NoteDateTime = noteDateTime;
	}
	public String getValidationID() {
		return ValidationID;
	}
	public void setValidationID(String validationID) {
		ValidationID = validationID;
	}
	public String getVoucherSequence() {
		return VoucherSequence;
	}
	public void setVoucherSequence(String voucherSequence) {
		VoucherSequence = voucherSequence;
	}
	public String getVoucherAmt() {
		return VoucherAmt;
	}
	public void setVoucherAmt(String voucherAmt) {
		VoucherAmt = voucherAmt;
	}
	public String getTransferDateTime() {
		return TransferDateTime;
	}
	public void setTransferDateTime(String transferDateTime) {
		TransferDateTime = transferDateTime;
	}
	public String getSessionID() {
		return SessionID;
	}
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	
	

}
