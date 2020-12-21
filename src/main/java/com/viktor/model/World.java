package com.viktor.model;

public class World {
	private long id;
	private String message;

	public World(long incrementAndGet, String format) {
		this.id = incrementAndGet;
		this.message = format;
	}

	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}
}
