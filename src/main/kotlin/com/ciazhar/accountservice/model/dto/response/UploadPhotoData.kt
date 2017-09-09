package com.ciazhar.accountservice.model.dto.response

import javax.validation.constraints.NotNull

/**
 * Created by mirza on 11/12/16.
 */
class UploadPhotoData (

        @field:NotNull
        var id: String,

        @field:NotNull
        var url: String
)
