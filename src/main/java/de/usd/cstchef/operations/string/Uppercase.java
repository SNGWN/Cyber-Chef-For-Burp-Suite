package de.usd.cstchef.operations.string;

import burp.BurpUtils;
import burp.IBurpExtenderCallbacks;
import burp.IExtensionHelpers;
import de.usd.cstchef.operations.Operation;
import de.usd.cstchef.operations.OperationCategory;
import de.usd.cstchef.operations.Operation.OperationInfos;

@OperationInfos(name = "Uppercase", category = OperationCategory.STRING, description = "Change string to uppercase.")
public class Uppercase extends Operation {

	@Override
	protected byte[] perform(byte[] input) throws Exception {
		try {
			String inputStr = new String(input);
			return inputStr.toUpperCase().getBytes(); 
		} catch (Exception e) {
			return input;
		}
	}	
}
