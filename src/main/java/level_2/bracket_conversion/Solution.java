package level_2.bracket_conversion;

public class Solution {

    StringBuilder sb = new StringBuilder();

    public String solution(String p) {
        return setConversionBracket(p);
    }

    private String setConversionBracket(String bracket) {
        String[] uv = splitBracket(bracket);

        if(checkBracket(uv[0])) {
            sb.append(uv[0]);
        }
        else {
            sb.append("(");
            if(!uv[1].isEmpty()) {
                setConversionBracket(uv[1]);
                uv[1] = "";
            }
            sb.append(")");
            sb.append(setValidBracket(uv[0]));
        }

        if(!uv[1].isEmpty()) {
            setConversionBracket(uv[1]);
        }

        return sb.toString();
    }

    private String[] splitBracket(String bracket) {
        StringBuilder u = new StringBuilder();
        String v = "";
        int count = 0;
        String[] splitArray = bracket.split("");
        for(int i = 0; i < splitArray.length; i++) {
            count = splitArray[i].equals("(") ? count + 1 : count - 1;
            u.append(splitArray[i]);

            if(count == 0) {    // 균형잡힌 괄호 문자열 (혹은 올바른 괄호 문자열이 만들어짐)
                v = bracket.substring(i + 1); // 나머지를 v 에 넣는다.
                break;
            }
        }
        return new String[] { u.toString(), v};
    }

    private boolean checkBracket(String bracket) {
        int count = 0;
        for(String s : bracket.split("")) {
            count = s.equals("(") ? count + 1 : count - 1;
            if(count < 0)
                return false;
        }

        return true;
    }

    private String setValidBracket(String bracket) {
        String[] splitArray = bracket.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < splitArray.length - 1; i++) {
            sb.append(splitArray[i].equals("(") ? ")" : "(");
        }
        return sb.toString();
    }
}
