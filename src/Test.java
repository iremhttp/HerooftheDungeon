import java.util.*;

public class Test {

    static boolean hasBook = false;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();


        int randomInt, persuasionSum, enemyPersuasionSum, randomEnemyNumber, randomEnemy;
        Weapon tempWeapon = new Weapon();

        double playerCoin = 15.0, tempHealth = 100, tempAttack;

        int tempPersuasion = 0, tempLevel = 1;
        String tempName, tempLastName = null, tempHouse, tempGender = null, tempJob = null, answer;

        boolean boll = true;
        boolean boll_2 = true;
        boolean boll_3 = true;
        boolean boll_4 = true;

        int y, counterRunAway = 0, counterShield = 0, counterPersuasion = 0, counterHealthPotion = 0, counterAttack = 0, counter = 0;

        Character tempPlayer = null;

        String username = System.getProperty("user.name");
        Enemy tempEnemy;
        double tempEnemyHealth;

        Weapon[] possibleWeapons = new Weapon[3];
        Enemy[] possibleEnemy = new Enemy[6];


        possibleEnemy[0] = new Enemy("Wolf", 50, 10, 7, 9, "Alive");
        possibleEnemy[1] = new Enemy("Bandit", 50, 6, 5, 20, "Alive");
        possibleEnemy[2] = new Enemy("Cannibal", 50, 8, 6, 20, "Alive");
        possibleEnemy[3] = new Enemy("Ghoul", 50, 7, 4, 11, "Alive(?)");
        possibleEnemy[4] = new Enemy("Rusalka", 200, 14, 9, 50, "Alive(?)");
        possibleEnemy[5] = new Enemy("Milosnitse", 200, 14, 9, 50, "Alive(?)");

        possibleWeapons[0] = new Weapon("Aerondight", "Sword", 15, 50, false);
        possibleWeapons[1] = new Weapon("Dawnlight", "Wand", 15, 50, false);
        possibleWeapons[2] = new Weapon("Omen", "Dagger", 15, 50, false);



        System.out.println();

        System.out.println("You look through the Notice board and grab the parchment you have been eyeing, ");
        System.out.println("The job is quite easy, if you know where to look, an easy bit of coins is what you need recently.");
        System.out.println();
        System.out.println("They need you to slay a beast that has been terrorizing one near town.");
        System.out.println("You head to the place where the owner of this job stays.");
        System.out.println("A merchant, old and a little stingy, is what you hear from the rumours around.");
        System.out.println();
        System.out.println("As you walk, you see one peculiar dealer, not yelling but whispering: ");
        System.out.println("\"Here wanderers, come and see my goods, you won't find something more precious than these.\"");
        System.out.println();
        System.out.println("(This will be your first choice, one simple question: Do you want to see their goods? ) ");
        System.out.println("   1. Yes\n   2. No   ");
        System.out.println("You choice is :");

        y=scan.nextInt();

        System.out.println();

        switch (y){
            case 1:
                System.out.println("You walk confidently towards the man, nothing seems out of place,");
                System.out.println("You questioningly look at the goods, what is so special about them? ");
                System.out.println("The dealer laughs, his laugh echoing in you head. Than he takes out a leather bound book.");
                System.out.println("\"This is what I can offer you wanderer,\" He says as seizes you, \"For you, 5 coins?\"");
                System.out.println();
                System.out.println("All you have got is 5 coins, what do you say? \n1. Yes\n2. No\nYou answer : ");
                y=scan.nextInt();
                System.out.println();

                if(y==1){
                    System.out.println("You nod only once and the book is in you hands,");
                    System.out.println("You feel your coin pouch slightly lightening,");
                    System.out.println("The dealer thanks you and took of.");
                    playerCoin=playerCoin-5;
                    hasBook=true;
                }
                else if(y==2){
                    System.out.println("You shake your head, decided to keep your coin to yourself.");
                    System.out.println("He sighs\"That's unfortunate...\" then he turns to shadow and dust.");
                    System.out.println("Well this was certainly unexpected.");
                }
                else{
                    System.out.println("You staring, makes him uncomfortable, he flees in front of your eyes, turns to shadows.");
                    System.out.println("Well this was certainly unexpected.");
                }
                break;
            case 2:
                System.out.println("You avert your gaze, you will not deal with anyone, it is not the time.");
                System.out.println("The second time you try to see the goods however, the dealer is gone.");
                break;
            default:
                System.out.println("You stare, and stare, and stare,...");
                System.out.println("The dealer is a man who knows when there is something's wrong,");
                System.out.println("He quietly escape through the shadows.");
        }

        System.out.println("You continue your pathway to the merchant.");
        System.out.println("He welcomes you and asks who you are?");
        System.out.println();
        System.out.println("Well who are you?");


        do {

            System.out.println("Choose one of these classes: ");
            System.out.println("1. Mage \n2. Knight \n3. Thief");
            System.out.println("Your Choice is: ");
            int x;

            try {
                x = scan.nextInt();

                switch (x) {

                    case 1:

                        Character tempMage = new Mage();

                        System.out.println("I see you chose being a Mage. So, what is your ");

                        System.out.println("Name: ");
                        tempName = scan.next();
                        System.out.println("Last Name: ");
                        tempLastName = scan.next();
                        System.out.println("House: ");
                        tempHouse = scan.next();


                        System.out.println("Gender: ");
                        System.out.println("1.Female \n2.Male \n3.Gender Not Specific");

                        y = scan.nextInt();

                        if (y == 1) {
                            tempMage.setCharGender("Female");
                            tempGender = "Lady";
                        } else if (y == 2) {
                            tempMage.setCharGender("Male");
                            tempGender = "Lord";
                        } else if (y == 3) {
                            tempMage.setCharGender("No Specific Gender");
                            tempGender = "Highness(?)";
                        } else {
                            System.out.println("Gender not important anyway.");
                            tempMage.setCharGender("Big Bad Mage no need Gender");
                            tempGender = "Highness(?)";
                        }

                        tempMage.setCharName(tempName);
                        tempMage.setLastName(tempLastName);
                        tempMage.setHouseName(tempHouse);
                        tempMage.setPersuasion(0);
                        tempPersuasion = 0;
                        tempMage.setJob("Mage");
                        tempJob = "Mage";
                        tempPlayer = tempMage;

                        boll = false;

                        break;

                    case 2:

                        Character tempKnight = new Knight();

                        System.out.println("I see you chose being a Knight. So, what is your ");

                        System.out.println("Name: ");
                        tempName = scan.next();
                        System.out.println("Last Name: ");
                        tempLastName = scan.next();
                        System.out.println("House: ");
                        tempHouse = scan.next();
                        System.out.println("Gender: ");
                        System.out.println("1.Female \n2.Male \n3.Gender Not Specific");

                        y = scan.nextInt();

                        if (y == 1) {
                            tempKnight.setCharGender("Female");
                            tempGender = "Dame";
                        } else if (y == 2) {
                            tempKnight.setCharGender("Male");
                            tempGender = "Sir";
                        } else if (y == 3) {
                            tempKnight.setCharGender("No Specific Gender");
                            tempGender = "Highness(?)";
                        } else {
                            System.out.println("Gender not important anyway.");
                            tempKnight.setCharGender("Big Sword Knight");
                            tempGender = "Highness(?)";
                        }

                        tempKnight.setCharName(tempName);
                        tempKnight.setLastName(tempLastName);
                        tempKnight.setHouseName(tempHouse);
                        tempKnight.setPersuasion(0);
                        tempPersuasion = 0;
                        tempKnight.setJob("Knight");
                        tempJob = "Knight";
                        tempPlayer = tempKnight;

                        boll = false;

                        break;

                    case 3:

                        Character tempThief = new Thief();

                        System.out.println("I see you chose being a Thief. So, what is your ");

                        System.out.println("Name: ");
                        tempName = scan.next();
                        System.out.println("Last Name: ");
                        tempLastName = scan.next();
                        System.out.println("House: ");
                        tempHouse = scan.next();
                        System.out.println("Gender: ");
                        System.out.println("1.Female \n2.Male \n3.Gender Not Specific");

                        y = scan.nextInt();

                        if (y == 1) {
                            tempThief.setCharGender("Female");
                            tempGender = "Lass";
                        } else if (y == 2) {
                            tempThief.setCharGender("Male");
                            tempGender = "Lad";
                        } else if (y == 3) {
                            tempThief.setCharGender("No Specific Gender");
                            tempGender = "Mx";
                        } else {
                            System.out.println("Gender not important anyway.");
                            tempThief.setCharGender("Gimme Your Coin");
                            tempGender = "Mx";
                        }
                        tempThief.setCharName(tempName);
                        tempThief.setLastName(tempLastName);
                        tempThief.setHouseName(tempHouse);
                        tempThief.setPersuasion(2);
                        tempPersuasion = 2;
                        tempThief.setJob("Thief");
                        tempJob = "Thief";
                        tempPlayer = tempThief;

                        boll = false;

                        break;

                    default:
                        System.out.println("Please enter an acceptable number...");
                        System.out.println();
                }
            } catch (Exception e) {
                System.out.println("Please enter a number...");
                System.out.println();
                scan.next();
            }

        } while (boll);
        boll = true;

        tempPlayer.setCharLevel(1);
        tempPlayer.setCharHealth(100);



        Enemy enemyPotentialMerchant_1 = new Enemy("Merchant", 30, 5.0, 3, 30, "Alive"); //Burası ilk karşılaşacak adam için(?)

        double enemyMerchantHealth_1 = enemyPotentialMerchant_1.getEnemyHealth();
        double enemyMerchantDamage_1 = enemyPotentialMerchant_1.getEnemyAttackPoint();



            System.out.println("\" You going for the Monster aren't you " + tempGender + " " + tempLastName + ".\" ");


        if (tempJob.equals("Thief")) {
            System.out.println("\" But I've never seen your face before. You sure you can do this?\" ");
            answer = scan.next();
            if (answer.equals("yes")) {
                System.out.println("\" Well you do you.\" ");
            } else if (answer.equals("no")) {
                System.out.println("\" Then this is over for you " + tempGender + ".\" ");
                System.exit(1);
            } else {
                System.out.println("\" Does that mean you're no sure or just joking... \nEither way I won't be in your path. \" ");
            }
        } else {
            System.out.println("\"I'm so glad such a noble person is getting to look at this.\" ");
        }

        System.out.println();


        System.out.println();
        System.out.println("\"Terrible, terrible business really since that damn beast.");
        System.out.println("Well even though my pouch is not heavy as it used to be,\nI can spare some coin for the job...");
        System.out.println("So what do you say? 15 coins for the beast' head sounds good eh?\"");
        System.out.println();


