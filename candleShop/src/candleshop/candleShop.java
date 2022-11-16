
package candleshop;
import java.util.Scanner;

public class candleShop {
    public static void main (String [] args){
 //store setup   
 
 Scanner scnr = new Scanner (System.in);
 System.out.println("Hello Shopkeeper! Lets set up your shop!\n");

 
    System.out.println("Please enter the name of candle 1");
        String candle1Name = scnr.nextLine();
    System.out.println("Please enter the type of candle 1");
        int candle1Type = scnr.nextInt();
    System.out.println("Please enter the price of candle 1");
        double candle1Price = scnr.nextDouble();
    System.out.println("Please enter the burn time of candle 1");
        int candle1Burn = scnr.nextInt();
    scnr.nextLine();
    System.out.println("The candle's name is " + candle1Name + ". It is type " + candle1Type + ". The cost is $" + candle1Price + ". The burn time is " + candle1Burn + " minutes.\n");
  candle candle1 = new candle (candle1Name, candle1Type, candle1Price, candle1Burn);

System.out.println("Please enter the name of candle 2");
        String candle2Name = scnr.nextLine();
    System.out.println("Please enter the type of candle 2");
        int candle2Type = scnr.nextInt();
    System.out.println("Please enter the price of candle 2");
        double candle2Price = scnr.nextDouble();
    System.out.println("Please enter the burn time of candle 2");
        int candle2Burn = scnr.nextInt();
    scnr.nextLine();
    System.out.println("The candle's name is " + candle2Name + ". It is type " + candle2Type + ". The cost is $" + candle2Price + ". The burn time is " + candle2Burn + " minutes.\n");

  candle candle2 = new candle (candle2Name, candle2Type, candle2Price, candle2Burn);


System.out.println("Please enter the name of candle 3");
        String candle3Name = scnr.nextLine();
    System.out.println("Please enter the type of candle 3");
        int candle3Type = scnr.nextInt();
    System.out.println("Please enter the price of candle 3");
        double candle3Price = scnr.nextDouble();
    System.out.println("Please enter the burn time of candle 3");
        int candle3Burn = scnr.nextInt();
    scnr.nextLine();
    System.out.println("The candle's name is " + candle3Name + ". It is type " + candle3Type + ". The cost is $" + candle3Price + ". The burn time is " + candle3Burn + " minutes./\n");

  candle candle3 = new candle (candle3Name, candle3Type, candle3Price, candle3Burn);
 
 //Customer purchase
 
System.out.println("Hello! Welcome to my candle shop!\n");

System.out.println("How many candles of type 1 would you like?");
    int numCandle1 = scnr.nextInt(); 
    
   while (numCandle1 > 10 || numCandle1 < 0){
       System.out.println("Please enter a different amount. You can only buy a maximum of 10 candles.");
    numCandle1 = scnr.nextInt();
   }
System.out.println("How many candles of type 2 would you like?");
    int numCandle2 = scnr.nextInt();
     while (numCandle2 > 10 || numCandle2 < 0){
       System.out.println("Please enter a different amount. You can only buy a maximum of 10 candles.");
    numCandle2 = scnr.nextInt();
   }
System.out.println("How many candles of type 3 would you like?");
    int numCandle3 = scnr.nextInt();  
     while (numCandle3 > 10 || numCandle3 < 0){
       System.out.println("Please enter a different amount. You can only buy a maximum of 10 candles.");
    numCandle3 = scnr.nextInt();
   }
    
// Calculating the total price of all the candles bought
double totCandle1 = numCandle1 * candle1.getCost();
double totCandle2 = numCandle2 * candle2.getCost();
double totCandle3 = numCandle3 * candle3.getCost();
double totPurchase = totCandle1 + totCandle2 + totCandle3;

//A discount based on the total purchase price

double discount;

if (totPurchase <= 20){
    discount = 0;
}    
else if (totPurchase > 20 && totPurchase <=35){
         discount = totPurchase * 0.05;
       //  System.out.println("Your total purchase today with our 5% discount is: $" + discount5);    
}
else if (totPurchase > 35 && totPurchase <= 55){
        discount = totPurchase * 0.07;
       // System.out.println("Your total purchase today with our 7% discount is: $" + discount7);
}
else if (totPurchase > 55 && totPurchase <= 100){
        discount = totPurchase * 0.10;
       // System.out.println("Your total purchase today with our 10% discount is: $" + discount10);
}
else {
        discount = totPurchase * 0.20;
       // System.out.println("Your total purchase today with our 20% discount is: $" + discount20);
}
double totSavings = totPurchase - discount;

        

//Calculating the total burn time of all the candles if they were burned consecutively

    int totBurnTime = (candle1.getTime()*numCandle1) + (candle2.getTime()*numCandle2) + (candle3.getTime()*numCandle3);
    
//candle's cost per minute
    
    double costPerMin = totSavings / totBurnTime;

  //purchase display  
    
String row1 = "";
String row2 = "";
String row3 = "";
// Bonus-Bonus Change Symbol
for (int n = 0; n < numCandle1; n++){
    row1 = row1 + "#";
}
for (int n = 0; n < numCandle2; n++){
    row2 = row2 + "!";
}
for (int n = 0; n < numCandle3; n++){
    row3 = row3 + "^";
}
System.out.println(numCandle1 + " " + candle1.getName() +  " candles of type " + candle1.getType() + " purchased " + row1);
System.out.println(numCandle2 + " " + candle2.getName() +  " candles of type " + candle2.getType() + " purchased " + row2);
System.out.println(numCandle3 + " " + candle3.getName() +  " candles of type " + candle3.getType() + " purchased " + row3);

System.out.println("Today's purchase is $" + totPurchase);
System.out.println("Today's discount price $" + totSavings);
System.out.println("Your total burn time is " + totBurnTime + " minutes.");
System.out.println("The cost per a minute for burn time is $" + costPerMin);
System.out.println("Thank you! Come again!");

// Bonus-Bonus-Bonus Loyal Program

System.out.println("Would you like to join our rewards program? Today's purchase can be applied to your account. For every 10 candles you buy you get a point. (Y/N)");
String response = scnr.nextLine();

int totCandles = numCandle1 + numCandle2 + numCandle3;
int rewardsPoints = totCandles /10;

while (!response.equals("Y") && !response.equals("N")){
    System.out.println("Please pick Y or N.");
    response = scnr.nextLine();
}
    if (response.equals("Y")){
         
        System.out.println("Thank you for joining! Today's reward points are :" + rewardsPoints + " points.");
    }
    else{
        System.out.println("Thank you! Have a nice day!");
    }
    
    }
    
}
