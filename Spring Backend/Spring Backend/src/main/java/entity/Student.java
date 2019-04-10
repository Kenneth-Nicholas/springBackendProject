package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// @Table is not mandatory, it just lets you know that this class
// is mapped to the student data in the DB
// @Id is used for e-mail address because an e-mail address is unique
// so you can search the database by e-mail address and only get
// one result if you make it so that an e-mail address can only 
// be associated with one single thing/student
// Using these @Column is good practice so you know what the data
// is referred to as in the DB versus what we refer to that same 
// data as in Java

@Entity
@Table(name="student")
public class Student {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="age")
	private int age;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="password")
	private String password;
	
	// we would map address differently
	// didn't get to it yet, but we will when we get to learning
	// about databases and relationships
	
	public Student() {
		
		super();
		
	}

	public Student(String firstName, String lastName, String email, int age, String telephone, String password) {
		
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.telephone = telephone;
		this.password = password;
		
	}

	public String getFirstName() {
		
		return firstName;
		
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}

	public String getLastName() {
		
		return lastName;
		
	}

	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}

	public String getEmail() {
		
		return email;
		
	}

	public void setEmail(String email) {
		
		this.email = email;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		this.age = age;
		
	}

	public String getTelephone() {
		
		return telephone;
		
	}

	public void setTelephone(String telephone) {
		
		this.telephone = telephone;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public void setPassword(String password) {
		
		this.password = password;
		
	}
	

	@Override
	public String toString() {
		
		return firstName + ", " + lastName + ", " + email + ", " + age + ", " + telephone + ", " + password;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		
		if (age != other.age)
			return false;
		
		if (email == null) {
			
			if (other.email != null)
				return false;
			
		} else if (!email.equals(other.email))
			return false;
		
		if (firstName == null) {
			
			if (other.firstName != null)
				return false;
			
		} else if (!firstName.equals(other.firstName))
			return false;
		
		if (lastName == null) {
			
			if (other.lastName != null)
				return false;
			
		} else if (!lastName.equals(other.lastName))
			return false;
		
		if (password == null) {
			
			if (other.password != null)
				return false;
			
		} else if (!password.equals(other.password))
			return false;
		
		if (telephone == null) {
			
			if (other.telephone != null)
				return false;
			
		} else if (!telephone.equals(other.telephone))
			return false;
		
		return true;
		
	}
	
}