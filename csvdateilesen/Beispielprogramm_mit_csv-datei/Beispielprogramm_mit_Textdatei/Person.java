import java.io.Serializable;

public class Person implements Serializable{
	
	private int personalnummer;  //  eine positive Zahl
	private String name;
	private String  geburtsdatum;

	public Person() {
		this.personalnummer = -1;
		this.name = null;
		this.geburtsdatum = geburtsdatum;
	}
	
	public Person(int personalnummer, String name, String geburtsdatum) {   //  geburtstag : "21.02.2011"  
		this.personalnummer = personalnummer;
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}
	
	
	@Override
	public String toString() {
		return "[personalnummer=" + personalnummer + ", name=" + name + ", geburtsdatum=" + geburtsdatum + "]";
	}
	
	
	

}
