package beans;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;



@Entity
@Table(name="jtable")
public class JSample {
	private long jId;
	private String jTitle;
	private String jDescription;
	private User user;
	private Timestamp dateCreated;
	private boolean approved;
	
	@Id
	@GeneratedValue
	@Column(name="JId")
	public long getjId() {
		return jId;
	}
	public void setjId(long jId) {
		this.jId = jId;
	}
	
	@Column(name="JTitle",length=100)
	public String getjTitle() {
		return jTitle;
	}
	public void setjTitle(String jTitle) {
		this.jTitle = jTitle;
	}
	
	@Column(name="JDescription",length=2000)
	public String getjDescription() {
		return jDescription;
	}
	public void setjDescription(String jDescription) {
		this.jDescription = jDescription;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Column(name="DateCreated")
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@Column(name="Approved")
	@Value("false")
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	
}
