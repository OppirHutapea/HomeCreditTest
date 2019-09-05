package com.oppir.test.API_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

import com.oppir.test.API_test.Repositori.KategoriRepo;
import com.oppir.test.API_test.Repositori.ModuleRepo;
import com.oppir.test.API_test.Repositori.UserRepo;
import com.oppir.test.API_test.models.Kategoridiskon;
import com.oppir.test.API_test.models.Modulekategori;
import java.util.Map;
import java.util.ArrayList;

@RestController
@RequestMapping("kategori/")
public class MenuController {
	@Autowired
	private ModuleRepo moduleRepo;
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping(path="/module-id/{userid}", produces="application/json")
	public @ResponseBody Map getAllKategori(@PathVariable("userid") String userid) {
		int groupId = userRepo.findGroupingIdBasedIdUser(userid);
		
		List<Modulekategori> modkat = moduleRepo.findAllByUserGroup(groupId);
		HashMap<String, Object> value;
		List semuaKategori =  new ArrayList();
		
		for(Modulekategori katedis : modkat) {
			value = new HashMap<>();
			value.put("moduleorder", katedis.getModuleorder());
			value.put("namamodule", katedis.getNamamodule());
			
			semuaKategori.add(value);
		}
		HashMap<String, List> returnValue = new HashMap<>();
		returnValue.put("Modules", semuaKategori);
		return returnValue;
		
		
	}
}
