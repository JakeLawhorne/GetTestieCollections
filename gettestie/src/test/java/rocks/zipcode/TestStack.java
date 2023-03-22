package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        stack.add("Jill");
        stack.add("Chris");
        stack.add("Leon");
        stack.pop();
        assertEquals((stack.elementAt(1)), stack.peek() );
    }

    @org.junit.Test
    public void TestHashSet(){
        HashSet<String> set = new HashSet<>();
        set.add("Superman");
        set.add("Spiderman");
        set.add("Batman");
        set.add("Wolverine");
        set.add("Captain America");
        set.clear();

        assertEquals(true, set.isEmpty());
    }
    @org.junit.Test
    public void TestHashMap(){
        String[] topChamps = {"Mordekaiser", "Ornn", "Sett"};
        String[] midChamps = {"Annie", "Sylas", "A-Sol"};
        HashMap<String, String[]> champions = new HashMap<>();
        champions.put("Top", topChamps);
        champions.put("Mid", midChamps);

        assertEquals(topChamps, champions.get("Top"));

    }

    @org.junit.Test
    public void TestLinkedList(){
        LinkedList<String> fpsGames = new LinkedList<>();
        fpsGames.add("CallOfDuty");
        fpsGames.add("Battlefield");
        fpsGames.add("EscapeFromTarkov");

        assertEquals("CallOfDuty", fpsGames.getFirst());

    }

    @org.junit.Test
    public void TestArrayDeque(){
        ArrayDeque<String> powerRangers = new ArrayDeque<>();
        powerRangers.add("RedRanger");
        powerRangers.add("BlueRanger");
        powerRangers.add("BlackRanger");
        powerRangers.add("YellowRanger");
        powerRangers.add("PinkRanger");
        powerRangers.add("WhiteRanger");

        String deadRanger = powerRangers.pop();
        assertEquals("RedRanger", deadRanger);

    }

    @org.junit.Test
    public void TestVector(){
        Vector<String> looneyTunes = new Vector<>();
        looneyTunes.ensureCapacity(4);
        looneyTunes.add("Bugs");
        looneyTunes.add("Daffy");
        looneyTunes.add("Taz");
        looneyTunes.add("Foghorn");

        assertEquals(10, looneyTunes.capacity());
        assertEquals(4, looneyTunes.size());


    }

    @org.junit.Test
    public void TestTreeMap(){
        TreeMap<String, String> user = new TreeMap<>();
        user.put("pinataMan", "oogidyboogidy52");
        user.put("lazyWalrus", "passwordsarecool");
        user.put("alphaPotato", "yoyoyo!!!#$");
        user.put("deadlySlob", "slob89FGg1");

        assertEquals("oogidyboogidy52", user.get("pinataMan"));

    }

    @org.junit.Test
    public void TestTreeSet(){
        TreeSet<String> codChars = new TreeSet<>();
        codChars.add("Ghost");
        codChars.add("Price");
        codChars.add("Gaz");
        codChars.add("Soap");

        assertEquals("Ghost",codChars.higher("Gaz"));

    }

    @org.junit.Test
    public void TestIterator(){
        LinkedList<String> people = new LinkedList<>();
        people.add("Bob");
        people.add("Robert");
        people.add("Bobby");
        people.add("Bingbong");
        Object[] peopleArray = new String[people.size()];

        Iterator<String> itr = people.iterator();


        for(int i = 0; i < people.size();){
            if(itr.hasNext()) {
                peopleArray[i] = itr.next();
            }
        }

        assertEquals(peopleArray[0], "Bob");


    }

    @org.junit.Test
    public void TestPriorityQueue(){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(15);
        queue.add(20);
        queue.add(5);
        queue.add(30);

        assertEquals(5, (int)queue.element());
        assertEquals(5, (int)queue.peek());

    }

    @org.junit.Test
    public void TestComparable(){
        List<Person> people;
        people = new ArrayList<>();
        Person jake = new Person("Jake", 1994);
        Person chris = new Person("Chris", 1980);
        Person paul = new Person("Paul", 1970);
        people.add(jake);
        people.add(chris);
        people.add(paul);

        Collections.sort(people);
        people.toString();
        assertEquals(people.get(0).getYearOfBirth(), paul.getYearOfBirth());
    }

    // Make a bigger test exercising more Stack methods.....
}
