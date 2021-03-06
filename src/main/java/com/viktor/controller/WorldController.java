package com.viktor.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.viktor.model.World;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
	private static final String template = "Hello World!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping ("/world")
	public World world() {
		return new World(counter.incrementAndGet(),String.format(template));
	}
}
