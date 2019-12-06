package cn.demo.bean;
import java.io.Serializable;

/**
 * @author zh
 * @ClassName cn.saytime.domain.User
 * @Description
 */
public class User implements Serializable {
	
	private int id;
    private String name;

    public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
