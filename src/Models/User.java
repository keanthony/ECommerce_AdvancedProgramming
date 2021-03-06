package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
	
	public User(String username){
		this.Id = UUID.randomUUID();
		this.username = "username";
		this.email = "jortiz3@ggc.edu";
		this.orders = new ArrayList<Order>();
	}
	
	public UUID Id;
	public String username;
	public String email;
	public List<Order> orders;
	
	public UUID getId() {
		return Id;
	}
	public void setId(UUID id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
