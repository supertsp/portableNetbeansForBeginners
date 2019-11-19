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
@Entity
@Table(name = "${name}")
public class ${name} {
	
	// <editor-fold defaultstate="collapsed" desc="Database fields...">
	@Id
	@GeneratedValue
	@Column(name = "id${name}")
	private Long id${name};
	
	@Column(name = "name", length = 30, unique = true, nullable = false)
	private String name;
	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="Relationships fields...">
	@JsonIgnore
	@OneToMany(mappedBy = "testeFK")
	private List<String> listOfStrings;
	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="constants fields...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="constructors...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="methods...">

	// <editor-fold defaultstate="collapsed" desc="getter and setter methods...">

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="override methods...">

	// </editor-fold>    

	// <editor-fold defaultstate="collapsed" desc="main methods...">

	// </editor-fold>

	// </editor-fold>

}//class
