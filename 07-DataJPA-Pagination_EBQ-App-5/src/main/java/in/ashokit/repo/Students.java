package in.ashokit.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private Integer studId;
	private String studName;
	private Integer studAge;
	private String studCollege;
	private String studCity;
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Integer getStudAge() {
		return studAge;
	}
	public void setStudAge(Integer studAge) {
		this.studAge = studAge;
	}
	public String getStudCollege() {
		return studCollege;
	}
	public void setStudCollege(String studCollege) {
		this.studCollege = studCollege;
	}
	public String getStudCity() {
		return studCity;
	}
	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}
	@Override
	public String toString() {
		return "Students [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", studCollege="
				+ studCollege + ", studCity=" + studCity + "]";
	}
}
