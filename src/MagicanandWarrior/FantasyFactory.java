package MagicanandWarrior;


public class FantasyFactory extends GameFactory{
	
	@Override
	public Warrior createWarrior() {
		return new FantasyWarrior();
	}

	@Override
	public Magican createMagican() {
		return new FantasyMagican();
	}

}
