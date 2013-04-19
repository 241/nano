// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *       Retrieves a paginated list containing details of a user's Selling Manager inventory.
 * This call is subject to change without notice; the deprecation process is
 * inapplicable to this call.
 *     
 */
@RootElement(name = "GetSellingManagerInventoryRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerInventoryRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Sort")
	@Order(value=0)
	public SellingManagerProductSortCodeType sort;	
	
	@Element(name = "FolderID")
	@Order(value=1)
	public Long folderID;	
	
	@Element(name = "Pagination")
	@Order(value=2)
	public PaginationType pagination;	
	
	@Element(name = "SortOrder")
	@Order(value=3)
	public SortOrderCodeType sortOrder;	
	
	@Element(name = "Search")
	@Order(value=4)
	public SellingManagerSearchType search;	
	
	@Element(name = "StoreCategoryID")
	@Order(value=5)
	public Long storeCategoryID;	
	
	@Element(name = "Filter")
	@Order(value=6)
	public List<SellingManagerInventoryPropertyTypeCodeType> filter;	
	
    
}