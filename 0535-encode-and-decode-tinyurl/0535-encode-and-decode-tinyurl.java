public class Codec {
    
    String url;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        url = longUrl;
        return url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return url;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));