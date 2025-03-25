package furniture;
		 
public class FurnitureClient {
		 
		public static void main(final String[] args) {
			
			final FurnitureStore mFactory = ModernFactory.getFactory(FactoryType.Modern);				
			final FurnitureStore aFactory = AntiqueFactory.getFactory(FactoryType.Antique);
			final FurnitureStore aFactory2 = AntiqueFactory.getFactory(FactoryType.Antique);
				
			mFactory.createChairs().orderFurniture();
			aFactory.createTable().orderFurniture();
			aFactory2.createChairs().orderFurniture();
				
		}
			
}

