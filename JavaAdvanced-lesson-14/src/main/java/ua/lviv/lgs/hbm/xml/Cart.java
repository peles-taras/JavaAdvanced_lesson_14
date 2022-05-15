package ua.lviv.lgs.hbm.xml;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cart {

	private Integer id;
	private Integer total;
	private String name;
	private Set<Item> items = new HashSet<>();

	public Cart() {
	}

	public Cart(Integer id, Integer total, String name) {
		this.id = id;
		this.total = total;
		this.name = name;
	}

	public Cart(Integer total, String name) {
		this.total = total;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> itemSet) {
		this.items = itemSet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, items, name, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(id, other.id) && Objects.equals(items, other.items)
				&& Objects.equals(name, other.name) && Objects.equals(total, other.total);
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + ", itemSet=" + items + "]";
	}

}
