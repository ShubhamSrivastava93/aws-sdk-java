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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProactiveInsight JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProactiveInsightJsonUnmarshaller implements Unmarshaller<ProactiveInsight, JsonUnmarshallerContext> {

    public ProactiveInsight unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProactiveInsight proactiveInsight = new ProactiveInsight();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsightTimeRange", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setInsightTimeRange(InsightTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PredictionTimeRange", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setPredictionTimeRange(PredictionTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceCollection", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setResourceCollection(ResourceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SsmOpsItemId", targetDepth)) {
                    context.nextToken();
                    proactiveInsight.setSsmOpsItemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return proactiveInsight;
    }

    private static ProactiveInsightJsonUnmarshaller instance;

    public static ProactiveInsightJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProactiveInsightJsonUnmarshaller();
        return instance;
    }
}
