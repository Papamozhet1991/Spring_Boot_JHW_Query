package org.skovorodko.server.handlers;

import org.skovorodko.server.request.Request;

import java.io.BufferedOutputStream;

public interface Handler {
    void handle(Request request, BufferedOutputStream responseStream);
}