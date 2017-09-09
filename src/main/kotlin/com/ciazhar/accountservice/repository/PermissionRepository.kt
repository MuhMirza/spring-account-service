package com.ciazhar.accountservice.repository

import com.ciazhar.accountservice.model.jpa.Permission
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by ciazhar on 6/23/17.
 */

interface PermissionRepository : PagingAndSortingRepository<Permission, String>
