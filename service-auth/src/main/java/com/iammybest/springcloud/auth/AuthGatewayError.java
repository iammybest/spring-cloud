package com.iammybest.springcloud.auth;

import com.timanetworks.tsf.core.exception.IError;

public enum AuthGatewayError implements IError {

    UNKNOWN_TOKEN_ERROR("4400", "unknown token authentication error"),
    TOKEN_NOT_FOND("4401", "token not found"),
    TOKEN_AUTH_FAILED("4402", "authenticate token failed"),
    REQUEST_PATH_INVALID("4403", "request path is invalid"),
    REQUEST_PARAMETER_INVALID("4404", "request parameter is invalid"),
    APPKEY_PARAMETER_NOT_FOUND("4405", "request parameter appkey not found"),
    SIGNATURE_VALIDATION_FAILED("4406", "The signature validate failed"),
    SIGNATURE_INVALID("4407", "The signature is invalid"),
    UNKNOWN_APPKEY_ERROR("4408", "unknown appkey check error"),
    API_GATEWAY_ERROR("4409", "api gateway Error");



    String errorCode;

    String errorMessage;

    AuthGatewayError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getNamespace() {
        return "API.GATEWAY";
    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
