package com.ciazhar.accountservice.model.dto.request

import javax.validation.constraints.NotNull

class ChangePhoneForm (

    @field:NotNull
    var id: String? = null,

    @field:NotNull
    var phone: String? = null

)