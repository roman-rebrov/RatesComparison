package com.check_currency.app.controllers;

import com.check_currency.app.RandomNum;
import com.check_currency.app.controllers.reqfeign.IGetImg;
import com.check_currency.app.getImg.GetImg;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.check_currency.app.controllers.reqfeign.currentAPIs;
import com.check_currency.app.getRates.GetRates;
import com.check_currency.app.setDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class APIsController {

    @Autowired
    private currentAPIs get;
    @Autowired
    private IGetImg img;

    @CrossOrigin
    @GetMapping("/getCurrency")
    public GetRates getCurrency ( ) {

        GetRates res = get.getCurrence();
        return res;
    }

    @CrossOrigin
    @GetMapping("/rateEquals/{name}")
    public String equals(@PathVariable("name") String name ) {
        setDate d = new setDate();
        String req = d.getYear() + "-" + d.getMonth() + "-" + d.yesterday();

        ObjectMapper oMapper = new ObjectMapper();

        GetRates getRatesToday = get.getCurrence();

        GetRates getRatesYesterday = get.getYesterday(req + "");

        Map<String, Object> t = oMapper.convertValue(getRatesYesterday.rates, Map.class);
        Map<String, Object> y = oMapper.convertValue(getRatesToday.rates, Map.class);


        Double today = (Double) t.get(name);
        Double yesterday = (Double) y.get(name);



        GetImg getImg;

        if(today > yesterday) {
            getImg = img.getImg("rich");
        } else {
            getImg = img.getImg("broke");
        }
        RandomNum random = new RandomNum(50);
        int i = random.getRandom();

        String p =  getImg.data.get(i).images.original.url ;

        return p;
    }
}