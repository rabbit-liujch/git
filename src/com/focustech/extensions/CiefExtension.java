package com.focustech.extensions;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.SFSExtension;

public class CiefExtension extends SFSExtension{

	@Override
	public void init() {
		trace("========================init");
		//addEventHandler(SFSEventType.USER_JOIN_ZONE, JoinZoneEventHandler.class);
		addEventHandler(SFSEventType.USER_DISCONNECT, DisconnectionEventHandler.class);
		trace("========================init addRequestHandler spawnMe");
		addRequestHandler("spawnMe", SpawnMeHandler.class);
	}
}
