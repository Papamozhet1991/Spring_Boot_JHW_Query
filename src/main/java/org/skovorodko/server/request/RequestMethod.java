package org.skovorodko.server.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.skovorodko.exceptions.RequestMethodException;

@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
public enum RequestMethod {
    GET("GET"),
    POST("POST");

    private final String method;

    public static RequestMethod getRequestMethodByString(String method) throws RequestMethodException {
        RequestMethod requestMethod;

        switch (method) {
            case "GET":
                requestMethod = RequestMethod.GET;
                break;

            case "POST":
                requestMethod = RequestMethod.POST;
                break;

            default:
                throw new RequestMethodException("Unknown method!");
        }

        return requestMethod;
    }
}