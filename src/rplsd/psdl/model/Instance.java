package rplsd.psdl.model;

import java.util.ArrayList;

public class Instance {
	public Point position;
	public ObjectType type;
	
	public Instance(ObjectType type, Point position){
		this.position=position; this.type = type;
	}
	
	public String toString(){
		return String.format("%s at %s", type.name, position);
	}
	
	public float getFriction(){
		return type.friction;
	}
	
	public float getElasticity(){
		return type.elacticity;
	}
	
	public Vector getForce(){
		return type.force;
	}
	
	public Vector getInitVelocity(){
		return type.initVelocity;
	}
	
	public String getTypeName(){
		return type.name;
	}
	
	public Shape getShape(){
		return type.shape;
	}
	
	public ArrayList<BasicShape> getBasicShapes(){
		return getShape().basicShapes;
	}
}
