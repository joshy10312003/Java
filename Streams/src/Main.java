import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Nick", 'M'));
		people.add(new Person("Alexa", 'F'));
		people.add(new Person("Siri", 'F'));
		people.add(new Person("Klay", 'M'));
		
		List<Person> females = people.stream()
				.filter(person -> person.gender == 'M')
				.sorted(Comparator.comparing(person -> person.name))
				.collect(Collectors.toList());
		
		List<Person> males = people.stream()
				.filter(person -> person.gender == 'F')
				.sorted(Comparator.comparing(person -> person.name))
				.collect(Collectors.toList());
		
//		for (Person p : people) {
//			if(p.gender == 'F') females.add(p);
//		}
		
		System.out.print("Female: ");
		females.forEach(person -> System.out.print(person.name + "\t"));
		System.out.print("\nMale: \t");
		males.forEach(person -> System.out.print(person.name+ "\t"));
		
		
		

	}
	static class Person {
		
		String name;
		char gender;
		
		public Person(String name, char gender){
			this.name = name;
			this.gender = gender;
		}
	}

}
