package com.ciazhar.accountservice.service

import com.ciazhar.accountservice.model.dto.response.ResponseData
import com.ciazhar.accountservice.model.jpa.Role


/**
 * Created by ciazhar on 9/2/17.
 */

interface RoleService{
    fun save(role: Role) : ResponseData<*>
    fun findAll() : ResponseData<*>
    fun findOne(id : String) : ResponseData<*>
    fun delete(id: String): ResponseData<*>
}