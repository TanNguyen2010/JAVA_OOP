package lesson06;

public class CheckUrl {
    public static void main(String[] args) {
        String url = "https://google.com";

        String[] splitUrl = url.split(":");
        String protocolString = splitUrl[0];
        String domainString = url.substring(url.length()-4,url.length());

        if (protocolString.equals("http")){
            System.out.println("Protocol is http");
        } else if (protocolString.equals("https")){
            System.out.println("Protocol is https");
        } else {
            System.out.println("Protocol is not https or http");
        }


        if (domainString.equals(".net")){
            System.out.println("Domain is .net");
        } else if (domainString.equals(".com")){
            System.out.println("Domain is .com");
        } else{
            System.out.println("Domain is not .net or .com");
        }
    }
}
