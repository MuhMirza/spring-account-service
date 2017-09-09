package com.ciazhar.accountservice.service

import com.ciazhar.accountservice.model.dto.request.PermissionForm
import com.ciazhar.accountservice.model.dto.response.ResponseData
import com.ciazhar.accountservice.model.jpa.Permission

/**
 * Created by ciazhar on 9/2/17.
 */
interface PermissionService {
    fun save(role: PermissionForm) : ResponseData<*>
    fun findAll() : ResponseData<*>
    fun findOne(id : String) : ResponseData<*>
    fun delete(id: String): ResponseData<*>
}