package MagicanandWarrior;

public class SciFiFactory extends GameFactory{
	
	@Override
	public Warrior createWarrior() {
		return new SciFiWarrior();
	}

	@Override
	public Magican createMagican() {
		return new SciFiMagican();
	}

}
