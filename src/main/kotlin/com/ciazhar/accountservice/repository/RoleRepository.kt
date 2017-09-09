package com.ciazhar.accountservice.repository

import com.ciazhar.accountservice.model.jpa.Role
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by ciazhar on 6/23/17.
 */
interface RoleRepository : PagingAndSortingRepository<Role, String>{
    fun findByNama(nama : String) : Role
}
