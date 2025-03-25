package furniture;

public class AntiqueFactory extends FurnitureStore{

	@Override
	public Chairs createChairs() {
		return new AnitiqueChairs();
	}

	@Override
	public Tables createTable() {
		return new AntiqueTables();
	}
	
	
}