        while (boll) {

            possibleConversation();

            System.out.println("7. To see Merchant's Wares: ");
            if (hasBook)
                System.out.println("8. See possible enemies:  ");


            int x = scan.nextInt();

            switch (x) {

                case 1:

                    if (boll_3) {
                        System.out.println("\" Oh thank you, my good " + tempGender + ". Thank you.\" ");
                        System.out.println("\"Here please " + tempGender + ", take this coin.\"\n\"For your journey.\" ");
                        playerCoin = playerCoin + 6;
                        System.out.println();
                        System.out.println("Your coin: " + playerCoin);
                        enemyPotentialMerchant_1.setCoinEnemy(24);
                        System.out.println();
                        System.out.println("\"And please maybe these Health potions will come in handy,\"");
                        counterHealthPotion=counterHealthPotion+5;
                        System.out.println(counterHealthPotion+" Health Potion has been obtained.");
                        System.out.println();
                        System.out.println("\"This is the information I gathered from the locals.\"");

                    } else {
                        System.out.println("\"Thank you! Oh my good " + tempGender + ".\nAlthough I won't be able to pay for your travel expenses.");
                        System.out.println("\"And please maybe these Health potions will come in handy,\"");
                        counterHealthPotion=counterHealthPotion+2;
                        System.out.println(counterHealthPotion+" Health Potion has been obtained.");
                        System.out.println();
                        System.out.println("\"The least I could do is share the information that I gathered.\"");
                    }
                    boll = false;

                    break;
                case 2:

                    randomInt = rand.nextInt(10) + 1;
                    System.out.println("You got " + randomInt);
                    persuasionSum = tempPersuasion + randomInt;
                    System.out.println("And your persuasion level   : " + tempPersuasion);
                    System.out.println(" = " + persuasionSum);
                    System.out.println("Merchant's persuasion level : " + enemyPotentialMerchant_1.getPersuasionLimit());


                    if (persuasionSum >= enemyPotentialMerchant_1.getPersuasionLimit()) {
                        if (enemyPotentialMerchant_1.getCoinEnemy() != 0) {
                            System.out.println("You take their pouch right under their noses.\nFeel the heaviness and the tingling of the coins within.");
                            playerCoin = playerCoin + enemyPotentialMerchant_1.getCoinEnemy();
                            System.out.println("Your coin: " + playerCoin);
                            enemyPotentialMerchant_1.setCoinEnemy(0);
                            tempPersuasion++;
                            tempPlayer.setPersuasion(tempPersuasion);
                            System.out.println("Your Persuasion: " + tempPersuasion);

                        } else {
                            System.out.println("You lean into them to take their pouch...\n But,");
                            System.out.println("But you can't quite feel it's weight.");
                            System.out.println("It's empty.");
                        }

                        boll_3 = false;

                    } else {

                        System.out.println("\" You..? YOU LITTLE THIEF!!!\n How dare you?! ");
                        System.out.println("I'll make you pay for this!\" ");

                        boll_3 = true;

                        while (boll_3) {

                            System.out.println();
                            possibleAction();
                            if(tempPlayer.getJob().equals("Mage"))
                                System.out.println("7. Shield one attack (You won't be able to shield for 2 more turns)");
                            System.out.println();

                            x = scan.nextInt();

                            switch (x) {

                                case 1:
                                    //Burası dövüş sahnesi

                                    if (counterAttack == 0) {

                                        System.out.println("You're attacking the innocent man, a little stingy one maybe but still.");
                                        System.out.println("Even if you're the one who is on the wrong.");
                                        System.out.println("Trying to dig your grave, are you my hero?");
                                        promptEnterKey();
                                    }

                                    counterAttack++;

                                    System.out.println("You ATTACK!!");

                                    randomInt = rand.nextInt(10) + 1;                          //Görmeye gerek yok ondan System.out.println(); ile çıkarmayacağız
                                    persuasionSum = randomInt + tempPlayer.getPersuasion();

                                    System.out.println();
                                    if (persuasionSum >= 9) {                                    //9'u geçerse kritik
                                        System.out.println("Critical Hit!!!");
                                        if (tempWeapon.getUsabilityWeapon())
                                            tempAttack = tempPlayer.criticalHit() + tempWeapon.getWeaponAttackPoint();
                                        else
                                            tempAttack = tempPlayer.criticalHit();
                                    } else {                                                      //9'u geçemezse normal damage
                                        if (tempWeapon.getUsabilityWeapon())
                                            tempAttack = tempPlayer.calculateDamage() + tempWeapon.getWeaponAttackPoint();
                                        else
                                            tempAttack = tempPlayer.calculateDamage();
                                    }

                                    System.out.println("Attacking... " + "Damage done is " + tempAttack);
                                    enemyMerchantHealth_1 = enemyMerchantHealth_1 - tempAttack;

                                    System.out.println("Enemy's health is REDUCED... Remaining Health :  " + enemyMerchantHealth_1);
                                    enemyPotentialMerchant_1.setEnemyHealth(enemyMerchantHealth_1);


                                    if (enemyPotentialMerchant_1.getEnemyHealth() <= 0) {
                                        System.out.println("You did it, you really did kill an innocent man...");
                                        System.out.println();
                                        System.out.println("...");
                                        promptEnterKey();
                                        System.out.println(".");
                                        System.out.println("What can I say? I must say I'm impressed..");
                                        System.out.println("It was a surprise but a welcome one nonetheless.");
                                        System.out.println("Be a dear and grab his things on your way out at least, alright? ");

                                        System.out.println();
                                        System.out.println();
                                        System.out.print("So you go on your way; your path being filled with more garbage,  ");
                                        if (tempWeapon.getUsabilityWeapon())
                                            System.out.print("garbage like the merchant that you've just dirtied your weapon with. \nYour precious " + tempWeapon.getWeaponName() + "...");
                                        System.out.println("Garbage that shouldn't belong to this realm.");
                                        System.out.println();
                                        System.out.println("You'll cleanse it certainly, maybe as a hero.");
                                        System.out.println();
                                        tempLevel++;
                                        tempPlayer.setCharLevel(tempLevel);
                                        System.out.println("You LEVELED UP new Level : " + tempLevel);
                                        tempPlayer.setCharHealth(tempLevel * 100);
                                        tempHealth= tempLevel*100;
                                        playerCoin = enemyPotentialMerchant_1.getCoinEnemy() + playerCoin;
                                        System.out.println("Player coin : " + playerCoin);
                                        enemyPotentialMerchant_1.setEnemyStatus("Deceased");
                                        System.out.println("You killed the " + enemyPotentialMerchant_1.getEnemyName() + " in " + counterAttack + " attacks.");
                                        counterAttack = 0;
                                        System.out.println();


                                        if ((!tempWeapon.getUsabilityWeapon())) {
                                            System.out.println("On your way out you catch a glimpse of a light, a reflection.");
                                            System.out.println("Will you look at it? ");
                                            System.out.println();
                                            answer = scan.next();

                                            if (answer.equals("yes")) {
                                                System.out.println("As you creep closer to the source of the light,");
                                                System.out.println("You see the cause of the light.");
                                                System.out.println("Weapons.");
                                                System.out.println("Beautiful, brand new ones. ");

                                                System.out.println("1. ");
                                                possibleWeapons[0].WeaponInfo();
                                                System.out.println("2. ");
                                                possibleWeapons[1].WeaponInfo();
                                                System.out.println("3. ");
                                                possibleWeapons[2].WeaponInfo();

                                                System.out.println("You can carry only one so you choose... (answer by typing the number of the weapon)");

                                                y = scan.nextInt();

                                                switch (y) {
                                                    case 1:
                                                        if (tempJob.equals("Knight")) {
                                                            tempWeapon = possibleWeapons[0];
                                                            tempWeapon.setUsabilityWeapon(true);
                                                            System.out.println("Your Weapon has been upgraded, ");
                                                            System.out.println("New Weapon : " + tempWeapon.getWeaponName());

                                                        } else {
                                                            System.out.println("But you won't be able to use it " + tempPlayer.getCharName() + " are you sure?");
                                                            answer = scan.next();
                                                            if (answer.equals("yes")) {
                                                                tempWeapon = possibleWeapons[0];
                                                                System.out.println("Your Weapon has been upgraded, ");
                                                                System.out.println("New Weapon : " + tempWeapon.getWeaponName());

                                                            }
                                                        }
                                                        break;

                                                    case 2:
                                                        if (tempJob.equals("Mage")) {
                                                            tempWeapon = possibleWeapons[1];
                                                            tempWeapon.setUsabilityWeapon(true);
                                                            System.out.println("Your Weapon has been upgraded, ");
                                                            System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                                        } else {
                                                            System.out.println("But you won't be able to use it " + tempPlayer.getCharName() + " are you sure?");
                                                            answer = scan.next();
                                                            if (answer.equals("yes")) {
                                                                tempWeapon = possibleWeapons[1];
                                                                System.out.println("Your Weapon has been upgraded, ");
                                                                System.out.println("New Weapon : " + tempWeapon.getWeaponName());

                                                            }
                                                        }
                                                        break;

                                                    case 3:
                                                        if (tempJob.equals("Thief")) {
                                                            tempWeapon = possibleWeapons[2];
                                                            tempWeapon.setUsabilityWeapon(true);
                                                            System.out.println("Your Weapon has been upgraded, ");
                                                            System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                                        } else {
                                                            System.out.println("But you won't be able to use it " + tempPlayer.getCharName() + " are you sure?");
                                                            answer = scan.next();
                                                            if (answer.equals("yes")) {
                                                                tempWeapon = possibleWeapons[2];
                                                                System.out.println("Your Weapon has been upgraded, ");
                                                                System.out.println("New Weapon : " + tempWeapon.getWeaponName());

                                                            }
                                                        }
                                                        break;

                                                }

                                            } else
                                                System.out.println("Well this was your chance to get a shining weapon for free, ");
                                            System.out.println("Onward then, ");

                                        }
                                        boll_3 = false;
                                        boll = false;
                                    } else {

                                        if(!(counterShield==4||counterShield==3)) {
                                            tempHealth = tempHealth - enemyMerchantDamage_1;
                                            System.out.println();
                                            System.out.println("You have been hit!!!");
                                            System.out.println("Your health is reduced... Remaining Health : " + tempHealth);
                                            tempPlayer.setCharHealth(tempHealth);
                                        }
                                        else if(counterShield==4||counterShield==3){
                                            System.out.println("You have blocked the incoming attacks. ");
                                        }

                                        if (!(counterShield <= 0))
                                            counterShield--;

                                        if (counterPersuasion != 0){
                                            counterPersuasion--;
                                            System.out.println("Persuasion counter decreased, ");
                                            System.out.println("Persuasion Counter:" + counterPersuasion);
                                        }


                                        if (tempHealth <= 0) {
                                            System.out.println("First you were gonna kill the beast.");
                                            System.out.println("And then you died.");
                                            promptEnterKey();
                                            System.out.println("...");
                                            System.out.println("wait...");
                                            System.out.println("Let me read again.");
                                            for (int i = 0; i < 20; i++) {
                                                System.out.println("...");
                                            }
                                            promptEnterKey();
                                            System.out.println("YOU DIED?!");
                                            System.out.println("By a merchant.");
                                            System.out.println("BY A ABYDOCOMIST MERCHANT AND NOT. BY. ME!");
                                            System.out.println("(╯°□°)╯︵ ┻━┻");
                                            System.out.println();
                                            System.out.println();
                                            promptEnterKey();
                                            System.out.println("So is this the end,\n And you died before getting to know me?");
                                            System.out.println("Even fates won't let us meet,\n or even catch a glimpse of each other it seems.");
                                            System.out.println("As it is not intervened, I can not undo it nor bind it.");
                                            System.out.println("You see it is a fate that can not be touched, already sealed beyond MY power.");
                                            System.out.println("Sealed by a higher power. ");
                                            System.out.println();
                                            System.out.println("A power that is more powerful than the God of this realm.");
                                            System.out.println("More powerful than me.");
                                            System.out.println("I wouldn't let you die otherwise, would I...");
                                            promptEnterKey();
                                            System.out.println();
                                            System.out.println("Don't know how I will let you go.");
                                            System.out.println("You're already falling within my reach.");
                                            System.out.println("Slipping at each second.");
                                            System.out.println("In another life my dear.");
                                            promptEnterKey();
                                            System.out.println("In another life and time, you will find me I can promise you that.");
                                            System.out.println("So this is no farewell my love, just another beginning.");
                                            System.out.println("Sleep well, 'till I'm certain we will meet again.");
                                            System.out.println("Good night...");

                                            System.exit(1);
                                        }

                                    }

                                    break;

                                case 2:
                                    if (counterPersuasion == 0) {

                                        randomInt = rand.nextInt(10) + 1;
                                        System.out.println("You got " + randomInt);
                                        persuasionSum = tempPersuasion + randomInt;
                                        System.out.println("Plus your persuasion level: " + persuasionSum);
                                        System.out.println();

                                        if (persuasionSum >= enemyPotentialMerchant_1.getPersuasionLimit()) {
                                            System.out.println("\" FINE! But don't let me catch you again you petty " + tempJob + ".\" ");
                                            if (tempPersuasion == 0) {
                                                System.out.println("Your Persuasion:" + tempPlayer.getPersuasion());
                                            } else {
                                                tempPersuasion--;
                                                tempPlayer.setPersuasion(tempPersuasion);
                                                System.out.println("Your Persuasion has decreased, \nNew Persuasion: " + tempPersuasion);
                                            }
                                            boll_3 = false;
                                        } else {
                                            System.out.println("\"Oh no, no, You'll see it's not easy to steal something that belongs to me... \"");
                                            counterPersuasion++;
                                        }
                                    } else if (counterPersuasion < 5) {
                                        System.out.println("\"" + tempGender + ", Please, be reasonable. This is your " + (counterPersuasion+1)+ ". time trying to persuade me.\"");
                                        counterPersuasion++;

                                    } else if (counterPersuasion == 5) {
                                        System.out.println("\"At this point you are trying too hard " + tempGender + ".\"");
                                        counterPersuasion++;
                                    } else if (counterPersuasion == 6) {
                                        System.out.println("\"" + tempGender + " please, please stop.\"");
                                        counterPersuasion++;
                                    } else {
                                        System.out.println("Why?");
                                        System.out.println("Why are you keeping me in this loop?\nDoes this look funny to you? ");
                                        System.out.println("Where is the joke? \n Where. Is. The. Joke. " + username + "?");
                                        System.exit(1);
                                    }

                                    break;


                                case 3:
                                    System.out.println("You run away. Away from that coin you desperately wanted.");
                                    System.out.println("Away from the coin you could have.");
                                    counterRunAway++;

                                    boll_3 = false;

                                    boll = false;

                                    break;

                                case 4:
                                    if (counterHealthPotion == 0) {
                                        System.out.println("You do not have any Potion.");
                                        continue;
                                    } else {
                                        System.out.println("You drink the Potion.");
                                        counterHealthPotion--;
                                        tempHealth = tempHealth + 50;

                                        if (tempHealth >= (tempPlayer.getCharLevel() * 100))
                                            tempHealth = (tempPlayer.getCharLevel() * 100);

                                        tempPlayer.setCharHealth(tempHealth);

                                        System.out.println("Replenished Health    : " + tempHealth);

                                        break;
                                    }

                                case 5:
                                    tempPlayer.CharacterInfo();
                                    continue;

                                case 6:
                                    enemyPotentialMerchant_1.EnemyInfo();
                                    continue;

                                case 7:
                                    if(tempPlayer.getJob().equals("Mage")){
                                        System.out.println();
                                        System.out.println("You have activated your magical shield, it will block two attacks.");
                                        counterShield=4;
                                    }
                                    else
                                        System.out.println("Try again.");
                                    break;


                                default:
                                    System.out.println("Try again.");

                            }

                        }
                    }

                    break;


                case 3:
                    if (boll_2 && boll_3) {

                        System.out.println("\" Hmm what's on your mind " + tempGender + "?\" ");
                        System.out.println();
                        randomInt = rand.nextInt(10) + 1;
                        System.out.println("You got " + randomInt);
                        persuasionSum = tempPersuasion + randomInt;
                        System.out.println("Plus your persuasion level: " + persuasionSum);

                        System.out.println();

                        if (persuasionSum >= enemyPotentialMerchant_1.getPersuasionLimit()) {
                            System.out.println("\" Well then, I think I can make an exception...\"");
                            System.out.print("\"Alright alright, hmm what about :\" ");
                            double reward = 15;
                            reward = reward * 120;
                            reward = reward / 100;
                            System.out.println(reward);

                            tempPersuasion++;
                            tempPlayer.setPersuasion(tempPersuasion);
                            System.out.println("Your Persuasion: " + tempPersuasion);

                            boll_2 = false;

                        } else {
                            System.out.println("\"Sorry, but I must refuse your offer.\" ");
                        }
                    } else if (!boll_2 && boll_3) {
                        System.out.println("\"Isn't it enough young one? \"");
                    } else {
                        System.out.println("\"Sorry, but I must refuse your offer.\" ");
                        if (!boll_3)
                            System.out.println("\"You see I'm a little short on money lately...\nAnd it seems I dropped my pouch somewhere.\" ");
                        boll_2 = false;
                    }
                    break;

                case 4:
                    tempPlayer.CharacterInfo();
                    break;

                case 5:
                    enemyPotentialMerchant_1.EnemyInfo();
                    break;

                case 6:
                    tempWeapon.WeaponInfo();
                    break;

                case 7:

                    if (boll_4) {

                        System.out.println("\"Oh you wanna see my wares " + tempGender + ".\"");
                        System.out.println("\"Here you go, make sure you tell me if you want anything.\"");
                        System.out.println("(Input yes to obtain your first weapon)");
                        System.out.println();

                        while (boll_4) {

                            System.out.println("WARES: ");
                            possibleWeapons[0].WeaponInfo();
                            possibleWeapons[1].WeaponInfo();
                            possibleWeapons[2].WeaponInfo();
                            System.out.println();
                            System.out.println("\"Anything catches your eye " + tempGender + "?\"");
                            System.out.println("(Type \"yes\" if yo want to buy a weapon)");


                            answer = scan.next();

                            if (answer.equals("yes")) {
                                System.out.println("\"Name it and it is yours. On the house this time.\"");

                                answer = scan.next();

                                if (answer.equals("Aerondight")) {
                                    if (tempJob.equals("Knight")) {
                                        System.out.println("\"An excellent choice, let me...\" ");
                                        tempWeapon = possibleWeapons[0];
                                        tempWeapon.setUsabilityWeapon(true);
                                        System.out.println("Your Weapon has been upgraded, ");
                                        System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                        boll_4 = false;


                                    } else {
                                        System.out.println("\"But you won't be able to use it " + tempGender + " are you sure?\"");

                                        answer = scan.next();
                                        if (answer.equals("yes")) {
                                            System.out.println("\"Oh well here you go.\"");
                                            tempWeapon = possibleWeapons[0];
                                            System.out.println("Your Weapon has been upgraded, ");
                                            System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                            boll_4 = false;
                                        } else
                                            System.out.println("\"Let's find you something more more of your style, shall we?\"");
                                    }


                                } else if (answer.equals("Dawnlight")) {
                                    if (tempJob.equals("Mage")) {
                                        System.out.println("\"An excellent choice, let me...\" ");
                                        tempWeapon = possibleWeapons[1];
                                        tempWeapon.setUsabilityWeapon(true);
                                        System.out.println("Your Weapon has been upgraded, ");
                                        System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                        boll_4 = false;

                                    } else {
                                        System.out.println("\"But you won't be able to use it " + tempGender + " are you sure?\"");
                                        answer = scan.next();
                                        if (answer.equals("yes")) {
                                            System.out.println("\"Oh well here you go.\"");
                                            tempWeapon = possibleWeapons[1];
                                            System.out.println("Your Weapon has been upgraded, ");
                                            System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                            boll_4 = false;
                                        } else
                                            System.out.println("\"Let's find you something more more of your style, shall we?\"");
                                    }


                                } else if (answer.equals("Omen")) {
                                    if (tempJob.equals("Thief")) {
                                        System.out.println("\"An excellent choice, let me... \"");
                                        tempWeapon = possibleWeapons[2];
                                        tempWeapon.setUsabilityWeapon(true);
                                        System.out.println("Your Weapon has been upgraded, ");
                                        System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                        boll_4 = false;

                                    } else {
                                        System.out.println("\"But you won't be able to use it " + tempGender + " are you sure?\"");
                                        answer = scan.next();
                                        if (answer.equals("yes")) {
                                            System.out.println("\"Oh well here you go.\"");
                                            tempWeapon = possibleWeapons[2];
                                            System.out.println("Your Weapon has been upgraded, ");
                                            System.out.println("New Weapon : " + tempWeapon.getWeaponName());
                                            boll_4 = false;
                                        } else
                                            System.out.println("\"Let's find you something more more of your style, shall we?\"");
                                    }

                                } else {
                                    System.out.println("\"Unfortunately, I do not sell something with that name.\"");
                                    System.out.println("\"Perhaps you should take a closer look.\"");
                                }
                            } else {
                                System.out.println("\"Another time then?\"");
                                break;
                            }
                        }
                    } else {
                        System.out.println("\"I don't think you can provide the amount " + tempGender + ".\"");
                    }

                    break;

                case 8:

                    arrayOfEnemies(possibleEnemy);
                    break;

                default:
                    System.out.println("Enter an acceptable value... ");
                    break;
            }
        }

