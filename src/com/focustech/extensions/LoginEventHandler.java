package com.focustech.extensions;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

public class LoginEventHandler extends BaseServerEventHandler {

	@Override
	public void handleServerEvent(ISFSEvent isfsEvent) throws SFSException {
//		String userName = (String) isfsEvent.getParameter(SFSEventParam.LOGIN_NAME);
//		User user = null;
//		DataStore.getSingleInstance().getUsersByName().put(userName, user);
//		int size = DataStore.getSingleInstance().getUsersByName().size();
//		trace("==============Users count:" + size);
	}
}
