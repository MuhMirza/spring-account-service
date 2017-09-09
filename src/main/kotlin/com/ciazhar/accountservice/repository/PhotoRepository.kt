package com.ciazhar.accountservice.repository

import com.ciazhar.accountservice.model.jpa.Photo
import org.springframework.data.repository.PagingAndSortingRepository

import java.util.Date

/**
 * Created by ciazhar on 6/21/17.
 */

interface PhotoRepository : PagingAndSortingRepository<Photo, String> {
    fun findByAccountIdAndCreatedDate(accountId: String, createdDate: Date): Photo
}
