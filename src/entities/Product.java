package entities;

public abstract class Product {

	private Integer id;
	private Type type;
	private Double uniValue;
	private Integer quantity;

	public Product() {
		super();
	}

	public Product(Integer id, Type type, Double uniValue, Integer quantity) {
		super();
		this.id = id;
		this.type = type;
		this.uniValue = uniValue;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getUniValue() {
		return uniValue;
	}

	public void setUniValue(Double uniValue) {
		this.uniValue = uniValue;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
