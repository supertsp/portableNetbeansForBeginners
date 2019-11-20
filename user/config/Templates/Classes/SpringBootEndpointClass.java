<#if package?? && package != "">
package ${package};
</#if>

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
// </editor-fold>

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
@RestController
@RequestMapping("/api/v1/API-NAME")
public class ${name} {
	
	// <editor-fold defaultstate="collapsed" desc="fields...">
	@Autowired
	private ObjectRepository objectRepository;
	// </editor-fold>
	
	// <editor-fold defaultstate="collapsed" desc="constructors...">

	// </editor-fold>

	// <editor-fold desc="CREATE methods..." defaultstate="collapsed">
	@PostMapping("/endpointURL/{object}")
	public ResponseEntity<Object> createOneObject(@RequestBody Object newObject) {		
		return ResponseEntity.status(HttpStatus.OK).body(newObject);
	}
	
	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="UPDATE methods...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="DELETE methods...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="SEARCH methods...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="CHECK methods...">

	// </editor-fold>

	// <editor-fold desc="AUTHENTICATION methods..." defaultstate="collapsed">
	
	// </editor-fold>

}//class
