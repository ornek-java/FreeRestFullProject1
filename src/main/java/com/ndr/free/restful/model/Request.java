package com.ndr.free.restful.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Request {

	private int requestId;

	public Request(){
	}

	public Request(int requestId) {
		this.requestId = requestId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}


}
