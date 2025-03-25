package MagicanandWarrior;


public abstract class GameFactory {
	
public static GameFactory getFactory(GameType type) {
		
		if(type == GameType.Fantasy) {
			return new FantasyFactory();
		} else if(type == GameType.SciFi) {
			return new SciFiFactory();
		} else {
			return null;
	}
}

	public abstract Warrior createWarrior();
	
	public abstract Magican createMagican();


}
