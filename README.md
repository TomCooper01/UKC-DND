# UKC-DND
Made when Tom and Sam got drunk...
--- at the start of the line means the idea has probably been superceded and should be deleted.

idea for making sections, like a level editor for text games. windows form where you input stuff and it formats it into the desired format. makes for faster section making

run on raptor so people can all connect. 
        depending on the person logging in, you may or may not be able to see the autism stat.
        Rated R value (Allowed to f the courses, but you become more autistic and a knight can appear.
        "STOP! You have violated the law! Pay the court a fine or serve your sentance." leaves you with nothing but your
        boxers in your hands. 

player class: health, stats, inventory, abilities, hunger
        hunger constantly falls as you play, if the game goes online you can have your character
                hibernate while you're offline so you dont lose hunger/health. if you dont the character
                can starve while you're gone.
        stats: endurance, strength, agility, autism, Aholeness, coolness, accuracy, perception, intelligence?
        if name is alex bag, max stats from the start + his laptop
        endurance: no max, increasing increases max hunger, health by set values
        strength: no max, your strength stat decides what percent of a weapons attack stat you actually use.
                str 50: attacks use 50% of the equipped weapons damage. str 150: attakcs use 150% or 1.5* the damage
                increasing has a small chance to increase autism? attacking with certain weapons increases chance?
        agility: max 100, % chance to dodge incoming attacks
        autism: higher level = less map awareness (when moved, move the distance asked plus a random
                integer, proportional to the autism)
                when opening the bag, you randomly lose items, and you take an extra turn to search the bag
                (other poeple dont use a turn)
                increasing autism increases strength
                when the stat goes above a certian threshold, you become a mob and can hurt your teammates
        Aholeness: true/false? might not need to be a player stat so much as a public field
        coolness: same as ahole, or this could be a fashion based stat affected by what you wear and maybe your abilities
        accuracy: percent (?) chance of hitting using projectiles, throwing objects, firearms etc.
        perception: is this an rpg or not? better view of traps, enemy strengths/weaknesses/stats at max perc. 
                possibly more detailed descriptions above a perc threshold?
        intelience?:
        inventory: collect bags, decides inventory size/weight capacity, also stats affect this.
        
        
it matters what you kill mobs with, depending on what you use different stats increase
        ability Balls Tingle: 
        inner monologue to start: "Shit! I'm late for my lecture". can wonder to get a hint on next step.
            this is like a tutorial. it babysits you till you get to the main campus, then the game opens up
            like every good rpg.
        

connected players class:

mob class: drop all items
        boolean value isBoss
        mobs can only spawn in certain places (cant move)
        lecturer timed boss (disappeares at the end of the hour, "Poof! He went on strike. See him next week :D"
        once all bosses are beaten, headmaster (dean) appears.

mob list class:

nps class: npc gives out quest, they also hold the reward so you can kill them if you want

quests: randomly generated, complete task and we'll give you x (given out by npc)
        depending on time of day, 

map: canterbury campus (including parkwood). 
        each building/area can have different mobs, and a boss
        raid houses for loot
        rutherford/eliot is the prison: area boss prison warden (rutherford warden/secret boss is James, surrounded by empty wok bowls, mobs are brain-dead prisoners and wok bar workers.
     ---every section of map is 100x100. (coordanites)
     ---whole map is based on coords, each section has coords too
        scenario seperate to driver. we could have folders for areas, so you start at the root of the scenario folder, and each direction takes you down a seperate subfolder. in each subfolder there is a file that must be called into the driver. probably call this the same thing in each folder so the game can grab it.
        this may not work if this is going to be more open world ish. if theres crossing pathways/multiple ways to get somewhere we might have to only use this idea for little areas of the game, for instance if main campuss is 1 section have that on the same level as the path to parkwood, and below it is subfolders for each building on the main campus

UKCDnD/items
      /East(1? we would have to keep track of the layer)
      /west
      /Scenario.json

items: all item objects are stored in an array list
        bobs cool tophat: if while you wear it you speak to a ben, they turn into a bob and gain powerlevel
        alex's laptop: causes confusion on everyone. including himself
        the lecturer microphone: can use it as a weapon but will fail 50% of the time
        sds: potato with some wires: can be crafted and used as projectiles
        frazier's hat: useless but really cool.
        thomas' cigerettes: gives the ability to code when under stress.
        humphreys gun: shh no one knows its here (it doesnt exist) (perpetual quest asks you to find the gun but you cant cause its not an item)
        james' wok bowl: if thomas comes into contact, dies of spice poisoning. if equiped you randomly hit walls (move random)
        The Emachine 1000: god tier weapon. 1 hit kills any enemy but falls apart unless ubuntu is equiped alongside
        Ryans taxi: depending on autism stats, it may transport you across the map for free. CAUTION it may be jimmy.
        john's car bumper: can be used without fear of autism but the enemy contracts autism (+100) when hit. 
            no bag can hold this item, unless you are john, then you dont need a bag. can dig a hole to hide itself
        connor's tuna pasta bake: smells funny. give +10% max Health
