/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guitextrpg;

import java.util.Random;

/**
 *
 * @author capta
 */
public class Story {
    
    GUI g;
    RPG_Game rpg;
    GUIVisibility vm;
    Enemies enemy;
    Player player = new Player();
    
    //Constructor
    public Story(GUI g, RPG_Game rpg, GUIVisibility vm) {
        this.g = g;
        this.rpg = rpg;
        this.vm = vm;
    }
    
    //Method to initialise player
    public void PlayerCreator() {
        player.hp = 50;
        g.hpnL.setText("" + player.hp);
        
        player.currentequip = new Weapon_Staff();
        g.wnL.setText(player.currentequip.name);
    }
    
    //Method to handle player choices and outcomes
    public void selectLocation(String nL) {
        switch(nL) {
            case "agree": agreed(); break;
            case "greed": greed(); break;
            case "agreedbored": agreedbored(); break;
            case "denied": denied(); break;
            
            case "N": north(); break;
            case "EnchantedForest": enchantedForest(); break;
            case "Riddles": Riddles(); break;
            case "cR": correctRiddle(); break;
            case "iC": incorrectRiddle(); break;
            case "ancientRuins": ancientRuins(); break;
            case "iceCavern": iceCavern(); break;
            
            case "E": east(); break;
            case "Win": win(); break;
            case "lose": lose(); break;
            case "enemyAttack": enemyAttack(); break; 
            case "WhisperingGrove": WhisperingGrove(); break;
            
            case "S": south(); break;
            case "frostpeak": frostPeak(); break;
            case "frostpeakTop": frostpeakTop(); break;
            
            case "W": west(); break;
            case "aridWilderness": aridWilderness(); break;
            case "oasis": Oasis(); break;
            
            case "Fight": fight(); break;
            case "run": run(); break;
            case "NEnding": nEnding(); break;
            case "EEnding": eEnding(); break;
            case "quit": quit(); break;
            
            case "playerAttack": playerAttack(); break;
        }
    }
    
      public void Intro() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("In a world teeming with mysteries and magic, I am the Curiosity's Conjuror, "
                + "driven by an unyielding thirst for knowledge and adventure. Guided by ancient tomes "
                + "and the whispers of the arcane, I journey across lands both familiar and fantastical, seeking to unravel the secrets that lie beyond the veil of the known. Join me as "
                + "I traverse the paths of fate, fueled by curiosity and the boundless allure of the unknown.");
        g.c1.setText("Yes Of Course!");
        g.c2.setText("Only if i get something");
        g.c3.setText("Eh why not");
        g.c4.setText("No I'm on my own journey");
        
