package com.example.gradle;

import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DeploymentPlugin2 implements Plugin<Project> {

    public void apply(final Project project) {
        project.getExtensions().add("deployments2", new DeploymentExtension2(project));
    }

    public static class DeploymentExtension2 {
        final NamedDomainObjectContainer<Server2> servers;

        public DeploymentExtension2(final Project project) {
            servers = project.container(Server2.class);
        }
    }

    public static class Server2 {
        public String url;
        public String name;

        public Server2(String name) {
            this.name = name;
        }
    }
}