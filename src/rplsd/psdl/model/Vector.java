package rplsd.psdl.model;

public class Vector {
	public float size, angle;
	public Vector(float size, float angle){
		this.size = size; this.angle = angle;
	}
	
	public String toString(){
		return String.format("%.2f//%.2f", size, angle);
	}
}
