package hello

import org.springframework.boot.SpringApplication
/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @amol
 * @since 1.0
 */
object HelloWebApp {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloController]);
	}
}
