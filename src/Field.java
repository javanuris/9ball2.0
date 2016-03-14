/**
 * Created by Admin on 14.03.2016.
 */
public class Field {
    int varible;
    private  Player playerOne;
    private  Player playerTwo;

    public Field(){
        playerOne = new Player();
        playerTwo = new Player();
    }

    public Player getPlayerOne() {
        return playerOne;

    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void playerData(){
        for(int i =0; i<=8 ; i++){
            playerTwo.setBalls(i , 9);
            playerOne.setBalls(i , 9);
        }
    }

public void mainLogicGame(Player player ,int currentBox) {
    int currentValue = player.getBalls(currentBox);
   varible = currentBox + currentValue-8-2; /*Незнаю почему отнимаю двойку */
    System.out.println(varible);
    int minus = 8 - currentBox;

    if(player.getBalls(currentBox) == 1){
        player.setBalls(currentBox , 0);
        player.setBalls(currentBox+1 , player.getBalls(currentBox+1)+1);
    }
    else if(player.getBalls(currentBox) == 0){
        player.setBalls(currentBox , 0);
    }
    else{
    player.setBalls(currentBox, 1);
    for (int i = 0; i <= minus; i++) {
        if (i == 0) {
            player.setBalls(currentBox + i, player.getBalls(currentBox + i));
        } else {
            player.setBalls(currentBox + i, player.getBalls(currentBox + i) + 1);
        }
    }
    }

     onesOne(varible);
}
    public void onesTwo(int x){}

    public void twosTwo(int x){}

    public void onesOne(int x) {
        int s = x;
        if (s <= 8) {
            for (int i = 0; i <= x; i++) {
                playerTwo.setBalls(i, playerTwo.getBalls( i) + 1);
                if(playerTwo.getBalls(x)%2 == 0){
                    playerTwo.setBalls(x ,0);
                }
                s--;
            }
        } else if (s > 8) {
            for (int i = 0; i <= 8; i++) {
                playerTwo.setBalls(i, playerTwo.getBalls(i) + 1);
                s--;
            }
        }
        if (s >= 0) {
            twosOne(s);
        } else {
            System.out.println("Завершило");
        }
    }

    public void twosOne(int x) {
        int s = x;
        if (s <= 8) {
            for (int i = 0; i <= x; i++) {
                playerOne.setBalls(i, playerOne.getBalls( i) + 1);
                s--;
            }
        }else if(s> 8){
            for(int i = 0; i <=8 ; i++){
                playerOne.setBalls(i ,playerOne.getBalls(i)+1);
                s--;
            }

        }
        if(s >= 0){
            onesOne(s);
        }else {
            System.out.println("Завершило");
        }
    }
}
