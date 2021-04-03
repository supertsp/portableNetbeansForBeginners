<#if package?? && package != "">
package ${package};
</#if>

import java.util.List;
import java.util.ArrayList;

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author ${user}, ${date}, ${time}
 * Last update: -
 */// </editor-fold>
public class ${name} {

    public static ${name} getInstance() {
        return ${name}Holder.INSTANCE;
    }
    
    private ${name}() {
        
    }
    
    private static class ${name}Holder {
        private static final ${name} INSTANCE = new ${name}();
    }
    
}
