package rplsd.psdl.model;

import java.util.HashMap;
import java.util.Map.Entry;

public class Model {
	public String name;
	public World world;
	public HashMap<String,ObjectType> objectTypes = new HashMap<>();
	public HashMap<String,Shape> shapes = new HashMap<>();
	
	public Model(String name){
		this.name = name;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("model ").append(name).append("\n\n");
		
		for(Entry<String,Shape> e : shapes.entrySet()){
			sb.append(e.getValue()).append("\n");
		}
		
		sb.append("\n");
		
		for(Entry<String,ObjectType> e : objectTypes.entrySet()){
			sb.append(e.getValue()).append("\n");
		}
		
		sb.append("\n");
		sb.append(world.toString());
		
		return sb.toString();
	}
}
