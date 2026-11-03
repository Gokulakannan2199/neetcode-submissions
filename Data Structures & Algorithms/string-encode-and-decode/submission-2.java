class Solution {

    public String encode(List<String> strs) {
        String str = new String();
        int dig;

        for(String s : strs) {
            if(s.length() >= 100) dig = 3;
            else if(s.length() < 100 && s.length() >= 10) dig = 2; 
            else dig = 1;
            str = str + dig + "" + s.length() + s;
        }

        return str;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        
        int offset; int ind = 0; int digit; 
        
        while(ind < str.length()) {
            digit = Integer.valueOf(str.substring(ind, ind + 1));
            ind++;
            offset = Integer.valueOf(str.substring(ind, ind + digit));
            strs.add(str.substring(ind + digit, ind + digit + offset));
            ind += digit + offset;
        } 

        return strs;
    }
}
