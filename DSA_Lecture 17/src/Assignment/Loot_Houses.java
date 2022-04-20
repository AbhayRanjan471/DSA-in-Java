//A thief wants to loot houses. He knows the amount of money in each house. He cannot loot two consecutive houses.
//Find the maximum amount of money he can loot.
	//Sample Input 1 :
	//6
	//5 5 10 100 10 5
	//Sample Output 1 :
	//110

package Assignment;

public class Loot_Houses {
    //one condition in this Question is that if we are at index i = 3 then we cannot take element at i = 3-1 and i = 3+1

	//Recursive Approach
	public static int maxMoneyLooted(int[] houses) {

		return maxMoneyLooted( houses , 0);
	}

	public static int maxMoneyLooted(int[] houses , int i) {
		if(i >= houses.length){
			return 0;
		}
		int opt1 = houses[i] + maxMoneyLooted(houses , i+2);
		int opt2 = maxMoneyLooted(houses , i+1);

		return Math.max(opt1 , opt2);
	}
	
	//Memoization
	public static int maxMoneyLootedM(int[] houses) {
		//Your code goes here
        int storage[] = new int[houses.length +1];
       return maxMoneyLootedM( houses , 0 , storage);
	}

    public static int maxMoneyLootedM(int[] houses , int i , int [] storage) {
        if(i >= houses.length){
            return 0;
        }
        if(storage[i] != 0){
            return storage[i];
        }
        int opt1 = houses[i] + maxMoneyLootedM(houses , i+2 ,storage);
        int opt2 = maxMoneyLootedM(houses , i+1 ,storage);
        
        storage[i] = Math.max(opt1 , opt2);
         
        return storage[i];
    }

    //Dynamic Programming
    public static int maxMoneyLootedDP(int[] houses) {
    	int n = houses.length;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return houses[0];
        }
    	int maxMoneyCanBeLooted[] = new int[n + 1];
        if(houses.length == 2){
            return Math.max(houses[0] , houses[1]);
        }
        maxMoneyCanBeLooted[0] = houses[0];
        maxMoneyCanBeLooted[1] = Math.max(houses[0], houses[1]);
    	for(int currHouse =2 ; currHouse < n ; currHouse++) {
    		maxMoneyCanBeLooted[currHouse] = Math.max(houses[currHouse] + maxMoneyCanBeLooted[currHouse -2], maxMoneyCanBeLooted[currHouse-1]);
    	}
    	return maxMoneyCanBeLooted[n -1];
    }
	public static void main(String[] args) {
		 int house[] = {10,2,30,20,3,50};
		 System.out.println(maxMoneyLooted(house));
		 System.out.println(maxMoneyLootedM(house));
		 System.out.println(maxMoneyLootedDP(house));

	}

}
