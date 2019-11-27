public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String  sen1 = str1.trim();
        String sen2 = str2.trim();
        String sen3 = sen1.concat(sen2);
        return sen3;
    }
    public Integer getIndexOrNull(String str1, char letter){
        int idx = str1.indexOf((letter));
        if (idx==-1){
            return null;
        }
        return idx;
        
    }
    public Integer getIndexOrNull(String str1, String subs){
        int idx = str1.indexOf(subs);
        if (idx== -1){
            return null;
        }
        return idx;
    }
    public String concatSubstring(String str1, int num1, int num2, String str2){
        String str = str1.substring(num1,num2);
        String str3 = str.concat(str2);

        return str3;
    }
}

