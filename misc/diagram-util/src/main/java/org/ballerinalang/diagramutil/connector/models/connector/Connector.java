/*
 *  Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.ballerinalang.diagramutil.connector.models.connector;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.ballerinalang.central.client.model.Package;

import java.util.List;
import java.util.Map;

/**
 * Connector model.
 */
public class Connector {

    public static final String JSON_PROPERTY_PACKAGE = "package";
    @Expose
    public String id;
    @Expose
    public String orgName;
    @Expose
    public String moduleName;
    @Expose
    public String packageName;
    @Expose
    public String version;
    @Expose
    public String name;
    @Expose
    public String documentation;
    @Expose
    public String platform;
    @Expose
    public String ballerinaVersion;
    @Expose
    public Map<String, String> displayAnnotation;
    @Expose
    public List<Function> functions;
    @SerializedName(JSON_PROPERTY_PACKAGE)
    public Package packageInfo;

    public Connector() {
    }

    public Connector(String orgName, String moduleName, String packageName, String version, String name,
                        String documentation, Map<String, String> displayAnnotation) {
        this.moduleName = moduleName;
        this.name = name;
        this.documentation = documentation;
        this.displayAnnotation = displayAnnotation;

        Package packageInfo = new Package();
        packageInfo.setOrganization(orgName);
        packageInfo.setName(packageName);
        packageInfo.setVersion(version);
        this.packageInfo = packageInfo;
    }

    public Connector(String orgName, String moduleName, String packageName, String version, String name,
                        String documentation, Map<String, String> displayAnnotation, List<Function> functions) {
        this.moduleName = moduleName;
        this.name = name;
        this.documentation = documentation;
        this.displayAnnotation = displayAnnotation;
        this.functions = functions;

        Package packageInfo = new Package();
        packageInfo.setOrganization(orgName);
        packageInfo.setName(packageName);
        packageInfo.setVersion(version);
        this.packageInfo = packageInfo;
    }
}
