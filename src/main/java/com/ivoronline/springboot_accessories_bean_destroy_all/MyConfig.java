package com.ivoronline.springboot_accessories_bean_destroy_all;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

  //PERSON
  @Bean(destroyMethod = "destroyMethod")
  public Person person() {
    return new Person();
  }

}
