// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Shipping costs and options related to an international shipping service. When used
 * as input, if one is provided, at least one domestic ShippingService must be
 * provided. This type does not exist before compatibility level 383.
 * 
 */
public class InternationalShippingServiceOptionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingInsuranceCost")
	public AmountType shippingInsuranceCost;	
	
	@Element(name = "ShippingServiceName")
	public String shippingServiceName;	
	
	@Element(name = "ShippingServiceAdditionalCost")
	public AmountType shippingServiceAdditionalCost;	
	
	@Element(name = "ShippingServiceCost")
	public AmountType shippingServiceCost;	
	
	@Element(name = "ShippingServicePriority")
	public Integer shippingServicePriority;	
	
	@Element(name = "ShipsTo")
	public List<String> shipsTo;	
	
	@Element(name = "EstimatedDeliveryMinTime")
	public Date estimatedDeliveryMinTime;	
	
	@Element(name = "EstimatedDeliveryMaxTime")
	public Date estimatedDeliveryMaxTime;	
	
	@Element(name = "ImportCharge")
	public AmountType importCharge;	
	
	@AnyElement
	public List<Object> any;	
	
    
}