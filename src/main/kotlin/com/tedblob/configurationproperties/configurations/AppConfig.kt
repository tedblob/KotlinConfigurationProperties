package com.tedblob.configurationproperties.configurations

import org.springframework.boot.context.properties.ConfigurationProperties
import com.tedblob.configurationproperties.configurations.AppProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {
    @Bean
    @ConfigurationProperties(prefix = "server-a")
    fun serverA(): ServerProperties {
        return ServerProperties()
    }

    @Bean
    @ConfigurationProperties(prefix = "server.b")
    fun serverB(): ServerProperties {
        return ServerProperties()
    }
}