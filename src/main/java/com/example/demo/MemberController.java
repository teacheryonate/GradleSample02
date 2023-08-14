package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@GetMapping({"", "/"})
	public ResponseEntity<?> index(){
		Map<String, Object> map = new HashMap<>();
		map.put("key", "11111");
		return ResponseEntity.ok().body(map);
	}
	
	@GetMapping("/health")
	public ResponseEntity<?> health(){
		Map<String, Object> map = new HashMap<>();
		map.put("key", "2222");
		return ResponseEntity.ok().body(map);
	}
	
	@GetMapping("/check")
	public ResponseEntity<?> check(){
		Map<String, Object> map = new HashMap<>();
		map.put("id", "ok");
		return ResponseEntity.ok().body(map);
	}
}
