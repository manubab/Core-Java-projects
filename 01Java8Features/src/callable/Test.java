package callable;

import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.Callable;

class User
{
	private String name;
	private String serName;
	private  LocalDate birthDate;
	private Integer age;
	private Boolean canDriverACar=false;
	
	
	
	public User(String name, String serName, LocalDate birthDate, Integer age, Boolean canDriverACar) {
	
		this.name = name;
		this.serName = serName;
		this.birthDate = birthDate;
		this.age = age;
		this.canDriverACar = canDriverACar;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSerName() {
		return serName;
	}



	public void setSerName(String serName) {
		this.serName = serName;
	}



	public LocalDate getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Boolean getCanDriverACar() {
		return canDriverACar;
	}



	public void setCanDriverACar(Boolean canDriverACar) {
		this.canDriverACar = canDriverACar;
	}
	
	
	
	
	
}


public class Test implements Callable<Integer> {

	
	private  LocalDate birthDate;
	
	@Override
	public Integer call() throws Exception {
	
		return Period.between(birthDate, LocalDate.now()).getYears();
	}

}















