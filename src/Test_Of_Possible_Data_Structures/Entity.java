package Test_Of_Possible_Data_Structures;

import java.util.UUID;

public class Entity  implements java.io.Serializable, LoadStore {
    
    // Data considerations:
    // Entity : Self explanitory, all the entities good or bad
    // Item   : All items that the player can carry, sell, wear, fight with.
    //          The entity class will "own" a set of these, indexing them
    //          whenever neccessary to calculate carrying weight, defense points,
    //          damage, etc.
    // Object : Anything that doesn't fit in Item. So things like wagons, horses,
    //          boats, etc. You could generalize this into a base class and two
    //          derived classes, but that's just a pain in the ass for only 4 or 5
    //          overlapping data points
    //
    // Container classes : I think two of these will be needed in total.
    //          One for containing the data for encounters, which itself will
    //          have data about the encounter. The second being campaign data,
    //          which will aggregate the party data, encounters, baddies, items,
    //          etc.

    private UUID entity_id;
    public UUID getID(){
        return entity_id;
    }

    public enum Alignment { LAWFUL_GOOD, LAWFUL_NEUTRAL, LAWFUL_EVIL, NEUTRAL_GOOD, NEUTRAL_NEUTRAL, NEUTRAL_EVIL, CHAOTIC_GOOD, CHAOTIC_NEUTRAL, CHAOTIC_EVIL };
    public enum Class { BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROUGE, SORCERER, WARLOCK, WIZARD };
    public enum Race { DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALF_ORC, HALFING, HUMAN, TIEFLING, AARAKOCRA, GENASI, GOLIATH };
      
    
    // To determine which side the character is on
    private String alliance;
    
    // Pulled from dnd 5e character sheet
    private String name;
    private Class class_;
    private Race race;
    
    private int age;
    private String height;
    private int weight;
    private String eye_color;
    private String skin_color;
    private String hair_color;
    private Alignment alignment;
    
    private int experience_points;
    private int initiative;
    private int speed;
    private int health_points;
    private int max_health_points;
    
    private int proficiency_bonus;
    private int inspiration;
    
    // Strength attribs
    private int strength;
    private int strength_saving_throws;
    private int athletics;
    
    // Dex attribs
    private int dexterity;
    private int dexterity_saving_throws;
    private int acrobatics;
    private int sleight_of_hand;
    private int stealth;
    
    // Constitution attribs
    private int constitution;
    private int constitution_saving_throws;
    
    // Intelligence attribs
    private int intelligence;
    private int intelligence_saving_throws;
    private int arcana;
    private int history;
    private int investigation;
    private int nature;
    private int religion;
    
    // Wisdom attribs
    private int wisdom;
    private int wisdom_saving_throws;
    private int animal_handling;
    private int insight;
    private int medicine;
    private int perception;
    private int survival;
    
    // Charisma attribs
    private int charisma;
    private int charisma_saving_throws;
    private int deception;
    private int intimidation;
    private int performance;
    private int persuasion;
    
    // Extra perception stat
    private int passive_wisdom_perception;
    
    public Entity(){
        
         entity_id = UUID.randomUUID();
        
    }
    
    public Entity(String raw_data){
        // From file data constructor
    }
 
    // Holy hell a lot of getters and setters. These will almost all need
    // to be customized as altering single values affect multiple other
    // values in sometimes complex ways. As well, some values are immutable
    // and shouldn't be changed
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getClass_() {
        return class_;
    }

    private void setClass_(Class class_) {
        this.class_ = class_;
    }

    public Race getRace() {
        return race;
    }

    private void setRace(Race race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    private void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEye_color() {
        return eye_color;
    }

    private void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    private void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }
    
    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    private void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getExperience_points() {
        return experience_points;
    }

