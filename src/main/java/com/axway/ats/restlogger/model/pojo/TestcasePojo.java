/*
 * Copyright 2017 Axway Software
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
package com.axway.ats.restlogger.model.pojo;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "testcase details")
public class TestcasePojo extends BasePojo {

    @ApiModelProperty(hidden = true)
    private int            testcaseId;

    @ApiModelProperty(required = true, value = "Testcase name")
    private String         testcaseName;

    @ApiModelProperty(required = true, value = "Scenario name")
    private String             scenarioName;

    @ApiModelProperty(required = true, value = "Scenario description")
    private String             scenarioDescription;

    @ApiModelProperty(hidden = true)
    private TestcaseResultPojo testcaseResult;

    public int getTestcaseId() {

        return testcaseId;
    }

    public void setTestcaseId(
                               int testcaseId ) {

        this.testcaseId = testcaseId;
    }

    public String getTestcaseName() {

        return testcaseName;
    }

    public void setTestcaseName(
                                 String testcaseName ) {

        this.testcaseName = testcaseName;
    }

    public TestcaseResultPojo getTestcaseResult() {

        return testcaseResult;
    }

    public void setTestcaseResult(
                                   TestcaseResultPojo testcaseResult ) {

        this.testcaseResult = testcaseResult;
    }

    public String getScenarioName() {

        return scenarioName;
    }

    public void setScenarioName(
                                 String scenarioName ) {

        this.scenarioName = scenarioName;
    }

    public String getScenarioDescription() {

        return scenarioDescription;
    }

    public void setScenarioDescription(
                                        String scenarioDescription ) {

        this.scenarioDescription = scenarioDescription;
    }

}
