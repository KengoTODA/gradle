/*
 * Copyright 2023 the original author or authors.
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

package org.gradle.internal.build.event.types;

import org.gradle.tooling.internal.protocol.problem.InternalPayloadSerializedAdditionalData;
import org.jspecify.annotations.NullMarked;

import java.io.Serializable;
import java.util.Collections;

@NullMarked
public class DefaultInternalPayloadSerializedAdditionalData extends DefaultInternalAdditionalData implements Serializable, InternalPayloadSerializedAdditionalData {
    private final byte[] isolatable;
    private final Object payload;

    public DefaultInternalPayloadSerializedAdditionalData(byte[] isolatable, Object payload) {
        super(Collections.emptyMap());
        this.isolatable = isolatable;
        this.payload = payload;
    }

    @Override
    public Object getSerializedType() {
        return payload;
    }

    @Override
    public byte[] getBytesForIsolatadObject() {
        return isolatable;
    }
}
