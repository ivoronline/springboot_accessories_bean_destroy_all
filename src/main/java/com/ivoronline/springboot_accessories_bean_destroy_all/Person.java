package com.ivoronline.springboot_accessories_bean_destroy_all;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class Person implements DisposableBean {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //PRE DESTROY
  @PreDestroy
  public void preDestroy() {
    System.out.println("preDestroy()");
  }

  //DESTROY
  @Override
  public void destroy() {
    System.out.println("destroy()");
  }
  
  //DESTROY METHOD
  public void destroyMethod() {
    System.out.println("destroyMethod()");
  }
  
}
