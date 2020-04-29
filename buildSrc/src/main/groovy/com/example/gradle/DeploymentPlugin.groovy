package com.example.gradle

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.gradle.api.Plugin

class DeploymentPlugin implements Plugin<Project> {

    void apply(final Project project) {
        def servers = project.container(Server)
        servers.all {
            nodes = project.container(Node)
        }
        project.extensions.add('deployments', servers)
    }

    static class Server {
        NamedDomainObjectContainer<Node> nodes
        String url
        String name

        Server(String name) {
            this.name = name
        }

        def nodes(final Closure configureClosure) {
            nodes.configure(configureClosure)
        }
    }

    static class Node {
        String name
        Integer port

        Node(String name) {
            this.name = name
        }
    }
}