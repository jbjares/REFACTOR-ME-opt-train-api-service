package de.difuture.ekut.pht.service.trainapi.controller

import de.difuture.ekut.pht.lib.train.TrainId
import de.difuture.ekut.pht.lib.train.TrainTag
import de.difuture.ekut.pht.service.trainapi.service.DockerClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class APIController
@Autowired constructor(private val dockerService: DockerClientService) {

    @RequestMapping("/{trainId}/{trainTag}/{command}")
    fun executeTrainArrival(
            @PathVariable("trainId") trainId: TrainId,
            @PathVariable("trainTag") trainTag: TrainTag,
            @PathVariable("command") command: String) {


    }
}
