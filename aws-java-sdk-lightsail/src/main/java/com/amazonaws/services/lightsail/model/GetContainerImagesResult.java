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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerImages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerImagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that describe container images that are registered to the container service.
     * </p>
     */
    private java.util.List<ContainerImage> containerImages;

    /**
     * <p>
     * An array of objects that describe container images that are registered to the container service.
     * </p>
     * 
     * @return An array of objects that describe container images that are registered to the container service.
     */

    public java.util.List<ContainerImage> getContainerImages() {
        return containerImages;
    }

    /**
     * <p>
     * An array of objects that describe container images that are registered to the container service.
     * </p>
     * 
     * @param containerImages
     *        An array of objects that describe container images that are registered to the container service.
     */

    public void setContainerImages(java.util.Collection<ContainerImage> containerImages) {
        if (containerImages == null) {
            this.containerImages = null;
            return;
        }

        this.containerImages = new java.util.ArrayList<ContainerImage>(containerImages);
    }

    /**
     * <p>
     * An array of objects that describe container images that are registered to the container service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerImages(java.util.Collection)} or {@link #withContainerImages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param containerImages
     *        An array of objects that describe container images that are registered to the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerImagesResult withContainerImages(ContainerImage... containerImages) {
        if (this.containerImages == null) {
            setContainerImages(new java.util.ArrayList<ContainerImage>(containerImages.length));
        }
        for (ContainerImage ele : containerImages) {
            this.containerImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe container images that are registered to the container service.
     * </p>
     * 
     * @param containerImages
     *        An array of objects that describe container images that are registered to the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerImagesResult withContainerImages(java.util.Collection<ContainerImage> containerImages) {
        setContainerImages(containerImages);
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
        if (getContainerImages() != null)
            sb.append("ContainerImages: ").append(getContainerImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContainerImagesResult == false)
            return false;
        GetContainerImagesResult other = (GetContainerImagesResult) obj;
        if (other.getContainerImages() == null ^ this.getContainerImages() == null)
            return false;
        if (other.getContainerImages() != null && other.getContainerImages().equals(this.getContainerImages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerImages() == null) ? 0 : getContainerImages().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerImagesResult clone() {
        try {
            return (GetContainerImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
