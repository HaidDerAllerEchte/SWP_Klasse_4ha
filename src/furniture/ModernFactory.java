package furniture;

public class ModernFactory extends FurnitureStore{
	
	@Override
	public Chairs createChairs() {
		return new ModernChairs();
	}

	@Override
	public Tables createTable() {
		return new ModernTables();
	}

}
