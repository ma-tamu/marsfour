package jp.co.project.planets.marsfour.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * webapp application
 */
@SpringBootApplication(scanBasePackages = "jp.co.project.planets.marsfour")
public class WebappApplication {

    /**
     * main
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

}
