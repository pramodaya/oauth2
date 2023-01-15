package com.pramodaya.spring.boot.oauth2;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {
    @GetMapping
    public Object getCurrentUser(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        /**
         * PRINCIPAL OBJECT WILL GIVE THE SUER DETAILS
         */
        return oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
