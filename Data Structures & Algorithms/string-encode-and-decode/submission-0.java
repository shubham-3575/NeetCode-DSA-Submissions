class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' ')
                    sb.append("#");
                else
                    sb.append(str.charAt(i)-'a');
                sb.append(",");
            }
            sb.append("/");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>(); 
        String encoded[] = str.split("/",-1);
        for(int i=0;i<encoded.length-1;i++){
            String s = encoded[i];
            StringBuilder sb = new StringBuilder();
            if(!s.isEmpty()){
                String tokens[] = s.split(",");
                for(String token : tokens){
                    if(token.equals("#"))
                        sb.append(" ");
                    else{
                        int val = Integer.parseInt(token);
                        sb.append((char)('a'+val));
                    }
                }
            }
            strList.add(sb.toString());
        }
        return strList;
    }
}
