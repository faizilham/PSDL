package rplsd.psdl.model;

import java.util.ArrayList;

public class World {
	public float width, height, gravity;
	public ArrayList<Instance> instances = new ArrayList<>();
	
	public World(){
		width = 300; height = 300; gravity = 0;
	}
	
	public void addInstance(Instance ins){
		instances.add(ins);
	}
	
	public String toString(){
		return String.format("world: %.2fx%.2f g %.2f\n%s", width, height, gravity, instances);
	}
}
