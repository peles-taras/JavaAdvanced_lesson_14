package ua.lviv.lgs.hbm.xml;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {

	private Integer id;
	private Integer total;
	private Set<Cart> carts = new HashSet<>();

	public Item() {
	}

	public Item(Integer id, Integer total) {
		this.id = id;
		this.total = total;

	}
	
	public Item(Integer total) {
		this.total = total;
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

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> cartSet) {
		this.carts = cartSet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carts, id, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(carts, other.carts) && Objects.equals(id, other.id)
				&& Objects.equals(total, other.total);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", total=" + total + ", cartSet=" + carts + "]";
	}

}
