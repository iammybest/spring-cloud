package com.iammybest.springcloud.internal;

import java.io.Serializable;

/**
 * @DESCRIBE:
 * @TIME: 2020/4/22 10:17
 * @AUTHOR: qinghai.deng
 **/
public class CdpResponse implements Serializable {
    private static final long serialVersionUID = -136831721829917274L;
    private Status returnStatus;
    private String errorCode;
    private String errorMessage;
    private String extMessage;

    public static enum Status {
        SUCCEED,
        FAILED;

        private Status() {
        }
    }

    public Status getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Status returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getExtMessage() {
        return extMessage;
    }

    public void setExtMessage(String extMessage) {
        this.extMessage = extMessage;
    }
}
