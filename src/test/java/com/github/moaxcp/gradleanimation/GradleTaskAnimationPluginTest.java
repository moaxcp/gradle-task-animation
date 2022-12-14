/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.moaxcp.gradleanimation;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A simple unit test for the 'com.github.moaxcp.gradleanimation' plugin.
 */
class GradleTaskAnimationPluginTest {
    @Test void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("com.github.moaxcp.gradleanimation");

        // Verify the result
        assertThat(project.getTasks().findByName("greeting")).isNotNull();
    }
}
