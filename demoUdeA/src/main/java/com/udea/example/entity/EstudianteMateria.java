package com.udea.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A Estudiante.
 */
@Entity
@Table(name = "estudiante_materia")
public class EstudianteMateria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "estudiante_id")
	private Long estudianteId;

	@Column(name = "materia_id")
	private Long materiaId;

	public Long getEstudianteId() {
		return estudianteId;
	}

	public void setEstudianteId(Long estudianteId) {
		this.estudianteId = estudianteId;
	}

	public Long getMateriaId() {
		return materiaId;
	}

	public void setMateriaId(Long materiaId) {
		this.materiaId = materiaId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstudianteMateria other = (EstudianteMateria) obj;
		if (estudianteId == null) {
			if (other.estudianteId != null)
				return false;
		} else if (!estudianteId.equals(other.estudianteId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (materiaId == null) {
			if (other.materiaId != null)
				return false;
		} else if (!materiaId.equals(other.materiaId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estudianteId == null) ? 0 : estudianteId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((materiaId == null) ? 0 : materiaId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "EstudianteMateria [id=" + id + ", estudianteId=" + estudianteId + ", materiaId=" + materiaId + "]";
	}
}
