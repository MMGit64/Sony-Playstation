
public class BackwardCompatibleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playstation5 playStation5 = new Playstation5();
	
		playStation5.play("ps1", "Metal Gear Solid.ps1");
		playStation5.play("ps1", "Tomb Raider 3: Adventures of Lara Croft.ps1");
		playStation5.play("ps1", "Tekken3.ps1");
		
		playStation5.play("ps2", "Grand Theft Auto: Vice City.ps2");
		playStation5.play("ps2", "God Of War.ps2");
		playStation5.play("ps2" ,"Grand Theft Auto: San Andreas.ps2");
		
		playStation5.play("ps3", "Uncharted 2: Among Thieves.ps3");
		playStation5.play("ps3", "The Last Of Us.ps3");
		playStation5.play("ps3", "Grand Theft Auto 5.ps3");
		
		playStation5.play("ps4", "Uncharted 4: A Thieves End.ps4");
		playStation5.play("ps4", "Red Redemption 2.ps4");
		playStation5.play("ps4", "The Witcher: Wild Hunt.ps4");
	}

}
