/**
 *
 * @author Vitor
 */

package projeto.engenharia.software.controle.estoque.as.impl;

import projeto.engenharia.software.controle.estoque.base.entity.IEntityBase;
import projeto.engenharia.software.controle.estoque.base.entity.as.iface.IGenericAS;
import projeto.engenharia.software.controle.estoque.base.entity.dao.iface.IGenericDAO;

public abstract class GenericsAS<T> implements IGenericAS<T>{
    
    
    public abstract IGenericDAO<T> getDAO() throws Exception;
    
    @Override
    public T save(T entity) throws Exception{
        
        if (((IEntityBase)entity).getId() == null) {
            getDAO().insert(entity);
        }else{
            entity = getDAO().update(entity);
        }
        
        return entity;
    }
    
}
