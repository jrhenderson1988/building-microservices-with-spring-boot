package com.github.jrhenderson1988.orderservice;

import org.springframework.core.env.Environment;

public class ResponseWrapper<T> {
    private final Integer port;
    private final T data;

    public ResponseWrapper(final Environment environment, final T data) {
        String serverPort = environment.getProperty("server.port");
        this.port = serverPort != null ? Integer.parseInt(serverPort) : null;
        this.data = data;
    }

    public Integer getPort() {
        return port;
    }

    public T getData() {
        return data;
    }
}
