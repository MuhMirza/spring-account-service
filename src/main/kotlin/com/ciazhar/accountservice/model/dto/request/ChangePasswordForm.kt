package com.ciazhar.accountservice.model.dto.request

import javax.validation.constraints.NotNull

/**
 * Created by ciazhar on 6/21/17.
 */
class ChangePasswordForm (

        @field:NotNull
        var id: String?=null,

        @field:NotNull
        var oldPassword: String?=null,

        @field:NotNull
        var newPassword: String?=null
)
