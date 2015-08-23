package com.partlight.ms.scene.mainmenu;

class MainMenuNavDemoStrings {

	public static final String	NAV_DEMO_GOOGLE_SIGN_IN	= "\n\nNOTE THAT THIS REQUIRES\nA SIGNED IN GOOGLE PLAY PROFILE";
	public static final String	NAV_DEMO_INTRO			= "WELCOME TO MORTAL SHOWDOWN!\n\nNAVIGATE THIS MENU BY SWIPING IN\nANY DIRECTION. EACH RESPECTIVE\nICON SHOWS WHAT SWIPING IN THAT\nDIRECTION DOES";
	public static final String	NAV_DEMO_ACHIEVEMENTS	= "THERE ARE DOZENS OF CHALLENGES\nTO COMPLETE. CHECK THEM OUT BY\nSWIPING TO THE LEFT"
			.concat(MainMenuNavDemoStrings.NAV_DEMO_GOOGLE_SIGN_IN);
	public static final String	NAV_DEMO_LEADERBOARD	= "CAN YOU BEAT THE WORLD WIDE\nWEB? CHECK OUT THE LEADERBOARD BY\nSWIPING TO THE RIGHT"
			.concat(MainMenuNavDemoStrings.NAV_DEMO_GOOGLE_SIGN_IN);
	public static final String	NAV_DEMO_OPTIONS		= "YOU CAN EASILY ADJUST\nYOUR GAME SETTINGS BY SWIPING\nDOWNWARDS";
	public static final String	NAV_DEMO_STORE			= "AS YOU PLAY, YOU WILL COLLECT\nSCRAP PARTS.\nSWIPE UPWARDS AND VISIT\nTHE WORKSHOP TO UPGRADE AND\nPERSONALISE YOUR GEAR";
	public static final String	NAV_DEMO_STRING_LONGEST	= MainMenuNavDemoStrings.NAV_DEMO_LEADERBOARD;

	public static final String[] NAV_DEMO_STRINGS = {
			MainMenuNavDemoStrings.NAV_DEMO_INTRO,
			MainMenuNavDemoStrings.NAV_DEMO_ACHIEVEMENTS,
			MainMenuNavDemoStrings.NAV_DEMO_OPTIONS,
			MainMenuNavDemoStrings.NAV_DEMO_LEADERBOARD,
			MainMenuNavDemoStrings.NAV_DEMO_STORE
	};
}