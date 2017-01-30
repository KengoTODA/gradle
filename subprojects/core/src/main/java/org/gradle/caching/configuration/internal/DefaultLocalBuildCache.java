/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.caching.configuration.internal;

import org.gradle.caching.configuration.LocalBuildCache;

public class DefaultLocalBuildCache implements LocalBuildCache {
    private boolean enabled = true;
    private boolean push = true;
    private Object directory;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isPush() {
        return push;
    }

    @Override
    public void setPush(boolean push) {
        this.push = push;
    }

    public Object getDirectory() {
        return directory;
    }

    @Override
    public void setDirectory(Object directory) {
        this.directory = directory;
    }
}
