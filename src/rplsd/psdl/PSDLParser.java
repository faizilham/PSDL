// Generated from PSDL.g4 by ANTLR 4.4
package rplsd.psdl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, INT=34, WS=35, ID=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'from'", "'radius'", "'\n'", "','", "'-'", "'gravity'", 
		"'line'", "'('", "'triangle'", "'force'", "'angle'", "'to'", "'{'", "'size'", 
		"'friction'", "'}'", "'objects'", "'is'", "'velocity'", "'.'", "')'", 
		"'shape'", "'='", "'object'", "'height'", "'elasticity'", "'circle'", 
		"'at'", "'rect'", "'world'", "'model'", "'end'", "'width'", "INT", "WS", 
		"ID"
	};
	public static final int
		RULE_model = 0, RULE_newline = 1, RULE_modelName = 2, RULE_real = 3, RULE_vector = 4, 
		RULE_point = 5, RULE_declarations = 6, RULE_basicShape = 7, RULE_circle = 8, 
		RULE_rectangle = 9, RULE_triangle = 10, RULE_line = 11, RULE_shape = 12, 
		RULE_object = 13, RULE_objectProperty = 14, RULE_elasticity = 15, RULE_friction = 16, 
		RULE_force = 17, RULE_initVelocity = 18, RULE_objectCreation = 19, RULE_worldProperty = 20, 
		RULE_width = 21, RULE_height = 22, RULE_gravity = 23, RULE_world = 24;
	public static final String[] ruleNames = {
		"model", "newline", "modelName", "real", "vector", "point", "declarations", 
		"basicShape", "circle", "rectangle", "triangle", "line", "shape", "object", 
		"objectProperty", "elasticity", "friction", "force", "initVelocity", "objectCreation", 
		"worldProperty", "width", "height", "gravity", "world"
	};

	@Override
	public String getGrammarFileName() { return "PSDL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public ModelNameContext name;
		public WorldContext world() {
			return getRuleContext(WorldContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ModelNameContext modelName() {
			return getRuleContext(ModelNameContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(T__2);
			setState(51); ((ModelContext)_localctx).name = modelName();
			setState(52); newline();
			setState(53); declarations();
			setState(54); world();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); match(T__30);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__30 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PSDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PSDLParser.ID, i);
		}
		public ModelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitModelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelNameContext modelName() throws RecognitionException {
		ModelNameContext _localctx = new ModelNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(ID);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(62); match(T__13);
				setState(63); match(ID);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(PSDLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PSDLParser.INT, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(69); match(T__28);
				}
			}

			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(73);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(72); match(INT);
					}
				}

				setState(75); match(T__13);
				}
				break;
			}
			setState(78); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public RealContext size;
		public RealContext angle;
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(T__19);
			setState(81); ((VectorContext)_localctx).size = real();
			setState(82); match(T__22);
			setState(83); ((VectorContext)_localctx).angle = real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointContext extends ParserRuleContext {
		public RealContext x;
		public RealContext y;
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(T__25);
			setState(86); ((PointContext)_localctx).x = real();
			setState(87); match(T__29);
			setState(88); ((PointContext)_localctx).y = real();
			setState(89); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ShapeContext shape(int i) {
			return getRuleContext(ShapeContext.class,i);
		}
		public List<ShapeContext> shape() {
			return getRuleContexts(ShapeContext.class);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__9) {
				{
				setState(93);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(91); shape();
					}
					break;
				case T__9:
					{
					setState(92); object();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicShapeContext extends ParserRuleContext {
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TriangleContext triangle() {
			return getRuleContext(TriangleContext.class,0);
		}
		public RectangleContext rectangle() {
			return getRuleContext(RectangleContext.class,0);
		}
		public BasicShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicShape; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitBasicShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicShapeContext basicShape() throws RecognitionException {
		BasicShapeContext _localctx = new BasicShapeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basicShape);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); circle();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); triangle();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); rectangle();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CircleContext extends ParserRuleContext {
		public PointContext center;
		public RealContext radius;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitCircle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_circle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(T__6);
			setState(105); match(T__5);
			setState(106); ((CircleContext)_localctx).center = point();
			setState(107); match(T__31);
			setState(108); ((CircleContext)_localctx).radius = real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RectangleContext extends ParserRuleContext {
		public PointContext p1;
		public PointContext p2;
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public RectangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitRectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectangleContext rectangle() throws RecognitionException {
		RectangleContext _localctx = new RectangleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rectangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(T__4);
			setState(111); match(T__32);
			setState(112); ((RectangleContext)_localctx).p1 = point();
			setState(113); match(T__21);
			setState(114); ((RectangleContext)_localctx).p2 = point();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriangleContext extends ParserRuleContext {
		public PointContext p1;
		public PointContext p2;
		public PointContext p3;
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public TriangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triangle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitTriangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriangleContext triangle() throws RecognitionException {
		TriangleContext _localctx = new TriangleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_triangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(T__24);
			setState(117); ((TriangleContext)_localctx).p1 = point();
			setState(118); ((TriangleContext)_localctx).p2 = point();
			setState(119); ((TriangleContext)_localctx).p3 = point();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public PointContext p1;
		public PointContext p2;
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(T__26);
			setState(122); match(T__32);
			setState(123); ((LineContext)_localctx).p1 = point();
			setState(124); match(T__21);
			setState(125); ((LineContext)_localctx).p2 = point();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeContext extends ParserRuleContext {
		public Token name;
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<BasicShapeContext> basicShape() {
			return getRuleContexts(BasicShapeContext.class);
		}
		public BasicShapeContext basicShape(int i) {
			return getRuleContext(BasicShapeContext.class,i);
		}
		public TerminalNode ID() { return getToken(PSDLParser.ID, 0); }
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(T__11);
			setState(128); ((ShapeContext)_localctx).name = match(ID);
			setState(129); match(T__15);
			setState(130); newline();
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131); basicShape();
				setState(132); newline();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__24) | (1L << T__6) | (1L << T__4))) != 0) );
			setState(138); match(T__1);
			setState(139); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public Token name;
		public Token shapeName;
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PSDLParser.ID); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(PSDLParser.ID, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(T__9);
			setState(142); ((ObjectContext)_localctx).name = match(ID);
			setState(143); match(T__15);
			setState(144); newline();
			setState(145); match(T__11);
			setState(146); match(T__10);
			setState(147); ((ObjectContext)_localctx).shapeName = match(ID);
			setState(148); newline();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__18) | (1L << T__14) | (1L << T__7))) != 0)) {
				{
				{
				setState(149); objectProperty();
				setState(150); newline();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157); match(T__1);
			setState(158); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ForceContext force() {
			return getRuleContext(ForceContext.class,0);
		}
		public ElasticityContext elasticity() {
			return getRuleContext(ElasticityContext.class,0);
		}
		public FrictionContext friction() {
			return getRuleContext(FrictionContext.class,0);
		}
		public InitVelocityContext initVelocity() {
			return getRuleContext(InitVelocityContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objectProperty);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); elasticity();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); friction();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); force();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); initVelocity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElasticityContext extends ParserRuleContext {
		public RealContext value;
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public ElasticityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elasticity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitElasticity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElasticityContext elasticity() throws RecognitionException {
		ElasticityContext _localctx = new ElasticityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elasticity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__7);
			setState(167); match(T__10);
			setState(168); ((ElasticityContext)_localctx).value = real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrictionContext extends ParserRuleContext {
		public RealContext value;
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public FrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_friction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitFriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrictionContext friction() throws RecognitionException {
		FrictionContext _localctx = new FrictionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_friction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(T__18);
			setState(171); match(T__10);
			setState(172); ((FrictionContext)_localctx).value = real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForceContext extends ParserRuleContext {
		public VectorContext value;
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ForceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_force; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitForce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForceContext force() throws RecognitionException {
		ForceContext _localctx = new ForceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_force);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(T__23);
			setState(175); match(T__10);
			setState(176); ((ForceContext)_localctx).value = vector();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitVelocityContext extends ParserRuleContext {
		public VectorContext value;
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public InitVelocityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVelocity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitInitVelocity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVelocityContext initVelocity() throws RecognitionException {
		InitVelocityContext _localctx = new InitVelocityContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initVelocity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(T__14);
			setState(179); match(T__10);
			setState(180); ((InitVelocityContext)_localctx).value = vector();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectCreationContext extends ParserRuleContext {
		public Token type;
		public PointContext pos;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode ID() { return getToken(PSDLParser.ID, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ObjectCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectCreation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitObjectCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectCreationContext objectCreation() throws RecognitionException {
		ObjectCreationContext _localctx = new ObjectCreationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(182); newline();
				}
			}

			setState(185); ((ObjectCreationContext)_localctx).type = match(ID);
			setState(186); match(T__5);
			setState(187); ((ObjectCreationContext)_localctx).pos = point();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WorldPropertyContext extends ParserRuleContext {
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public GravityContext gravity() {
			return getRuleContext(GravityContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public WorldPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_worldProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitWorldProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorldPropertyContext worldProperty() throws RecognitionException {
		WorldPropertyContext _localctx = new WorldPropertyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_worldProperty);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); width();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); height();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); gravity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthContext extends ParserRuleContext {
		public RealContext value;
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(T__0);
			setState(195); match(T__10);
			setState(196); ((WidthContext)_localctx).value = real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeightContext extends ParserRuleContext {
		public RealContext value;
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(T__8);
			setState(199); match(T__10);
			setState(200); ((HeightContext)_localctx).value = real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GravityContext extends ParserRuleContext {
		public RealContext value;
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public GravityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gravity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitGravity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GravityContext gravity() throws RecognitionException {
		GravityContext _localctx = new GravityContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gravity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(T__27);
			setState(203); match(T__10);
			setState(204); ((GravityContext)_localctx).value = real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WorldContext extends ParserRuleContext {
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<WorldPropertyContext> worldProperty() {
			return getRuleContexts(WorldPropertyContext.class);
		}
		public ObjectCreationContext objectCreation(int i) {
			return getRuleContext(ObjectCreationContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public List<ObjectCreationContext> objectCreation() {
			return getRuleContexts(ObjectCreationContext.class);
		}
		public WorldPropertyContext worldProperty(int i) {
			return getRuleContext(WorldPropertyContext.class,i);
		}
		public WorldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_world; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSDLVisitor ) return ((PSDLVisitor<? extends T>)visitor).visitWorld(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorldContext world() throws RecognitionException {
		WorldContext _localctx = new WorldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_world);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(T__3);
			setState(207); match(T__15);
			setState(208); newline();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__8) | (1L << T__0))) != 0)) {
				{
				{
				setState(209); worldProperty();
				setState(210); newline();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(217); match(T__16);
				setState(218); match(T__10);
				setState(219); match(T__20);
				setState(220); objectCreation();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(221); match(T__29);
					setState(222); objectCreation();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(228); newline();
					}
				}

				setState(231); match(T__17);
				setState(232); newline();
				}
			}

			setState(236); match(T__1);
			setState(238);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(237); newline();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3<\n\3\r\3\16\3=\3\4\3\4\3\4"+
		"\7\4C\n\4\f\4\16\4F\13\4\3\5\5\5I\n\5\3\5\5\5L\n\5\3\5\5\5O\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b`\n\b\f\b\16"+
		"\bc\13\b\3\t\3\t\3\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\6\16\u0089\n\16\r\16\16\16\u008a\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u009b"+
		"\n\17\f\17\16\17\u009e\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00a7"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\5\25\u00ba\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\5\26\u00c3\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00d7\n\32\f\32\16\32\u00da\13"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00e2\n\32\f\32\16\32\u00e5\13"+
		"\32\3\32\5\32\u00e8\n\32\3\32\3\32\3\32\5\32\u00ed\n\32\3\32\3\32\5\32"+
		"\u00f1\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\2\2\u00f0\2\64\3\2\2\2\4;\3\2\2\2\6?\3\2\2\2\bH\3\2\2\2\nR\3"+
		"\2\2\2\fW\3\2\2\2\16a\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2\24p\3\2\2\2\26v"+
		"\3\2\2\2\30{\3\2\2\2\32\u0081\3\2\2\2\34\u008f\3\2\2\2\36\u00a6\3\2\2"+
		"\2 \u00a8\3\2\2\2\"\u00ac\3\2\2\2$\u00b0\3\2\2\2&\u00b4\3\2\2\2(\u00b9"+
		"\3\2\2\2*\u00c2\3\2\2\2,\u00c4\3\2\2\2.\u00c8\3\2\2\2\60\u00cc\3\2\2\2"+
		"\62\u00d0\3\2\2\2\64\65\7!\2\2\65\66\5\6\4\2\66\67\5\4\3\2\678\5\16\b"+
		"\289\5\62\32\29\3\3\2\2\2:<\7\5\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>\5\3\2\2\2?D\7&\2\2@A\7\26\2\2AC\7&\2\2B@\3\2\2\2CF\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GI\7\7\2\2HG\3\2\2\2HI\3\2\2\2IN"+
		"\3\2\2\2JL\7$\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\7\26\2\2NK\3\2\2\2N"+
		"O\3\2\2\2OP\3\2\2\2PQ\7$\2\2Q\t\3\2\2\2RS\7\20\2\2ST\5\b\5\2TU\7\r\2\2"+
		"UV\5\b\5\2V\13\3\2\2\2WX\7\n\2\2XY\5\b\5\2YZ\7\6\2\2Z[\5\b\5\2[\\\7\27"+
		"\2\2\\\r\3\2\2\2]`\5\32\16\2^`\5\34\17\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2"+
		"a_\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ca\3\2\2\2di\5\22\n\2ei\5\26\f\2fi\5\24"+
		"\13\2gi\5\30\r\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\21\3\2\2\2j"+
		"k\7\35\2\2kl\7\36\2\2lm\5\f\7\2mn\7\4\2\2no\5\b\5\2o\23\3\2\2\2pq\7\37"+
		"\2\2qr\7\3\2\2rs\5\f\7\2st\7\16\2\2tu\5\f\7\2u\25\3\2\2\2vw\7\13\2\2w"+
		"x\5\f\7\2xy\5\f\7\2yz\5\f\7\2z\27\3\2\2\2{|\7\t\2\2|}\7\3\2\2}~\5\f\7"+
		"\2~\177\7\16\2\2\177\u0080\5\f\7\2\u0080\31\3\2\2\2\u0081\u0082\7\30\2"+
		"\2\u0082\u0083\7&\2\2\u0083\u0084\7\24\2\2\u0084\u0088\5\4\3\2\u0085\u0086"+
		"\5\20\t\2\u0086\u0087\5\4\3\2\u0087\u0089\3\2\2\2\u0088\u0085\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\7\"\2\2\u008d\u008e\5\4\3\2\u008e\33\3\2\2\2\u008f"+
		"\u0090\7\32\2\2\u0090\u0091\7&\2\2\u0091\u0092\7\24\2\2\u0092\u0093\5"+
		"\4\3\2\u0093\u0094\7\30\2\2\u0094\u0095\7\31\2\2\u0095\u0096\7&\2\2\u0096"+
		"\u009c\5\4\3\2\u0097\u0098\5\36\20\2\u0098\u0099\5\4\3\2\u0099\u009b\3"+
		"\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\""+
		"\2\2\u00a0\u00a1\5\4\3\2\u00a1\35\3\2\2\2\u00a2\u00a7\5 \21\2\u00a3\u00a7"+
		"\5\"\22\2\u00a4\u00a7\5$\23\2\u00a5\u00a7\5&\24\2\u00a6\u00a2\3\2\2\2"+
		"\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\37"+
		"\3\2\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\5\b\5\2"+
		"\u00ab!\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00af"+
		"\5\b\5\2\u00af#\3\2\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7\31\2\2\u00b2"+
		"\u00b3\5\n\6\2\u00b3%\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\7\31\2"+
		"\2\u00b6\u00b7\5\n\6\2\u00b7\'\3\2\2\2\u00b8\u00ba\5\4\3\2\u00b9\u00b8"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7&\2\2\u00bc"+
		"\u00bd\7\36\2\2\u00bd\u00be\5\f\7\2\u00be)\3\2\2\2\u00bf\u00c3\5,\27\2"+
		"\u00c0\u00c3\5.\30\2\u00c1\u00c3\5\60\31\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3+\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6"+
		"\7\31\2\2\u00c6\u00c7\5\b\5\2\u00c7-\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9"+
		"\u00ca\7\31\2\2\u00ca\u00cb\5\b\5\2\u00cb/\3\2\2\2\u00cc\u00cd\7\b\2\2"+
		"\u00cd\u00ce\7\31\2\2\u00ce\u00cf\5\b\5\2\u00cf\61\3\2\2\2\u00d0\u00d1"+
		"\7 \2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d8\5\4\3\2\u00d3\u00d4\5*\26\2\u00d4"+
		"\u00d5\5\4\3\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00ec\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\7\23\2\2\u00dc\u00dd\7\31\2\2\u00dd\u00de\7"+
		"\17\2\2\u00de\u00e3\5(\25\2\u00df\u00e0\7\6\2\2\u00e0\u00e2\5(\25\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\5\4\3\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\22"+
		"\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ed\3\2\2\2\u00ec\u00db\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\7\"\2\2\u00ef\u00f1\5\4"+
		"\3\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\63\3\2\2\2\24=DHKN"+
		"_ah\u008a\u009c\u00a6\u00b9\u00c2\u00d8\u00e3\u00e7\u00ec\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}