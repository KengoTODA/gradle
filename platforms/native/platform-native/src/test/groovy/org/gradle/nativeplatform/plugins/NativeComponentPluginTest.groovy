/*
 * Copyright 2013 the original author or authors.
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

package org.gradle.nativeplatform.plugins


import org.gradle.nativeplatform.toolchain.NativeToolChainRegistry
import org.gradle.nativeplatform.toolchain.internal.plugins.StandardToolChainsPlugin
import org.gradle.test.fixtures.AbstractProjectBuilderSpec

class NativeComponentPluginTest extends AbstractProjectBuilderSpec {

    def setup() {
        project.pluginManager.apply(NativeComponentPlugin)
    }

    def "registers extensions and adds default compilers"() {
        expect:
        project.toolChains instanceof NativeToolChainRegistry
        project.plugins.hasPlugin(StandardToolChainsPlugin)
    }
}
