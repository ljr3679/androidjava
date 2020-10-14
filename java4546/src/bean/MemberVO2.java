package bean;

public class MemberVO2 {
	//private라고 쓰면, 이클래스내에서만 변수에 접근해서 쓸수 있음.
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String ip_address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", gender=" + gender + ", ip_address=" + ip_address + "]";
	}
	
	
	
	
	
	
	
	
	
	//각 변수에 값을 넣는 /뺴는 메서드를 정의 하면됨.!
	//가방에 넣을떄는 set메서드로 정의: setters //값을 넣을떄는 set을 넣는다
	//가방에서 꺼낼때는 get메서드로 정의: getters //값을 꺼낼떄는 set을 넣는다
	//헷갈려서 this.id = id; this.는 클래스를 의미 
	
}
