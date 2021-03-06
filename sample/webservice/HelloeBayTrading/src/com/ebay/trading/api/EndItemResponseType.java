// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Includes the acknowledgement of date and time the auction was
 * ended due to the call to EndItem.
 * 
 */
@RootElement(name = "EndItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class EndItemResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EndTime")
	@Order(value=0)
	public Date endTime;	
	
    
}