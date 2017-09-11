package com.ciazhar.accountservice.config

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.web.client.RestTemplate





/**
 * Created by ciazhar on 9/9/17.
 */


@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity(debug = true)
class Oauth2Config : ResourceServerConfigurerAdapter() {

    override fun configure(http: HttpSecurity?) {
        http
                ?.authorizeRequests()
                ?.antMatchers("/api/user/register")?.permitAll()
                ?.antMatchers("/mobile/user/register")?.permitAll()
                ?.antMatchers("/activate**")?.permitAll()
                ?.antMatchers("/webjars/**")?.permitAll()
                ?.antMatchers("/swagger-resources/**")?.anonymous()
                ?.antMatchers("/v2/api-docs/**")?.anonymous()
                ?.anyRequest()?.authenticated()
                ?.and()
                ?.csrf()?.ignoringAntMatchers("/mobile/**")
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder(
        )
    }


}