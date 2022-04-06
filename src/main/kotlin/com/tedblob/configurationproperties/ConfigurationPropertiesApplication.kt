package com.tedblob.configurationproperties

import com.tedblob.configurationproperties.configurations.AppConfig
import com.tedblob.configurationproperties.configurations.AppProperties
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppProperties::class)
open class ConfigurationPropertiesApplication : CommandLineRunner {
	@Autowired
	lateinit var appProperties : AppProperties
	/*@Autowired
	lateinit var appConfig : AppConfig
*/	private val logger: Logger = LoggerFactory.getLogger(ConfigurationPropertiesApplication::class.java)

	override fun run(vararg args: String?) {
		logger.info(appProperties.address)
		logger.info(appProperties.error.path)
	}
}

fun main(args: Array<String>) {
	runApplication<ConfigurationPropertiesApplication>(*args)
}
