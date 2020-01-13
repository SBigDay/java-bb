package com.program.shop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service
public class ServiceS {
    @ExceptionHandler(Exception.class)
   public void sort(){
       int arr[]={55,33,5};
       for(int i=0;i<5;i++){
           System.out.println(arr[i]);
       }
   }

}
