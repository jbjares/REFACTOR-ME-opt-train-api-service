package de.difuture.ekut.pht.service.trainapi.service

import de.difuture.ekut.pht.dockerclient.DefaultDockerClient
import org.springframework.stereotype.Service

@Service
class DockerClientService {

    // Fetch an imported DefaultDockerClient from the Docker Client implementation
    val dockerClient = DefaultDockerClient(
            com.spotify.docker.client.DefaultDockerClient.fromEnv().build())
}
