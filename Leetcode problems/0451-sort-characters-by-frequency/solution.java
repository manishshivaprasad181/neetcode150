class Solution {
    public String frequencySort(String s) {
        if(s==null||s.isEmpty())
            return s;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        List<String> charString = new ArrayList<>();
        StringBuilder currentString = new StringBuilder();
        currentString.append(chars[0]);
        for(int i =1;i<chars.length;i++) {
            if(chars[i]!=chars[i-1]) {
                charString.add(currentString.toString());
                currentString = new StringBuilder();
            }
            currentString.append(chars[i]);
        }
        charString.add(currentString.toString());

        Collections.sort(charString, (a,b)->b.length()-a.length());

        StringBuilder sb = new StringBuilder();
        for(String str:charString)
            sb.append(str);
        return sb.toString();
    }
}
