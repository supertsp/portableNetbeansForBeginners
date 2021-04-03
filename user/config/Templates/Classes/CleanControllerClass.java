<#if package?? && package != "">
package ${package};
</#if>

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

	@Autowired
	private ObjectRepository objectRepository;

	@GetMapping("/")
	public ResponseEntity<List<Object>> getAllObjects() {		
		return ResponseEntity.status(HttpStatus.OK).body(new ArrayList<>());
	}

	@PostMapping("/endpointURL/{object}")
	public ResponseEntity<Object> createOneObject(@RequestBody Object newObject) {		
		return ResponseEntity.status(HttpStatus.OK).body(newObject);
	}

}