<#if package?? && package != "">
package ${package};
</#if>

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
public interface ${name} extends CrudRepository<Object, Long> {

/**
 * TIPS:
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
 */

	@Query("SELECT o FROM Object o ORDER BY o.field DESC")
	public List<Object> findAllOrderByField();

}//interface
