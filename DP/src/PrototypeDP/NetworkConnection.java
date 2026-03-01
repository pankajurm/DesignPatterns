package PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{ //cloneable interface se btaya ja sakte hai ki ye class ab clone ki ja sakti hai
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadData() throws InterruptedException {
        this.data = "Very Very imp data";
        domains.add("www.pankajlearn.com");
        domains.add("www.rahullearn.com");
        domains.add("www.devlearn.com");
        domains.add("www.google.com");
        Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domain '" + domains +  '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //logic for deep cloning
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());
        for (String d:this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}
