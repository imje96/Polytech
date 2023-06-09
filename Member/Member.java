package Member;

import java.text.*;

public class Member {
	private String id; // 회원번호
	private String name; // 이름
	private String address; // 주소
	private String phoneNumber; // 전화번호
	private String birthday; // 생년월일
	private int age; // 나이
	private String joinDate; //등록일

	@Override
	public String toString() {
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	    return "ID: " + id +
	           ", Name: " + name +
	           ", Address: " + address +
	           ", Phone Number: " + phoneNumber +
	           ", Birthday: " + dateFormat.format(birthday) +
	           ", Registration Date: " + joinDate;
	    
	}
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String regiDate) {
		this.joinDate = regiDate;
	}

	
}
