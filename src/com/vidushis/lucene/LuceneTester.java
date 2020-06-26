package com.vidushis.lucene;

import java.io.IOException;

public class LuceneTester {

	String indexDir = "/Users/vidushis/Downloads/Index";
	String dataDir = "/Users/vidushis/Downloads/Data";
	Indexer indexer;

	private void createIndex() throws IOException {
		indexer = new Indexer(indexDir);
		int numIndexed;
		long startTime = System.currentTimeMillis();
		numIndexed = indexer.createIndex(dataDir, new TextFileFilter());
		long endTime = System.currentTimeMillis();
		indexer.close();
		System.out.println(numIndexed + " File indexed, time taken: " + (endTime - startTime) + " ms");
	}
	
	public static void main(String[] args) {
	      LuceneTester tester;
	      try {
	         tester = new LuceneTester();
	         tester.createIndex();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } 
	   }

}
