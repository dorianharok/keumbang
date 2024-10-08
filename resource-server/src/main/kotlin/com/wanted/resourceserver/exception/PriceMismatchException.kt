package com.wanted.resourceserver.exception

import org.springframework.http.HttpStatus

class PriceMismatchException(
    val extra: String
): CoreException(HttpStatus.BAD_REQUEST, ErrorCode.PRICE_MISMATCH) {
    override val message: String
        get() = super.message + extra
}