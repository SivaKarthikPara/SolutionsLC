import java.util.regex.*;
class Solution {
    public String validIPAddress(String queryIP) {
        String ip4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        String ip4regex = ip4+"\\."+ip4+"\\."+ip4+"\\."+ip4;
        String ip6 = "[0-9a-fA-F]{1,4}";
        String ip6regex = ip6+":"+ip6+":"+ip6+":"+ip6+":"+ip6+":"+ip6+":"+ip6+":"+ip6;
        Pattern ipV4 = Pattern.compile("^"+ip4regex+"$");
        Pattern ipV6 = Pattern.compile("^"+ip6regex+"$");
        Matcher m1 = ipV4.matcher(queryIP);
        Matcher m2 = ipV6.matcher(queryIP);
        if(m1.find()){
            return "IPv4";
        }
        else if(m2.find()){
            // System.out.println(m2.group());
            return "IPv6";
        }
        else
            return "Neither";
        
        // if(queryIP.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))return "IPv4";
        // if(queryIP.matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})"))return "IPv6";
        // return "Neither";
    }
}