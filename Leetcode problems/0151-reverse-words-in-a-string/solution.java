class Solution {
    public String reverseWords(String s) {
    int left = 0;
    int right = s.length()-1;

    while(left<=right && s.charAt(left)==' ') ++left;

    while(left<=right && s.charAt(right) == ' ') --right;

    StringBuilder word = new StringBuilder();
    Deque<String> d = new ArrayDeque();

    while(left<=right) {
        char c = s.charAt(left);

        if(word.length()!=0 && c==' ') {
            d.offerFirst(word.toString());
            word.setLength(0);
        } else if(c!=' ') {
            word.append(c);
        }
        ++left;
    }
    d.offerFirst(word.toString());
    return String.join(" ", d);

    }
}
