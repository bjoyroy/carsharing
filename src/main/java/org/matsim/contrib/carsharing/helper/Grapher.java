package org.matsim.contrib.carsharing.helper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.grapher.graphviz.GraphvizGrapher;
import com.google.inject.grapher.graphviz.GraphvizModule;

public class Grapher {
	  public void graph(String filename, Injector demoInjector) throws IOException {
		    PrintWriter out = new PrintWriter(new File(filename), "UTF-8");

		    Injector injector = Guice.createInjector(new GraphvizModule());
		    GraphvizGrapher grapher = injector.getInstance(GraphvizGrapher.class);
		    grapher.setOut(out);
		    grapher.setRankdir("TB");
		    grapher.graph(demoInjector);
		  }
	
}
