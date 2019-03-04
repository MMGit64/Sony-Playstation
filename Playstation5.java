
public class Playstation5 implements SonyPlaystation{
	
	FormatAdapter formatAdapter;
	
	public void play(String format, String gameTitle) {
		
		if (format.equalsIgnoreCase("ps5")){
			System.out.println("Playing PLAYSTATION 5 game: " + gameTitle);
		}
	
		else if(format.equalsIgnoreCase("ps1")||format.equalsIgnoreCase("ps2")||format.equalsIgnoreCase("ps3")||format.equalsIgnoreCase("ps4")) {
			formatAdapter = new FormatAdapter(format);
			formatAdapter.play(format, gameTitle);
		}

		else {
			System.out.println("Invalid Format: \n" + format + " Format Not Supported.");
		}
	}

}
