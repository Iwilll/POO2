package jajasx2;

public class Jajasx3 {
	public static void main (String[] args) {
	traveler();
	}
	
	
	
	
	public static void traveler (){
		int maxv = 1100;
		int[] value1 = {60,48,14,31,10};
		int[] mass1 = {800,600,300,400,200};
		int opt = 0;
		for (int i = 0; i < 5; i++) {
			int value = 0;
			int actv = 0;
			for(int j = 0 + i; j < 5; j++) {
				if (actv + mass1[j] <= maxv) {
					actv = actv + mass1[j];
					value = value +value1[j];
				}
				else {
					if(value > opt) {
						
					opt = value;
					}
				}
			}
		}
		System.out.println(opt);
	}
	
}
