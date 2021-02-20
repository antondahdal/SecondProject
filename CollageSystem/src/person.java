
public class person {
private String name;
private int id;
private String gender;
private int age;
private String adress;


public person(String name,int id,String gender,int age,String adress) {
	setName(name);
	setId(id);
	setGender(gender);
	setAge(age);
	setAdress(adress);
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getAdress() {
	return adress;
}


public void setAdress(String adress) {
	this.adress = adress;
}
}