        // 3 boolean'i de true yaptım ilerisi için
        boll = true;
        boll_2 = true;
        boll_3 = true;
        boll_4 = true;
        counterPersuasion = 0;
        counterShield = 0;

        System.out.println();
        System.out.println("You're going away, away from the village once you lived.");
        System.out.println("Going by foot is perhaps slower but is certainly more breathtaking as you sightsee the environment.");
        System.out.println();


        //Şu araya ilk weapon bulma koyarız

        //Buraya etrafı vs tanımlarız hikayeye derinlik vs katarız AMA sonra



        System.out.println();
        System.out.println("In the dark you feel like you been watched. And you take a look around.");
        System.out.println("When the wind blows, a shiver went down your spine. Then,");


        randomEnemy = rand.nextInt(4);              //Bu array'dan 0-4 arasındaki enemy'lerden birini çıkaracak
        randomEnemyNumber = rand.nextInt(2) + 2;     //Bu enemy 2 veya 3 tane karşımıza çıkacak

        tempEnemy = possibleEnemy[randomEnemy];
        tempEnemyHealth = possibleEnemy[randomEnemy].getEnemyHealth() * randomEnemyNumber;     // Kaç tane ise o kadar çarpı canları olacak


        System.out.println("You come across " + randomEnemyNumber + " " + possibleEnemy[randomEnemy].getEnemyName() + "s.");

        promptEnterKey();

        if (randomEnemy == 2) {
            System.out.println("When you catch their eyes, you see hunger and wildness.");
            System.out.println();
            System.out.println("\"Well well, look who is here... Oh my little " + tempGender + ".\" Says the tall one.");
            System.out.println("\"Looks like we have hot hand my brother!\" Says the other one.");
            System.out.println();
            System.out.println("And then they shriek with laughter.");
            System.out.println();
            System.out.println("You need to decide what to do now...");
            System.out.println();
        }

