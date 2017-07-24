package se.cambio.training.entities;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author MJameel
 * @since on 7/17/2017.
 */
@Entity
@Table(name = "SPARE_PARTS")
public class SparePart extends AbstractEntity
{
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;
	@ManyToOne(cascade = CascadeType.ALL)
	private Manufacturer manufacturer;
	@Basic
	private String description;

	public SparePart()
	{}

	public SparePart(final String name, final String description)
	{
		setName(name);
		this.description = description;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public Manufacturer getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
