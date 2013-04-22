// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Type defining the <b>BuyerRequirementDetails</b> container, which is returned in
 * GeteBayDetails, and provides the seller with the buyer requirement features (and applicable
 * values) that are supported by the listing site.
 * <br/><br/>
 * <span class="tablenote"><b>Note: </b>
 * This container is only returned if <b>BuyerRequirementDetails</b> is included as a <b>DetailName</b>
 * filter in the request, or if no <b>DetailName</b> filters are used in the request.
 * </span>  <br/><br/>
 * 
 */
public class SiteBuyerRequirementDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "LinkedPayPalAccount")
	@Order(value=0)
	public Boolean linkedPayPalAccount;	
	
	@Element(name = "MaximumBuyerPolicyViolations")
	@Order(value=1)
	public MaximumBuyerPolicyViolationsDetailsType maximumBuyerPolicyViolations;	
	
	@Element(name = "MaximumItemRequirements")
	@Order(value=2)
	public MaximumItemRequirementsDetailsType maximumItemRequirements;	
	
	@Element(name = "MaximumUnpaidItemStrikesInfo")
	@Order(value=3)
	public MaximumUnpaidItemStrikesInfoDetailsType maximumUnpaidItemStrikesInfo;	
	
	@Element(name = "MinimumFeedbackScore")
	@Order(value=4)
	public MinimumFeedbackScoreDetailsType minimumFeedbackScore;	
	
	@Element(name = "ShipToRegistrationCountry")
	@Order(value=5)
	public Boolean shipToRegistrationCountry;	
	
	@Element(name = "VerifiedUserRequirements")
	@Order(value=6)
	public VerifiedUserRequirementsDetailsType verifiedUserRequirements;	
	
	@Element(name = "DetailVersion")
	@Order(value=7)
	public String detailVersion;	
	
	@Element(name = "UpdateTime")
	@Order(value=8)
	public Date updateTime;	
	
	@AnyElement
	@Order(value=9)
	public List<Object> any;	
	
    
}