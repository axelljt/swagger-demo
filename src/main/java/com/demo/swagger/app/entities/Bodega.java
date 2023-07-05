package com.demo.swagger.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bodegas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bodega implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_bodega;
	@Column(name="nombre_bodega")
	private String nombreBodega;
	@Column(name="ubicacion_bodega")
	private String ubicacionBodega;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
