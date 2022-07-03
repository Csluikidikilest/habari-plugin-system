package org.qazima.habari.pluginsystem.library;

import org.apache.http.HttpStatus;

public class Content {
    private int statusCode = HttpStatus.SC_OK;
    private String type = "text/plain";
    private byte[] body;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
