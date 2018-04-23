package Springmain.pojo;

public class Display {
   private String id;
   private String name;
   private String gender;
   private String age;

public Display(String id, String name, String gender, String age) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
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

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
   
}