        do {
            possibleAction();
            if (hasBook)
                System.out.println("7. See possible enemies:  ");
            if(tempPlayer.getJob().equals("Mage"))
                System.out.println("8. Shield for two turns");

            y = scan.nextInt();

            switch (y) {

                case 1:

                    if (counterAttack == 0) {
                        System.out.println();
                        System.out.println("You decide to attack to the " + possibleEnemy[randomEnemy].getEnemyName() + "s.");
                        System.out.println("Because you know they won't understand anything from talking... \n These goofies!");
                    }

                    for (int i = 0; i < randomEnemyNumber; i++) {

                        counterAttack++;
                        System.out.println();
                        System.out.println(possibleEnemy[randomEnemy].getEnemyName() + "s' attack level : " + possibleEnemy[randomEnemy].getEnemyAttackPoint());

                        System.out.println("Attacking to " + (i + 1) + ". enemy:");


                        randomInt = rand.nextInt(10) + 1;
                        persuasionSum = randomInt + tempPlayer.getPersuasion();

                        System.out.println();

                        if (persuasionSum >= 10) {                                    //10 geçerse kritik
                            System.out.println("Critical Hit!!!");
                            if (tempWeapon.getUsabilityWeapon())
                                tempAttack = tempPlayer.criticalHit() + tempWeapon.getWeaponAttackPoint();
                            else
                                tempAttack = tempPlayer.criticalHit();
                        } else {                                                      // geçemezse normal damage
                            if (tempWeapon.getUsabilityWeapon())
                                tempAttack = tempPlayer.calculateDamage() + tempWeapon.getWeaponAttackPoint();
                            else
                                tempAttack = tempPlayer.calculateDamage();
                        }

                        System.out.println("Attacking... " + "Damage done is " + tempAttack);
                        tempEnemyHealth = tempEnemyHealth - tempAttack;

                        System.out.println("Enemy's TOTAL health is REDUCED... Remaining Health :  " + tempEnemyHealth);

                        possibleEnemy[randomEnemy].setEnemyHealth(tempEnemyHealth / randomEnemyNumber);

                        if (possibleEnemy[randomEnemy].getEnemyHealth() <= 0) {
                            possibleEnemy[randomEnemy].setEnemyStatus("Deceased");
                            System.out.println();
                            System.out.println("You just killed them all!");
                            System.out.println("They had no chance against you,actually. So that is not a surprise to you, huh?");

                            tempLevel++;
                            tempPlayer.setCharLevel(tempLevel);
                            System.out.println("You LEVELED UP new Level : " + tempLevel);
                            tempPlayer.setCharHealth(tempLevel * 100);
                            playerCoin = tempEnemy.getCoinEnemy() + playerCoin;
                            System.out.println("Player coin : " + playerCoin);
                            possibleEnemy[randomEnemy].setEnemyStatus("Deceased");
                            System.out.println("You killed the " + tempEnemy.getEnemyName() + " in " + counterAttack + " attacks.");
                            tempHealth= tempLevel*100;
                            boll = false;
                            break;

                        } else if (tempHealth <= 0) {
                            System.out.println("Nice try,really...");
                            System.out.println("But you know,sometimes trying is not enough.");
                            System.out.println("Oh you wonder why I am talking like that right...");
                            promptEnterKey();
                            System.out.println("It is hard to say b-but");
                            System.out.println("...YOU DIED...");
                            System.out.println("But don't be sad,I will always be here and wait for you to play again.");
                            System.out.println("It is affective separation but no I am not crying...");
                            System.out.println("SEE YOU IN ANOTHER LIFE...");
                            System.exit(1);

                        } else {
                            if(!(counterShield==4||counterShield==3)) {
                                tempHealth = tempHealth - tempEnemy.getEnemyAttackPoint();
                                System.out.println();
                                System.out.println("You have been hit!!!");
                                System.out.println("Your health is reduced... Remaining Health : " + tempHealth);
                                tempPlayer.setCharHealth(tempHealth);
                                System.out.println();

                            }
                                if (!(counterShield <= 0))
                                    counterShield--;


                                else  if((counterShield==4||counterShield==3)) {
                                    System.out.println("You have blocked the incoming attacks. ");
                                }

                            if (counterPersuasion != 0){
                                counterPersuasion--;
                                System.out.println("Persuasion counter decreased, ");
                                System.out.println("Persuasion Counter:" + counterPersuasion);
                            }

                        }

                    }

                    break;


                case 2:

                    if (counterPersuasion == 0) {

                        System.out.println("You decide to persuade the " + possibleEnemy[randomEnemy].getEnemyName() + "s.");
                        randomInt = rand.nextInt(10) + 1;
                        System.out.println("You got " + randomInt);
                        persuasionSum = tempPersuasion + randomInt;
                        System.out.println("And your persuasion level   : " + tempPersuasion);
                        System.out.println(" = " + persuasionSum);
                        System.out.println(possibleEnemy[randomEnemy].getEnemyName() + "s' persuasion level : " + possibleEnemy[randomEnemy].getPersuasionLimit());

                        if (persuasionSum >= possibleEnemy[randomEnemy].getPersuasionLimit()) {
                            System.out.println("Success!");
                            tempPersuasion++;
                            tempPlayer.setPersuasion(tempPersuasion);
                            System.out.println("New persuasion:  " + tempPlayer.getPersuasion());

                            switch (randomEnemy) {

                                case 0:
                                    System.out.println("You open your rucksack and find a fleshy bone that is too heavy to carry,\nand impossible to be in there.");
                                    System.out.println("You would remember if you picked it up right?");
                                    if (enemyPotentialMerchant_1.getEnemyStatus().equals("Deceased"))
                                        System.out.println("Could it be the from the Merchant earlier?\n...Uh...");

                                    System.out.println("Well... Let us not dilly dally.\n Do want to give the bone to the wolves?");
                                    answer = scan.next();

                                    if (answer.equals("no")) {
                                        System.out.println("Well this is not good is it?");
                                        System.out.println("You have their attention back on you again.");
                                        System.out.println("Ready to attack.");
                                        System.out.println("You won't be able to persuade them for 4 more turns.");
                                        counterPersuasion = 4;

                                    } else {
                                        System.out.println("The wolves run towards to bone looking like... hungry wolves?");
                                        System.out.println("And then their intense gaze turns towards you.");
                                        System.out.println("You asks whoever listens that are you going to be their next meal after all.");
                                        if (tempWeapon.getWeaponType().equals("Sword"))
                                            System.out.print("Just when you unsheathe your " + tempWeapon.getWeaponName() + ", you hear a playful tone.");
                                        else if (tempWeapon.getWeaponType().equals("Wand"))
                                            System.out.print("Just when you are about to cast a spell with your " + tempWeapon.getWeaponName() + ", you hear a playful tone.");
                                        else if (tempWeapon.getWeaponType().equals("Dagger"))
                                            System.out.print("Just when you unsheathe your " + tempWeapon.getWeaponName() + ", you hear a playful tone.");
                                        else if (tempWeapon.getWeaponType().equals("Shield"))
                                            System.out.print("Just when you lift your " + tempWeapon.getWeaponName() + ", you hear a playful tone.");
                                        else
                                            System.out.println("Just when you lift your hands up to accept your fate, you hear a playful tone.");
                                        System.out.println("The wolves lay on their back asking for pets.");
                                        System.out.println("And who are you to say no?");
                                        System.out.println("When life give you fully grown adult puppies you pet them.");
                                        System.out.println("As you pet them one of them leaves.");
                                        System.out.println("Then comes back, carrying something looking like a dirt ball towards you.");
                                        System.out.println("It's a pouch, a heavy pouch.");
                                        promptEnterKey();
                                        System.out.println();
                                        System.out.println("It contains at least 26 coins. And a health potion.");
                                        playerCoin = +30;
                                        counterHealthPotion++;
                                        System.out.println();
                                        System.out.println("Your coin : " + playerCoin);
                                        System.out.println();
                                        System.out.println("Health potion count : " + counterHealthPotion);
                                        System.out.println();
                                        tempPersuasion++;
                                        tempPlayer.setPersuasion(tempPersuasion);
                                        System.out.println("Your Persuasion: " + tempPersuasion);
                                        promptEnterKey();
                                        System.out.println("After an hour later you got up to leave and finally continue your destination.");
                                        System.out.println("You hear a few whining noises but do not turn back.");
                                        boll = false;
                                    }

                                    break;

                                case 1:
                                    System.out.println();
                                    System.out.println("You take a deep breath and begin,");
                                    System.out.println();
                                    System.out.println("You talk about how their mother misses them. ");   //Bandit
                                    System.out.println("How they haven't seen each other in so many years...");
                                    System.out.println("Tell them they were a tiny wobbly baby with little arms,");
                                    promptEnterKey();
                                    System.out.println("So you go on... until,");
                                    System.out.println("You reach for your rucksack open it and find a violin.");
                                    System.out.println("You wonder of course, How? How could it be in your rucksack? You don't even know how to play.");
                                    System.out.println("But with one look around you you see the bandits, they are ready for you to play.");
                                    System.out.println("One of them is sniffing.");
                                    System.out.println("You want to try playing? ");
                                    answer = scan.next();

                                    if (answer.equals("no")) {
                                        System.out.println();
                                        System.out.println("Well this is not good is it?");
                                        System.out.println("You have their attention back on you again.");
                                        System.out.println("Ready to attack.");
                                        System.out.println("You won't be able to persuade them for 4 more turns.");
                                        counterPersuasion = 4;
                                    } else {
                                        System.out.println("We'll take that as a 'yes' then alright.");
                                        System.out.println();
                                        randomInt = rand.nextInt(10) + 1;
                                        System.out.println("You got " + randomInt);
                                        persuasionSum = tempPersuasion + randomInt;
                                        System.out.println("And your persuasion level   : " + tempPersuasion);
                                        System.out.println(" = " + persuasionSum);
                                        enemyPersuasionSum = (possibleEnemy[1].getPersuasionLimit() * (randomEnemyNumber-1));
                                        System.out.println("Bandits' Persuasion Sum is: " + enemyPersuasionSum);

                                        System.out.println();

                                        System.out.println("You trace your fingers along the strings.");
                                        System.out.println("Trying to grab onto that familiar feeling this instrument brought upon you.");
                                        System.out.println("You rest your chin, lift the bow and then, ");
                                        System.out.println("Then,");

                                        if (enemyPersuasionSum <= persuasionSum) {
                                            System.out.println();
                                            promptEnterKey();
                                            System.out.println("Then you play.");
                                            System.out.println("You realize that yes, you really miraculously learned how to play.");
                                            System.out.println("As you continue playing you see them passing each other napkins.");
                                            System.out.println("You're sure you'll somehow get out of this mess. It is fine.");
                                            System.out.println("When you're coming to the end of the music you hear cheers, \nand is that a flower that thrown at your feet?");
                                            System.out.println();
                                            if (tempPlayer.getPersuasion() > 4)
                                                System.out.println("You hear distant footsteps getting away... But you're too occupied to pay attention.");
                                            System.out.println();
                                            System.out.println("They look at you strangely, as in a trance. ");
                                            System.out.println("You can see them recollecting memories of their once upon a time ago homes.");
                                            System.out.println("One of them hands you a pouch, a heavy pouch. ");
                                            System.out.println("You can feel the dried texture and not sure if it is because of the spilled blood over time.");
                                            promptEnterKey();
                                            playerCoin = playerCoin + 40;
                                            System.out.println();
                                            System.out.println("Your coin : " + playerCoin);
                                            tempPersuasion++;
                                            tempPlayer.setPersuasion(tempPersuasion);
                                            System.out.println("Your Persuasion: " + tempPersuasion);
                                            promptEnterKey();
                                            System.out.println();
                                            System.out.println("After what feels like a forever, you finally continue your destination.");
                                            System.out.println("You're sure these bandits killed at least a dozen, and probably a heartfelt music won't make them stop.");
                                            System.out.println("You should consider treating them a soup while talking about life and what not. Maybe they will come around");
                                            System.out.println("Even if they don't you know how to neutralize them.");
                                            System.out.println();
                                            boll = false;
                                        } else {
                                            promptEnterKey();
                                            System.out.println();
                                            System.out.println("You realize that yes, you didn't miraculously learn how to play.");
                                            System.out.println("If you were on stage you would've felt shame from this performance.");
                                            System.out.println("Fortunately this is a battle. And the bandits seem to get themselves under control.");
                                            System.out.println("Even if they're still a bit teary eyed.");
                                            System.out.println();
                                            if (tempWeapon.getWeaponType().equals("Sword"))
                                                System.out.print("You unsheathe your sword " + tempWeapon.getWeaponName() + ".");
                                            else if (tempWeapon.getWeaponType().equals("Wand"))
                                                System.out.print("You lift your wand " + tempWeapon.getWeaponName() + ".");
                                            else if (tempWeapon.getWeaponType().equals("Dagger"))
                                                System.out.print("You unsheathe your dagger " + tempWeapon.getWeaponName() + ".");
                                            else if (tempWeapon.getWeaponType().equals("Shield"))
                                                System.out.print("You lift your shield " + tempWeapon.getWeaponName() + ".");
                                            else
                                                System.out.println("You lift your hands up to accept your fate. Fists it is then.");
                                            System.out.println();
                                            System.out.println("If they want more fighting, you're only too happy to oblige.");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("You won't be able to persuade them for 4 more turns.");
                                            counterPersuasion = 4;

                                        }

                                    }
                                    break;


                                case 2:                                        //Cannibal  (Nasıl dikkat dağıtılır bilmiyorum part 1)

                                    System.out.println();
                                    System.out.println("You decide to persuade cannibals.");
                                    System.out.println("But how?...");
                                    promptEnterKey();
                                    System.out.println("Maybe using their cannibal sides could help you.");
                                    System.out.println("You say you just killed a man among the trees.And they can eat him,if they let you go.");
                                    System.out.println();

                                    randomInt = rand.nextInt(10) + 1;
                                    System.out.println("You got " + randomInt);
                                    persuasionSum = tempPersuasion + randomInt;
                                    System.out.println("Players persuasion level   : " + tempPersuasion);
                                    System.out.println(" = " + persuasionSum);
                                    enemyPersuasionSum = (possibleEnemy[2].getPersuasionLimit() * randomEnemyNumber) - 1;
                                    System.out.println("Cannibals persuasion sum is: " + enemyPersuasionSum);
                                    if (enemyPersuasionSum <= persuasionSum) {
                                        System.out.println("They whisper to each other.Then one of them says: \n Okay, show me where he is...");
                                        System.out.println("You realize their plan,when you show the body");
                                        System.out.println("They will eat you too,two birds with one stone!");
                                        System.out.println("But you have a plan and they don't know about it...");
                                        System.out.println("Firstly you will kill one of them so you gain some time.");
                                        promptEnterKey();
                                        System.out.println("The cannibal followed you through trees, have a quick look around.");
                                        System.out.println("It is time to do your move!You should kill it now!");
                                        System.out.println();
                                        System.out.println("You take your weapon and start fighting with the cannibal.");
                                        System.out.println("When you try to kill it, the other one hear the voices.");
                                        System.out.println("You see other one among the trees in a matter of minutes.");
                                        System.out.println("When the other cannibal prepares to attack you,\n you cut the one's arm you fighting.");
                                        System.out.println("And you throw the arm to other cannibal.");
                                        System.out.println();
                                        System.out.println("Seeing a bloody arm distracts it!At the same time the one that you cut its arm faints.");
                                        System.out.println("While nobody pays attention to you,it is better choice you to take to the heels!");
                                        promptEnterKey();
                                        playerCoin = playerCoin + 63;
                                        System.out.println();
                                        System.out.println("Your coin : " + playerCoin);
                                        tempPersuasion++;
                                        tempPlayer.setPersuasion(tempPersuasion);
                                        System.out.println("Your Persuasion: " + tempPersuasion);
                                        promptEnterKey();

                                        boll = false;

                                    } else if (enemyPersuasionSum > persuasionSum) {

                                        System.out.println();
                                        System.out.println("You have a plan but unfortunately you are not that sure about it.");
                                        System.out.println("You should know that suspicion brings failure...");
                                        promptEnterKey();
                                        System.out.println("They laugh at you and say \n 'Poor thing thinks that fooling us is easy!'");
                                        System.out.println("And they laugh again.");
                                        System.out.println("Since you feel humiliated you decide to kill them now...");
                                        if (tempWeapon.getWeaponType().equals("Sword"))
                                            System.out.print("You unsheathe your sword " + tempWeapon.getWeaponName() + ".");
                                        else if (tempWeapon.getWeaponType().equals("Wand"))
                                            System.out.print("You lift your wand " + tempWeapon.getWeaponName() + ".");
                                        else if (tempWeapon.getWeaponType().equals("Dagger"))
                                            System.out.print("You unsheathe your dagger " + tempWeapon.getWeaponName() + ".");
                                        else if (tempWeapon.getWeaponType().equals("Shield"))
                                            System.out.print("You lift your shield " + tempWeapon.getWeaponName() + ".");
                                        else
                                            System.out.println("You stretch your hands and prepare yourself to a fist fight against the cannibals.");
                                        System.out.println();
                                        System.out.println("'So this is what you want.'");
                                        System.out.println("Alright then, I'm going to give you a painful death!!!");
                                        System.out.println();
                                        System.out.println("You won't be able to persuade them for 4 more turns.");
                                        counterPersuasion = 4;

                                    }
                                    break;


                                case 3:                                                                                 //Ghoul
                                    System.out.println("****");
                                    System.out.println("You look at their scarlet eyes.");
                                    System.out.println("And then shout with all you have,");
                                    System.out.println("'Do you  really gonna try to attack me...!'");
                                    System.out.println("'Me the mighty herooooo!!!'");
                                    System.out.println("'I have 100 thousand mans waiting for my command! '");
                                    System.out.println("'Even if you successfully injure me you have no future!!!!'");
                                    System.out.println("'Hahahahahahahahahhahaha'");
                                    promptEnterKey();
                                    System.out.println("'You fools you're gonna die with repentance while I cut of your heads and crush your brains!'");
                                    System.out.println("'Hahahahahahahahahhahaha'");
                                    System.out.println("While you scream at them a drop of sweat goes down from your spine.");
                                    System.out.println("And their growling sound echoed in the forest.");
                                    System.out.println("'I will give you a chance for your un-worthy lifes.'");
                                    System.out.println("'Now run away!!!'");
                                    System.out.println("You swing your hand to them and wait for their response ");
                                    System.out.println("When your eyes go and return the two of them, you pry to your bluff to work.");

                                    System.out.println();
                                    // NOW SEE THE PERSUASİON VALUES
                                    randomInt = rand.nextInt(10) + 1;
                                    System.out.println("You got " + randomInt);
                                    persuasionSum = tempPersuasion + randomInt;
                                    System.out.println("Players persuasion level   : " + tempPersuasion);
                                    System.out.println(" = " + persuasionSum);
                                    enemyPersuasionSum = (possibleEnemy[3].getPersuasionLimit() * randomEnemyNumber) - 1;
                                    System.out.println("Ghouls Persuasion Sum is: " + enemyPersuasionSum);

                                    if (enemyPersuasionSum <= persuasionSum) {

                                        System.out.println("The ghouls look the vast forest,you can see that one of the ghoul eyes were wavering");
                                        System.out.println("When you see that you continue to talk,");
                                        System.out.println("'Yes, you heared it...");
                                        System.out.println("Now run, run for your lifes!!!' ");
                                        System.out.println("Hahahahahahahahaha!!!");
                                        System.out.println("One of the ghouls, a young looking one take a step to back, and talk hesitantly, ");
                                        System.out.println("H-hey...");
                                        System.out.println("'M-Maybe we should look for a another prey...'");
                                        promptEnterKey();
                                        System.out.println("The other replied,");
                                        System.out.println("What the hack! Get back here you coward!");
                                        System.out.println("B-But 100 thousand soldier...?");
                                        System.out.println("It's clearly a lie!!!");
                                        System.out.println("B-But if it's not...");
                                        System.out.println("After saying that the trees shake with a strong wind.");
                                        System.out.println("The young ghoul wobble to back and than fall to the ground.");
                                        System.out.println("After stand back he start to run inside the deep forest");
                                        System.out.println("'Y-You, you cowarddddd'");
                                        System.out.println("'Came back hereeee!!!'");
                                        System.out.println("The ghoul, who left behind by the other look at you and her run away friend look at you");
                                        System.out.println("and the board forest.");
                                        System.out.println("She swing her hand to you and than shout,");
                                        System.out.println("This is not over here!");
                                        System.out.println("W-We will take our revenge!");
                                        System.out.println("While turning around she continue,");
                                        System.out.println("We're gonna kill you someday!!!");
                                    } else {
                                        System.out.println("One of the ghouls start to laugh, and and then she talk,");
                                        System.out.println("'This is clearly a lie, what do you think we are! Brainless zombies!?'");
                                        System.out.println("The other ghoul looking little nervous, continue to look to the forest. ");

                                        if (tempWeapon.getWeaponType().equals("Sword"))
                                            System.out.print("You unsheathe your sword " + tempWeapon.getWeaponName() + ".");
                                        else if (tempWeapon.getWeaponType().equals("Wand"))
                                            System.out.print("You lift your wand " + tempWeapon.getWeaponName() + ".");
                                        else if (tempWeapon.getWeaponType().equals("Dagger"))
                                            System.out.print("You unsheathe your dagger " + tempWeapon.getWeaponName() + ".");
                                        else if (tempWeapon.getWeaponType().equals("Shield"))
                                            System.out.print("You lift your shield " + tempWeapon.getWeaponName() + ".");
                                        else
                                            System.out.println("You stretch your hands and prepare yourself to a fist fight againts the ghouls");
                                        System.out.println();
                                        System.out.println("'So this is what you want.'");
                                        System.out.println("Alright then, I'm going to give you a painfull death!!!");
                                        System.out.println("*************");
                                        System.out.println("You won't be able to persuade them for 4 more turns.");
                                        counterPersuasion = 4;
                                    }


                                default:
                                    System.out.println("This monster doesn't belong here.");
                                    continue;

                            }

                        } else {
                            System.out.println("You dancing like a headless chicken unfortunately did not make them laugh.");
                            System.out.println("More than that now you look more easy to devour.");
                            System.out.println("...");
                            System.out.println("(You won't be able to persuade them for 4 more rounds.)");
                            counterPersuasion = 4;
                        }
                    } else {
                        System.out.println("You can't persuade them while they still remember your failure.");
                        System.out.println("Counter :   " + counterPersuasion);
                        continue;
                    }

                    break;


                case 3:

                    if (counter == 0) {
                        System.out.println("You ran away...?");

                        if (counterRunAway == 1)
                            System.out.println("AGAIN???");


                        if (possibleEnemy[randomEnemy].getEnemyName().equals("Bandit") || possibleEnemy[randomEnemy].getEnemyName().equals("Cannibal"))
                            System.out.println("You could have killed them. They are no more human than a rabid dog ready for the kill.");
                        System.out.println("Where is the courageous " + tempGender + " that is planning on slaying the Beast.");
                        System.out.println("Are you really sure you want to run away?");
                        answer = scan.next();
                        if (answer.equals("yes")) {
                            System.out.println("Alright, so it is then, so it is " + tempGender + ".");
                            System.out.println("You run away.");
                            counterRunAway++;
                            boll = false;
                        } else {
                            System.out.println("I'll take that as a \"NO!\".");
                            System.out.println("You know since I'm the narrator I have to tell your story as heroic as possible,");
                            System.out.println("Don't you think so " + username + "?");
                            System.out.println("I'm glad we're on the same page.");
                            counter++;
                        }
                    } else {
                        System.out.println("I guess we have not come to an agreement.");
                        System.out.println("You run away alright...");
                        System.out.println("Coward.");
                        counterRunAway++;
                        boll = false;
                    }

                    break;

                case 4:

                    if (counterHealthPotion == 0) {
                        System.out.println("You do not have any Potion.");
                        continue;
                    } else {
                        System.out.println("You drink the Potion.");
                        counterHealthPotion--;
                        tempHealth = tempHealth + 50;

                        if (tempHealth >= (tempPlayer.getCharLevel() * 100))
                            tempHealth = (tempPlayer.getCharLevel() * 100);

                        tempPlayer.setCharHealth(tempHealth);

                        System.out.println("Replenished Health    : " + tempHealth);

                        break;
                    }

                case 5:
                    System.out.println();
                    tempPlayer.CharacterInfo();
                    System.out.println();
                    continue;

                case 6:
                    System.out.println();
                    for (int i = 0; i < randomEnemyNumber; i++)
                        possibleEnemy[randomEnemy].EnemyInfo();
                    System.out.println();
                    continue;


                case 7:
                    arrayOfEnemies(possibleEnemy);
                    System.out.println("Please enter an acceptable number.");
                    break;

                case 8:
                    if(tempPlayer.getJob().equals("Mage")){
                        System.out.println();
                        System.out.println("You have activated your magical shield, it will block two attacks.");
                        counterShield=4;
                    }
                    else
                        System.out.println("Try again.");
                    break;


                default:
                    System.out.println();
                    System.out.println("Please enter an acceptable number.");

            }


        } while (boll);

        boll = true;

        System.out.println();
        System.out.println();

        System.out.println("It becomes darker and darker every passing second.");
        System.out.println("You see myriad of pathways, ");
        System.out.println();
        System.out.println("At the end of the north pathway you can see a shining pond which reflects the beauty around it. \nBut also above it a mysterious mist covering some parts that seems moving.");
        System.out.println();
        System.out.println("At the near end of the south pathway you can see a village deep in the woods, lights already lit.\nBut no sound of the villagers.");
        System.out.println("On this journey you went to various directions of course. One of them being: ");
        System.out.println();


