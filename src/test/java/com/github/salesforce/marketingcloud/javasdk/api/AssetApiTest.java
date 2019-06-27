/*
 * Marketing Cloud REST API
 * Marketing Cloud's REST API is our newest API. It supports multi-channel use cases, is much more lightweight and easy to use than our SOAP API, and is getting more comprehensive with every release.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: mc_sdk@salesforce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.salesforce.marketingcloud.javasdk.api;

import com.github.salesforce.marketingcloud.javasdk.ApiException;
import com.github.salesforce.marketingcloud.javasdk.model.ApiError;
import com.github.salesforce.marketingcloud.javasdk.model.Asset;
import java.math.BigDecimal;

import com.github.salesforce.marketingcloud.javasdk.model.AssetType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * API tests for AssetApi
 */
@Ignore
public class AssetApiTest extends ApiTest {

    private final AssetApi api = new AssetApi(
            authBasePath,
            clientId,
            clientSecret,
            accountId,
            scope);

    /**
     * createAsset
     *
     * Creates a new asset.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAssetTest() throws ApiException {
        Asset asset = createAsset();

        Asset createdAsset = api.createAsset(asset);
        assertEquals(asset.getCustomerKey(), createdAsset.getCustomerKey());
//        assertEquals(asset.getName(), createdAsset.getName());
//        assertEquals(asset.getDescription(), createdAsset.getDescription());
//        assertEquals(asset.getAssetType().getId(), createdAsset.getAssetType().getId());
//        assertEquals(asset.getAssetType().getName(), createdAsset.getAssetType().getName());
//        assertEquals(asset.getAssetType().getDisplayName(), createdAsset.getAssetType().getDisplayName());

        // TODO: test validations
    }

    private Asset createAsset() {
        AssetType assetType = new AssetType();
        assetType.setId(BigDecimal.valueOf(196));
        assetType.setName("textblock");
        assetType.setDisplayName("Text Block");

        Asset asset = new Asset();
        asset.setCustomerKey(java.util.UUID.randomUUID().toString());
        asset.setName("Asset " + java.util.UUID.randomUUID().toString());
        asset.setDescription("Asset from Automated Java SDK");
        asset.setAssetType(assetType);
        return asset;
    }

    /**
     * deleteAsset
     *
     * Deletes an asset.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void deleteAssetByIdTest() throws ApiException {
        BigDecimal id = null;
        api.deleteAssetById(id);

        // TODO: test validations
    }
    
    /**
     * getAssetById
     *
     * Gets an asset by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssetByIdTest() throws ApiException {
        Asset asset = createAsset();
        BigDecimal id = api.createAsset(asset).getId();
        Asset response = api.getAssetById(id);
        assertEquals(asset.getCustomerKey(), response.getCustomerKey());
        // TODO: test validations
    }
    
    /**
     * patchAsset
     *
     * Updates part of an asset.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void partiallyUpdateAssetTest() throws ApiException {
        BigDecimal id = null;
        Asset asset = null;
        Asset response = api.partiallyUpdateAsset(id, asset);

        // TODO: test validations
    }
    
}
