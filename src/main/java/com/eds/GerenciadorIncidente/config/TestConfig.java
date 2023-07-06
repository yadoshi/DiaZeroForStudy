package com.eds.GerenciadorIncidente.config;

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
	
		Incidente i1 = new Incidente(null, "exemplo1", "exemplodescricao1","00/00/0000 00:00:00", "00/00/0000 00:00:00", "00/00/0000 00:00:00");
		Incidente i2 = new Incidente(null, "exemplo2", "exemplodescricao2","01/00/0000 00:00:00", "01/00/0000 00:00:00", "01/00/0000 00:00:00");
		
		incidenteRepository.saveAll(Arrays.asList(i1,i2));
	}
	
	
}
