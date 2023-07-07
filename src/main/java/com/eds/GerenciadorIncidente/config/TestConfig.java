package com.eds.GerenciadorIncidente.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eds.GerenciadorIncidente.entities.Incidente;
import com.eds.GerenciadorIncidente.repositories.IncidenteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private IncidenteRepository incidenteRepository;

	@Override
	public void run(String... args) throws Exception {
	
		Incidente i1 = new Incidente(null, "exemplo1", "exemplodescricao1",Instant.parse("2023-06-29T20:53:20Z"), Instant.parse("2023-06-30T08:10:15Z"), Instant.parse("2023-07-01T06:50:20Z"));
		Incidente i2 = new Incidente(null, "exemplo2", "exemplodescricao2",Instant.parse("2023-06-29T21:30:01Z"), Instant.parse("2023-06-30T11:15:23Z"), Instant.parse("2023-07-01T08:23:50Z"));
		
		incidenteRepository.saveAll(Arrays.asList(i1,i2));
	}
	
	
}
