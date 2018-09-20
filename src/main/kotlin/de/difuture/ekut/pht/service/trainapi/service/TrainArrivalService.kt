package de.difuture.ekut.pht.service.trainapi.service

import de.difuture.ekut.pht.lib.train.registry.DefaultTrainRegistryClient
import jdregistry.client.DockerRegistryGetClient
import org.springframework.stereotype.Service

@Service
class TrainArrivalService {


    private val trainRegistry = DefaultTrainRegistryClient(
            DockerRegistryGetClient.of()
    )


}
