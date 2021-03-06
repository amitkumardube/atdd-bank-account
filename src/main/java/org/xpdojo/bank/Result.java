/*
 *
 * Copyright (c) 2019 xp-dojo organisation and committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.xpdojo.bank;

public class Result {

    public static Result success() {
        return SUCCESS;
    }

    public static Result failure() {
        return FAILURE;
    }

    public boolean succeeded() {
        return succeeded;
    }

    private static Result SUCCESS = new Result(true);
    private static Result FAILURE = new Result(false);

    private boolean succeeded;

    private Result(boolean succeeded) {
        this.succeeded = succeeded;
    }
}
