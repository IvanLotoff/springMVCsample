package simplespringmvc.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import simplespringmvc.mvc.model.CurrencyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CurrencyValueExtracter implements ICurrencyValueExtracter {
    private final RestTemplate restTemplate;
    private static final String url = "https://www.cbr-xml-daily.ru/daily_json.js";

    @Autowired
    public CurrencyValueExtracter(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        this.restTemplate.setMessageConverters(messageConverters);
    }



    @Override
    public double extractValueFor(String currencyCode, int amount) {
        CurrencyList currencyList = restTemplate.getForObject(url, CurrencyList.class);
        return amount/currencyList.getValute().get(currencyCode).getValue();
    }
}
