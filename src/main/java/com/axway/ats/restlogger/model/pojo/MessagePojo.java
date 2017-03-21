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

import com.axway.ats.restlogger.model.MessageLevel;
import com.axway.ats.restlogger.model.pojo.BasePojo;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "message details")
public class MessagePojo extends BasePojo {

    @ApiModelProperty(required = true, value = "Log level")
    private String level;
    @ApiModelProperty(required = true, value = "Host message is logged from")
    private String machineName;
    @ApiModelProperty(required = true, value = "Thread name")
    private String threadName;
    @ApiModelProperty(required = true, value = "Message")
    private String message;

    public String getLevel() {

        return level;
    }

    public void setLevel(
                          String level ) {

        this.level = level;
    }

    public String getMachineName() {

        return machineName;
    }

    public void setMachineName(
                                String machineName ) {

        this.machineName = machineName;
    }

    public String getThreadName() {

        return threadName;
    }

    public void setThreadName(
                               String threadName ) {

        this.threadName = threadName;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(
                            String message ) {

        this.message = message;
    }

    public MessageLevel getLogLevel() {

        return MessageLevel.valueOf( level );
    }
}
