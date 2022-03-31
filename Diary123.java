import java.io.InvalidClassException;
import java.util.*;

class initializ {
    int pass, option;
    int month, day;
    String place;
    float time;

    ArrayList<Integer> dayarr = new ArrayList<>();
    ArrayList<Integer> monarr = new ArrayList<>();
    ArrayList<Float> timearr = new ArrayList<>();
    ArrayList<String> placearr = new ArrayList<>();
}

class accept_password extends initializ {

    public void main() {
        Scanner spass = new Scanner(System.in);

        System.out.print("enter the password to open the diary : ");
        pass = spass.nextInt();

        if (pass != 4400) {
            System.out.println("\npassword is wrong ..!\nplease enter the right password ..!");
        } else {

            do {
                System.out.println("***************************************************");

                System.out.println("\nfor enter an event          (1)");
                System.out.println("for check an event          (2)");
                System.out.println("for delete an event         (3)");
                System.out.println("for delete all event        (4)");
                System.out.println(" exit (5)");
                System.out.print("enter your choice : ");

                option = spass.nextInt();
                System.out.println("***************************************************");

                switch (option) {
                    case 1:
                        add_event();
                        break;

                    case 2:
                        check_event();
                        break;

                    case 3:
                        remove_event();
                        break;

                    case 4:
                        removeAll_event();
                        break;

                    case 5:
                        System.out.println("exit successfull ..!");

                    default:
                        System.out.println("\nyou entered wrong choice ..!");
                }
            } while (option != 5);

        }

    }

    public void add_event() {
        Scanner event = new Scanner(System.in);

        System.out.println("***************************************************");

        System.out.print("\nenter the day : ");
        day = event.nextInt();
        dayarr.add(day);

        System.out.print("\nenter the month : ");
        month = event.nextInt();
        monarr.add(month);

        System.out.print("\nenter the time : ");
        time = event.nextFloat();
        timearr.add(time);

        System.out.print("\nenter the place :");
        place = event.next();
        placearr.add(place);

        System.out.println("\nevent added successfully ..!");

        System.out.println("***************************************************");

    }

    public void check_event() {

        System.out.println("***************************************************");
        System.out.println("day : " + dayarr);
        System.out.println("month : " + monarr);
        System.out.println("time : " + timearr);
        System.out.println("place : " + placearr);

        System.out.println("***************************************************");
    }

    public void remove_event() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nenter the index number of event : ");
        int index = sc.nextInt();

        dayarr.remove(index);
        monarr.remove(index);
        timearr.remove(index);
        placearr.remove(index);

        System.out.println("***************************************************");
        System.out.println("\nevent removed successfully ..!");
        System.out.println("***************************************************");
    }

    public void removeAll_event() {
        dayarr.removeAll(dayarr);
        monarr.removeAll(monarr);
        placearr.removeAll(placearr);
        timearr.removeAll(timearr);
        System.out.println("***************************************************");

        System.out.println("\nall event deleted successfully ..!");

        System.out.println("***************************************************");
    }

}

public class Diary123 {
    public static void main(String[] args) {
        accept_password ob = new accept_password();
        ob.main();
    }
}
