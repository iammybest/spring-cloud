package com.iammybest.springcloud.internal;

/**
 * @DESCRIBE:
 * @TIME: 2020/4/24 14:31
 * @AUTHOR: qinghai.deng
 **/
public interface IError {
    String getNamespace();

    String getErrorCode();

    String getErrorMessage();
}
