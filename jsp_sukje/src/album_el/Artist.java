package album_el;

public class Artist {
	String name,job;
	int age;
	
	public Artist(String name, String job, int age) {
		this.name=name;
		this.job=job;
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
