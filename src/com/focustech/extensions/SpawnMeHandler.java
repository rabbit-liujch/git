package com.focustech.extensions;

import java.util.List;
import java.util.Random;

import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

public class SpawnMeHandler extends BaseClientRequestHandler{

	@Override
	public void handleClientRequest(User sender, ISFSObject isfsObject) {
//		trace("==============enter class[SpawnMeHandler]function[handleClientRequest]");
//		trace("==============user room:"+sender.getLastJoinedRoom());
//		trace("==============user count:"+sender.getLastJoinedRoom().getUserList().size());
//		for(User receiver : sender.getLastJoinedRoom().getUserList()){
//			ISFSObject resObj = SFSObject.newInstance();
//			resObj.putUtfString("userName", receiver.getName());
//			resObj.putUtfString("displayName", receiver.getName());
//			Random random = new Random();
//			resObj.putUtfString("x", String.valueOf(random.nextInt(100)));
//			resObj.putUtfString("y", String.valueOf(random.nextInt(100)));
//			resObj.putUtfString("z", String.valueOf(random.nextInt(100)));
//			resObj.putUtfString("rot", String.valueOf(random.nextInt(100)));
//			trace("===============spawnUser:"+receiver.getName());
//			this.send("spawnUser", resObj, sender);
//		}
		
		Random random = new Random();
		ISFSObject resObj = SFSObject.newInstance();
		resObj.putUtfString("userName", sender.getName());
		resObj.putUtfString("displayName", sender.getName());
		resObj.putUtfString("x", String.valueOf(random.nextInt(100)));
		resObj.putUtfString("y", String.valueOf(random.nextInt(100)));
		resObj.putUtfString("z", String.valueOf(random.nextInt(100)));
		resObj.putUtfString("rot", String.valueOf(random.nextInt(100)));
		List<User> users = sender.getLastJoinedRoom().getUserList();
//		int startIndex = (users.indexOf(sender)-50)>0?(users.indexOf(sender)-50):0;
//		int endIndex = (users.indexOf(sender)+50)>users.size()?users.size():(users.indexOf(sender)+50);
		//trace(ExtensionLogLevel.ERROR,">>>>>>>>>>>>>>"+sender.getLastJoinedRoom().getName()+">>>>>>>>>>>>>>>>"+users.size());
		this.send("spawnUser", resObj, users,true);
	}

}
