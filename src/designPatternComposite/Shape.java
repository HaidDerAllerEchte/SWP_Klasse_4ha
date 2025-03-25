package designPatternComposite;

public abstract class Shape {
	
	public abstract void display();

	public void add(Shape shape) {
		//Leermethode für die Leaf-Nodes
		//methode muss in ComposedShape überschrieben werden
	}
}
