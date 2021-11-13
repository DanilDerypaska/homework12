package persons;

public class Solution {

    public static void main(String[] args) {


        Elf elfOne = new Elf( "elf one", 35, 90, "man", 110);
        Elf elfTwo = new Elf( "elf two", 50, 110, "woman", 200);

        ElfArcher elfArcherOne = new ElfArcher( "elf archer one",30,210, "man", 50);
        ElfArcher elfArcherTwo = new ElfArcher( "elf archer two",45,230, "woman", 70);
        ElfArcher elfArcherThree = new ElfArcher( "elf archer three",60,220, "woman", 90);

        ElfSwordMan swordManOne = new ElfSwordMan("elf sword man one", 10, 30, "man", 200);
        ElfSwordMan swordManTwo = new ElfSwordMan("elf sword man two", 10, 30, "woman", 40);
        ElfSwordMan swordManThree = new ElfSwordMan("elf sword man three", 10, 30, "man", 34);
        ElfSwordMan swordManFour = new ElfSwordMan("elf sword man four", 10, 30, "man", 35);
        ElfSwordMan swordManFive = new ElfSwordMan("elf sword man five", 10, 30, "woman", 67);

        Gnome gnomeOne = new Gnome("gnome one", 32, 100, "man", 50);
        Gnome gnomeTwo = new Gnome("gnome two", 20, 95, "man", 61);
        Gnome gnomeThree = new Gnome("gnome three", 70, 97, "woman", 93);

        Solution solution = new Solution();

        solution.greetings(elfOne,elfTwo,elfArcherOne,elfArcherTwo,elfArcherThree,swordManOne,swordManTwo,swordManThree,swordManFour,swordManFive);
        System.out.println("\n\n");

        solution.toRun(elfOne,elfTwo,gnomeOne,gnomeTwo,gnomeThree,swordManFive,swordManFour,swordManThree,swordManTwo,swordManOne,elfArcherOne,elfArcherTwo,elfArcherThree);
        solution.toEat(elfOne,elfTwo,gnomeOne,gnomeTwo,gnomeThree,swordManFive,swordManFour,swordManThree,swordManTwo,swordManOne,elfArcherOne,elfArcherTwo,elfArcherThree);

        System.out.println("\n\n");
        solution.toAttack(elfOne,elfTwo,gnomeOne,gnomeTwo,gnomeThree,swordManFive,swordManFour,swordManThree,swordManTwo,swordManOne,elfArcherOne,elfArcherTwo,elfArcherThree);
        System.out.println("\n\n");
        solution.toDefence(elfOne,elfTwo,gnomeOne,gnomeTwo,gnomeThree,swordManFive,swordManFour,swordManThree,swordManTwo,swordManOne,elfArcherOne,elfArcherTwo,elfArcherThree);

        System.out.println("\nHomework 12:\n");

        solution.toPosible(elfOne,elfTwo,gnomeOne,gnomeTwo,gnomeThree,swordManFive,swordManFour,swordManThree,swordManTwo,swordManOne,elfArcherOne,elfArcherTwo,elfArcherThree);
        System.out.println("\t\t");
        solution.toPossibilities(elfArcherOne,elfArcherTwo,elfArcherThree,gnomeOne,gnomeTwo,gnomeThree);
        System.out.println("\t");
        solution.toJump(gnomeOne,gnomeTwo,gnomeThree,elfArcherOne,elfArcherTwo,elfArcherThree);
        System.out.println("\t");
        solution.toSpeedRun(elfOne,elfTwo,swordManFive,swordManFour,swordManThree,swordManTwo,swordManOne,elfArcherOne,elfArcherTwo,elfArcherThree,gnomeOne,gnomeTwo,gnomeThree);



    }

    private void toRun(Runable...runables) {
        for (Runable runable: runables            ) {
            runable.run();
        }
    }

    private void toEat(Eatable...eatables) {
        for (Eatable eatable: eatables            ) {
            eatable.eat();

        }
    }

    private void toAttack(Warrior...warriors) {
        for (Warrior warrior:warriors            ) {
            warrior.attack();

        }
    }

    private void toDefence(Warrior...warriors) {
        for (Warrior warrior:warriors            ) {
            warrior.defence();
        }
    }

    private void greetings(Elf... elves) {

        for (Elf elf : elves) {
            elf.greetings();
        }
    }

    private void toPosible(Possibilitable...possibilitables) {
        for (Possibilitable possibilitable: possibilitables           ) {
            possibilitable.jump();
            possibilitable.speedRun();
        }
    }
    private void toPossibilities(Possibilitable...possibilitables) {
        for (Possibilitable possibilitable: possibilitables           ) {
            possibilitable.jump();
            System.out.println("attacks!");
            possibilitable.speedRun();
            System.out.println("attacks!");
        }
    }
    private void toJump(Possibilitable...possibilitables) {
        for (Possibilitable possibilitable: possibilitables           ) {
            possibilitable.jump();
        }
    }

    private void toSpeedRun(Possibilitable...possibilitables) {
        for (Possibilitable possibilitable: possibilitables           ) {
            possibilitable.speedRun();
        }
    }

}
