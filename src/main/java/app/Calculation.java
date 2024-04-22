package app;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculation {
	
	
	public Calculation() {
	
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	int number1;
	int number2;
	String operation;
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public int calculate() {
		
		switch(operation) {
		
		case "+" : return number1 + number2;
		
		case "-" : return number1 - number2;
		
		case "*" : return number1 * number2;
		
		case "/" : return number1 / number2;
		
		default : return -1;
		
		}
	}
	
}
