package com.ciazhar.accountservice.service.impl

import com.ciazhar.accountservice.model.dto.request.RegisterForm
import com.ciazhar.accountservice.repository.UserRepository
import com.ciazhar.accountservice.service.EmailService
import com.ciazhar.accountservice.util.email.EmailHtmlSender
import com.ciazhar.accountservice.util.email.EmailStatus
import org.springframework.stereotype.Service
import org.thymeleaf.context.Context

@Service
class EmailServiceImpl (private val emailHtmlSender: EmailHtmlSender,
                        private val userRepository: UserRepository
                        ): EmailService {

    override fun sendEmail(form: RegisterForm): EmailStatus {
        val context = Context()
        context.setVariable("title", "Email Verification")
        context.setVariable("description", "To Verify your account please click link below ")
        context.setVariable("a", userRepository.findByEmail(form.email).id)

        return emailHtmlSender.send(form.email, "Email Verification", "mail", context)
    }
}