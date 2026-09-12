class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>(); 
        int i = 0;
        while(i<str.length()){
            int del = str.indexOf('#',i);
            int start = del+1;
            int len = Integer.parseInt(str.substring(i,del));
            int end = start+len;
            i = end;
            strList.add(str.substring(start,end));
        }
        return strList;
    }
}
