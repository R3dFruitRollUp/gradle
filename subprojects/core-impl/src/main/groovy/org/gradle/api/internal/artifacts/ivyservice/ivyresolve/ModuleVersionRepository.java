/*
 * Copyright 2011 the original author or authors.
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
package org.gradle.api.internal.artifacts.ivyservice.ivyresolve;

import org.gradle.api.artifacts.component.ModuleComponentIdentifier;
import org.gradle.api.internal.artifacts.ivyservice.ArtifactResolver;
import org.gradle.api.internal.artifacts.metadata.DependencyMetaData;

/**
 * A repository of module versions.
 *
 * The plan is to sync this with {@link org.gradle.api.internal.artifacts.ivyservice.DependencyToModuleVersionResolver} and rename it
 * to have 'resolver' instead of 'repository' in its name.
 */
public interface ModuleVersionRepository extends ArtifactResolver {
    String getId();

    String getName();

    /**
     * Resolves the given dependency to a list of module versions.
     */
    void listModuleVersions(DependencyMetaData dependency, BuildableModuleVersionSelectionResolveResult result);

    /**
     * Gets the metadata for a module component.
     */
    void resolveComponentMetaData(DependencyMetaData dependency, ModuleComponentIdentifier moduleComponentIdentifier, BuildableModuleVersionMetaDataResolveResult result);
}
