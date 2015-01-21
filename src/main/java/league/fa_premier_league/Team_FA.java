/**
 * @Title: Team_FA.java
 * @Package league.fa_premier_league
 * Copyright: Copyright (c) 2011 
 * Company:Everbridge.Inc
 * 
 * @author wyq
 * @date Jan 21, 2015 7:14:39 PM
 * @version V1.0
 * @Description: TODO
 */
package league.fa_premier_league;

/**
 * @ClassName: Team_FA
 * @Description: TODO Enum for FA Premier League
 * @author wyq
 * @date Jan 21, 2015 7:14:39 PM
 */
public enum Team_FA {
	Arsenal("Arsenal"),
	AstonVilla("Aston Villa"),
	Burnley("Burnley"),
	Chelsea("Chelsea"),
	CrystalPalace("Crystal Palace"),
	Everton("Everton"),
	HullCity("Hull City"),
	LeicesterCity("Leicester City"),
	Liverpool("Liverpool"),
	ManchesterCity("Manchester City"),
	ManchesterUnited("Manchester United"),
	NewcastleUnited("Newcastle United"),
	QueensParkRangers("Queens Park Rangers"),
	Southampton("Southampton"),
	StokeCity("Stoke City"),
	Sunderland("Sunderland"),
	SwanseaCity("Swansea City"),
	TottenhamHotspur("Tottenham Hotspur"),
	WestBromwichAlbion("West Bromwich Albion"),
	WestHamUnited("West Ham United");

	private String teamName;
	
	Team_FA(String name){
		this.teamName = name;
	}
	
	public String getTeam(){
		return this.teamName;
	}
}