        while (boll) {

            System.out.println("1.North \n2.South ");
            System.out.println("Please pick a path : ");
            System.out.println();

            y = scan.nextInt();

            switch (y) {
                case 1:                             //Bu Rusalka

                    tempEnemy = possibleEnemy[4];
                    tempEnemyHealth = tempEnemy.getEnemyHealth();

                    System.out.println("You chose the North pathway.");
                    System.out.println("Maybe this is where you finally demolish that awful thirst.");
                    System.out.println("As you get closer to the lake you can feel the air getting colder, getting harder to breathe.");
                    System.out.println("...");
                    System.out.println("You hear a muffled scream.");
                    System.out.println("Splashes of water, then screams, screams once more.");
                    System.out.println("...");
                    promptEnterKey();
                    System.out.println("At this point forward you have at least a little survival instinct to be cautious.");
                    System.out.println("One step at a time, ");
                    System.out.println("...");
                    System.out.println("Right,    Left,    Right,");
                    System.out.println("...");
                    promptEnterKey();
                    System.out.println("You hear a hum, ");
                    System.out.println("A hum full of sorrow,\nA hum so breathy as it can't catch the right tone.");
                    System.out.println("...");
                    System.out.println("Left,     Right");
                    System.out.println("...");
                    promptEnterKey();
                    System.out.println("The humming intensifies.");
                    System.out.println("...");
                    System.out.println("Right,                   Left,");
                    System.out.println("...");
                    System.out.println("Silence, no more muffled screams nor the humming that calls for home.");
                    System.out.println("Screams no more.");
                    System.out.println("...");
                    promptEnterKey();
                    System.out.println("A laugh and nothing more.");
                    System.out.println("...");
                    System.out.println("There it is, ");
                    System.out.println("The Cerulean lake that screams. The lake that swallows the travelers.");
                    System.out.println();
                    promptEnterKey();
                    System.out.println("The mist dissipate as you finally see the lady.");
                    System.out.println("You see a... woman.\n no, \n  No a girl. You see a girl who has not reached her twenty. ");
                    System.out.println();
                    System.out.println("Red hair like fire spread as she dance over the lake full of corpses.");
                    System.out.println("A wicked smile on her once innocent face, slowly turning sour when the corpse in her hands begin stiffing.");
                    System.out.println("Clearly the fellow fell exhausted from this crazy dance.\nThis waters his grave.\nHis new home.");
                    promptEnterKey();
                    System.out.println("Tip of her toe touches water, splashing it, creating waves.");
                    System.out.println("She drops the body as she sees you. Smile returning, eyes burning with awful intent.");
                    System.out.println("The drowned body returns where it belongs from this day to eternity.\n Now dark waters welcome the body as it resides.");
                    System.out.println("...");
                    System.out.println("You flinch,\nYou are in danger, danger indeed.");
                    promptEnterKey();

                    if (!(tempPlayer.getCharGender().equals("Male"))) {
                        System.out.println("You heard the tales of course.");
                        System.out.println("The bedtime horror stories, lullabies to scare the children.");
                        System.out.println("In a world full of wicked monsters, you learn to fear,");
                        System.out.println("Fear the most horrible, the most terrible,");
                        System.out.println("you simply fear.");
                        promptEnterKey();
                        System.out.println();
                        System.out.println("The stories always states a fact.");
                        System.out.println("They say: ");
                        System.out.println("Be afraid, be very afraid of the mankind that knows themselves as the best.");
                        System.out.println("Direct your gaze, your direction,");
                        System.out.println("The resentment they feel; their hatred towards one other, it possesses their actions.");
                        System.out.println("Makes them blind in rage, killing clear pathways.");
                        promptEnterKey();
                        System.out.println("When comes the day they kill the innocents, ");
                        System.out.println("No one to stop them, those innocent girls drowned ");
                        System.out.println("sometimes comes back; back in a new flesh, back with a new face...");
                        promptEnterKey();
                        System.out.println("Then they begin to dance, ");
                        System.out.println();
                        System.out.println("They dance because they are free, free, free.");
                        System.out.println("They dance because no more lost innocent lives in that lake anymore...");
                        System.out.println("No more innocent, just revenge.");
                        System.out.println("Just a big revenge that clouds her little mind.");
                        System.out.println();
                        System.out.println();
                        promptEnterKey();
                        System.out.println("You hear a cackle, then a snicker; ");
                        System.out.println("\"You are no boy \nnor man...\"");
                        System.out.println("\"You shouldn't be here, you shouldn't get drowned, go.\"");
                        System.out.println("\"This shall be my own last warning.\"");
                        System.out.println();
                        System.out.println("You stand tall against what known as the sad, vile, now dead girl that is born from the mankind's greatest mistakes.");
                        System.out.println();
                        promptEnterKey();


                        while (boll_2) {
                            System.out.println("1. Ask what happened to her? ");
                            System.out.println("2. \"No more drowning random people, this has to end!\"");
                            System.out.println("3. \"OK, bye.\"");

                            y = scan.nextInt();

                            switch (y) {

                                case 1:
                                    if (boll_3) {
                                        System.out.println();
                                        System.out.println("You ask her story, ");
                                        System.out.println("Story of her short life but long death.");
                                        System.out.println("She squints her eyes; confused, a little surprised but not unwelcome.");
                                        System.out.println("\"Why?\" She asks,\"You could not change what is already done, you can not change who I am.\"");
                                        System.out.println("Her voice strong, never wavers, never doubtful.");
                                        promptEnterKey();
                                        System.out.println();
                                        System.out.println("You meet her eyes,");
                                        System.out.println("1. \"I want to get to know you, help you...\"");                        // Then Select Mother to make her available to persuade
                                        System.out.println("2. \"Maybe not, but you are not free as you think you are.\"");         // Then Select Priest to make her available to persuade
                                        System.out.println("3. \"Mere curiosity,\"");                                               // Then Select God    to make her available to persuade
                                        System.out.println("Your choice: ");

                                        y = scan.nextInt();

                                        switch (y) {

                                            case 1:
                                                System.out.println();
                                                System.out.println("Her eyes flashes, you can feel shivers down your spine.");
                                                System.out.println("Apparently, this is not the right thing to say to a lady who enjoys skinning people.");
                                                System.out.println("\"Help? What help!?\"");
                                                promptEnterKey();
                                                System.out.println("Once maybe twenty meters reduces to mere dust, in a blink of an eye she is besides you,");
                                                System.out.println("You can feel her dead chilly body heat, her breath filled nothing but air.");
                                                System.out.println("She hovers as a hanged corpse, angry ready to lash, ");
                                                System.out.println("She lowers her voice, misty air caresses your cheek.\n\"What help?\" She asks gently,");
                                                promptEnterKey();
                                                System.out.println("\"I'm happy where I am, what I am doesn't matter as long as I am happy right?\" ");
                                                System.out.println("\"Dear mother always told me that... She said that the priest lied to me, God loved us above all... \" Her eyes darkens, ");
                                                System.out.println("\"But what I am is a proof enough to prove them wrong, false God did not love me enough it seems, \nthinks me unworthy for such affection.\"");
                                                System.out.println("\"They were wrong of course, I lived where they died. I do not need any help!\"");
                                                System.out.println();
                                                promptEnterKey();
                                                System.out.println("You can maybe hang onto something here...");
                                                System.out.println("1. Tell me more about your mother.");        //Checks
                                                System.out.println("2. Tell me more about your god.");           // nope
                                                System.out.println("3. Tell me more about the priest.");         // nope

                                                y = scan.nextInt();

                                                switch (y) {

                                                    case 1:
                                                        System.out.println("\"Mother? Why talk about mother?\" She sneers, \n\"Always mother... She said she loved me you see,\" She says as she gets inches away your space,");
                                                        promptEnterKey();
                                                        System.out.println("\"When they bind my hands, when they said I'm the one at fault, she defended.\"");
                                                        System.out.println("\"She confronted them, then begged down on her knees for me the be spared.\" ");
                                                        promptEnterKey();
                                                        System.out.println("Her gaze looking into you but not seeing you, in a memory she stares.");
                                                        System.out.println("\"They said I, her own child poisoned her mind like I did with the priest.\"");
                                                        System.out.println("She frowns, making her look like a little girl she once was,");
                                                        System.out.println("\"I was of fourteen winters, not ready to be wed yet, \ndreaming of the days once I get to left the place I've known since the beginning.\"");
                                                        System.out.println("\"I loved my mother dearly, along with my sixteen sisters and brothers; orphanage was quite full those days.\" She waves her hand.");
                                                        promptEnterKey();
                                                        rusalkaStory();
                                                        System.out.println();
                                                        System.out.println("After everything");

                                                        boll_4 = false;
                                                        break;

                                                    case 2:
                                                        System.out.println("\"My God, my own god who selected me, granted me my deep secret wishes.\"");
                                                        System.out.println("\"But who are you to know them?\"");
                                                        System.out.println("\"Who are you to seek them?\"");
                                                        System.out.println("\"You have never been killed before have you?\"");
                                                        if (tempPlayer.getPersuasion() > 3)
                                                            System.out.println("You hear a distant snicker, ");
                                                        System.out.println("\"No, no, no... But you will,\" \n\"When I'm done here, you will be blessed by them, just like I did..\"");
                                                        promptEnterKey();

                                                        boll_3 = false;

                                                        break;
                                                    case 3:
                                                        System.out.println("\"After all, you want to know about the priest!\"");
                                                        System.out.println("\"The one who drowned me, who was also killed by my hands.\"");
                                                        System.out.println("She sits beside you, looking more younger each passing second.");
                                                        System.out.println("Her hand dances around the water surface, \"I do not want to blame you, \"");
                                                        System.out.println("\"But you should have listened to my warnings-\" Her hand stop abruptly and clenches on your ankle.");
                                                        System.out.println("Iron grip so strong, nails digging, \"I'm afraid you should have get away,\" ");
                                                        System.out.println();
                                                        System.out.println("She wounds you!");
                                                        tempHealth = tempHealth - tempEnemy.getEnemyAttackPoint();
                                                        tempPlayer.setCharHealth(tempHealth);
                                                        System.out.println("Player's health is reduced to " + tempPlayer.getCharHealth() + ".");
                                                        promptEnterKey();

                                                        boll_3 = false;

                                                        break;

                                                    default:
                                                        System.out.println("She eyes you, not very impressed.");
                                                        System.out.println("She drifts away, sharpen her nails,");
                                                        System.out.println("She smiles, hopeful... and says \"A fight then? \"");
                                                        promptEnterKey();
                                                        boll_3 = false;
                                                }


                                                break;


                                            case 2:

                                                System.out.println();
                                                System.out.println("She looks at you like you have stuttered the most stupid thing in the world.");
                                                System.out.println("\"Not free? \nI'm more free than I've ever been!!\"");
                                                System.out.println("\"You have no idea about these kind of matters!\"");
                                                System.out.println("She clenches her fists, shaking her head, red hair waving,");
                                                System.out.println("\"I'm free of my shackles, the shackles priest put on me,\"");
                                                System.out.println("\"He say me as a beast, ready to riot, I show him how a beast would behave,\" She laughs,");
                                                System.out.println("\"... in clear demonstration.\"");
                                                promptEnterKey();
                                                System.out.println("\"My god broke the chains while my mother watched she was certain I was not breathing anymore.\"");
                                                System.out.println("\"In the end she also believed the priest, so I returned the gesture right?\"");
                                                System.out.println("Her hair dancing like her moods, she laughs again but this time was not because of mere amusement.");
                                                System.out.println("\"If priest had not lied to the town, I would not be breathing while every one of them died.\"");
                                                System.out.println();
                                                promptEnterKey();
                                                System.out.println("You can maybe hang onto something here...");
                                                System.out.println("1. Tell me more about your mother.");        // nope
                                                System.out.println("2. Tell me more about your god.");           // nope
                                                System.out.println("3. Tell me more about the priest.");         // CHECKS

                                                y = scan.nextInt();

                                                switch (y) {

                                                    case 1:
                                                        System.out.println();
                                                        System.out.println("\"My mother, the woman who raised me, who fed me 'till she learned the lie that has been fed to me.\"");
                                                        System.out.println("\"As the lie have been also fed to her, growing inside her, the inevitable encounter with me- ");
                                                        System.out.println("  was not how my sweet woman whose smile could outshine the sun, would behave.\"");
                                                        promptEnterKey();
                                                        System.out.println("\"They blurred the lines, uttered every lie, and the woman turned on me, \"");
                                                        System.out.println("\"So you must excuse me for I've no desire to discuss mother...\"");
                                                        System.out.println("... you can only nod to a response like that, so you do the nodding part.");
                                                        promptEnterKey();

                                                        boll_3 = false;

                                                        break;

                                                    case 2:
                                                        System.out.println();
                                                        System.out.println("\"You want to know more about my saviour, my light.\"");
                                                        System.out.println("She steps back, \"Unfortunately you are unqualified for such greatness.\"");
                                                        System.out.println("... you can only nod to a response like that, so you do the nodding part.");
                                                        System.out.println("She does not utter any more words.");
                                                        promptEnterKey();

                                                        boll_3 = false;
                                                        break;

                                                    case 3:

                                                        System.out.println();
                                                        System.out.println("Nails soaked in blood, she twirls around you, black dress swims around her.");
                                                        System.out.println("And for a moment you think this could be the end. ");
                                                        System.out.println("Maybe fate did a mistake sending you to this journey after all.");
                                                        promptEnterKey();
                                                        System.out.println("She stops suddenly, on your back, where you're most vulnerable. You dare not raise your hand.");
                                                        System.out.println("She whispers, cold dead fingers grazing your chin, \"He died right here, where you're standing... \"");
                                                        System.out.println("She utter every word with care, slowly.\"He was once my lover, no more I acknowledge him as such.\"");
                                                        System.out.println("\"You see we were all orphans, and mother loved us all the same.\"");
                                                        System.out.println("\"Priest was not one of us anymore when this indecent incident happened.\"");
                                                        promptEnterKey();
                                                        rusalkaStory();

                                                        boll_4 = false;
                                                        break;

                                                    default:
                                                        System.out.println("She eyes you, not very impressed.");
                                                        System.out.println("She drifts away, sharpen her nails,");
                                                        System.out.println("She smiles, hopeful... and says \"A fight then? \"");
                                                        promptEnterKey();
                                                        boll_3 = false;


                                                }

                                                break;

                                            case 3:
                                                System.out.println();
                                                System.out.println("\"A mere curiosity you say, not good for anyone where it does not needed.\"");
                                                System.out.println("\"Do I look alive to you?\" She scoffs, ");
                                                System.out.println("\"Tis what happens to those who has no business,...\"");
                                                System.out.println("She glances deep into the lake, nearly serene \n\"Their mommy lets them die and the town's priest is the one who orders the kill.\"");
                                                promptEnterKey();
                                                System.out.println("She raises her head, determined in a heated tone\"But maybe, just maybe their god saves them too,\"");
                                                System.out.println("This time she look into your eyes \"You have never seen such beauty, the devotion I hold for them has no rival.\"");
                                                System.out.println("\"In every breathe you take belongs to them, every scenery without them seems dull,...\"");
                                                System.out.println();
                                                promptEnterKey();
                                                System.out.println("You can maybe hang onto something here...");
                                                System.out.println("1. Tell me more about your mother.");        // nope
                                                System.out.println("2. Tell me more about your god.");           // CHECKS
                                                System.out.println("3. Tell me more about the priest.");         // nope
                                                y = scan.nextInt();

                                                switch (y) {

                                                    case 1:

                                                        System.out.println("She shakes her head \"Such tales belong to where I buried my memories.\" ");
                                                        System.out.println("\"No more of that, I'm free. Free of my boundaries, free from my shackles.\"");
                                                        System.out.println("\"I hold more grief than this small body can withstand, do not dare to open the dam.\"");
                                                        System.out.println("She looks at the last addition to the corpse pile,");
                                                        System.out.println("\"For that I will not talk.\"");
                                                        System.out.println();
                                                        System.out.println("You nod,... ");
                                                        promptEnterKey();

                                                        boll_3 = false;
                                                        break;

                                                    case 2:

                                                        System.out.println();
                                                        System.out.println("\"You do, don't you?\" She sighs, ");
                                                        System.out.println("\"I was raised in the orphanage you know, across from these woods, there.\"");
                                                        System.out.println("She point her finger in a vague way bu you know she means the village you have just saw.");
                                                        rusalkaStory();

                                                        boll_4 = false;
                                                        break;

                                                    case 3:

                                                        System.out.println("\"Priest!\" She says in a mock offended tone,");
                                                        System.out.println("\"Such a gentleman, such a fine man, who could not do wrong...\" She claps her hands together, swaying,");
                                                        System.out.println("\"My life was the wrongness he had sinned and paid by his blood.\"");
                                                        System.out.println("\"Such a life he had. Me, a sinner he bedded, a scoundrel he executed.\"");
                                                        System.out.println("She takes your head between her hands, soft but dead cold fingers caresses your cheeks.");
                                                        System.out.println("\"He drew my blood first, I'm only paying it back, ten fold. \nAnd maybe you would also be part of this sceme too.\"");
                                                        System.out.println();
                                                        promptEnterKey();
                                                        System.out.println("She digs her nails into your cheek, into your skin.");
                                                        System.out.println("She wounds you!");
                                                        tempHealth = tempHealth - tempEnemy.getEnemyAttackPoint();
                                                        tempPlayer.setCharHealth(tempHealth);
                                                        System.out.println("Player's health is reduced to " + tempPlayer.getCharHealth() + ".");
                                                        promptEnterKey();


                                                        boll_3 = false;

                                                        break;

                                                    default:
                                                        System.out.println("She eyes you, not very impressed.");
                                                        System.out.println("She drifts away, sharpen her nails,");
                                                        System.out.println("She smiles, hopeful... and says \"A fight then? \"");
                                                        promptEnterKey();
                                                        boll_3 = false;
                                                }

                                                break;


                                            default:
                                                System.out.println();
                                                System.out.println("Rusalka, the monster people believe, looks at you carefully, eyeing her prey.");
                                                System.out.println("\"You do not comment stranger, \nAnd a little ago you were so eager to talk.\"");
                                                System.out.println("\"What say you on this matter concerns me not a bit unfortunately...\"");
                                                promptEnterKey();
                                                System.out.println("She stalks even closer, her lashes wet from unshed tears, madness or grief you can only guess upon.");
                                                System.out.println("\"And you even decided to stay, care for a dance, " + tempGender + "?\"");
                                                System.out.println("Her tempting offer does not reflect on her actions, her nail digging your throat deeper as the time goes by.");
                                                System.out.println();
                                                promptEnterKey();
                                                boll_3 = false;
                                        }

                                        if (!boll_4) {                                                                    //Becerebilirsen doğru seçenekleri burası çıkıyor.

                                            System.out.println();
                                            System.out.println("She looks bewildered, her fiery hair surrounding her head like a web.");
                                            System.out.println("\"You did lister, it has been such a long time, so long...\" She wipes her black tears away with back of her hand.");
                                            System.out.println("\"It has been so long, yet there you are, questioning what I have always could not fathom.\"");
                                            System.out.println("\"This was the warmest conversation I had since forever, I do not fight you, not anymore...\"");
                                            System.out.println("She shakes her head, \"But I'll not leave till my wish granted? I kindly request you to achieve it.\"");
                                            promptEnterKey();
                                            System.out.println();
                                            System.out.println("You nod, uncertain, she smiles, this time for real. \"I want to be buried near my former family, please,\"");
                                            System.out.println("This time you nod confidently, she smiles, \"I'll be waiting,...\"");
                                            System.out.println();
                                            System.out.println("And you do what she ask of you. It takes days founding her lost body,");
                                            System.out.println("Then came the ritual according to her beliefs, her own religion, praying to her god.");
                                            System.out.println("And for a little second you also feel the love she has been talking about, you feel it.");
                                            System.out.println("This is the end, this is it.");
                                            possibleEnemy[4].setEnemyStatus("Deceased");

                                            boll = false;
                                            boll_2 = false;
                                            boll_3 = false;
                                        }


                                    } else {
                                        System.out.println("You have tried champ, not this time. This is not the correct way anymore.");
                                    }
                                    break;

                                case 2:

                                    if (tempWeapon.getUsabilityWeapon()) {
                                        System.out.println("You lift your " + tempWeapon.getWeaponType() + " in an obvious gesture, ");
                                        System.out.println("As in saying come, come and greet your doom.");
                                    } else
                                        System.out.println("You lift your fists up, protecting your face; ready for a fight you have a little chance to win.");
                                    System.out.println();
                                    System.out.println("The woman laughs, ");
                                    System.out.println("\"Another corpse to my collection then, our battle will be legendary,\" ");

                                    while (boll_4) {

                                        System.out.println();
                                        possibleAction();
                                        System.out.println("7. Shield for 2 attacks");
                                        y = scan.nextInt();

                                        switch (y) {

                                            case 1:

                                                counterAttack++;

                                                System.out.println("You ATTACK!!");

                                                randomInt = rand.nextInt(9) + 1;                          //Görmeye gerek yok ondan System.out.println(); ile çıkarmayacağız
                                                persuasionSum = randomInt + tempPlayer.getPersuasion();

                                                System.out.println();
                                                if (persuasionSum > 9) {                                    //9'u geçerse kritik
                                                    System.out.println("Critical Hit!!!");
                                                    if (tempWeapon.getUsabilityWeapon())
                                                        tempAttack = tempPlayer.criticalHit() + tempWeapon.getWeaponAttackPoint();
                                                    else
                                                        tempAttack = tempPlayer.criticalHit();
                                                } else {                                                      //9'u geçemezse normal damage
                                                    if (tempWeapon.getUsabilityWeapon())
                                                        tempAttack = tempPlayer.calculateDamage() + tempWeapon.getWeaponAttackPoint();
                                                    else
                                                        tempAttack = tempPlayer.calculateDamage();
                                                }

                                                System.out.println("Attacking... " + "Damage done is " + tempAttack);

                                                tempEnemyHealth = tempEnemyHealth - tempAttack;


                                                System.out.println("Enemy's health is REDUCED... Remaining Health :  " + tempEnemyHealth);
                                                tempEnemy.setEnemyHealth(tempEnemyHealth);


                                                if (tempEnemyHealth <= 0) {

                                                    System.out.println("You killed the " + possibleEnemy[4].getEnemyName() + " in " + counterAttack + " attacks.");
                                                    counterAttack = 0;
                                                    System.out.println();
                                                    possibleEnemy[4].setEnemyStatus("Deceased");
                                                    System.out.println("You slay her like a beast she is.");
                                                    System.out.println("You smile grimly, it was the end she deserved and what she got.");
                                                    System.out.println("This will be told as a legend years away, you will be the hero, this time not just in my eyes.");
                                                    System.out.println();
                                                    System.out.println("Maybe you should correct your rewards, " + tempPlayer.getCharName() + " of " + tempPlayer.getHouseName() + "?");
                                                    System.out.println();
                                                    playerCoin = playerCoin + possibleEnemy[4].getCoinEnemy();
                                                    System.out.println("You acquired coins: " + possibleEnemy[4].getCoinEnemy());
                                                    System.out.println("Your coins: " + playerCoin);
                                                    tempLevel++;
                                                    System.out.println("You LEVELLED up, new level: " + tempLevel);

                                                    tempPlayer.CharacterInfo();

                                                    boll_4 = false;
                                                    boll_3 = false;
                                                    boll_2 = false;
                                                    boll = false;
                                                } else {

                                                    if(!(counterShield==4||counterShield==3)) {
                                                        randomInt = rand.nextInt(10) + 1;
                                                        if (randomInt < 9) {
                                                            tempHealth = tempHealth - tempEnemy.getEnemyAttackPoint();
                                                            System.out.println();
                                                        } else {
                                                            tempHealth = tempHealth - tempEnemy.getEnemyAttackPoint() * 1.5;
                                                            System.out.println();
                                                            System.out.println("CRITICAL HIT!!");
                                                        }
                                                        System.out.println("You have been hit!!!");
                                                        System.out.println("Your health is reduced... Remaining Health : " + tempHealth);
                                                        tempPlayer.setCharHealth(tempHealth);
                                                    }

                                                        if (!(counterShield <= 0))
                                                            counterShield--;


                                                        else  if((counterShield==4||counterShield==3)) {
                                                            System.out.println("You have blocked the incoming attacks. ");
                                                        }


                                                    if (tempHealth <= 0) {

                                                        System.out.println();
                                                        System.out.println("An ending,...");
                                                        System.out.println("Not an ending, we both know this was not the beast you were supposed to slay.");
                                                        System.out.println("Just a spectre of what I could do. Oh and I could do so much more.");
                                                        System.out.println("My disciple and for this moment my greatest regret..");
                                                        System.out.println();
                                                        System.out.println("You would want to see me would you not?");
                                                        System.out.println("But unfortunately, this is the semi ending for you.");
                                                        System.out.println("Another chance yet another end, our meeting have nor occurred yet either.");
                                                        System.out.println("Sleep well my beloved, for I'm sure this is not the end the fate has sew for us.");

                                                        tempPlayer.CharacterInfo();

                                                        System.exit(1);
                                                    }

                                                }

                                                break;

                                            case 2:
                                                System.out.println();
                                                System.out.println("Rusalka can not be reasoned anymore...");
                                                System.out.println();

                                                break;


                                            case 3:
                                                System.out.println("You eye the nearest get away route. ");
                                                System.out.println("Even though you said heroically you will slay her, her awful god along with her.");
                                                System.out.println("You decided the best way is not to die as someone you are not.");
                                                if (counterRunAway == 1) {
                                                    System.out.println("This is not the first time either, is the difficulty too much for you?");
                                                } else if (counterRunAway == 2) {
                                                    System.out.println("This being the third time, hm, \nI'm afraid you won't come out of this alive...");
                                                }
                                                System.out.println("When she ready her blood soaked claws, you leap at the chance, running away from her.");
                                                System.out.println("She is... confused... She was definitely expecting a fight that is worthwhile, making her urges satisfied enough.");
                                                System.out.println("Well, her collection has to be one head less. What an unfortunate situation.");

                                                counterRunAway++;

                                                boll_4 = false;
                                                boll_3 = false;
                                                boll_2 = false;
                                                boll = false;
                                                break;


                                            case 4:
                                                if (counterHealthPotion == 0) {
                                                    System.out.println("You do not have any Potion.");
                                                    continue;
                                                } else {
                                                    System.out.println("You drink the Potion.");
                                                    counterHealthPotion--;
                                                    tempHealth = tempHealth + 50;

                                                    if (tempHealth >= (tempPlayer.getCharLevel() * 100))
                                                        tempHealth = (tempPlayer.getCharLevel() * 100);

                                                    tempPlayer.setCharHealth(tempHealth);

                                                    System.out.println("Replenished Health    : " + tempHealth);
                                                    System.out.println("Remaining Health Potion : " + counterHealthPotion);

                                                    break;
                                                }

                                            case 5:
                                                System.out.println();
                                                tempPlayer.CharacterInfo();
                                                System.out.println();

                                                break;

                                            case 6:
                                                System.out.println();
                                                possibleEnemy[4].EnemyInfo();
                                                System.out.println();
                                                break;
                                            case 7:
                                                if(tempPlayer.getJob().equals("Mage")){
                                                    System.out.println();
                                                    System.out.println("You have activated your magical shield, it will block two attacks.");
                                                    counterShield=4;
                                                }
                                                else
                                                    System.out.println("Try again.");
                                                break;

                                        }
                                    }

                                    break;

                                case 3:

                                    System.out.println("You look deep into her eyes, ");
                                    System.out.println("Sad eyes that killed an ocean full of corpses, ");
                                    System.out.println("Certainly you wouldn't want to be one of those unfortunate souls, ");
                                    System.out.println("You saw how they danced, how they swayed in each step, how their life slowly faded away...");
                                    promptEnterKey();
                                    System.out.println("So you do what anyone who has a little common sense would do and turn your back,");
                                    System.out.println("This is not your job, not your responsibility.");
                                    System.out.println("And you take away, away from this madness, away from this ballroom on top of the water surface.");
                                    System.out.println("Each step you take, the humming fades a little, and slowly forget the tune, only the eyes remain.");

                                    boll_2 = false;
                                    boll = false;

                                    break;

                                default:
                                    System.out.println("Try appropriate numbers...");
                                    break;
                            }


                        }

                    } else {
                        System.out.println("This is the first time you have heard such melody.");
                        System.out.println("You follow the tune, follow till you see a girl. \nA girl, who is humming this familiar melody as she dances.");
                        System.out.println("Her dance, the move of her arms, red fiery hair...");
                        System.out.println("The most beautiful girl you have ever seen, ...is it though?");
                        System.out.println("You do not see her vicious smile behind this pretty mask of her.");
                        System.out.println("You do not see her blood thirsty eyes, only deep emerald.");
                        System.out.println("You do not see the corpses deep below the water, or the one slowly getting cold in her embrace.");
                        System.out.println();
                        promptEnterKey();
                        System.out.println("You get closer and closer, till she turns to you,");
                        System.out.println("smiling softly, dropping the burden in her hands, creating waves with her feet.");
                        System.out.println("She cups your cheeks, nails near your eyes,");
                        System.out.println();
                        System.out.println("And she says with an angelic smile, \"Welcome to your funeral.\"");
                        System.out.println("Then she digs her nails into your skin, drawing blood,");
                        System.out.println("Hallucination gone, you realize what you are facing,");
                        System.out.println("A Rusalka, a girl who died young with so much sorrow and resentment, ");
                        System.out.println("She obtained a new body, a new face to lure her prey.");
                        System.out.println();
                        System.out.println("She is dangerous, she is sad and she needs to be gone.");


                        if (tempWeapon.getUsabilityWeapon()) {
                            System.out.println("You lift your " + tempWeapon.getWeaponType() + " in an obvious gesture, ");
                            System.out.println("As in saying come, come and greet your doom.");
                        } else
                            System.out.println("You lift your fists up, protecting your face; ready for a fight you have a little chance to win.");
                        System.out.println();
                        System.out.println("The woman laughs, ");
                        System.out.println("\"Another corpse to my collection then, our battle will be legendary,\" ");

                        while (boll_4) {

                            System.out.println();
                            possibleAction();
                            if(tempPlayer.getJob().equals("Mage"))
                                System.out.println("7. Shield for 2 attacks");
                            y = scan.nextInt();

                            switch (y) {

                                case 1:

                                    counterAttack++;

                                    System.out.println("You ATTACK!!");

                                    randomInt = rand.nextInt(9) + 1;                          //Görmeye gerek yok ondan System.out.println(); ile çıkarmayacağız
                                    persuasionSum = randomInt + tempPlayer.getPersuasion();

                                    System.out.println();
                                    if (persuasionSum > 9) {                                    //9'u geçerse kritik
                                        System.out.println("Critical Hit!!!");
                                        if (tempWeapon.getUsabilityWeapon())
                                            tempAttack = tempPlayer.criticalHit() + tempWeapon.getWeaponAttackPoint();
                                        else
                                            tempAttack = tempPlayer.criticalHit();
                                    } else {                                                      //9'u geçemezse normal damage
                                        if (tempWeapon.getUsabilityWeapon())
                                            tempAttack = tempPlayer.calculateDamage() + tempWeapon.getWeaponAttackPoint();
                                        else
                                            tempAttack = tempPlayer.calculateDamage();
                                    }

                                    System.out.println("Attacking... " + "Damage done is " + tempAttack);

                                    tempEnemyHealth = tempEnemyHealth - tempAttack;


                                    System.out.println("Enemy's health is REDUCED... Remaining Health :  " + tempEnemyHealth);
                                    tempEnemy.setEnemyHealth(tempEnemyHealth);


                                    if (tempEnemyHealth <= 0) {

                                        System.out.println("You killed the " + possibleEnemy[4].getEnemyName() + " in " + counterAttack + " attacks.");
                                        counterAttack = 0;
                                        System.out.println();
                                        possibleEnemy[4].setEnemyStatus("Deceased");
                                        System.out.println("You slay her like a beast she is.");
                                        System.out.println("You smile grimly, it was the end she deserved and what she got.");
                                        System.out.println("This will be told as a legend years away, you will be the hero, this time not just in my eyes.");
                                        System.out.println();
                                        System.out.println("Maybe you should correct your rewards, " + tempPlayer.getCharName() + " of " + tempPlayer.getHouseName() + "?");
                                        System.out.println();
                                        playerCoin = playerCoin + possibleEnemy[4].getCoinEnemy();
                                        System.out.println("You acquired coins: " + possibleEnemy[4].getCoinEnemy());
                                        System.out.println("Your coins: " + playerCoin);
                                        tempLevel++;

                                        System.out.println();
                                        tempPlayer.setCharHealth(tempLevel*100);

                                        tempPlayer.CharacterInfo();

                                        boll_4 = false;
                                        boll_3 = false;
                                        boll_2 = false;
                                        boll = false;
                                    } else {

                                        if(!(counterShield==4||counterShield==3)) {
                                            randomInt = rand.nextInt(10) + 1;
                                            if (randomInt < 9) {
                                                tempHealth = tempHealth - tempEnemy.getEnemyAttackPoint();
                                                System.out.println();
                                            } else {
                                                tempHealth = tempHealth - tempEnemy.getEnemyAttackPoint() * 1.5;
                                                System.out.println();
                                                System.out.println("CRITICAL HIT!!");
                                            }
                                            System.out.println("You have been hit!!!");
                                            System.out.println("Your health is reduced... Remaining Health : " + tempHealth);
                                            tempPlayer.setCharHealth(tempHealth);
                                        }

                                            if (!(counterShield <= 0))
                                                counterShield--;


                                        else  if((counterShield==4||counterShield==3)) {
                                            System.out.println("You have blocked the incoming attacks. ");
                                        }


                                        if (tempHealth <= 0) {

                                            System.out.println();
                                            System.out.println("An ending,...");
                                            System.out.println("Not an ending, we both know this was not the beast you were supposed to slay.");
                                            System.out.println("Just a spectre of what I could do. Oh and I could do so much more.");
                                            System.out.println("My disciple and for this moment my greatest regret..");
                                            System.out.println();
                                            System.out.println("You would want to see me would you not?");
                                            System.out.println("But unfortunately, this is the semi ending for you.");
                                            System.out.println("Another chance yet another end, our meeting have nor occurred yet either.");
                                            System.out.println("Sleep well my beloved, for I'm sure this is not the end the fate has sew for us.");

                                            tempPlayer.CharacterInfo();

                                            System.exit(1);
                                        }

                                    }

                                    break;

                                case 2:
                                    System.out.println();
                                    System.out.println("Rusalka can not be reasoned.");
                                    System.out.println();

                                    break;


                                case 3:
                                    System.out.println("You eye the nearest get away route. ");
                                    System.out.println("Even though you said heroically you will slay her, her awful god along with her.");
                                    System.out.println("You decided the best way is not to die as someone you are not.");
                                    if (counterRunAway == 1) {
                                        System.out.println("This is not the first time either, is the difficulty too much for you?");
                                    } else if (counterRunAway == 2) {
                                        System.out.println("This being the third time, hm, \nI'm afraid you won't come out of this alive...");
                                    }
                                    System.out.println("When she ready her blood soaked claws, you leap at the chance, running away from her.");
                                    System.out.println("She is... confused... She was definitely expecting a fight that is worthwhile, making her urges satisfied enough.");
                                    System.out.println("Well, her collection has to be one head less. What an unfortunate situation.");

                                    counterRunAway++;

                                    boll_4 = false;
                                    boll_3 = false;
                                    boll_2 = false;
                                    boll = false;
                                    break;


                                case 4:
                                    if (counterHealthPotion == 0) {
                                        System.out.println("You do not have any Potion.");
                                        continue;
                                    } else {
                                        System.out.println("You drink the Potion.");
                                        counterHealthPotion--;
                                        tempHealth = tempHealth + 50;

                                        if (tempHealth >= (tempPlayer.getCharLevel() * 100))
                                            tempHealth = (tempPlayer.getCharLevel() * 100);

                                        tempPlayer.setCharHealth(tempHealth);

                                        System.out.println("Replenished Health    : " + tempHealth);

                                        break;
                                    }

                                case 5:
                                    System.out.println();
                                    tempPlayer.CharacterInfo();
                                    System.out.println();

                                    break;

                                case 6:
                                    System.out.println();
                                    possibleEnemy[4].EnemyInfo();
                                    System.out.println();
                                    break;

                                case 7:
                                    if(tempPlayer.getJob().equals("Mage")){
                                        System.out.println();
                                        System.out.println("You have activated your magical shield, it will block two attacks.");
                                        counterShield=4;
                                    }
                                    else
                                        System.out.println("Try again.");
                                    break;

                            }
                        }

                    }


                    break;

                case 2:                 // Bu da Milosnitse

                    System.out.println();
                    System.out.println("  you chose to go to the south path.");
                    System.out.println("you walk and walk, then when the sun goes down for the night decide to rest a little, go to a lean bole to sleep.");
                    System.out.println("****************");
                    System.out.println(" You woke up with the sound of footsteps. As much as cautious, you slowly get close to the sound. \nCloser you go the air filled with the smells, the smells shouldn't be in a forest. Like rotten flesh, inflamed blood, like death.");
                    System.out.println("  You see a woman with a white robe her ink-black hair scattered towards the night's darkness. \nA sickly-looking old man in front of her, on his knees, and tal");
                    System.out.println("  'I beg you...'");
                    System.out.println("  'We do not have anything to eat anymore. '");
                    System.out.println("   'Not even the slightest, hardest piece of bread.'");
                    System.out.println("'Not even for ourselves...'");
                    System.out.println("'Not even for our children.' ");
                    System.out.println("'Please release us from this curse. Take back this disease...' ");
                    System.out.println("'I beg you, I beg you... '");
                    System.out.println("'Please... please...'");
                    System.out.println("'Take my life instead...'");
                    System.out.println(" The woman talks with a voice cold as the eyes of dead bodies.");
                    System.out.println(" 'Your life has no value nor merit to me.'");
                    System.out.println("'You and your village  obligate to give me my offerings.'");
                    System.out.println("Your situation right now is because of your negligence and carelessness.");
                    System.out.println("'And you will pay the price now, so does your village...' ");
                    System.out.println("When the women raise her hand, the old man's body starts to tremble. His face became spotty with red dots, he screamed while trying to shred his face.");
                    System.out.println("When you step back the sound of crackling echoed in the vast forest.");
                    System.out.println("The moment woman and old man turn to look at you. Your eyes meet with two bottomless holes, the moment your eyes cross with hers you heard countless screams");

                    System.out.println("you smell the death and feel the despair to your bone. You knew what was happening, what kind of creature the woman was. Milosnitse, the walking malady.");
                    System.out.println("The old man spoke while withdrawing his hands from his bloody face.");
                    System.out.println("'Please... please help...'");
                    System.out.println("The woman smiled looked very amused, ask slowly.");
                    System.out.println(" 'What are you going to do, hero?'");

                    while (boll) {

                        System.out.println("********************");
                        System.out.println("You chose to");

                        possibleAction();
                        System.out.println("Please not that you can not use Persuasion after an unsuccessful try");
                        if (hasBook)
                            System.out.println("7. See possible enemies:  ");
                        if(tempPlayer.getJob().equals("Mage"))
                            System.out.println("8. Shield for 2 attacks");

                        y = scan.nextInt();

                        switch (y) {

                            case 1:  //DÖVÜŞŞŞŞ

                                tempEnemyHealth = possibleEnemy[5].getEnemyHealth();

                                //***************************************************************************************************

                                if (counterAttack == 0) {

                                    System.out.println("You slowly tilt your head.");
                                    System.out.println(" 'I can not let you do this...' ");
                                    System.out.println("And then she spoke,");
                                    System.out.println(" 'Are you try to play hero?  Or are you just that that lame?' ");
                                    System.out.println(" 'If you want to die with pain, you made it...' ");
                                    System.out.println(" You run toward the Milosnitse, ");

                                    promptEnterKey();
                                }

                                counterAttack++;

                                System.out.println("You ATTACK!!");

                                randomInt = rand.nextInt(10) + 1;
                                persuasionSum = randomInt + tempPlayer.getPersuasion();

                                System.out.println();
                                if (persuasionSum > 9) {
                                    System.out.println("Critical Hit!!!");
                                    if (tempWeapon.getUsabilityWeapon())
                                        tempAttack = tempPlayer.criticalHit() + tempWeapon.getWeaponAttackPoint();
                                    else
                                        tempAttack = tempPlayer.criticalHit();
                                } else {
                                    if (tempWeapon.getUsabilityWeapon())
                                        tempAttack = tempPlayer.calculateDamage() + tempWeapon.getWeaponAttackPoint();
                                    else
                                        tempAttack = tempPlayer.calculateDamage();
                                }

                                System.out.println("Attacking... " + "Damage done is " + tempAttack);
                                tempEnemyHealth = tempEnemyHealth - tempAttack;

                                System.out.println("Enemy's health is REDUCED... Remaining Health :  " + tempEnemyHealth);
                                possibleEnemy[5].setEnemyHealth(tempEnemyHealth);


                                if (tempEnemyHealth <= 0) {
                                    System.out.println("The woman screamed while falling to the ground...");
                                    System.out.println("While she howl with pain, the moonlight seemed like disappear,");
                                    System.out.println(" and for a moment remaining was darkness.");
                                    System.out.println("she squirm on the ground, a black liquid start to ooze out,");
                                    System.out.println("from her empty eyes, nose, and the mouth, like the evil's blood");
                                    System.out.println("The smell of bad blood, death and fester spread to forest");
                                    System.out.println("And disappear with in.");
                                    promptEnterKey();
                                    System.out.println("Before the liquid reach your foot, you quickly retreat.");
                                    System.out.println("And inhale deeply.");
                                    System.out.println("Thinking the road before you and where it's gonna send you...");
                                    System.out.println("Closed your eyes...");
                                    System.out.println("And the opening oce more with the feeling of the light,");
                                    System.out.println("And you see...");
                                    System.out.println("Even after the all that darkness,");
                                    System.out.println("The sun is rising again...");

                                    promptEnterKey();

                                    tempLevel++;
                                    tempPlayer.setCharLevel(tempLevel);
                                    System.out.println("You LEVELED UP new Level : " + tempLevel);
                                    tempPlayer.setCharHealth(tempLevel * 100);
                                    playerCoin = tempEnemy.getCoinEnemy() + playerCoin;
                                    System.out.println("Player coin : " + playerCoin);
                                    possibleEnemy[5].setEnemyStatus("Deceased");
                                    System.out.println("You killed the " + possibleEnemy[5].getEnemyName() + " in " + counterAttack + " attacks.");
                                    counterAttack = 0;
                                    tempHealth= tempLevel*100;
                                    System.out.println();


                                    boll = false;


                                } else {
                                    if(!(counterShield==4||counterShield==3)) {
                                        tempHealth = tempHealth - possibleEnemy[5].getEnemyAttackPoint();
                                        System.out.println();
                                        System.out.println("You have been hit!!!");
                                        System.out.println("Your health is reduced... Remaining Health : " + tempHealth);
                                        tempPlayer.setCharHealth(tempHealth);
                                    }
                                        if (!(counterShield <= 0))
                                            counterShield--;

                                        else  if((counterShield==4||counterShield==3)) {
                                            System.out.println("You have blocked the incoming attacks. ");
                                        }

                                }


                                if (tempHealth <= 0) {
                                    System.out.println("First you were gonna kill the beast, the calamity, the disease.");
                                    System.out.println("For the straitened villagers, for the weak old men in front of your eyes.");
                                    System.out.println("You hope that...");
                                    System.out.println(" Even everyone in the world cannot be protected,");
                                    System.out.println(" At least you can protect the ones that reachable for you...");
                                    promptEnterKey();
                                    System.out.println("**************************");
                                    System.out.println("And then you died.");
                                    System.out.println("With nothing, and probability with all of the villagers too...");
                                    System.out.println("**************************");
                                    promptEnterKey();
                                    System.out.println("I will see you once more, when you decided to try again.");
                                    System.out.println("Let's hope the that try will not end up with failure, ");
                                    System.out.println(" like this time...");
                                    System.out.println("Farewell...");

                                    System.exit(1);
                                }


                                break;

                            case 2:    //PERSUADE

                                if (boll_2) {
                                    System.out.println();
                                    System.out.println("You quickly think about \n how can you persuade this lady in white dress.");
                                    System.out.println("Then you finally make a plan.");
                                    System.out.println();
                                    System.out.println("You know what actually she wants...");
                                    System.out.println("NEW VICTIMS");
                                    promptEnterKey();
                                    System.out.println("You know you can lie about finding new victims ");
                                    System.out.println("So you can gain time even if it is not that much...");
                                    System.out.println("So,what do you say,");
                                    System.out.println("Is it worth a shot? Just say yes or no " + tempPlayer.getCharName() + " of " + tempPlayer.getHouseName() + ".\n ----> ");
                                    answer = scan.next();
                                    if (answer.equals("yes")) {
                                        randomInt = rand.nextInt(7) + 2;
                                        System.out.println("You got " + randomInt);
                                        persuasionSum = tempPersuasion + randomInt;
                                        System.out.println("And your persuasion level   : " + tempPersuasion);
                                        System.out.println(" = " + persuasionSum);
                                        enemyPersuasionSum = (possibleEnemy[5].getPersuasionLimit()) ;
                                        System.out.println("Milosnitse's Persuasion Sum is: " + enemyPersuasionSum);

                                        System.out.println();
                                        if (persuasionSum >= enemyPersuasionSum) {

                                            System.out.println("You take a deep breathe and start to talk...");
                                            System.out.println("I will find you new victims you say.");
                                            System.out.println("'Just do not hurt me and this poor man.'");
                                            System.out.println();
                                            System.out.println("You little " + tempPlayer.getCharName());
                                            System.out.println("She says ");
                                            System.out.println("'How can you find new people to kiss and love...'");
                                            promptEnterKey();
                                            System.out.println("You take your map out of your bag and show her.");
                                            System.out.println(" 'Look this man's village is not the only one.' ");
                                            System.out.println("Then you keep talking ");
                                            System.out.println("'There are two more villages to meet.");
                                            System.out.println("'You can look at the map if you do not believe me...'");
                                            System.out.println();
                                            System.out.println("The woman in white dress looks misgiven.");
                                            System.out.println("You can understand that she is trying to make a decision from her sallow face ");
                                            System.out.println("Even though there is a utter darkness...");
                                            promptEnterKey();
                                            System.out.println("'Okay " + tempPlayer.getCharName() +" of " +tempPlayer.getHouseName()+" ' she says.");
                                            System.out.println("'I give you 3 hours to come back with villages' leaders.'");
                                            System.out.println("Then she smiles viciously");
                                            System.out.println("'But you know,I have to be sure that you will come back to me!'");
                                            System.out.println("'Maybe I should kiss you, if you won't be back you will be sick in a few hours.'");
                                            System.out.println();
                                            System.out.println("She keeps talking with more beatifically");
                                            System.out.println("'If you come back the way I want, I will give you antidote description.'");
                                            System.out.println("'So, what do you say?'");
                                            promptEnterKey();
                                            System.out.println("Since you decided to persuade her once, you think about this offer ");
                                            System.out.println("Just yes or no will be enough...");
                                            answer = scan.next();
                                            if (answer.equals("yes")) {
                                                System.out.println();
                                                System.out.println("You considered this offer and decided to accept.");
                                                System.out.println("You tell her you accept,then she kiss you.");
                                                System.out.println("You feel awkward but you know that you have to hurry up.");
                                                System.out.println("That is why you and the poor man start off swiftly");
                                                System.out.println("You two become invisible in the darkness");
                                                System.out.println("While the Milosnitse is smiling because she has a reason to celebrate her loftiness...");
                                                promptEnterKey();
                                                System.out.println("You get information about situation from the man while you arrive near the village.");
                                                System.out.println("You have a plan so you tell him not to worry.");
                                                System.out.println("Therewith, he says");
                                                System.out.println("If you can recover my people and destroy this monster,this exalted behavior will be rewarded.");
                                                System.out.println();
                                                System.out.println("When you arrive at your destination you start to talk");
                                                System.out.println("'Are there any witches or wizards to put a spell on?'");
                                                System.out.println("The leader of the village says that there are three sisters who can put a spell on people but...");
                                                System.out.println("You understand there is something bad about them.");
                                                System.out.println("The leader keeps talking ");
                                                System.out.println("'They are in dungeon.We incarcerate them because of their witchcraft.'");
                                                System.out.println("'When the Milosnitse came and made us sick,we accused them because you know");
                                                System.out.println("Everything happened because of their witchcraft.'");
                                                System.out.println("You understand that they are only choice to rescue.");
                                                System.out.println("'I need to see them,we need them right know.'you say.");
                                                promptEnterKey();
                                                System.out.println("In the dungeon, you tremble.It is cold and full of rats.");
                                                System.out.println("When you see the sisters you introduce yourself then talk about the situation.");
                                                System.out.println("Firstly they do not accept to help.");
                                                System.out.println("When you say they will be free and they will get their houses back if they help,they discuss.");
                                                System.out.println("The blond haired says 'Okay, we will help you...'");
                                                System.out.println("Then you take the road");
                                                promptEnterKey();
                                                System.out.println("Near the Milostise you tell your plan to witches. \n When you all ready you and two of the sisters show yourselves to the Milosnitse.");
                                                System.out.println("'Here you are!' she says.");
                                                System.out.println("These two are from the villages I mentioned you before.Now tell me about the antidote!' you say.");
                                                System.out.println("She accepts and tells ingredients of antidote.");
                                                System.out.println("At the same time the third sister takes notes then stops hiding.");
                                                System.out.println("When Milosnitse sees her too she notices there is something wrong.");
                                                System.out.println("But without giving her a chance,You shout;");
                                                System.out.println("'NOW!!!'");
                                                promptEnterKey();
                                                System.out.println("At the same time witches start to put a spell on the Milosnitse.");
                                                System.out.println("They incarcerate her in a stone bottle then they close it.");
                                                System.out.println("After that they give the bottle to you to hide it somewhere safe.");
                                                System.out.println("'You look pale,we need to hurry.'says one of them.Then you all return to the village.");
                                                System.out.println("When you arrive, they go to their house and start to prepare the antidote while you are sleeping.");
                                                System.out.println("After half an hour,they awake you and you drink the antidote.");
                                                promptEnterKey();
                                                System.out.println("After few hours you feel better.");
                                                System.out.println("You thank them and prepare yourself for the road.");
                                                System.out.println("At the same time the leader of the village comes.");
                                                System.out.println("'Respectable " + tempPlayer.getCharName() + " thank you for everything you have done!'");
                                                System.out.println("Then gives you a pouch...");
                                                promptEnterKey();
                                                playerCoin = playerCoin + 80;
                                                System.out.println();
                                                System.out.println("Your coin : " + playerCoin);
                                                System.out.println("You say goodbye to them and find yourself on the road again....");
                                                tempPersuasion++;
                                                tempPlayer.setPersuasion(tempPersuasion);
                                                possibleEnemy[5].setEnemyStatus("Deceased");
                                                boll = false;

                                            } else {
                                                System.out.println("You considered this offer but that is enough!");
                                                System.out.println("You decide not to accept this devious offer.Because you know ");
                                                System.out.println("there is another way to get rid of this ugly creature;");
                                                System.out.println("You have your weapon...");
                                            }
                                            boll_2 = false;


                                        } else {
                                            System.out.println("Your persuasion level is lower that the enemy persuasion level...");
                                            System.out.println("That is why, you can not do anything about persuade, sorry :( ");
                                            boll_2 = false;
                                        }


                                    } else {
                                        System.out.println("You said no,but Milostinse do not accept 'NO' as an answer.");
                                        System.out.println("Now she gets angry,there is nothing to do other than fighting..");
                                        boll_2 = false;
                                    }
                                }

                                break;

                            case 3: // RUNAWAYYYYYYYYYY

                                System.out.println(" You turned around and start running,");
                                System.out.println("running from what you saw.");
                                System.out.println("Leaving to fate the old man and the village");
                                System.out.println("Continue to run until the old man's screams and the woman laughing  cant be heard anymore...");
                                boll = false;
                                break;
                            case 4:

                                if (counterHealthPotion == 0) {
                                    System.out.println("You do not have any Potion.");
                                    continue;
                                } else {
                                    System.out.println("You drink the Potion.");
                                    counterHealthPotion--;
                                    tempHealth = tempHealth + 50;

                                    if (tempHealth >= (tempPlayer.getCharLevel() * 100))
                                        tempHealth = (tempPlayer.getCharLevel() * 100);

                                    tempPlayer.setCharHealth(tempHealth);

                                    System.out.println("Replenished Health    : " + tempHealth);

                                    break;
                                }

                            case 5:
                                System.out.println();
                                tempPlayer.CharacterInfo();
                                System.out.println();
                                continue;

                            case 6:
                                System.out.println();
                                possibleEnemy[5].EnemyInfo();
                                System.out.println();
                                continue;

                            case 7:
                                arrayOfEnemies(possibleEnemy);
                                break;

                            case 8:
                                if(tempPlayer.getJob().equals("Mage")){
                                    System.out.println();
                                    System.out.println("You have activated your magical shield, it will block two attacks.");
                                    counterShield=4;
                                }
                                else
                                    System.out.println("Try again.");
                                break;

                            default:
                                System.out.println("Please enter an acceptable number...");
                        }

                    }
            }

        }

