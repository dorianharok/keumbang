package com.wanted.authserver.support

import org.springframework.http.HttpStatus

open class AuthException(val httpStatus: HttpStatus, errorCode: AuthErrorCode) : RuntimeException(errorCode.defaultMessage) {
    override val message: String = errorCode.defaultMessage
}