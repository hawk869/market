package com.danielcepeda.market1.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

//    esta anotacion se usa para relacionat un id compuesto many to many
    @EmbeddedId
    private ComprasProductoPK id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;
//  @MapsId idCompra es el la clave primaria que queremos incluir en este campo de la tabla
    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra",insertable = false,updatable = false)
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "id_producto",insertable = false,updatable = false)
    private Producto producto;
	public Object setCompra(Compra compra2) {
		// TODO Auto-generated method stub
		return null;
	}
}
