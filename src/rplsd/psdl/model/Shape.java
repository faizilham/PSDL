package rplsd.psdl.model;

import java.util.ArrayList;

public class Shape {
	
	public String name;
	public ArrayList<BasicShape> basicShapes = new ArrayList<>();
	
	public Shape(String name){
		this.name = name;
	}
	
	public void addShape(BasicShape bs){
		basicShapes.add(bs);
	}
	
	public String toString(){
		return String.format("%s %s", name, basicShapes.toString());
	}
	
}
