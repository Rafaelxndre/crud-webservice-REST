package com.devsuperior.springcrud.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.springcrud.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Rafael", "12345678", 1350.00, Instant.parse("2021-11-20T17:01:20Z"), 4));
		list.add(new Client(2L, "Felipe", "98765432", 1300.00, Instant.parse("2021-11-22T17:15:36Z"), 2));
		return ResponseEntity.ok().body(list);
	}
}
