package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsGereEtudiantsApplication implements CommandLineRunner {
	@Autowired 
	private EtudiantRepository etudiantRepository ;
	@Autowired 
	private FormationRepository formationRepository ;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(MsGereEtudiantsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Formation	f1=formationRepository.save(new Formation (null,"Java",30,null));
		Formation	f2=formationRepository.save(new Formation (null,"PHP",30,null));
		Formation	f3=formationRepository.save(new Formation (null,"Oracle",30,null));
		
		etudiantRepository.save(new  Etudiant(null,"Yassine","ghar",new Date(),f1));
		etudiantRepository.save(new  Etudiant(null,"mohamed","salh",new Date(),f1));
		etudiantRepository.save(new  Etudiant(null,"Ronaldo","Brazil",new Date(),f2));
		etudiantRepository.save(new  Etudiant(null,"Wissem","Amri",new Date(),f3));
		
	
	}

}
