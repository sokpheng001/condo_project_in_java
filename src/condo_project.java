
//Kim Chansokpheng used with JDK version 19
//=========================================
/**This console system comes with many features such as:
 * You can not insert number for the inserting name option.
 * You can not insert a character or a string for the option that requires you to insert in numeric value.
 * When the floor and room were full, this system will tell you via the text.
 * Last point is that, it has the -> "Bell sound" <- ; when you inserted wrong for the requirement. But, unfortunately; it depends on your IDE. AND for CMD is possible.
 */

import java.util.Scanner;


public class condo_project {
    public static void main(String[] args){
        int floor=0,room=0;
        int choice,choice_ = 0,floor_index = 0,room_index = 0,choice_for_search=0,count_if_room_is_full=0,decide_to_sell;
        Scanner scan = new Scanner(System.in);
        again:
        while ((floor<=0 || room<=0)){
            System.out.println("--------------------Set Up the Condo-------------------");
            System.out.print("Insert number of floor: ");
            while (!scan.hasNextInt()){
                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                System.out.print((char)7);//used this ASCII to get bell sound
                System.out.println("> The Number of Floor must not be a character or string. Please insert again: ");
                floor=0;
                scan.next();
                System.out.print("Press Enter key to continue...");
                scan.nextLine();
                scan.nextLine();
                continue again;
            }
            floor = scan.nextInt();
            if(floor<=0){
                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                System.out.print((char)7);//used this ASCII to get bell sound
                System.out.println("> Number of Room must be greater than. Please insert again: ");
                System.out.print("Press enter key to continue...");
                scan.nextLine();
                scan.nextLine();
                continue again;
            }
            System.out.print("Insert number of room: ");
            while (!scan.hasNextInt()){
                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                System.out.print((char)7);//used this ASCII to get bell sound
                System.out.println("> The Number of Room must not be a character or string. Please insert again: ");
                room=0;
                scan.next();
                System.out.print("Press enter key to continue...");
                scan.nextLine();
                scan.nextLine();
                continue again;
            }
            room = scan.nextInt();
            if(room<=0){
                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                System.out.print((char)7);//used this ASCII to get bell sound
                System.out.println("> Number of Room must be greater than. Please insert again: ");
                System.out.print("Press enter key to continue...");
                scan.nextLine();
                scan.nextLine();
                continue again;
            }
            if((floor!=0 || floor>0) && (room!=0 || room>0)){
                System.out.println("-> The Condo has been set up successfully.");
                System.out.println("Total room: " + floor*room);
            }
            System.out.print("Press enter key to continue...");
            scan.nextLine();
            scan.nextLine();
        }
        //array for condo
        String [][]owner = new String[floor][room];
        String name_search = null;
        int []floor_array = new int[floor];
        int []room_array = new int[room];
        int count_seen=0;
        //
        label1:
        while ((floor!=0 || floor<0) && (room!=0 || room<0)){
            System.out.println("==================== Welcome to Phnom Penh Condo ====================");
            //Making choice
            System.out.println("Choice to choose: ");
            System.out.println("1. Buy the condo.");
            System.out.println("2. Sell the condo.");
            System.out.println("3. Search the condo.");
            System.out.println("4. Display information.");
            System.out.println("5. Exit.");
            System.out.println("--------------------");
            System.out.print("-> Insert option(1-5): ");
            while (!scan.hasNextInt()){
                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                System.out.print((char)7);//used this ASCII to get bell sound
                System.out.println("> This Option must not be a character or string. Please insert again: ");
                scan.next();
                continue label1;
            }
            choice = scan.nextInt();//choice
            if(choice<1 || choice>5){
                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                System.out.print((char)7);//used this ASCII to get bell sound
                System.out.println("> You inserted wrong choice from(1->5). Please insert again: ");
                continue label1;
            }else {
                switch (choice){
                    case 1:
                        System.out.println("-------------------- Buying the Condo Process --------------------");
                        //floor_index
                        label2:
                        while(floor_index<=0 || floor_index>floor){
                            System.out.println("Floor: ");
                            if(floor>1){
                                System.out.print("-> Insert floor-index (1-" + floor+") to buy: ");
                            }else {
                                System.out.print("-> Insert floor-index (1) to buy: ");
                            }
                            while (!scan.hasNextInt()){
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                                System.out.println("> The Floor-index must not be a character or string. Please insert again: ");
                                scan.next();
                                continue label2;
                            }
                            floor_index = scan.nextInt();
                            if(floor_index<=0 || floor_index>floor){
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                                System.out.println("> You insert was out of index of floor <-");
                                continue label2;
                            }else {
                                break ;
                            }
                        }
                        //floor_index
                        label3:
                        while(room_index<=0 ||room_index>room){
                            System.out.println("Room: ");
                            if(room>1){
                                System.out.print("-> Insert room-index (1-" + room+") to buy: ");
                            }else {
                                System.out.print("-> Insert room-index (1) to buy: ");
                            }
                            while (!scan.hasNextInt()){
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound!
                                System.out.println("> The Room-index must not be a character or string. Please insert again: ");
                                scan.next();
                                continue label3;
                            }
                            room_index = scan.nextInt();
                            if(room_index<=0 || room_index>room){
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                                System.out.println("> You insert was out of index of room <-");
                                continue label3;
                            }else {
                                break ;
                            }
                        }
                        //Verify if duplicated floor and room:
                        for(int i=0;i<floor_index;i++){
                            for(int j=0;j<room_index;j++){
                                if(floor_array[i]==floor_index){
                                    if(room_array[j]==room_index){
                                        if(owner[i][j]!=null){
                                            java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                            System.out.print((char)7);//used this ASCII to get bell sound
                                            System.out.println("> This floor and room is belonging to the owner named " + " -> | " + owner[i][j] + " | <-, please try to choose another floor and room. <-" );
                                            floor_index = 0;
                                            room_index = 0;
                                            System.out.print("Press Enter key to continue...");
                                            scan.nextLine();
                                            scan.nextLine();
                                            continue label1;
                                        }
                                    }
                                }
                            }
                        }
                        floor_array[floor_index-1] = floor_index;
                        room_array[room_index-1] = room_index;
                        //Owner
                        if(owner[floor_index-1][room_index-1]==null ||owner[floor_index-1][room_index-1].equals("\n")){
                            System.out.println("Owner: ");
                            System.out.print("Owner's name: ");
                            while (scan.hasNextInt()){
                                System.out.println("Owner: ");
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                                System.out.println("> Name must be not number. PLease insert again: ");
                                System.out.print("Owner's name: ");
                                scan.next();
                            }
                            scan.nextLine();
                            owner[floor_index-1][room_index-1] = scan.nextLine();
                        }
                        count_if_room_is_full++;
                        System.out.println("-> Successfully for buying a condo <-");
                        if(count_if_room_is_full==floor*room){
                            System.out.println("===================== Each floor is -> FULL <- now =====================");
                        }
                        System.out.println("Press enter key to continue...");
                        scan.nextLine();
                        floor_index = 0;
                        room_index = 0;
                        break ;
                    //selling process
                    case 2:
                        System.out.println("-------------------- Selling the Condo process --------------------");
                        label4:
                        while (floor_index<=0||floor_index>floor){
                            if(floor>1){
                                System.out.print("-> Insert floor-index (1-" + floor +") to sell: ");
                            }else {
                                System.out.print("-> Insert floor-index (1) to sell: ");
                            }
                            while (!scan.hasNextInt()){
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                                System.out.print("> The Floor-index must not be a character or string. Please insert again: ");
                                scan.next();
                                continue label4;
                            }
                            floor_index = scan.nextInt();
                            if(floor_index<=0 || floor_index>floor){
                                System.out.println("WARNING!: Floor index cannot be less, equal 0 or greater than floor number, please insert again: ");
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                            }
                        }
                        label5:
                        while (room_index<=0||room_index>floor){
                            if(room>1){
                                System.out.print("-> Insert room-index (1-" + room +") to sell: ");
                            }else {
                                System.out.print("-> Insert room-index (1) to sell: ");
                            }
                            while (!scan.hasNextInt()){
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                                System.out.println("> Room-index must not be a character or string. Please insert again: ");
                                scan.next();
                                continue label5;
                            }
                            room_index = scan.nextInt();
                            if(room_index<=0 || room_index>room) {
                                System.out.println("WARNING!: Room index cannot be less, equal 0 or greater than room number, please insert again: ");
                                java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                System.out.print((char)7);//used this ASCII to get bell sound
                            }else {
                                break ;
                            }
                        }
                        if((owner[floor_index-1][room_index-1])==null){
                            System.out.println("-> This condo doesn't has an ownership yet <-");
                            java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                            System.out.print((char)7);//used this ASCII to get bell sound
                            floor_index=0;
                            room_index=0;
                            System.out.print("Press Enter key to continue...");
                            scan.nextLine();
                            scan.nextLine();
                            continue label1;
                        }
                        System.out.print("Enter 1 to sell the condo and 0 to cancel: ");
                        label6:
                        while (!scan.hasNextInt()){
                            java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                            System.out.print((char)7);//used this ASCII to get bell sound
                            System.out.println("> Option must not be a character or string. Please insert again: ");
                            System.out.print("Enter 1 to sell the condo and 0 to cancel: ");
                            scan.next();
                            continue label6;
                        }
                        decide_to_sell = scan.nextInt();
                        if(decide_to_sell==1){
                            owner[floor_index-1][room_index-1] = null;
                            count_if_room_is_full--;
                            floor_index=0;
                            room_index=0;
                            System.out.println(">>>>>>>>>>>>>>>>>>>> Successfully sold the condo <<<<<<<<<<<<<<<<<<<");
                            System.out.println("Press enter to continue...");
                            scan.nextLine();
                            scan.nextLine();
                        }else if(decide_to_sell==0){
                            floor_index=0;
                            room_index=0;
                            System.out.println(">>>>>>>>>>>>>>>>>>>> Selling condo was canceled <<<<<<<<<<<<<<<<<<<");
                            System.out.print("Press Enter key to continue...");
                            scan.nextLine();
                            scan.nextLine();
                        }else {
                            floor_index=0;
                            room_index=0;
                            System.out.println(">>>>>>>>>>>>>>>>>>>> You inserted with wrong decision!!! <<<<<<<<<<<<<<<<<<<");
                            System.out.print("Press Enter key to continue...");
                            scan.nextLine();
                            scan.nextLine();
                        }
                        break ;
                    case 3:
                        System.out.println("-------------------- Search the Condo --------------------");
                        System.out.println("1. Search via index_ (Floor_index and Room_index).");
                        System.out.println("2. Search via owner's name.");
                        System.out.println("3. Exit.");
                        System.out.print("Your choice: ");
                        while (!scan.hasNextInt()){
                            java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                            System.out.print((char)7);//used this ASCII to get bell sound
                            System.out.println(">This Option must be not a character or a string. PLease insert again: ");
                            System.out.print("Your choice: ");
                            scan.next();
                        }
                        choice_for_search = scan.nextInt();
                        //search process
                        if(choice_for_search==1){
                            System.out.println("----------- Searching via floor and room number processing -----------");
                            label7:
                            while (floor_index<=0||floor_index>floor){
                                if(floor>1){
                                    System.out.print("-> Insert floor-index (1-" + floor +") to sell: ");
                                }else {
                                    System.out.print("-> Insert floor-index (1) to sell: ");
                                }
                                while (!scan.hasNextInt()){
                                    java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                    System.out.print((char)7);//used this ASCII to get bell sound
                                    System.out.println("> The Floor-index must not be a character or string. Please insert again: ");
                                    scan.next();
                                    continue label7;
                                }
                                floor_index = scan.nextInt();
                                if(floor_index<=0 || floor_index>floor){
                                    System.out.println("WARNING!: Floor index cannot be less, equal 0 or greater than floor number, please insert again: ");
                                    java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                    System.out.print((char)7);//used this ASCII to get bell sound
                                }
                            }
                            //search as in index_floor and room:
                            label8:
                            while (room_index<=0||room_index>floor){
                                if(room>1){
                                    System.out.print("-> Insert room-index (1-" + room +") to sell: ");
                                }else {
                                    System.out.print("-> Insert room-index (1) to sell: ");
                                }
                                while (!scan.hasNextInt()){
                                    java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                    System.out.print((char)7);//used this ASCII to get bell sound
                                    System.out.println("> Floor-index must not be a character or string. Please insert again: ");
                                    scan.next();
                                    continue label8;
                                }
                                room_index = scan.nextInt();
                                if(room_index<=0 || room_index>room) {
                                    System.out.println("WARNING!: Room index cannot be less, equal 0 or greater than room number, please insert again: ");
                                    java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                                    System.out.print((char)7);//used this ASCII to get bell sound
                                }else {
                                    break ;
                                }
                            }
                            if(owner[floor_index-1][room_index-1]!=null){
                                System.out.println("Result: This condo is belonging to the owner named -> " + owner[floor_index-1][room_index-1] + " <- at floor number " + floor_index + " and room number " + room_index +".");
                                floor_index=0;
                                room_index=0;
                                System.out.print("Press Enter key to continue...");
                                scan.nextLine();
                                scan.nextLine();
                            }else {
                                System.out.println("Result: On floor " + floor_index + " and room " + room + " is Available now (It hasn't been bought yet).");
                                floor_index=0;
                                room_index=0;
                                System.out.print("Press Enter key to continue...");
                                scan.nextLine();
                                scan.nextLine();
                            }
                        }else if(choice_for_search==2){//search as in name process
                            System.out.println("----------- Searching via owner's name processing -----------");
                            System.out.print("Insert name: ");
                            scan.nextLine();
                            name_search = scan.nextLine();
                            for(int i=0;i<floor;i++){
                                for(int j=0;j<room;j++){
                                    if(name_search.equals(owner[i][j])){
                                        System.out.println("Name-Result: The owner named -> " + owner[i][j] + " <- is on the floor " + (i+1) + " and room " + (j+1) + ".");
                                        System.out.print("Press Enter key to continue...");
                                        scan.nextLine();
                                        scan.nextLine();
                                        continue label1;
                                    }else {
                                        count_seen++;
                                    }
                                }
                            }
                            if (count_seen>0){
                                System.out.println("Name-Result: The owner named -> " + name_search + " <- doesn't exist on any floor or room.");
                                System.out.print("Press Enter key to continue...");
                                scan.nextLine();
                                scan.nextLine();
                                continue label1;
                            }
                        }else if(choice_for_search==3) {
                            System.out.println("-> Exit from search option: ");
                            floor_index = 0;
                            room_index = 0;
                            continue label1;
                        }else {
                            java.awt.Toolkit.getDefaultToolkit().beep();//Used for producing "bell" sound
                            System.out.print((char)7);//used this ASCII to get bell sound
                            System.out.println("-> The option is not a number less than 0, please insert again: ");
                        }
                        break ;
                    case 4:
                        System.out.println("-------------------- Display Condo Information --------------------");
                        for(int i=floor-1;i>=0;i--){
                            System.out.print("Floor[" + (i+1) + "]: => ");
                            for(int j=0;j<room;j++){
                                System.out.print(owner[i][j]);
                                if(owner[i][j]!=null){
                                    System.out.print(" ");
                                }
                                System.out.print(" | ");
                            }
                            System.out.println();
                        }
                        if(count_if_room_is_full==floor*room){
                            System.out.println("===================== Each floor is -> FULL <- now =====================");
                        }
                        System.out.print("Press Enter key to continue...");
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    case 5:
                        System.out.println("========== > Program is closed!!! <==========");
                        System.exit(0);
                        break ;
                }
            }
        }
    }
}