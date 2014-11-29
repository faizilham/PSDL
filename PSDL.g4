grammar PSDL;

model :
	'model' name=modelName newline
	declarations
	world
;

INT: [0-9]+;
WS: [ \t\r]+ -> skip;
ID: [A-Za-z_]+[0-9A-Za-z_]*;

newline: '\n'+;
modelName:
	ID ('.' ID)*
;

real : '-'? (INT? '.')? INT;
vector: 'size' size=real 'angle' angle=real;
point : '(' x=real ',' y=real ')';

declarations : (shape|object)*;

basicShape : circle | triangle | rectangle | line;

circle : 'circle' 'at' center=point 'radius' radius=real;
rectangle: 'rect' 'from' p1=point 'to' p2=point;
triangle : 'triangle' p1=point p2=point p3=point;
line : 'line' 'from' p1=point 'to' p2=point;

shape : 
	'shape' name=ID 'is' newline
		(basicShape newline)+
	'end' newline
;


object:
	'object' name=ID 'is' newline
		'shape' '=' shapeName=ID newline
		(objectProperty newline)*
	'end' newline
;

objectProperty : elasticity | friction | force | initVelocity;

elasticity:
	'elasticity' '=' value=real
;

friction:
	'friction' '=' value=real 
;

force:
	'force' '=' value=vector
;

initVelocity:
	'velocity' '=' value=vector 
;

objectCreation :
	 newline? type=ID 'at' pos=point
;


worldProperty : width | height | gravity;

width: 'width' '=' value=real;
height: 'height' '=' value=real;
gravity: 'gravity' '=' value=real;

world:
	'world' 'is' newline
		(worldProperty newline)*
		
		('objects' '=' '{'
			objectCreation
			(',' objectCreation)*
		newline? '}' newline)?
	'end' newline?
;