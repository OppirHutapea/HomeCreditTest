package com.oppir.test.API_test.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oppir.test.API_test.Repositori.KontakRepo;
import com.oppir.test.API_test.models.Kontak;

@RequestMapping({"/kontaks"})
public class KontakCotroller {
	private KontakRepo kontakRepo;

	public KontakCotroller(KontakRepo kontakRepo) {
		this.kontakRepo = kontakRepo;
	}
	
	@GetMapping
	public List findAll(){
		return kontakRepo.findAll();
	}
	 @GetMapping(path = {"/{id}"})
	  public ResponseEntity<Kontak> findById(@PathVariable Long id){
	    return kontakRepo.findById(id)
	            .map(record -> ResponseEntity.ok().body(record))
	            .orElse(ResponseEntity.notFound().build());
	  }
	 @PostMapping
	  public Kontak create(@RequestBody Kontak contact){
	      return kontakRepo.save(contact);
	  }
	 
	 @PutMapping(value="/{id}")
	 public ResponseEntity<Kontak> update(@PathVariable("id") long id, @RequestBody Kontak kontak){
		 	return kontakRepo.findById(id)
		 			.map(record -> {
		 				record.setName(kontak.getName());
		 				record.setEmail(kontak.getEmail());
		 				record.setPhone(kontak.getPhone());
		 				Kontak updated = kontakRepo.save(record);
		 				return ResponseEntity.ok().body(updated);
		 			}).orElse(ResponseEntity.notFound().build());
		 
	 }
	 
	 @DeleteMapping(path ={"/{id}"})
	  public ResponseEntity<?> delete(@PathVariable("id") long id) {
	    return kontakRepo.findById(id)
	        .map(record -> {
	            kontakRepo.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	  }
}
