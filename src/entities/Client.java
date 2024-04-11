package entities;

import java.time.LocalDate;

public class Client {

	private Integer id;
	private String name;
	private String email;
	private LocalDate birthDate;
	private Integer id_order;

	public Client() {
		super();
	}

	public Client(Integer id, String name, String email, LocalDate birthDate, Integer order) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.id_order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getId_order() {
		return id_order;
	}

	public void setId_order(Integer id_order) {
		this.id_order = id_order;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", id_order="
				+ id_order + "]";
	}

}
