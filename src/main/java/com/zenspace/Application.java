package com.zenspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.core.command.annotation.Command;
import org.springframework.shell.core.command.annotation.Option;


@SpringBootApplication

public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
