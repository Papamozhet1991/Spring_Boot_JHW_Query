package org.skovorodko.server.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.skovorodko.server.handlers.Handler;

import java.util.concurrent.ConcurrentHashMap;

@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
public class RequestHandlers {

    private volatile ConcurrentHashMap<String, Handler> handlerGETRequests = new ConcurrentHashMap<>();
    private volatile ConcurrentHashMap<String, Handler> handlerPOSTRequests = new ConcurrentHashMap<>();

    // TODO currently not available
    //    private volatile ConcurrentHashMap<String, Handler> handlerPUTRequests = new ConcurrentHashMap<>();
    //    private volatile ConcurrentHashMap<String, Handler> handlerDELETERequests = new ConcurrentHashMap<>();

}