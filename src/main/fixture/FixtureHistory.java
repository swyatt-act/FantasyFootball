package main.fixture;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using= FixtureHistoryDeserialiser.class)
public class FixtureHistory {
	
//	private Fixture fixture;
	private Date fixtureDate;
	private Integer gameSequence;
	private String result;
	
	public Date getFixtureDate() {
		return fixtureDate;
	}
	public void setFixtureDate(Date fixtureDate) {
		this.fixtureDate = fixtureDate;
	}
	public Integer getGameSequence() {
		return gameSequence;
	}
	public void setGameSequence(Integer gameSequence) {
		this.gameSequence = gameSequence;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Integer getMinutesPlayerd() {
		return minutesPlayerd;
	}
	public void setMinutesPlayerd(Integer minutesPlayerd) {
		this.minutesPlayerd = minutesPlayerd;
	}
	public Integer getGoalScored() {
		return goalScored;
	}
	public void setGoalScored(Integer goalScored) {
		this.goalScored = goalScored;
	}
	public Integer getAssists() {
		return assists;
	}
	public void setAssists(Integer assists) {
		this.assists = assists;
	}
	public Integer getCleanSheets() {
		return cleanSheets;
	}
	public void setCleanSheets(Integer cleanSheets) {
		this.cleanSheets = cleanSheets;
	}
	public Integer getOwnGoals() {
		return ownGoals;
	}
	public void setOwnGoals(Integer ownGoals) {
		this.ownGoals = ownGoals;
	}
	public Integer getPenaltiesSaved() {
		return penaltiesSaved;
	}
	public void setPenaltiesSaved(Integer penaltiesSaved) {
		this.penaltiesSaved = penaltiesSaved;
	}
	public Integer getYellowCards() {
		return yellowCards;
	}
	public void setYellowCards(Integer yellowCards) {
		this.yellowCards = yellowCards;
	}
	public Integer getRedCards() {
		return redCards;
	}
	public void setRedCards(Integer redCards) {
		this.redCards = redCards;
	}
	public Integer getSaves() {
		return saves;
	}
	public void setSaves(Integer saves) {
		this.saves = saves;
	}
	public Integer getBonusPoints() {
		return bonusPoints;
	}
	public void setBonusPoints(Integer bonusPoints) {
		this.bonusPoints = bonusPoints;
	}
	public Integer getEaSportsPPI() {
		return eaSportsPPI;
	}
	public void setEaSportsPPI(Integer eaSportsPPI) {
		this.eaSportsPPI = eaSportsPPI;
	}
	public Integer getBonusPointsSystem() {
		return bonusPointsSystem;
	}
	public void setBonusPointsSystem(Integer bonusPointsSystem) {
		this.bonusPointsSystem = bonusPointsSystem;
	}
	public Integer getNetTransfers() {
		return netTransfers;
	}
	public void setNetTransfers(Integer netTransfers) {
		this.netTransfers = netTransfers;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	private Integer minutesPlayerd;
	private Integer goalScored;
	private Integer assists;
	private Integer cleanSheets;
	private Integer ownGoals;
	private Integer penaltiesSaved;
	private Integer yellowCards;
	private Integer redCards;
	private Integer saves;
	private Integer bonusPoints;
	private Integer eaSportsPPI;
	private Integer bonusPointsSystem;
	private Integer netTransfers;
	private Integer value;
	
}
