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
 */// </editor-fold>
public class ${name} extends Exception {
	
	/**
	 * Creates a new instance of <code>${name}</code> without detail message.
	 */
	public ${name}() {
		
	}


	/**
	 * Constructs an instance of <code>${name}</code> with the specified detail message.
	 * @param msg the detail message.
	 */
	public ${name}(String msg) {
		super(msg);
	}

}//class
