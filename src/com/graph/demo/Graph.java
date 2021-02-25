package com.graph.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<Integer,List<Integer>> adjacentList;
	public int numberOfNodes;
	
	public Graph(){
		adjacentList = new HashMap<>();
		numberOfNodes = 0;
	}
	
	public void addVertex(int node){
		adjacentList.put(node, new ArrayList<>());
		numberOfNodes++;
	}
	
	public void addEdge(int node1 , int node2){
		List<Integer> edge1 = adjacentList.get(node1);
		List<Integer> edge2 = adjacentList.get(node2);
		edge1.add(node2);
		edge2.add(node1);
		adjacentList.replace(node1, edge1);
		adjacentList.replace(node2, edge2);
	}
	
	public void showConnection(){
		for(Map.Entry<Integer,List<Integer>>  map : adjacentList.entrySet()){
			List<Integer> edges = map.getValue();
			System.out.print(map.getKey()+" --> ");
			edges.stream().forEach(e -> System.out.print(e + " "));
			System.out.println();
		}
	}
}