        rpg.nL1 = "agree";
        rpg.nL2 = "greed";
        rpg.nL3 = "agreedbored";
        rpg.nL4 = "denied";
    }
    
    public void agreed() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("With excitement bubbling in your chest, you eagerly accept the invitation to join the Curiosity's Conjuror on their adventure. Together, you journey through realms both enchanting and "
                + "perilous, united by a shared thirst for discovery. As companions bound by curiosity, you face challenges head-on, finding "
                + "strength in unity and courage in camaraderie. In this grand quest, you realize that with the Curiosity's Conjuror by your side, there's no limit to the wonders you can uncover.");
        g.c1.setText("Go North");
        g.c2.setText("Go East");
        g.c3.setText("Go South");
        g.c4.setText("Go West");
        
        rpg.nL1 = "N";
        rpg.nL2 = "E";
        rpg.nL3 = "S";
        rpg.nL4 = "W";
    }
    
    public void greed() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("Upon agreeing to join the Curiosity's Conjuror, you make a request: to mend your worn staff. Their response is hesitant, promising to fix it. "
                + "Yet, a fleeting expression of dissatisfaction betrays their reluctance, leaving you to ponder the true cost of your plea.");
        player.currentequip.name = "Sturdy Staff";
        player.currentequip.damage += 3;
        g.c1.setText("Go North");
        g.c2.setText("Go East");
        g.c3.setText("Go South");
        g.c4.setText("Go West");
        
        rpg.nL1 = "N";
        rpg.nL2 = "E";
        rpg.nL3 = "S";
        rpg.nL4 = "W";
    }
    
    public void agreedbored() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("Agreeing to join the Curiosity's Conjuror out of sheer boredom, you notice a flicker of sadness in their eyes. As you embark on the journey, you're determined to "
                + "shake off your indifference and fully embrace the adventure, vowing to never again let apathy dampen the spirits of those around you.");
        g.c1.setText("Go North");
        g.c2.setText("Go East");
        g.c3.setText("Go South");
        g.c4.setText("Go West");
        
        rpg.nL1 = "N";
        rpg.nL2 = "E";
        rpg.nL3 = "S";
        rpg.nL4 = "W";
    }
    
    public void denied() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("With a gentle smile, you decline the Curiosity's Conjuror's offer, explaining that you have your own path to pursue. Surprisingly, "
                + "they insist on joining you, eager for the adventure your journey promises. Though taken aback, you welcome their company, recognizing the value of shared "
                + "experiences on the road ahead. Together, you set forth, two wanderers bound by the allure of the unknown and the promise of discovery.");
        g.c1.setText("Go North");
        g.c2.setText("Go East");
        g.c3.setText("Go South");
        g.c4.setText("Go West");
        
        rpg.nL1 = "N";
        rpg.nL2 = "E";
        rpg.nL3 = "S";
        rpg.nL4 = "W";
    }
    
    public void north() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("You and the Curiosity's Conjuror decide to head north, towards the mysterious lands known for their "
                + "ancient ruins and mystical forests. After days of travel, you find yourselves in an enchanted forest, "
                + "where the trees whisper secrets and the air is thick with magic.");
        g.c1.setText("Explore the Enchanted Forest");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "EnchantedForest";
    }
    
    public void enchantedForest() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("In the heart of the enchanted forest, you encounter a wise old druid who speaks of an ancient "
                + "artifact, the 'Staff of Northern Winds,' hidden deep within the forest. To earn the druid's trust, you "
                + "must solve a series of riddles.");
        g.c1.setText("Solve the Riddles");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");

        rpg.nL1 = "Riddles";
    }
    
    public void Riddles() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("In the heart of the enchanted forest, where ancient trees whispered secrets and the air shimmered "
                + "with a magical glow, the player and the Curiosity's Conjuror stood in a serene clearing. Before them, "
                + "the wise old druid, his presence both gentle and powerful, awaited."
                + " \"Adventurers\", the druid began, his voice resonating with wisdom, \"you have shown great courage and "
                + "insight. Now, only one test remains. Solve this riddle, and the path to the 'Staff of Northern Winds' "
                + "shall be yours.\"\n" + "\n" + "With a mysterious smile, he presented the final riddle, a challenge that "
                + "would determine their fate.\n" + "\"I speak without a mouth and hear without ears. I have no body, but "
                + "I come alive with wind. What am I?\"");
        
        g.c1.setText("Echo");
        g.c2.setText("Whistle");
        g.c3.setText("Breath");
        g.c4.setText("Song");
        
        //Correct Riddle
        rpg.nL1 = "cR";
        rpg.nL2 = "iC";
        rpg.nL3 = "iC";
        rpg.nL4 = "iC";
    }
    
    public void correctRiddle() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("You have answered wisely. An echo speaks through the wind, carrying messages without a mouth or ears. "
                + "You have shown great insight.\n\n"
                + "The druid waves his hand, and a hidden path is revealed, leading deeper into the forest. The path is lined "
                + "with glowing runes, guiding the way to the ancient artifact.\n\n"
                + "'Follow this path, and you shall find the 'Staff of Northern Winds.' May it serve you well on your journey.'");
   
        g.c1.setText("Continue");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "ancientRuins";
    }
    
    public void incorrectRiddle() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("That is not the answer I seek. Think carefully. You may try again.\n" +
                "\"I speak without a mouth and hear without ears. I have no body, but "
                + "I come alive with wind. What am I?\"");
        g.c1.setText("Echo");
        g.c2.setText("Whistle");
        g.c3.setText("Breath");
        g.c4.setText("Song");

        rpg.nL1 = "cR";
        rpg.nL2 = "iC";
        rpg.nL3 = "iC";
        rpg.nL4 = "iC";
    }
    
    public void ancientRuins() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("After solving the riddles, the druid grants you passage to the heart of the forest where the "
                + "staff is hidden. Venturing deeper, you come across the ruins of an ancient civilization, guarded "
                + "by magical constructs and filled with traps.");
        g.c1.setText("Navigate the Ruins");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");

        rpg.nL1 = "iceCavern";
    }
    
    public void iceCavern() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("Navigating through the treacherous terrain of the northern mountains, you stumbled upon an "
                + "ice-covered cavern, its entrance obscured by a formidable ice elemental. Channeling the wisdom of "
                + "ancient lore, you found a way to peacefully communicate with the elemental, convincing it to grant "
                + "you passage.\n\n Within the cavern's frozen depths, you uncovered the legendary 'Staff of Northern Winds.' "
                + "As you held the staff, a sense of ancient power and knowledge washed over you, marking the beginning of "
                + "a new chapter in your journey, filled with endless possibilities and discoveries.'");
        player.currentequip.name = "Northern Winds Staff";
        player.currentequip.damage = 12;
        g.wnL.setText(player.currentequip.name);
        g.c1.setText("Journey End");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "NEnding";
    }
    
    public void nEnding() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("With the 'Staff of Northern Winds' in hand, you emerged from the ice cavern, the frigid winds "
                + "whispering tales of your triumph. As you ventured forth from the icy depths, the world seemed to shimmer "
                + "with newfound clarity and purpose. Each step forward carried the weight of ancient knowledge and the "
                + "promise of extraordinary adventures yet to unfold. With the staff's power guiding your path, you "
                + "embarked on a journey brimming with wonder and possibility, ready to unravel the mysteries of the world "
                + "and carve your destiny amidst the winds of change.");
        
        g.c1.setText("Quit Game");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "quit";
    }
    
    public void quit() {
        System.exit(0);
    }
    
    public void east() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        enemy = new Enemies_Werewolf();
        
        g.mtA.setText("In the moonlit forest, amidst ancient trees cloaked in shadow, you and the Curiosity's Conjuror "
                + "encountered a fearsome werewolf. Its eyes gleamed with primal fury, and its howl echoed through the night, "
                + "stirring the very essence of the wilderness. With hearts pounding and magic crackling in the air, you stood "
                + "united against the beast, ready to face whatever challenges the night may bring, for together, your courage "
                + "was boundless, and your resolve unyielding.");
        g.c1.setText("Fight");
        g.c2.setText("Run");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "Fight";
        rpg.nL2 = "run";
    }
    
    public void fight() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText(enemy.name + ": " + enemy.hp + "\n\n" + "What are you going to do?");
        g.c1.setText("Fight");
        g.c2.setText("Run");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "playerAttack";
        rpg.nL2 = "run";
    }
    
    public void playerAttack() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        int playerDmg = new Random().nextInt(player.currentequip.damage);
        
        g.mtA.setText("You attacked the " + enemy.name + " dealing " + playerDmg + " damage");
        
        enemy.hp -= playerDmg;
        
        g.c1.setText("Continue");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        if (enemy.hp > 0) {
            rpg.nL1 = "enemyAttack";
            rpg.nL2 = "";
            rpg.nL3 = "";
            rpg.nL4 = "";
        }
        
        else if (enemy.hp < 1){
            rpg.nL1 = "Win";
            rpg.nL2 = "";
            rpg.nL3 = "";
            rpg.nL4 = "";
        }
    }
    
    public void enemyAttack() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        int enemyDmg = new Random().nextInt(enemy.attack);
        
        player.hp -= enemyDmg;
        
        g.hpnL.setText("" + player.hp);
        
        g.c1.setText("Continue");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        if (player.hp > 0) {
            rpg.nL1 = "Fight";
            rpg.nL2 = "";
            rpg.nL3 = "";
            rpg.nL4 = "";
        }
        
        else if (player.hp < 1){
            rpg.nL1 = "lose";
            rpg.nL2 = "";
            rpg.nL3 = "";
            rpg.nL4 = "";
        } 
    }
    
    public void run() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.c1.setText("Go North");
        g.c2.setText("Go East");
        g.c3.setText("Go South");
        g.c4.setText("Go West");
        
        rpg.nL1 = "N";
        rpg.nL2 = "E";
        rpg.nL3 = "S";
        rpg.nL4 = "W";
    }
    
    public void win() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("Under the moon's gaze, the werewolf succumbs, its fury subdued by your united strength. "
                + "With the threat vanquished, you share a moment of silent triumph. Pressing on, you stumble "
                + "upon hidden path, drawn by the allure of the unknown. As you journey forward, the air hums "
                + "with magic, hinting at the mysteries awaiting amidst the whispering trees and moonlit paths.");
        
        g.c1.setText("Continue");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "WhisperingGrove";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
    public void lose() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("You're dead");
        
        
        g.c1.setText("Quit Game");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "quit";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
    public void WhisperingGrove() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("The hidden path leads you to the Whispering Grove, a place shrouded in legend "
                + "and whispered tales of ancient enchantments");
        g.c1.setText("Journey's End");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "EEnding";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        
    }
    
    public void eEnding() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("As you step further into it's mystical embrace, anticipation fills the air, "
                + "beckoning you and the Curiousity's Conjuror to uncover the untold wonders hidden within "
                + "its depths.");
        
        g.c1.setText("Quit Game");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "quit";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
    public void south() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("While traversing the path, you stumble upon a hidden map promising a journey to the "
                + "mountain's summit. With curiosity piqued, you and the Curiosity's Conjuror set your sights "
                + "on the lofty peak, eager to unlock the mysteries that await amidst the towering heights.");
        g.c1.setText("Continue");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "frostpeak";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
    public void frostPeak() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("At the mountain's base, a sign stood sentinel, bearing the words: \"Frostpeak: Veiled in mystery and "
                + "ancient whispers. \" With the Curiousity's Conjuror by your side, you embarked on the ascent, eager to unravel "
                + "the secrets cloaked within its lofty summit Filled with curiousity, the Conjuror wasted no time and sprang into "
                + "action, beginning the arduous climb up FrostPeak's rugged slopes");
        
        g.c1.setText("Continue");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "frostpeakTop";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
    public void frostpeakTop() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("Atop Frostpeak's summit, amid whispers of ancient magic, you uncovered a forgotten tome filled with powerful "
                + "spells. With the Curiosity's Conjuror beside you, you glimpsed into the depths of arcane mysteries, heralding a "
                + "new era of magical exploration and boundless potential. As the sun dipped low, you embraced the journey ahead, "
                + "eager to wield the secrets of the tome for the greater good.");
        g.c1.setText("Quit Game");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "quit";
        
    }
    
    public void west() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("While trekking across the desolate desert sands, the Curiosity's Conjuror caught a glint of light amidst the shimmering "
                + "heat waves. Intrigued, they deviated from their path, guided by the promise of the unknown. As they approached, the "
                + "glimmering objects unveiled themselves to be a trail of glistening crystals, their radiant sparkle leading deeper into the "
                + "unforgiving expanse. With each step, the Conjuror's curiosity heightened, fueled by the alluring prospect of adventure "
                + "hidden within the desert's harsh embrace.");
        g.c1.setText("Follow along");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "aridWilderness";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
    public void aridWilderness() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("Guided by the mesmerizing trail, the Conjuror ventured further into the arid wilderness, where shifting dunes whispered "
                + "secrets of ancient civilizations lost to time. The air crackled with static energy, charged with the anticipation of "
                + "uncovering long-buried truths. Despite the relentless sun beating down upon them, the Conjuror pressed onward, their "
                + "determination unwavering in the face of adversity. Every gust of wind and glimmer of light seemed to beckon, promising "
                + "revelations waiting to be unearthed.");
        g.c1.setText("Follow along");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "oasis";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
    public void Oasis() {
        rpg.nL1 = "";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
        g.mtA.setText("As the Conjuror followed the winding trail, it led them to an oasis oasis nestled amidst the vast desert expanse. "
                + "At its heart lay a forgotten temple, its weathered stone facade adorned with mysterious hieroglyphs—a testament to a "
                + "bygone era of arcane knowledge. With trembling hands, the Conjuror reached out to touch the ancient symbols, feeling the "
                + "pulse of ancient magic resonating within. In that moment, they realized that this discovery heralded the dawn of a remarkable "
                + "journey, where the secrets of the past would intertwine with the mysteries of the present, guiding them towards their destiny.");
        g.c1.setText("Quit Game");
        g.c2.setText("");
        g.c3.setText("");
        g.c4.setText("");
        
        rpg.nL1 = "quit";
        rpg.nL2 = "";
        rpg.nL3 = "";
        rpg.nL4 = "";
    }
    
}
