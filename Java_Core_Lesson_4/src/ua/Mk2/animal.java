package ua.Mk2;

public class animal {
	public String name;
	public int speed;
	public int age;
	
	animal (){
		this.name= "Леопард";
		this.speed= 20;
		this.age= 7;
	}
	
	
	
	public void setName(String Name) {
		name = Name;
	}

	public String getName() {
		return name;
	}
	
	public void setSpeed(int Speed) {
		speed = Speed;
	}

	public int getSpeed() {
		return speed;
	}
	public void setAge(int Age) {
		age = Age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "animal [Назва тварини=" + name + ", Швидкість тварин =" + speed + " км/год" + ", Вік тварини=" + age +  " років" + "]";
	}
	
}
