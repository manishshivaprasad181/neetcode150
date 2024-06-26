public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for(String str:strs) {
            encodedString.append(str);
            encodedString.append("π");
        }
        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String[] decodedString = s.split("π",-1);
        return new ArrayList(Arrays.asList(decodedString).subList(0, decodedString.length-1));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
