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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for monitoring constraints and monitoring statistics. These baseline resources are compared against the
 * results of the current job from the series of jobs scheduled to collect data periodically.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DataQualityBaselineConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityBaselineConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job that performs baselining for the data quality monitoring job.
     * </p>
     */
    private String baseliningJobName;

    private MonitoringConstraintsResource constraintsResource;

    private MonitoringStatisticsResource statisticsResource;

    /**
     * <p>
     * The name of the job that performs baselining for the data quality monitoring job.
     * </p>
     * 
     * @param baseliningJobName
     *        The name of the job that performs baselining for the data quality monitoring job.
     */

    public void setBaseliningJobName(String baseliningJobName) {
        this.baseliningJobName = baseliningJobName;
    }

    /**
     * <p>
     * The name of the job that performs baselining for the data quality monitoring job.
     * </p>
     * 
     * @return The name of the job that performs baselining for the data quality monitoring job.
     */

    public String getBaseliningJobName() {
        return this.baseliningJobName;
    }

    /**
     * <p>
     * The name of the job that performs baselining for the data quality monitoring job.
     * </p>
     * 
     * @param baseliningJobName
     *        The name of the job that performs baselining for the data quality monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityBaselineConfig withBaseliningJobName(String baseliningJobName) {
        setBaseliningJobName(baseliningJobName);
        return this;
    }

    /**
     * @param constraintsResource
     */

    public void setConstraintsResource(MonitoringConstraintsResource constraintsResource) {
        this.constraintsResource = constraintsResource;
    }

    /**
     * @return
     */

    public MonitoringConstraintsResource getConstraintsResource() {
        return this.constraintsResource;
    }

    /**
     * @param constraintsResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityBaselineConfig withConstraintsResource(MonitoringConstraintsResource constraintsResource) {
        setConstraintsResource(constraintsResource);
        return this;
    }

    /**
     * @param statisticsResource
     */

    public void setStatisticsResource(MonitoringStatisticsResource statisticsResource) {
        this.statisticsResource = statisticsResource;
    }

    /**
     * @return
     */

    public MonitoringStatisticsResource getStatisticsResource() {
        return this.statisticsResource;
    }

    /**
     * @param statisticsResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityBaselineConfig withStatisticsResource(MonitoringStatisticsResource statisticsResource) {
        setStatisticsResource(statisticsResource);
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
        if (getBaseliningJobName() != null)
            sb.append("BaseliningJobName: ").append(getBaseliningJobName()).append(",");
        if (getConstraintsResource() != null)
            sb.append("ConstraintsResource: ").append(getConstraintsResource()).append(",");
        if (getStatisticsResource() != null)
            sb.append("StatisticsResource: ").append(getStatisticsResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityBaselineConfig == false)
            return false;
        DataQualityBaselineConfig other = (DataQualityBaselineConfig) obj;
        if (other.getBaseliningJobName() == null ^ this.getBaseliningJobName() == null)
            return false;
        if (other.getBaseliningJobName() != null && other.getBaseliningJobName().equals(this.getBaseliningJobName()) == false)
            return false;
        if (other.getConstraintsResource() == null ^ this.getConstraintsResource() == null)
            return false;
        if (other.getConstraintsResource() != null && other.getConstraintsResource().equals(this.getConstraintsResource()) == false)
            return false;
        if (other.getStatisticsResource() == null ^ this.getStatisticsResource() == null)
            return false;
        if (other.getStatisticsResource() != null && other.getStatisticsResource().equals(this.getStatisticsResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseliningJobName() == null) ? 0 : getBaseliningJobName().hashCode());
        hashCode = prime * hashCode + ((getConstraintsResource() == null) ? 0 : getConstraintsResource().hashCode());
        hashCode = prime * hashCode + ((getStatisticsResource() == null) ? 0 : getStatisticsResource().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityBaselineConfig clone() {
        try {
            return (DataQualityBaselineConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DataQualityBaselineConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
