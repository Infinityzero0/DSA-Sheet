import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
  if ("Integer".equals(type)) {
        return 4;
    } else if ("Long".equals(type)) {
        return 8;
    } else if ("Float".equals(type)) {
        return 4;
    } else if ("Double".equals(type)) {
        return 8;
    }
    return 1;
    
    }
}
