package thymeleaf.tutorial.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Variety {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String name;
}
