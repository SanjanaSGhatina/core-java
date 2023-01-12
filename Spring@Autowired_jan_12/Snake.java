package com.xworkz.newsPaper.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String snake;
	@Value("8.4")
	private double length;
	@Value("Green with Red dots")
	private String color;
	private String type;
	private boolean poisinous;
	
	@Autowired
	public Snake(@Qualifier("snakeName")String snake,@Qualifier("snakeType") String type,@Qualifier("snakepois") boolean poisinous) {
		super();
		this.snake = snake;
		this.type = type;
		this.poisinous = poisinous;
	}

	@Override
	public String toString() {
		return "Snake [snake=" + snake + ", length=" + length + ", color=" + color + ", type=" + type + ", poisinous="
				+ poisinous + "]";
	}
	
	

}
