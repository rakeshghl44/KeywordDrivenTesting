package KDDTest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import KDD.KeyWordEngine;

public class testExecution {
	
	public KeyWordEngine keyWordEngine;
	
	
	@Test
	public void testCaseExecution() throws InvalidFormatException{
		
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("testCases");
		
		
		
	}
	
}
