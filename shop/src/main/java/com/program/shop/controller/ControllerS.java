package com.program.shop.controller;

import com.program.shop.service.ServiceS;
import org.springframework.web.bind.annotation.*;


@RestController
@ControllerAdvice
@RequestMapping("/shop")
public class ControllerS {
    private final ServiceS serviceS;

    public ControllerS(ServiceS serviceS) {
        this.serviceS = serviceS;
    }


    /**
     * @param id
     * @return
     */
    @ExceptionHandler({Exception.class})
    @RequestMapping(value= "/BB",method= RequestMethod.GET)
    public String Register2(@RequestParam int id){
        System.out.println("ssss");
        return "返回的id是"+id;
    }
    @RequestMapping(value= "/CC/{id}",method= RequestMethod.POST)
    public String Register(@PathVariable int id){
        System.out.println("ssss");
        return "返回的id是"+id;
    }
    @RequestMapping(value = "/ex",method = RequestMethod.POST)
    public void  exception(){
           serviceS.sort();

    }
}
