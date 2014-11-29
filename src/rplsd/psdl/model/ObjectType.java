package rplsd.psdl.model;

public class ObjectType {
	public Shape shape;
	public String name;
	public float friction, elacticity;
	public Vector force, initVelocity;
	
	public ObjectType(String name, Shape shape){
		this.name = name;
		this.shape = shape;
		friction = 0; elacticity = 0;
		force = new Vector(0, 0); initVelocity = new Vector(0, 0);
	}
	
	public String toString(){
		return String.format("%s<%s>: fric %.2f el %.2f f %s v0 %s", name, shape.name, friction, elacticity, force, initVelocity);
	}
}
