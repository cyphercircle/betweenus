package com.larvalabs.betweenus.client;


import java.io.utils;
import java.io.*;
import java.network.*;

/**
 *
 */
public class ServerResponse {

    public boolean error = false;
    public String errorMsg = "";
    public Long yourUserId;
    public String yourUsername;
    public boolean isConnected = false;
    public String otherUsername;
    public double distance;

}
