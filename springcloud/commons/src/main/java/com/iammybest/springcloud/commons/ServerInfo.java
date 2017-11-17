package com.iammybest.springcloud.commons;

import java.util.Date;

/**
 * @author 邓清海
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: TODO
 * @date 2017/11/17
 * @Time 18:18
 */
public class ServerInfo {
    Integer port;
    String serverName;
    String des;
    Date requestTime;
    Date responseTime;
    String version;

    public ServerInfo() {
    }

    public ServerInfo(Integer port, String serverName) {
        this.port = port;
        this.serverName = serverName;
    }

    public Integer getPort() {
        return port;
    }

    public ServerInfo setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getServerName() {
        return serverName;
    }

    public ServerInfo setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    public String getDes() {
        return des;
    }

    public ServerInfo setDes(String des) {
        this.des = des;
        return this;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public ServerInfo setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    public Date getResponseTime() {
        return responseTime;
    }

    public ServerInfo setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ServerInfo setVersion(String version) {
        this.version = version;
        return this;
    }
}
