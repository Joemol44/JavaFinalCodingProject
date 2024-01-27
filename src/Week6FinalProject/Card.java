package Week6FinalProject;

public class Card {
		int value;
		String name;
		
		Card(int value, String name) {
			this.value = value;
			this.name = name;
		}
		// Getters and Setters
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;			
		}
	
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		// Describe method, to print out information about the card 
		public void describe() {
		
			System.out.println(this.name + this.value);
		}

	
}
