package com.antra.report.client.exception;


public class ReportException extends RuntimeException {

        private Integer code;

        public ReportException(String message, Integer code) {
            super(message);
            this.code = code;
        }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
        public String toString() {
            return "ReportException{" +
                    "code=" + code +
                    ", message="+this.getMessage()+
                    '}';
        }


}
