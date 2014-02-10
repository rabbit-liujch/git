package com.focustech.extensions;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;
import com.smartfoxserver.v2.extensions.ExtensionLogLevel;

public class DisconnectionEventHandler extends BaseServerEventHandler {

	@Override
	public void handleServerEvent(ISFSEvent isfsEvent) throws SFSException {
		trace(ExtensionLogLevel.ERROR,">>>>>>>>>>>>>>>"+isfsEvent.getParameter(SFSEventParam.USER)+">>>>"+isfsEvent.getParameter(SFSEventParam.DISCONNECTION_REASON));
	}

}
