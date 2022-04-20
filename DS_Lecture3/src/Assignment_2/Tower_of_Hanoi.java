package Assignment_2;
//Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle 
//is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :
//1) Only one disk can be moved at a time.
//2) A disk can be moved only if it is on the top of a rod.
//3) No disk can be placed on the top of a smaller disk.
//Print the steps required to move n disks from source rod to destination rod.
//Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.

//step 1: move (n-1) disk from source (s) ,using the destination(d) , to the helper(h).
//step 2: move the last disk (n) from source(s) to destination(d);
//step 3: move (n-1) disk from helper(h) ,using source(s) to the destination(d).

public class Tower_of_Hanoi {
	
	public static void towerofHanoi(int n ,char source ,char helper,char destination) {
		if(n==1) {
			System.out.println("move 1st disk from " + source + " to " + destination);
			return;
		}
		towerofHanoi(n-1 ,source ,destination ,helper);
		System.out.println("move "+ n +"th disk from " + source +" to " + destination);
		towerofHanoi(n-1 , helper ,source , destination);
	}

	public static void main(String[] args) {
		char source ='a';
		char helper = 'b';
		char destination = 'c';
		towerofHanoi(3 , source , helper , destination);

	}

}
