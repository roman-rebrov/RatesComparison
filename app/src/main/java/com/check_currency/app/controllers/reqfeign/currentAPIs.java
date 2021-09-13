package com.check_currency.app.controllers.reqfeign;


import com.check_currency.app.getImg.Hd;
import com.check_currency.app.getRates.GetRates;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="getAPIs", url="https://openexchangerates.org/api/")
public interface currentAPIs {
    String key_id = "?app_id=1e131a83f57d4381a1d9c6c0f1d16410" ;

    @GetMapping("latest.json" + key_id )
    public GetRates getCurrence();

    @RequestMapping(method = RequestMethod.GET, value = "historical/{history}.json" + key_id)
    public GetRates getYesterday(@PathVariable("history") String history);

}
