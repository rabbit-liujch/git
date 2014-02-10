package com.focustech.extensions;

import com.focustech.extensions.data.ClusterUser;
import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

public class JoinZoneEventHandler extends BaseServerEventHandler{

	@Override
	public void handleServerEvent(ISFSEvent isfsEvent) throws SFSException {
		User user = (User) isfsEvent.getParameter(SFSEventParam.USER);
		ClusterUser cu = new ClusterUser();
		DataStore.getSingleInstance().getUsersByName().put(user.getName(), cu);
		int size = DataStore.getSingleInstance().getUsersByName().size();
		trace("=============================================");
		trace("Users count:" + size);
		int index = 0;
		for(String item : DataStore.getSingleInstance().getUsersByName().keySet()){
			trace("User"+ ++index +":" + item);
		}
		trace("=============================================");
	}
	
}
