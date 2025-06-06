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

package org.gradle.process.internal.worker;

import org.gradle.api.problems.Problem;
import org.gradle.api.problems.internal.InternalProblemReporter;
import org.gradle.api.problems.internal.ProblemsProgressEventEmitterHolder;
import org.gradle.internal.operations.OperationIdentifier;
import org.gradle.process.internal.worker.problem.WorkerProblemProtocol;
import org.jspecify.annotations.NullMarked;

/**
 * Default daemon-side implementation of {@link WorkerProblemProtocol}.
 * <p>
 * This implementation will take care of reporting problems received from the worker.
 */
@NullMarked
public class DefaultWorkerProblemProtocol implements WorkerProblemProtocol {

    @Override
    public void reportProblem(Problem problem, OperationIdentifier id) {
        InternalProblemReporter problemsService = ProblemsProgressEventEmitterHolder.get().getInternalReporter();
        problemsService.report(problem, id);
    }
}
