package jp.co.project.planets.marsfour.core.exception;

import jp.co.project.planets.marsfour.core.enums.Code;

/**
 * base exception
 */
public abstract class BaseException extends RuntimeException {

    /** HTTPステータス */
    private final int httpStatus;

    /** エラーコード */
    private final Code errorCode;

    /** エラーメッセージキーの引数 */
    private final String[] messageKeyArgs;

    /**
     * new instance exception
     *
     * @param httpStatus
     *            http status
     * @param errorCode
     *            error code
     * @param messageKeyArgs
     *            message key args
     */
    protected BaseException(final int httpStatus, final Code errorCode, final String[] messageKeyArgs) {
        this(null, null, httpStatus, errorCode, messageKeyArgs);
    }

    /**
     * new instance exception
     *
     * @param message
     *            exception detail message
     * @param httpStatus
     *            http status
     * @param errorCode
     *            error code
     * @param messageKeyArgs
     *            message key args
     */
    protected BaseException(final String message, final int httpStatus, final Code errorCode,
                            final String[] messageKeyArgs) {
        this(message, null, httpStatus, errorCode, messageKeyArgs);
    }

    /**
     * new instance exception
     *
     * @param message
     *            exception detail message
     * @param cause
     *            cause
     * @param httpStatus
     *            http status
     * @param errorCode
     *            error code
     * @param messageKeyArgs
     *            message key args
     */
    protected BaseException(final String message, final Throwable cause, final int httpStatus,
                            final Code errorCode, final String[] messageKeyArgs) {
        super(message, cause);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.messageKeyArgs = messageKeyArgs;
    }

    /**
     * get http status
     *
     * @return http status
     */
    public int getHttpStatus() {
        return httpStatus;
    }

    /**
     * get error code
     *
     * @return error code
     */
    public Code getErrorCode() {
        return errorCode;
    }

    /**
     * message key args
     *
     * @return args
     */
    public String[] getMessageKeyArgs() {
        return messageKeyArgs;
    }
}
