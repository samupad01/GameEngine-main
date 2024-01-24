package dad.game.engine;

import javafx.scene.image.Image;

/**
 * Clase que genera una entidad de arbol
 */
public class Tree extends CollidableEntity {

	public Tree(double x, double y) {
		super(new Image("/images/treeTile.png"), x, y);
	}

//	@Override
//	public void render(GraphicsContext gc) {
//		super.render(gc);
//		Rectangle shape = (Rectangle) getCollisionShape();
//		gc.setFill(Color.OLIVEDRAB);
//		gc.fillRect(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight());
//	}

}
