package rplsd.psdl.model;

public class Point {
	public float x, y;
	public Point(float x, float y){
		this.x = x; this.y = y;
	}

	public String toString(){
		return String.format("(%.2f, %.2f)", x, y);
	}
	
	public static Point getAbsolutePoint(Point position, Point relativePoint){
		return new Point(position.x + relativePoint.x, position.y + relativePoint.y);
	}
	
	public static float getAbsoluteX(Point position, Point relativePoint){
		return position.x + relativePoint.x;
	}
	
	public static float getAbsoluteY(Point position, Point relativePoint){
		return position.y + relativePoint.y;
	}
}
