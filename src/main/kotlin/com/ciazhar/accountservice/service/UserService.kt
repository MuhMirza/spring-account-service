package com.ciazhar.accountservice.service

import com.ciazhar.accountservice.model.dto.request.*
import com.ciazhar.accountservice.model.dto.response.ResponseData
import com.ciazhar.accountservice.model.dto.response.UploadPhotoData
import com.ciazhar.accountservice.model.dto.response.UserData
import com.ciazhar.accountservice.model.exception.AlreadyInUseException
import com.ciazhar.accountservice.model.exception.AuthException
import org.springframework.data.domain.Pageable
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.Authentication
import org.springframework.ui.Model
import org.springframework.web.multipart.MultipartFile

import javax.servlet.http.HttpServletRequest

/**
 * Created by ciazhar on 6/21/17.
 */


interface UserService {

    fun register(form: RegisterForm) : ResponseData<*>

    fun activate(id : String, model : Model):String

    fun current(authentication : Authentication) : ResponseData<*>

    fun findAll(page : Pageable) : ResponseData<*>

    fun findOne(id : String) : ResponseData<*>

    fun updateProfile(form: ProfileForm): ResponseData<*>

    fun changePassword(form: ChangePasswordForm) : ResponseData<*>

    fun changeUsername(form: ChangeUsernameForm) : ResponseData<*>

    fun changeEmail(form: ChangeEmailForm) : ResponseData<*>

    fun changeBirthdate(form: ChangeBirthDateForm) : ResponseData<*>

    fun changePhone(form: ChangePhoneForm) : ResponseData<*>

    fun changeRole(form: ChangeRoleForm) : ResponseData<*>

//    fun uploadAvatar(request: HttpServletRequest, id: String, photo: MultipartFile): UploadPhotoData

    fun delete(id : String) : ResponseData<*>
}
