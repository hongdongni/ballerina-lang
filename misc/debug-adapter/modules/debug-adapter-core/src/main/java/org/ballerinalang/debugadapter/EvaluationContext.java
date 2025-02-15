/*
 * Copyright (c) 2021, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ballerinalang.debugadapter;

import org.ballerinalang.debugadapter.evaluation.BImport;

import java.util.HashMap;
import java.util.Map;

/**
 * Context holder which contain information of the evaluation state.
 *
 * @since 2.0.0
 */
public class EvaluationContext {

    private final SuspendedContext suspendedContext;
    private Map<String, BImport> resolvedImports = new HashMap<>();

    public EvaluationContext(SuspendedContext suspendedContext) {
        this.suspendedContext = suspendedContext;
    }

    public SuspendedContext getSuspendedContext() {
        return suspendedContext;
    }

    public Map<String, BImport> getResolvedImports() {
        return resolvedImports;
    }

    public void setResolvedImports(Map<String, BImport> resolvedImports) {
        this.resolvedImports = resolvedImports;
    }
}
