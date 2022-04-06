package org.ac;

public class MyPojo {

    private String ip;
    private String hostname;
    private boolean anyCast;
    private String city;
    private String region;
    private String country;
    private String loc;
    private String org;
    private String postal;
    private String timeZone;
    private String readeMe;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public boolean isAnyCast() {
        return anyCast;
    }

    public void setAnyCast(boolean anyCast) {
        this.anyCast = anyCast;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getReadeMe() {
        return readeMe;
    }

    public void setReadeMe(String readeMe) {
        this.readeMe = readeMe;
    }

    @Override
    public String toString() {
        return "MyPojo{" +
                "ip='" + ip + '\'' +
                ", hostname='" + hostname + '\'' +
                ", anyCast=" + anyCast +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", loc='" + loc + '\'' +
                ", org='" + org + '\'' +
                ", postal='" + postal + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", readeMe='" + readeMe + '\'' +
                '}';
    }
}
