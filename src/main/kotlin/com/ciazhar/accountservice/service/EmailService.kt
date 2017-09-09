package com.ciazhar.accountservice.service

import com.ciazhar.accountservice.model.dto.request.RegisterForm
import com.ciazhar.accountservice.util.email.EmailStatus

interface EmailService {

    fun sendEmail(form: RegisterForm): EmailStatus
}