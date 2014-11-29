package rplsd.psdl;

import org.antlr.v4.runtime.misc.NotNull;

import rplsd.psdl.PSDLParser.BasicShapeContext;
import rplsd.psdl.PSDLParser.ObjectCreationContext;
import rplsd.psdl.PSDLParser.ObjectPropertyContext;
import rplsd.psdl.PSDLParser.WorldPropertyContext;
import rplsd.psdl.model.BasicShape;
import rplsd.psdl.model.Instance;
import rplsd.psdl.model.Model;
import rplsd.psdl.model.ObjectType;
import rplsd.psdl.model.Point;
import rplsd.psdl.model.Shape;
import rplsd.psdl.model.Vector;
import rplsd.psdl.model.World;

public class ModelVisitor extends PSDLBaseVisitor<Object> {
	
	private class Property{
		public String key; public Object value;
		
		public Property(String key, Object value){
			this.key = key; this.value = value;
		}
	}
	
	private final String HEIGHT = "height";
	private final String WIDTH = "width";
	private final String GRAVITY = "gravity";
	private final String FRICTION = "friction";
	private final String ELASTICITY = "elasticity";
	private final String FORCE = "force";
	private final String VELOCITY = "velocity";
	
	private Model model = null;
	
	@Override public Model visitModel(@NotNull PSDLParser.ModelContext ctx) {
		
		model = new Model(ctx.name.getText());
		visitChildren(ctx);
		
		return model; 
	}
	
	// world
	@Override public Object visitWorld(@NotNull PSDLParser.WorldContext ctx) { 
		model.world = new World();
		
		for(WorldPropertyContext wpc : ctx.worldProperty()){
			Property prop = (Property) visit(wpc);
			switch(prop.key){
			case GRAVITY: model.world.gravity = (Float) prop.value; break;
			case HEIGHT: model.world.height = (Float) prop.value; break;
			case WIDTH: model.world.width = (Float) prop.value; break;
			}
		}
		
		for (ObjectCreationContext occ : ctx.objectCreation()){
			model.world.addInstance((Instance) visit(occ));
		}
		
		return model.world;
	}
	
	
	
	// object instantiation
	@Override public Instance visitObjectCreation(@NotNull PSDLParser.ObjectCreationContext ctx) {
		ObjectType type; String typeName = ctx.type.getText();
		
		if ((type = model.objectTypes.get(typeName)) == null)
			throw new RuntimeException(String.format("Object '%s' not yet declared", typeName));
		
		return new Instance(type, (Point) visit(ctx.pos));
	}
	
	// world properties
	@Override public Object visitHeight(@NotNull PSDLParser.HeightContext ctx) { return new Property(HEIGHT, visit(ctx.value)); }
	@Override public Object visitWidth(@NotNull PSDLParser.WidthContext ctx) { return new Property(WIDTH, visit(ctx.value)); }
	@Override public Object visitGravity(@NotNull PSDLParser.GravityContext ctx) { return new Property(GRAVITY, visit(ctx.value)); }
	
	// basic shapes
	@Override public BasicShape visitCircle(@NotNull PSDLParser.CircleContext ctx) { 
		return BasicShape.createCircle((Point) visit(ctx.center), (Float) visit(ctx.radius)); 
	}
	
	@Override public BasicShape visitTriangle(@NotNull PSDLParser.TriangleContext ctx) {
		return BasicShape.createTriangle((Point) visit(ctx.p1), (Point) visit(ctx.p2), (Point) visit(ctx.p3)); 
	}
	
	@Override public BasicShape visitLine(@NotNull PSDLParser.LineContext ctx) {
		return BasicShape.createLine((Point) visit(ctx.p1), (Point) visit(ctx.p2)); 
	}

	@Override public BasicShape visitRectangle(@NotNull PSDLParser.RectangleContext ctx) {
		return BasicShape.createRect((Point) visit(ctx.p1), (Point) visit(ctx.p2)); 
	}
	
	
	// shape declaration
	@Override public Shape visitShape(@NotNull PSDLParser.ShapeContext ctx) {
		Shape shape = new Shape(ctx.name.getText());
		for(BasicShapeContext bsc : ctx.basicShape()){
			shape.addShape((BasicShape) visit(bsc));
		}
		
		model.shapes.put(shape.name, shape);
		
		return shape; 
	}
	
	// object declaration
	@Override public ObjectType visitObject(@NotNull PSDLParser.ObjectContext ctx) {
		Shape shape; String shapeName = ctx.shapeName.getText();
		if ((shape = model.shapes.get(shapeName)) == null)
			throw new RuntimeException(String.format("Shape '%s' not yet declared", shapeName));
		
		ObjectType obj = new ObjectType(ctx.name.getText(), shape);
		
		for (ObjectPropertyContext opc : ctx.objectProperty()){
			Property prop = (Property) visit(opc);
			switch(prop.key){
			case FRICTION: obj.friction = (Float) prop.value; break;
			case ELASTICITY: obj.elacticity = (Float) prop.value; break;
			case FORCE: obj.force =(Vector) prop.value; break;
			case VELOCITY: obj.initVelocity = (Vector) prop.value; break;
			}
		}
		
		model.objectTypes.put(obj.name, obj);
		
		return obj;
	}
	
	
	// object properties
	@Override public Object visitFriction(@NotNull PSDLParser.FrictionContext ctx) { return new Property(FRICTION, visit(ctx.value)); }
	@Override public Object visitElasticity(@NotNull PSDLParser.ElasticityContext ctx) { return new Property(ELASTICITY, visit(ctx.value)); }
	@Override public Object visitForce(@NotNull PSDLParser.ForceContext ctx) { return new Property(FORCE, visit(ctx.value)); }
	@Override public Object visitInitVelocity(@NotNull PSDLParser.InitVelocityContext ctx) { return new Property(VELOCITY, visit(ctx.value)); }
	
	// basic datatype
	@Override public Object visitReal(@NotNull PSDLParser.RealContext ctx) {
		return Float.valueOf(ctx.getText());
	}
	
	@Override public Object visitPoint(@NotNull PSDLParser.PointContext ctx) {
		return new Point((Float) visit(ctx.x), (Float) visit(ctx.y));
	}
	
	@Override public Object visitVector(@NotNull PSDLParser.VectorContext ctx) { 
		return new Vector((Float) visit(ctx.size), (Float) visit(ctx.angle)); 
	}
}
