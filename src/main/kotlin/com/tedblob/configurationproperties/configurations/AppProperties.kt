package com.tedblob.configurationproperties.configurations

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component


@ConstructorBinding
@ConfigurationProperties(value = "server")
data class AppProperties(var address: String? = "127.0.0.1", var error: Error)

@Configuration
data class Error(var path: String?)