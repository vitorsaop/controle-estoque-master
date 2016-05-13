/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.engenharia.software.controle.estoque.base.entity;

/**
 *
 * @author Vitor
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import projeto.engenharia.software.controle.estoque.base.entity.MaterialCategory;
import projeto.engenharia.software.controle.estoque.base.entity.MeasuringUnit;

@Entity
@Table(name = "Material")
public class Material extends Item {

    @NotNull
    private MaterialCategory materialCategory;
    
    @NotNull
    @Size(max = 50)
    private String description;
    
    @NotNull
    private MeasuringUnit measuringUnit;

    public MaterialCategory getMaterialCategory() {
        return materialCategory;
    }

    public void setMaterialCategory(MaterialCategory materialCategory) {
        this.materialCategory = materialCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MeasuringUnit getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(MeasuringUnit measuringUnit) {
        this.measuringUnit = measuringUnit;
    }
    
    

}
