import java.util.List;

public class PatternRule {
    public static List<Object> personName(String inStr, Boolean ignoreBlank){
        return new MainRule.RuleBuilder(inStr).isIgnore(ignoreBlank).build().GetResultMap();
    }

}
