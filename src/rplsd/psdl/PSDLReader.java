package rplsd.psdl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import rplsd.psdl.model.Model;



public class PSDLReader {
	public static void main (String[] args) throws Exception{
		if (args.length == 1){
			Model model = buildModel(new FileInputStream(new File(args[0])));
			System.out.println(model);
		}else{
			System.out.println("Usage: java -jar PSDL.jar <PSDL File>");
		}
	}
	
	public static Model buildModel(InputStream input) throws Exception{
		PSDLLexer lexer = new PSDLLexer(new ANTLRInputStream(input));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PSDLParser parser = new PSDLParser(tokens);
		ParseTree tree = parser.model();
		
		ModelVisitor visitor = new ModelVisitor();
		return (Model) visitor.visit(tree);
	}
}
