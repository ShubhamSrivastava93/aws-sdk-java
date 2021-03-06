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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListPartnerEventSourceAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPartnerEventSourceAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     */
    private java.util.List<PartnerEventSourceAccount> partnerEventSourceAccounts;
    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * 
     * @return The list of partner event sources returned by the operation.
     */

    public java.util.List<PartnerEventSourceAccount> getPartnerEventSourceAccounts() {
        return partnerEventSourceAccounts;
    }

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * 
     * @param partnerEventSourceAccounts
     *        The list of partner event sources returned by the operation.
     */

    public void setPartnerEventSourceAccounts(java.util.Collection<PartnerEventSourceAccount> partnerEventSourceAccounts) {
        if (partnerEventSourceAccounts == null) {
            this.partnerEventSourceAccounts = null;
            return;
        }

        this.partnerEventSourceAccounts = new java.util.ArrayList<PartnerEventSourceAccount>(partnerEventSourceAccounts);
    }

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartnerEventSourceAccounts(java.util.Collection)} or
     * {@link #withPartnerEventSourceAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param partnerEventSourceAccounts
     *        The list of partner event sources returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerEventSourceAccountsResult withPartnerEventSourceAccounts(PartnerEventSourceAccount... partnerEventSourceAccounts) {
        if (this.partnerEventSourceAccounts == null) {
            setPartnerEventSourceAccounts(new java.util.ArrayList<PartnerEventSourceAccount>(partnerEventSourceAccounts.length));
        }
        for (PartnerEventSourceAccount ele : partnerEventSourceAccounts) {
            this.partnerEventSourceAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * 
     * @param partnerEventSourceAccounts
     *        The list of partner event sources returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerEventSourceAccountsResult withPartnerEventSourceAccounts(java.util.Collection<PartnerEventSourceAccount> partnerEventSourceAccounts) {
        setPartnerEventSourceAccounts(partnerEventSourceAccounts);
        return this;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token you can use in a subsequent operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerEventSourceAccountsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPartnerEventSourceAccounts() != null)
            sb.append("PartnerEventSourceAccounts: ").append(getPartnerEventSourceAccounts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPartnerEventSourceAccountsResult == false)
            return false;
        ListPartnerEventSourceAccountsResult other = (ListPartnerEventSourceAccountsResult) obj;
        if (other.getPartnerEventSourceAccounts() == null ^ this.getPartnerEventSourceAccounts() == null)
            return false;
        if (other.getPartnerEventSourceAccounts() != null && other.getPartnerEventSourceAccounts().equals(this.getPartnerEventSourceAccounts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartnerEventSourceAccounts() == null) ? 0 : getPartnerEventSourceAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPartnerEventSourceAccountsResult clone() {
        try {
            return (ListPartnerEventSourceAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
