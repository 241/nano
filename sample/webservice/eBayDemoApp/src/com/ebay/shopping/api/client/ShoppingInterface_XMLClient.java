// Generated by wsdl compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api.client;


import com.leansoft.nano.ws.XMLServiceCallback;
import com.leansoft.nano.ws.NanoXMLClient;
import com.ebay.shopping.api.FindHalfProductsResponseType;
import com.ebay.shopping.api.GetItemStatusResponseType;
import com.ebay.shopping.api.GetSingleItemResponseType;
import com.ebay.shopping.api.FindPopularItemsResponseType;
import com.ebay.shopping.api.GetCategoryInfoResponseType;
import com.ebay.shopping.api.GetUserProfileResponseType;
import com.ebay.shopping.api.FindReviewsAndGuidesRequestType;
import com.ebay.shopping.api.GeteBayTimeRequestType;
import com.ebay.shopping.api.GetUserProfileRequestType;
import com.ebay.shopping.api.GetSingleItemRequestType;
import com.ebay.shopping.api.GetShippingCostsResponseType;
import com.ebay.shopping.api.FindProductsRequestType;
import com.ebay.shopping.api.FindProductsResponseType;
import com.ebay.shopping.api.GetItemStatusRequestType;
import com.ebay.shopping.api.FindHalfProductsRequestType;
import com.ebay.shopping.api.FindPopularSearchesRequestType;
import com.ebay.shopping.api.GetCategoryInfoRequestType;
import com.ebay.shopping.api.GeteBayTimeResponseType;
import com.ebay.shopping.api.FindReviewsAndGuidesResponseType;
import com.ebay.shopping.api.GetMultipleItemsRequestType;
import com.ebay.shopping.api.GetShippingCostsRequestType;
import com.ebay.shopping.api.FindPopularSearchesResponseType;
import com.ebay.shopping.api.GetMultipleItemsResponseType;
import com.ebay.shopping.api.FindPopularItemsRequestType;


/**
 This class is the XML client to the ShoppingInterface Web Service.
*/ 
public class ShoppingInterface_XMLClient extends NanoXMLClient {


    /**
     public method
    */
    public void findHalfProducts(FindHalfProductsRequestType requestObject, XMLServiceCallback<FindHalfProductsResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "FindHalfProducts");
        
        super.invoke(requestObject, serviceCallback, FindHalfProductsResponseType.class);
    }

    /**
     public method
    */
    public void findPopularItems(FindPopularItemsRequestType requestObject, XMLServiceCallback<FindPopularItemsResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "FindPopularItems");
        
        super.invoke(requestObject, serviceCallback, FindPopularItemsResponseType.class);
    }

    /**
     public method
    */
    public void findPopularSearches(FindPopularSearchesRequestType requestObject, XMLServiceCallback<FindPopularSearchesResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "FindPopularSearches");
        
        super.invoke(requestObject, serviceCallback, FindPopularSearchesResponseType.class);
    }

    /**
     public method
    */
    public void findProducts(FindProductsRequestType requestObject, XMLServiceCallback<FindProductsResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "FindProducts");
        
        super.invoke(requestObject, serviceCallback, FindProductsResponseType.class);
    }

    /**
     public method
    */
    public void findReviewsAndGuides(FindReviewsAndGuidesRequestType requestObject, XMLServiceCallback<FindReviewsAndGuidesResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "FindReviewsAndGuides");
        
        super.invoke(requestObject, serviceCallback, FindReviewsAndGuidesResponseType.class);
    }

    /**
     public method
    */
    public void getCategoryInfo(GetCategoryInfoRequestType requestObject, XMLServiceCallback<GetCategoryInfoResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "GetCategoryInfo");
        
        super.invoke(requestObject, serviceCallback, GetCategoryInfoResponseType.class);
    }

    /**
     public method
    */
    public void getItemStatus(GetItemStatusRequestType requestObject, XMLServiceCallback<GetItemStatusResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "GetItemStatus");
        
        super.invoke(requestObject, serviceCallback, GetItemStatusResponseType.class);
    }

    /**
     public method
    */
    public void getMultipleItems(GetMultipleItemsRequestType requestObject, XMLServiceCallback<GetMultipleItemsResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "GetMultipleItems");
        
        super.invoke(requestObject, serviceCallback, GetMultipleItemsResponseType.class);
    }

    /**
     public method
    */
    public void getShippingCosts(GetShippingCostsRequestType requestObject, XMLServiceCallback<GetShippingCostsResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "GetShippingCosts");
        
        super.invoke(requestObject, serviceCallback, GetShippingCostsResponseType.class);
    }

    /**
     public method
    */
    public void getSingleItem(GetSingleItemRequestType requestObject, XMLServiceCallback<GetSingleItemResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "GetSingleItem");
        
        super.invoke(requestObject, serviceCallback, GetSingleItemResponseType.class);
    }

    /**
     public method
    */
    public void getUserProfile(GetUserProfileRequestType requestObject, XMLServiceCallback<GetUserProfileResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "GetUserProfile");
        
        super.invoke(requestObject, serviceCallback, GetUserProfileResponseType.class);
    }

    /**
     public method
    */
    public void geteBayTime(GeteBayTimeRequestType requestObject, XMLServiceCallback<GeteBayTimeResponseType> serviceCallback) {
       
        super.getAsyncHttpClient().addHeader("X-EBAY-API-CALL-NAME", "GeteBayTime");
        
        super.invoke(requestObject, serviceCallback, GeteBayTimeResponseType.class);
    }


}