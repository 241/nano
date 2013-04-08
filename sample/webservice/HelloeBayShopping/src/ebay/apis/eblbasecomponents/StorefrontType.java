// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains information related to the item in the context of
 * a seller's eBay Store. Applicable for auction format, Basic Fixed Price,
 * and Store Inventory format items listed by eBay Stores sellers.
 *  
 */
public class StorefrontType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "StoreURL")
	public String storeURL;	
	
	@Element(name = "StoreName")
	public String storeName;	
	
	@AnyElement
	public List<Object> any;	
	
    
}