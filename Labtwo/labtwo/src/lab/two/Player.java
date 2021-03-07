package lab.two;

public class Player {
	String name;
	String country;
	String Skill;
	public void setPlayerName(String name) {
		this.name=name;
	}
	public void setCountryName(String country) {
		this.country=country;
	}
	public void setSkill(String skill) {
		this.Skill=skill;
	}
	
	public String getPlayerDetails() {
		System.out.println("Player Details");
		return "Player Name : "+name+"\n"+"Country Name: "+country+"\n"+"Skill: "+Skill+"";
	}

}

