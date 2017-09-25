
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
        for(int i=0;i<13;i++){
        int count=0;
        move();
        turnLeft();
        while(nextToABeeper()){
            pickBeeper();
            count++;
            move();
        }
        //need array, count var, and more
    }
    }
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
    public void findABeeper(){
        while(!nextToABeeper()){
            move();
        }
    }
}

