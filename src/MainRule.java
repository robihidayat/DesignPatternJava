import java.util.*;

public class MainRule {
    private final Object DataResult;
    private final Object OriginalData;


    public MainRule(RuleBuilder builder){
        this.DataResult = builder.DataResult;
        this.OriginalData = builder.OriginalData;
    }

    public String GetRelustString(){
        return this.DataResult.toString();
    }

    public String GetOriginal(){
        return this.OriginalData.toString();
    }

    public List<Object> GetResultMap(){
        final List<Object> outList = new ArrayList<Object>();
        outList.add(this.OriginalData);
        outList.add(this.DataResult);
        return outList;
    }

    public static class RuleBuilder{
    private final Object OriginalData;
    private final Object DataResult;
    private Boolean Flag;

    public RuleBuilder(Object field, String format){

        this.DataResult = field;
        this.OriginalData = field;
        this.Flag = false;
    }

    public RuleBuilder(Object field){
        this(field, "yyyy-MM-DD");
    }

    public MainRule build(){
        final MainRule mainRuleCore = new MainRule(this);
        return mainRuleCore;
    }

    public RuleBuilder isIgnore(Boolean condition){
        if(condition){
            this.Flag = true;
        }
        return this;
    }



    }
}
