class Team{
	
	private String teamName;
	private int teamRank;
	private String playerName;

	Team(String teamName){
		this.teamName = teamName;

	}

	public int setRank(int rank){
		teamRank = rank;
		return teamRank;
	}

	@Override
	public String toString(){
		String s = "Team: " + teamName + " Rank: " + teamRank;
		return s; 
	}
}