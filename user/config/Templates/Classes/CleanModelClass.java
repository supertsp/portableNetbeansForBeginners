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

	@Id @GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id${name};
	
	@Column(name = "name", length = 30, unique = true, nullable = false)
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy = "otherObjectFK", cascade = CascadeType.ALL)
	private List<String> listOfStrings;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "idObject")
	private Object object;

}
