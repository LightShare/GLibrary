package com.light.libary.exception;

/**
 * Created by 11449 on 2018/5/11.
 */

public class InitializationException extends  RuntimeException {
    public static final String INITIALIZATION = "initialization ";
    public InitializationException(String detailMessage) {
        super(INITIALIZATION + detailMessage);
    }
    /**
     * kuaifazs initialization exception constructor
     *
     * @param detailMessage {@link String}
     * @param throwable     {@link Throwable}
     */
    public InitializationException(String detailMessage, Throwable throwable) {
        super(INITIALIZATION + detailMessage, throwable);
    }
    /**
     * kuaifazs initialization exception constructor
     *
     * @param throwable {@link Throwable}
     */
    public InitializationException(Throwable throwable) {
        super(throwable);
    }

}
