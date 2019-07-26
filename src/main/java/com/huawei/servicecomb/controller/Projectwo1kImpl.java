package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-07-26T07:29:36.674Z")

@RestSchema(schemaId = "projectwo1k")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectwo1kImpl {

    @Autowired
    private Projectwo1kDelegate userProjectwo1kDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectwo1kDelegate.helloworld(name);
    }

}
