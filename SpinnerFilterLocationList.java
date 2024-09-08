import java.util.ArrayList;

//https://java2blog.com/return-arraylist-java/ 
class Main {
    public static ArrayList<String> provinceMunicipalName() {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("Boac");
        list.add("Mogpog");
        list.add("Sta. Cruz");
        list.add("Torrijos");
        list.add("Buenavista");
        list.add("Gasan");
        return list;
    }
    public static ArrayList<Integer> provinceMunicipalCode() {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(4900);
        list.add(4901);
        list.add(4902);
        list.add(4903);
        list.add(4904);
        list.add(4905);
        return list;
    }
    public static ArrayList<String> municipalBrgy4900() {
        ArrayList<String> list = new ArrayList<String>();
 
        //add all brgy ng Boac 4900
        list.add("Buliasnin");
        return list;
    }
    public static ArrayList<String> municipalBrgy4901() {
        ArrayList<String> list = new ArrayList<String>();
 
        //add all brgy ng Mogpog 4901
        list.add("");
        return list;
    }
    public static ArrayList<String> municipalBrgy4902() {
        ArrayList<String> list = new ArrayList<String>();
 
        //add all brgy ng Sta. Cruz 4902
        list.add("");
        return list;
    }
    public static ArrayList<String> municipalBrgy4903() {
        ArrayList<String> list = new ArrayList<String>();
 
        //add all brgy ng Torrijos 4903
        list.add("");
        return list;
    }
    public static ArrayList<String> municipalBrgy4904() {
        ArrayList<String> list = new ArrayList<String>();
 
        //add all brgy ng Buenavista 4904
        list.add("");
        return list;
    }
    public static ArrayList<String> municipalBrgy4905() {
        ArrayList<String> list = new ArrayList<String>();
 
        //add all brgy ng Gasan 4905
        list.add("");
        return list;
    }
    //copy function structure para sa iba pang mga brgy
    public static ArrayList<String> Brgy4900AddressExtra1() {
        ArrayList<String> list = new ArrayList<String>();
 
        //add all zone purok street ng Boac 4900 Brgy X
        list.add("Zone 1");
        list.add("Zone 2");
        list.add("Zone 3");
        list.add("Zone 4");
        list.add("Zone 5");
        list.add("Zone 6");
        list.add("Zone 7");
        return list;
    }

}
 
