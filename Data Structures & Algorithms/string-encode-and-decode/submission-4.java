class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str);
            sb.append("/ /");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        String[] strs = str.split("/ /");
        List<String> list = new ArrayList<>();
        for(String word : strs) {
            list.add(word);
        }
        if(list.size() == 0) list.add("");
        return list;
    }
}