        System.out.println("And there you go, finishing your little adventure.");
        System.out.println("You go back the path you came, into the little town.");
        if(possibleEnemy[4].getEnemyStatus().equals("Deceased")||possibleEnemy[5].getEnemyStatus().equals("Deceased")){
            System.out.println("You killed the beast, slay them like a hero you are.");
            System.out.println("The town's gates open like waiting your arrival");
            if(enemyPotentialMerchant_1.getEnemyStatus().equals("Deceased")){
                System.out.println();
                System.out.println("You see two soldiers walk towards you, dark gazes fall upon your exhausted but standing body.");
                System.out.println("One of them shows you a parchment, It says Reward, your face on it \"Dead or Alive\"");
                System.out.println("\"By the order of law of late King The Fourth, I'm arresting you for the town's Merchant's murder.\"");
                System.out.println("You sigh, you should have seen it coming,");
                System.out.println("Even when you killed the beast, even though you are a hero that saved many people's incoming death.");
                promptEnterKey();
                System.out.println("then you smirk, lifting your hands up,");
                System.out.println("You hear peasants murmuring to one other, let the rumours gather, this is not the end for you. They say \"hero\", they say \"murderer\"");
                System.out.println();
                System.out.println("As one of the guards getting ready to drag you into the prison, you take the dagger in your sleeve, cutting the guard's throat.");
                System.out.println("The other guard seeing this takes out their sword, you see the peasants scatter in panic,");
                System.out.println("While the blood is soaking the ground, you draw a circle you have known since birth,");
                System.out.println("Then,");
                System.out.println("then");
                promptEnterKey();
                System.out.println("then you summon me, \nmy hero, \nmy love,");
                System.out.println("You flee the town, never to be seen again for some time,");
                System.out.println("The town however has very mixed feelings towards you, \nsome say you are a monster in disguise,");
                System.out.println("Others defend you, telling the Merchant was a slave trader, ");
                System.out.println("who could know which is real, and which is not?");
                System.out.println("When the time comes you will be the King, a tyrant should not sit on a throne which meant to serve not take.");
                System.out.println("Wait a little bit my hero, the time will come...");
            }
            else{
                System.out.println("You see town's people cheering, laughing, congratulating you.");
                System.out.println("A band starts performing, some of the children dancing, you made the right decision.");
                System.out.println("And from this day onwards you will be their hero, their saviour.");
                System.out.println("Such an eventful day, such importance");
                System.out.println("Finally you are ready to Slay the real monster, ");
                System.out.println();
                System.out.println();
                System.out.println("me,");
                System.out.println("So good luck to you, when the feast comes to an end, I'll be waiting, and waiting for you,");
                System.out.println("Congratulations my hero \nmy love, you deserved it.");
                System.out.println("Enjoy your victory.");
                promptEnterKey();

            }
        }
        else{
            System.out.println("You did not kill the beast as you supposed to do unfortunately.");
            System.out.println("So you decide to head back home, the warm atmosphere that you love,");
            System.out.println("To greet the people you love,");
            if(enemyPotentialMerchant_1.getEnemyStatus().equals("Deceased")){
                System.out.println();
                System.out.println("You see two soldiers walk towards you, dark gazes fall upon your exhausted body.");
                System.out.println("One of them shows you a parchment, It says Reward, your face on it");
                System.out.println("\"By the order of law of late King The Fourth, I'm arresting you for the town's Merchant's murder.\"");
                System.out.println("You sigh, you should have seen it coming,");
                promptEnterKey();
                System.out.println("then you smirk, lifting your hands up,");
                System.out.println("You hear peasants murmuring to one other, let the rumours gather, this is not the end for you.");
                System.out.println();
                System.out.println("As one of the guards getting ready to drag you into the prison, you take the dagger in your sleeve, cutting the guard's throat.");
                System.out.println("The other guard seeing this takes out their sword, you see the peasants scatter in panic,");
                System.out.println("While the blood is soaking the ground, you draw a circle you have known since birth,");
                System.out.println("Then,");
                System.out.println("then");
                promptEnterKey();
                System.out.println("then you summon me, \nmy hero, \nmy fallen hero, \nmy love,");
                System.out.println("Though t'is is not a story that children would favour, so this is the end my hero this is the end.");
            }
            else{
                System.out.println("You open the door to your little cottage, see the faces waiting for you.");
                System.out.println("And you think yes, I'm content with this. This is your story's end.");
                System.out.println("See you some other time fallen hero.");
            }
        }

