package com.ciazhar.accountservice.controllers

import com.ciazhar.accountservice.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class UserThymeleafController @Autowired constructor(private val service: UserService){

    @PreAuthorize("permitAll()")
    @RequestMapping("/activate")
    fun activate(@RequestParam(value = "a") id: String, model: Model): String {
        return service.activate(id,model)
    }

}