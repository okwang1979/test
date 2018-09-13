package com.nn.start_mybatis.controller;

import com.nn.start_mybatis.vo.JsonResult;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;


@RestController
public class RsetWebController {

    @RequestMapping(value = "/baidu",method= RequestMethod.GET)
    public ResponseEntity<JsonResult> getBaiduRest() {

        try{
            RestTemplate template=new RestTemplate();
            template.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));

            ResponseEntity<String> getData = template.getForEntity("http://www.weather.com.cn/data/sk/101010100.html", String.class);
            String body = getData.getBody();
            return ResponseEntity.ok(JsonResult.getSuccess(body));
        }catch(Exception ex){
            return ResponseEntity.ok(JsonResult.getFailed(ex));
        }

    }
}
