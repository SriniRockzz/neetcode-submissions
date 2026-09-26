class Solution {

    public String encode(List<String> strs) {
        StringBuilder  ghj = new StringBuilder();
        for(String str : strs)
        {
            ghj.append(str).append('`');
        }
        return ghj.toString();
    }

    public List<String> decode(String str) {
        char[] a = str.toCharArray();
        List<String> strs = new ArrayList<>();


        StringBuilder stdf = new StringBuilder();
        String b = "";
        for (int i =0;i<a.length;i++)
        {
            if(a[i] == '`')
            {
                strs.add(stdf.toString());
                stdf.setLength(0);
                continue;
            }
            stdf.append(a[i]);

        }
        return strs;
    }
}
