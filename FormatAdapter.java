
public class FormatAdapter implements SonyPlaystation {
	
	PlaystationFormat psFormat;


	public FormatAdapter(String format) {
		
		if (format.equalsIgnoreCase("ps1")){
			psFormat = new PS1format();
		}
		
		else if (format.equalsIgnoreCase("ps2")) {
			psFormat = new PS2format();
		}
	
		else if (format.equalsIgnoreCase("ps3")) {
			psFormat = new PS3format();
		}
	
		else if (format.equalsIgnoreCase("ps4")) {
			psFormat = new PS4format();
		}
	
	}

	
	public void play(String format, String gameTitle) {
		
		if(format.equalsIgnoreCase("ps1")) {
			psFormat.PS1(gameTitle);
		}
		
		else if (format.equalsIgnoreCase("ps2")) {
			psFormat.PS2(gameTitle);
		}
	
		else if(format.equalsIgnoreCase("ps3")) {
			psFormat.PS3(gameTitle);
		}
	
		else if(format.equalsIgnoreCase("ps4")) {
			psFormat.PS4(gameTitle);
		}
	
	}

}
