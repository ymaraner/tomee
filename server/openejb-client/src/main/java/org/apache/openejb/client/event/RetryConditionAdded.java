/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.client.event;

/**
 * @version $Rev$ $Date$
 */
@Log(Log.Level.CONFIG)
public class RetryConditionAdded {

    private final Class<? extends Throwable> condition;

    public RetryConditionAdded(Class<? extends Throwable> condition) {
        this.condition = condition;
    }

    public Class<? extends Throwable> getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "RetryConditionAdded{" +
                "condition=" + condition.getName() +
                '}';
    }
}
