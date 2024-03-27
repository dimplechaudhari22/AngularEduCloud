package in.codetech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userRoleID;
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	@ManyToOne
	private Role role;

	public UserRole() {

	}

	public UserRole(long userRoleID, User user, Role role) {
		super();
		this.userRoleID = userRoleID;
		this.user = user;
		this.role = role;
	}

	public long getUserRoleID() {
		return userRoleID;
	}

	public void setUserRoleID(long userRoleID) {
		this.userRoleID = userRoleID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRole [userRoleID=" + userRoleID + ", user=" + user + ", role=" + role + "]";
	}

}
