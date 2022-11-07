package com.triplej.eussyax2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.triplej.eussyax2.*")
public class Eussyax2Application {

  public static void main(String[] args) {
    SpringApplication.run(Eussyax2Application.class, args);
  }

}
