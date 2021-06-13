package p08_NestedClass_test1;

public class PiggyBank {
	int total;
	Slot slot;
	PiggyBank(){
		total = 0;
		slot = new Slot();
	}
	class Slot{
		void put(int amount) {
			total += amount;
		}
	}
}
