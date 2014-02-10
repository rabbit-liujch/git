package com.focustech.extensions;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.focustech.extensions.data.ClusterUser;

public class DataStore {
	private static DataStore dataStore;
	public Map<String, ClusterUser>usersByName;
	
	private DataStore(){
		if(usersByName == null){
			usersByName = new ConcurrentHashMap<String, ClusterUser>();
		}
	}
	
	public static DataStore getSingleInstance(){
		if(dataStore == null){
			dataStore = new DataStore();
		}
		return dataStore;
	}

	public Map<String, ClusterUser> getUsersByName() {
		return usersByName;
	}
}
