package com.example.gradle;

import groovy.lang.Closure;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class BadDeploymentPlugin1 implements Plugin<Project> {

    public void apply(final Project project) {
        project.getExtensions().add("badDeployments1", new DeploymentExtension(project));
    }

    public static class DeploymentExtension {
        public NamedDomainObjectContainer<Server> servers;

        public DeploymentExtension(final Project project) {
            servers = project.container(Server.class);
        }

        public void servers(final Action<? super NamedDomainObjectContainer<Server>> action) {
            action.execute(servers);
        }
    }

    public static class Server {
        public String url;
        public String name;

        public Server(String name) {
            this.name = name;
        }
    }
}