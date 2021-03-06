/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.licensemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CheckoutLicenseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CheckoutLicenseRequestMarshaller {

    private static final MarshallingInfo<String> PRODUCTSKU_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductSKU").build();
    private static final MarshallingInfo<String> CHECKOUTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckoutType").build();
    private static final MarshallingInfo<String> KEYFINGERPRINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyFingerprint").build();
    private static final MarshallingInfo<List> ENTITLEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Entitlements").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> BENEFICIARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Beneficiary").build();
    private static final MarshallingInfo<String> NODEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeId").build();

    private static final CheckoutLicenseRequestMarshaller instance = new CheckoutLicenseRequestMarshaller();

    public static CheckoutLicenseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CheckoutLicenseRequest checkoutLicenseRequest, ProtocolMarshaller protocolMarshaller) {

        if (checkoutLicenseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(checkoutLicenseRequest.getProductSKU(), PRODUCTSKU_BINDING);
            protocolMarshaller.marshall(checkoutLicenseRequest.getCheckoutType(), CHECKOUTTYPE_BINDING);
            protocolMarshaller.marshall(checkoutLicenseRequest.getKeyFingerprint(), KEYFINGERPRINT_BINDING);
            protocolMarshaller.marshall(checkoutLicenseRequest.getEntitlements(), ENTITLEMENTS_BINDING);
            protocolMarshaller.marshall(checkoutLicenseRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(checkoutLicenseRequest.getBeneficiary(), BENEFICIARY_BINDING);
            protocolMarshaller.marshall(checkoutLicenseRequest.getNodeId(), NODEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
