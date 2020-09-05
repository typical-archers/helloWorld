package property;

import java.util.*;

public class Solution {


    public boolean isValid(String s) {
        boolean result = true;
        HashMap<String, String> codeMap = new HashMap<>();

        codeMap.put("(", ")");
        codeMap.put("[", "]");
        codeMap.put("{", "}");
        //Set<String> keys = codeMap.keySet();
        Iterator iterator = codeMap.entrySet().iterator();

        char[] codeArray = s.toCharArray();


        for (int i = 0; i < codeArray.length; i++) {
            if (i % 2 == 0) {
                boolean isFindKey = false;
                int count = 0;
                while (iterator.hasNext()) {

                    //System.out.println(iterator.next());//这里如果使用了一次之后，下一次就从【】开始了
                    //System.out.println(String.valueOf(codeArray[i]));
                    //System.out.println(iterator.next().toString().equals(String.valueOf(codeArray[i])));

                    Map.Entry entry = (java.util.Map.Entry) iterator.next();
                    if (entry.getKey().equals(String.valueOf(codeArray[i]))) {
                        isFindKey = true;
                        if (!entry.getValue().equals(String.valueOf(codeArray[i + 1]))) {
                            result = false;
                            break;
                        }
                        if (isFindKey) {
                            break;
                        }

                    }
                    count++;
                    if (count == 3) {
                        if (!isFindKey) {
                            System.out.println("没有在map中找到key");
                            result = false;
                        }
                    }
                }
                if (!isFindKey) {
                    break;
                }
            }
        }

        return result;
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean isValid1(String s) {

        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }


}
