package com.terreivoire.Terre_ivoire_back;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class TerreIvoireApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerreIvoireApplication.class, args);
	}


}
