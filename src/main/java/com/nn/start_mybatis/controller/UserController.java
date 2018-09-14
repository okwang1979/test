package com.nn.start_mybatis.controller;

import com.nn.start_mybatis.service.IUserService;
import com.nn.start_mybatis.entity.ContextValue;
import com.nn.start_mybatis.entity.JsonResult;
import com.nn.start_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

public class UserController {


    @Autowired
    public IUserService userService;

    @Autowired
    private ContextValue contextValue;

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)

    public ResponseEntity<JsonResult> getUserById(@PathVariable(value = "id") Integer id) {

        JsonResult r = new JsonResult();
        try {
            User user = userService.getUserById(id);
            r.setResult(user);
            r.setStatus("ok");

        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    @RequestMapping(value = "username")
    public ResponseEntity<JsonResult> getPropertiesValue() {
        JsonResult r = new JsonResult();
        r.setResult(contextValue.getName());
        r.setStatus("ok");
        return ResponseEntity.ok(r);
    }


}