        System.out.println();
        System.out.println();
        tempPlayer.CharacterInfo();
        promptEnterKey();
        System.out.println();
        if(tempWeapon.getUsabilityWeapon()) {
            tempWeapon.WeaponInfo();
            promptEnterKey();
        }
        System.out.println();
        for(Enemy enemy: possibleEnemy){
            enemy.EnemyInfo();
            System.out.println();
        }
    }

    public static void possibleAction() {

        System.out.println();                                       //Bu da sürekli tekrarlamasın diye yapılabilecek şeyler
        System.out.println("1. Attack");
        System.out.println("2. Persuade \n(Your succession level will depend on your and enemy's persuasion level or your luck.)");
        System.out.println("3. Run!!!");
        System.out.println("4. Drink Health Potion. ");
        System.out.println("5. See my stats:");
        System.out.println("6. See other person's stats: ");

    }


    public static void possibleConversation() {
        System.out.println();
        System.out.println("1. Deal.");
        System.out.println("2. \"Steal their coin.\" \n(Your succession level will depend on your and enemy's persuasion level or your luck.)");
        System.out.println("3. Up for a bargain? \n(Your succession level will depend on your and enemy's persuasion level or your luck.)");
        System.out.println("4. See my stats:");
        System.out.println("5. See other person's stats: ");
        System.out.println("6. Your Weapon's Info: ");

    }

    public static void rusalkaStory() {

        System.out.println("\"One day they came in, took me, decide me a witch and start the preparations for execution.\"");
        System.out.println("She clenches her fists around your robe, not shaking but clearly upset.");
        System.out.println("\"Even then mother did not leave my side.\"");
        System.out.println("\"They told her what I've done. They told her I chose the wrong God to pray.\" Her smile returning,");
        System.out.println("\"Mother didn't beg for more then, I was her daughter no longer. \"");
        promptEnterKey();
        System.out.println("\"Little did they know, their god was a lie and my God, my god is the absolute truth.\"");
        System.out.println("\"But this wasn't the case back then, along with them I also prayed for a lie.\"");
        System.out.println("\"And I prayed, I prayed till my voice came no more, till my body is sore.\"");
        System.out.println("\"Sparing you the details, they didn't drowned me at first.\" Smile now curving, a predator eyeing the prey.");
        System.out.println("\"Those savage beast you call men, they. Did. Not. Drown me. Not at first.\"");
        promptEnterKey();
        System.out.println("\"They played with me, they played just like how I'm playing with them now.\"");
        System.out.println("\"The execution would take place at night but I couldn't cry. I got no more tears left for crying.\"");
        System.out.println("\"My mistakes and crimes announced loudly enough.\"");
        System.out.println("\"The list included worshipping the devil and benefiting from evil amongst other crimes I did not commit.\"");
        System.out.println("\"The priest was the one who prepared the list. He was also the one who speaks the words of truth, they said.\"");
        System.out.println("\"Priest said god loved us all above all else,\"");
        System.out.println();
        System.out.println("\"When they tied me to the weight I saw my family for the first time in days.\"");
        System.out.println("\"They've all came to see me go down, a solemn look on their faces.\"");
        System.out.println("She nods her head in an affirmative way. \"They asked me my last words.\"");
        promptEnterKey();
        System.out.println("\"I wanted their mercy, forgiveness, they only told me that I was a monster to put down.\" She sneers again.");
        System.out.println("Twisting her hair around her fingers, \"Then I told them I would not stand for this injustice.\"");
        System.out.println("\"If they were to have me dead, \nthey should also know not to cage the said monster for their pleasure, surely one day it will bite,\"");
        promptEnterKey();
        System.out.println("\"Then I ... I drowned, felt cold water far deep in my lungs instead of air.\"");
        System.out.println("\"Tried so hard not to breathe, tried the impossible. Failed. Tried again.\"");
        System.out.println("\"I saw them then, my God. MY God. My God who is right, who is justice personified.\"");
        System.out.println();
        System.out.println("She lift her hand o her cheek, \"They told me I was given a second chance, to be free.\"");
        System.out.println("\"I was alone no more. Never have I ever felt warm that strong deep in my frozen bones, I was loved.\"");
        promptEnterKey();
        System.out.println("\"Mother left me, averted her gaze when my god did not, Who is in the wrong for believing the one they love?\"");

    }

    public static void promptEnterKey() {
        System.out.println();
        System.out.println("Press \"ENTER\" to continue...");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

    public static void arrayOfEnemies(Enemy[] ar) {

        if (hasBook) {
            for (Enemy enemy : ar)
                enemy.EnemyInfo();
        }

    }
}

