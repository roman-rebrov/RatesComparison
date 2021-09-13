package com.check_currency.app.controllers.reqfeign;


import com.check_currency.app.getImg.GetImg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="IGetImg" , url="https://api.giphy.com/v1/gifs/search")
public interface IGetImg {
    String api_key = "api_key=om9Ifij3iWCMCkwhu5V4E60HyMdEBQQg";
    String limit = "limit=50";

    @RequestMapping(method = RequestMethod.GET, value = "?" + IGetImg.api_key + "&q={imgValue}&" + IGetImg.limit)
    public GetImg getImg (@PathVariable("imgValue") String imgValue);
}
