package Lesson2;


public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    @Override
    public String toString() {
        return "Person{" + "man= " + man + ", name= '" + name + '\'' + ", spouse= '" + spouse.name + '\'' + '}';
    }



    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }


    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    //method checks gender of persons and if they are not husband and wife
    public boolean merry(Person person) {
        if ((this.man != person.man) && (spouse != person)) {
            divorce();
            person.divorce();
            spouse = person;
            person.spouse = this;

            return true;
        } else return false;
    }


    public boolean divorce() {
        if (this.spouse != null) {
            spouse.spouse = null; // set spouse null for h/w
            this.spouse = null;
        }
        return true;
    }

    public static void main(String[] args)   {

        Person gogi = new Person(true, "Gogi");
        Person julia = new Person(false, "Julia");
        Person vlad = new Person(true,"Vlad");
        Person klava = new Person(false,"Klava");

            gogi.merry(julia);
            vlad.merry(klava);


        System.out.println(gogi);
        System.out.println(julia);
        System.out.println(vlad);
        System.out.println(klava);

        
    }
}
