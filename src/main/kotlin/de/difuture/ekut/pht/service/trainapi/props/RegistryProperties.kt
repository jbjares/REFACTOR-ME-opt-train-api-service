package de.difuture.ekut.pht.service.trainapi.props

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import java.net.URI


@Configuration
@ConfigurationProperties(prefix = "registry")
class RegistryProperties {

    lateinit var uri: URI
    lateinit var namespace: String
}
