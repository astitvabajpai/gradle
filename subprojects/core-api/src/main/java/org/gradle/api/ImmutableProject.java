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

package org.gradle.api;

import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * An immutable view of {@link Project} that exposes only those properties that are safe to access from outside of
 * <code>this</code> project, from the perspective of isolated projects.
 */
public interface ImmutableProject {

    /**
     * <p>Returns the name of this project. The project's name is not necessarily unique within a project hierarchy. You
     * should use the {@link #getPath()} method for a unique identifier for the project.
     * If the root project is unnamed and is located on a file system root it will have a randomly-generated name
     * </p>
     *
     * @return The name of this project. Never return null.
     */
    @NotNull
    String getName();

    /**
     * <p>Returns the path of this project.  The path is the fully qualified name of the project.</p>
     *
     * @return The path. Never returns null.
     */
    @NotNull
    String getPath();

    /**
     * <p>The directory containing the project build file.</p>
     *
     * @return The project directory. Never returns null.
     */
    @NotNull
    File getProjectDirectory();

    /**
     * <p>Returns the root directory of this project. The root directory is the project directory of the root
     * project.</p>
     *
     * @return The root directory. Never returns null.
     */
    @NotNull
    File getRootDirectory();
}
