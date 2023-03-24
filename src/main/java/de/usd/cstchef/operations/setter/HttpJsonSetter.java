package de.usd.cstchef.operations.setter;

import burp.BurpUtils;
import burp.IBurpExtenderCallbacks;
import burp.IExtensionHelpers;
import burp.IParameter;
import de.usd.cstchef.operations.Operation.OperationInfos;
import de.usd.cstchef.operations.OperationCategory;

@OperationInfos(name = "HTTP JSON", category = OperationCategory.SETTER, description = "Set a JSON parameter to the specified value.")
public class HttpJsonSetter extends SetterOperation {

    @Override
    protected byte[] perform(byte[] input) throws Exception {

        String parameterName = getWhere();
        if( parameterName.equals("") )
            return input;

        IBurpExtenderCallbacks callbacks = BurpUtils.getInstance().getCallbacks();
        IExtensionHelpers helpers = callbacks.getHelpers();

        byte[] newValue = getWhatBytes();
        IParameter param = getParameter(input, parameterName, IParameter.PARAM_JSON, helpers);

        if( param == null )
            return input;

        byte[] newRequest = replaceParam(input, param, newValue);
        return newRequest;
    }

}
