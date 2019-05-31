<#if package?? && package != "">
package ${package};
</#if>

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author ${user}, ${date}, ${time}
 */// </editor-fold>
public class ${name} {
    
    //<editor-fold defaultstate="collapsed" desc="attributes...">
    
    //    <editor-fold defaultstate="collapsed" desc="main attributes...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="constants attributes...">
    
    //    </editor-fold>

    //    <editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    
    //    </editor-fold>
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="getInstance(), private constructor and private static nested class...">
    public static ${name} getInstance() {
        return ${name}Holder.INSTANCE;
    }
    
    private ${name}() {
        
    }
    
    private static class ${name}Holder {
        private static final ${name} INSTANCE = new ${name}();
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="methods...">
    
    //    <editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="override methods...">
    
    //    </editor-fold>    
    
    //    <editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="static methods...">
    
    //    </editor-fold>
    
    //    <editor-fold defaultstate="collapsed" desc="main methods...">
    
    //    </editor-fold>
    
    //</editor-fold>
    
 }
