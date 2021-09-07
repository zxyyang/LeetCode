
package other.StudentSort;

import sun.dc.pr.PRError;

public class Course {
 private  String id;
 private String name;
 private  Integer credit;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	@Override public String toString() {
		return "Course{" + "id=" + id + ", name='" + name + '\'' + ", credit=" + credit + '}';
	}
}