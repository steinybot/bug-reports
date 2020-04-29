package com.example.gradle;

import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DeploymentPlugin2 implements Plugin<Project> {

    public void apply(final Project project) {
        final NamedDomainObjectContainer<Server2> servers = project.container(Server2.class);
        servers.all(it ->
                it.nodes = project.container(Node2.class)
        );
        project.getExtensions().add("deployments2", servers);
    }

    public static class Server2 {
        public NamedDomainObjectContainer<Node2> nodes;
        public String url;
        public String name;

        public Server2(String name) {
            this.name = name;
        }

        public void nodes(final Action<? super NamedDomainObjectContainer<Node2>> action) {
            action.execute(nodes);
        }
    }

    public static class Node2 {
        public String name;
        public Integer port;

        public Node2(String name) {
            this.name = name;
        }
    }
}