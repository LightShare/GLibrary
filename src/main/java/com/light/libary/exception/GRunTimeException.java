package com.light.libary.exception;

/**
 * Created by 11449 on 2018/5/11.
 */

public class GRunTimeException extends  RuntimeException {

    private static final String G_RUNTIME_EXCEPTION = "lightEasyCar runtime exception ";

    /**
     * kuaifazs runtime exception constructor
     *
     * @param detailMessage {@link String}
     */
    public GRunTimeException(String detailMessage) {
        super(G_RUNTIME_EXCEPTION + detailMessage);
    }

    /**
     * kuaifazs runtime exception constructor
     *
     * @param detailMessage {@link String}
     * @param throwable     {@link Throwable}
     */
    public GRunTimeException(String detailMessage, Throwable throwable) {
        super(G_RUNTIME_EXCEPTION + detailMessage, throwable);
    }

    /**
     * kuaifazs runtime exception constructor
     *
     * @param throwable {@link Throwable}
     */
    public GRunTimeException(Throwable throwable) {
        super(throwable);
    }

}
