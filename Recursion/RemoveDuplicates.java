public class RemoveDuplicates {
    static void removed(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char carchar = str.charAt(idx);
        if(map[carchar - 'a'] == true){
            removed(str, idx+1, newstr, map);
        }
        else{
            map[carchar-'a'] = true;
            removed(str, idx+1, newstr.append(carchar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnaCollege";
        removed(str, 0, new StringBuilder("") , new boolean[26]);
    }
}
