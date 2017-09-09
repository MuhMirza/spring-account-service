package com.ciazhar.accountservice.service.impl

import com.ciazhar.accountservice.config.string.ErrorMessage
import com.ciazhar.accountservice.model.dto.response.ResponseData
import com.ciazhar.accountservice.model.jpa.Role
import com.ciazhar.accountservice.repository.RoleRepository
import com.ciazhar.accountservice.service.RoleService
import org.springframework.stereotype.Service
import java.util.*

@Service
class RoleServiceImpl (private val roleRepository: RoleRepository): RoleService {
    override fun save(role: Role): ResponseData<*> {
        if(role.id!=null&&roleRepository.findOne(role.id)==null){
            return ResponseData<Objects>(status = "Update Failed",message = "ID Not Found")
        }
        return ResponseData(roleRepository.save(role))
    }

    override fun findAll(): ResponseData<*> {
        return ResponseData(roleRepository.findAll())
    }

    override fun findOne(id: String): ResponseData<*> {
        val role = roleRepository.findOne(id)?: return ResponseData<Objects>(status = "Update Failed",message = "ID Not Found")

        return ResponseData(role)
    }

    override fun delete(id: String): ResponseData<*> {
        val role = roleRepository.findOne(id)?: return ResponseData<Objects>(status = "Update Failed",message = "ID Not Found")

        roleRepository.delete(id)

        return ResponseData(role)
    }
}