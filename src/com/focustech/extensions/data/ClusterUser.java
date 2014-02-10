package com.focustech.extensions.data;

import java.util.Map;

public class ClusterUser {
	private String name;								// name of the user
	private String nodeId;								// id of the node where the user is connected
	private int localUID;								// local user id, relative to its server instance
	public Map<String, Object> properties;				// a map of optional parameters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public int getLocalUID() {
		return localUID;
	}
	public void setLocalUID(int localUID) {
		this.localUID = localUID;
	}
	public Map<String, Object> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
}
