package rplsd.psdl.model;

public class BasicShape {
	public static final int TYPE_CIRCLE = 0;
	public static final int TYPE_RECT = 1;
	public static final int TYPE_TRIANGLE = 2;
	public static final int TYPE_LINE = 3;
	
	
	private int type;
	public Point p1 = null, p2 = null, p3 = null, center = null;
	public float radius = 0;
	
	private BasicShape(int type){
		this.type = type;
	}
	
	public int getType(){
		return type;
	}
	
	public boolean isType(int type){
		return this.type == type;
	}
	
	public String toString(){
		switch(type){
		case TYPE_CIRCLE:
			return String.format("circle{%s, %.2f}", center.toString(), radius);
		case TYPE_RECT:
			return String.format("rect{%s - %s}", p1.toString(), p2.toString());
		case TYPE_LINE:
			return String.format("line{%s - %s}", p1.toString(), p2.toString());
		case TYPE_TRIANGLE:
			return String.format("triangle{%s, %s, %s}", p1.toString(), p2.toString(), p3.toString());
		default:
			return "N/A";
		}
	}
	
	public static BasicShape createCircle(Point center, float radius){
		BasicShape bs = new BasicShape(TYPE_CIRCLE);
		
		bs.radius = radius;
		bs.center = center;
		
		return bs;
	}
	
	public static BasicShape createRect(Point p1, Point p2){
		BasicShape bs = new BasicShape(TYPE_RECT);
		
		bs.p1 = p1; bs.p2 = p2;
		return bs;
	}
	
	public static BasicShape createLine(Point p1, Point p2){
		BasicShape bs = new BasicShape(TYPE_LINE);
		
		bs.p1 = p1; bs.p2 = p2;
		return bs;
	}
	
	public static BasicShape createTriangle(Point p1, Point p2, Point p3){
		BasicShape bs = new BasicShape(TYPE_TRIANGLE);
		
		bs.p1 = p1; bs.p2 = p2; bs.p3 = p3;
		return bs;
	}
}