    public void setExperience_points(int experience_points_addition) {
        this.experience_points += experience_points_addition;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getProficiency_bonus() {
        return proficiency_bonus;
    }

    public void setProficiency_bonus(int proficiency_bonus) {
        this.proficiency_bonus = proficiency_bonus;
    }

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength_saving_throws() {
        return strength_saving_throws;
    }

    public void setStrength_saving_throws(int strength_saving_throws) {
        this.strength_saving_throws = strength_saving_throws;
    }

    public int getAthletics() {
        return athletics;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDexterity_saving_throws() {
        return dexterity_saving_throws;
    }

    public void setDexterity_saving_throws(int dexterity_saving_throws) {
        this.dexterity_saving_throws = dexterity_saving_throws;
    }

    public int getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    public int getSleight_of_hand() {
        return sleight_of_hand;
    }

    public void setSleight_of_hand(int sleight_of_hand) {
        this.sleight_of_hand = sleight_of_hand;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getConstitution_saving_throws() {
        return constitution_saving_throws;
    }

    public void setConstitution_saving_throws(int constitution_saving_throws) {
        this.constitution_saving_throws = constitution_saving_throws;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence_saving_throws() {
        return intelligence_saving_throws;
    }

    public void setIntelligence_saving_throws(int intelligence_saving_throws) {
        this.intelligence_saving_throws = intelligence_saving_throws;
    }

    public int getArcana() {
        return arcana;
    }

    public void setArcana(int arcana) {
        this.arcana = arcana;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getInvestigation() {
        return investigation;
    }

    public void setInvestigation(int investigation) {
        this.investigation = investigation;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWisdom_saving_throws() {
        return wisdom_saving_throws;
    }

    public void setWisdom_saving_throws(int wisdom_saving_throws) {
        this.wisdom_saving_throws = wisdom_saving_throws;
    }

    public int getAnimal_handling() {
        return animal_handling;
    }

    public void setAnimal_handling(int animal_handling) {
        this.animal_handling = animal_handling;
    }

    public int getInsight() {
        return insight;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getSurvival() {
        return survival;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getCharisma_saving_throws() {
        return charisma_saving_throws;
    }

    public void setCharisma_saving_throws(int charisma_saving_throws) {
        this.charisma_saving_throws = charisma_saving_throws;
    }

    public int getDeception() {
        return deception;
    }

    public void setDeception(int deception) {
        this.deception = deception;
    }

    public int getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(int intimidation) {
        this.intimidation = intimidation;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public int getPassive_wisdom_perception() {
        return passive_wisdom_perception;
    }

    public void setPassive_wisdom_perception(int passive_wisdom_perception) {
        this.passive_wisdom_perception = passive_wisdom_perception;
    }
    

    public String FormatForStorage() {
        
        String output =
                "entity[" + entity_id + "]{\n" +
                "alliance[" + alliance + "]\n" +
                "name[" + name + "]\n" +
                "class_[" + class_ + "]\n" +
                "race[" + race + "]\n" +
                "age[" + age + "]\n" +
                "height[" + height + "]\n" +
                "weight[" + weight + "]\n" +
                "eye_color[" + eye_color + "]\n" +
                "skin_color[" + skin_color + "]\n" +
                "hair_color[" + hair_color + "]\n" +
                "alignment[" + alignment + "]\n" +
                "experience_points[" + experience_points + "]\n" +
                "initiative[" + initiative + "]\n" +
                "speed[" + speed + "]\n" +
                "health_points[" + health_points + "]\n" +
                "max_health_points[" + max_health_points + "]\n" +
                "proficiency_bonus[" + proficiency_bonus + "]\n" +
                "inspiration[" + inspiration + "]\n" +
                "strength[" + strength + "]\n" +
                "strength_saving_throws[" +  strength_saving_throws + "]\n" +
                "athletics[" + athletics + "]\n" +
                "dexterity[" + dexterity + "]\n" +
                "dexterity_saving_throws[" + dexterity_saving_throws + "]\n" +
                "acrobatics[" + acrobatics + "]\n" +
                "sleight_of_hand[" + sleight_of_hand + "]\n" +
                "stealth[" + stealth + "]\n" +
                "constitution[" + constitution + "]\n" +
                "constitution_saving_throws[" + constitution_saving_throws + "]\n" +
                "intelligence[" + intelligence + "]\n" +
                "intelligence_saving_throws[" + intelligence_saving_throws + "]\n" +
                "arcana[" + arcana + "]\n" +
                "history[" + history + "]\n" +
                "investigation[" + investigation + "]\n" +
                "nature[" + nature + "]\n" +
                "religion[" + religion + "]\n" +
                "wisdom[" + wisdom + "]\n" +
                "wisdom_saving_throws[" + wisdom_saving_throws + "]\n" +
                "animal_handling[" + animal_handling + "]\n" +
                "insight[" + insight + "]\n" +
                "medicine[" + medicine + "]\n" +
                "perception[" + perception + "]\n" +
                "survival[" + survival + "]\n" +
                "charisma[" + charisma + "]\n" +
                "charisma_saving_throws[" + charisma_saving_throws + "]\n" +
                "deception[" + deception + "]\n" +
                "intimidation[" + intimidation + "]\n" +
                "performance[" + performance + "]\n" +
                "persuasion[" + persuasion + "]\n" +
                "passive_wisdom_perception[" + passive_wisdom_perception + "]\n" +
                "}";
        
        return output;
    }
    
}
