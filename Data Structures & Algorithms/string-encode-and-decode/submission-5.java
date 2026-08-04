class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length()); // how many chars to read
            sb.append("#");          // separator between length and content
            sb.append(str);          // the actual string
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while(i < s.length()) {
            // find the # to get the length prefix
            int j = i;
            while(s.charAt(j) != '#') j++;

            // parse the length
            int len = Integer.parseInt(s.substring(i, j));

            // extract exactly len characters after the #
            String word = s.substring(j + 1, j + 1 + len);
            list.add(word);

            // move i to start of next encoded string
            i = j + 1 + len;
        }

        return list;
    }
}