// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container of token and image URL and Audio URL.
 * 
 */
public class BotBlockResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BotBlockToken")
	@Order(value=0)
	public String botBlockToken;	
	
	@Element(name = "BotBlockUrl")
	@Order(value=1)
	public String botBlockUrl;	
	
	@Element(name = "BotBlockAudioUrl")
	@Order(value=2)
	public String botBlockAudioUrl;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}