package gameSalesManagement.Entities;

public class Game {
	private int gameId;
	private String name;
	private double price;
	private String details;
	private int maxNumberOfPlayers;
	
	public Game() {
		
	}
	
	public Game(int gameId, String name, double price, String details, int maxNumberOfPlayers) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.price = price;
		this.details = details;
		this.maxNumberOfPlayers = maxNumberOfPlayers;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getMaxNumberOfPlayers() {
		return maxNumberOfPlayers;
	}

	public void setMaxNumberOfPlayers(int maxNumberOfPlayers) {
		this.maxNumberOfPlayers = maxNumberOfPlayers;
	}
	
}
