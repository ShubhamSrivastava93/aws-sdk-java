/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that triggered
 * the action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/IotEventsAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotEventsAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS IoT Events input.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     * 
     * @param inputName
     *        The name of the AWS IoT Events input where the data is sent.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     * 
     * @return The name of the AWS IoT Events input where the data is sent.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     * 
     * @param inputName
     *        The name of the AWS IoT Events input where the data is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsAction withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS IoT Events input.
     * </p>
     * 
     * @param payload
     *        You can configure the action payload when you send a message to an AWS IoT Events input.
     */

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS IoT Events input.
     * </p>
     * 
     * @return You can configure the action payload when you send a message to an AWS IoT Events input.
     */

    public Payload getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS IoT Events input.
     * </p>
     * 
     * @param payload
     *        You can configure the action payload when you send a message to an AWS IoT Events input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsAction withPayload(Payload payload) {
        setPayload(payload);
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotEventsAction == false)
            return false;
        IotEventsAction other = (IotEventsAction) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public IotEventsAction clone() {
        try {
            return (IotEventsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.IotEventsActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
