package model;



import java.util.ArrayList;

import javax.swing.event.EventListenerList;

public class DiagramModel {

	private static int count=0;
	private String name;
	
	
	EventListenerList listenerList = new EventListenerList();

	 
	 
	

	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		DiagramModel.count = count;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}	
	
	
	
	
}
