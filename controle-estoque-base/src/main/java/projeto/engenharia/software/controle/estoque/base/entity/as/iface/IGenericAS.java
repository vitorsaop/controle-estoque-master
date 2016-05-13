/**
 *
 * @author Vitor
 */

package projeto.engenharia.software.controle.estoque.base.entity.as.iface;

import projeto.engenharia.software.controle.estoque.base.entity.*;

public interface IGenericAS<T> {

    T save(T entity) throws Exception;

    //T insert(T entity) throws Exception;

    //T update(T entity) throws Exception;
    
    void remove(T entity) throws Exception;

    T get(Class<T> clazz, Long id) throws Exception;
    
}
