package com.ciazhar.accountservice.service.impl

import com.ciazhar.accountservice.config.string.ErrorMessage
import com.ciazhar.accountservice.model.dto.request.PermissionForm
import com.ciazhar.accountservice.model.dto.response.ResponseData
import com.ciazhar.accountservice.model.jpa.Permission
import com.ciazhar.accountservice.model.jpa.User
import com.ciazhar.accountservice.repository.PermissionRepository
import com.ciazhar.accountservice.repository.RoleRepository
import com.ciazhar.accountservice.service.PermissionService
import org.springframework.stereotype.Service
import java.util.*

@Service
class PermissionServiceImpl (private val permissionRepository: PermissionRepository,
                             private val roleRepository: RoleRepository
                             ): PermissionService {
    override fun save(form: PermissionForm): ResponseData<*> {
        if(form.id!=null&&permissionRepository.findOne(form.id)==null){
            return ResponseData<Objects>(status = "Update Failed",message = "ID Not Found")
        }
        val role = roleRepository.findOne(form.id_role)
        val permission = Permission(id = form.id,
                        id_role = role,
                        nama = form.nama,
                        label = form.label
                )

        return ResponseData(permissionRepository.save(permission))
    }

    override fun findAll(): ResponseData<*> {
        return ResponseData(permissionRepository.findAll())
    }

    override fun findOne(id: String): ResponseData<*> {
        val permission = permissionRepository.findOne(id) ?: return ResponseData<Objects>(status = "Update Failed",message = "ID Not Found")

        return ResponseData(permission)
    }

    override fun delete(id: String): ResponseData<*> {
        val role = permissionRepository.findOne(id) ?: return ResponseData<Objects>(status = "Update Failed",message = "ID Not Found")

        permissionRepository.delete(id)

        return ResponseData(role)
    }
}