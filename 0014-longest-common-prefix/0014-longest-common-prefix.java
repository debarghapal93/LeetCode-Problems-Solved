class Solution {
    public String longestCommonPrefix(String[] strs) {
        String comm = strs[0];
        for (int i = 0; i < strs.length; i++){
            while (strs[i].indexOf(comm) != 0){
                comm = comm.substring(0, comm.length() - 1);
                if (comm.isEmpty()) return "";
            }
        }
        return comm;
    }
}