import java.util.Date;

import static ui.UIMenu.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Guido Juliano", "doctor@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        System.out.println(myDoctor);
//        for (Doctor.AvailableAppointment a : myDoctor.getAvailableAppointments()) {
//            System.out.println(a.getDate() + " " + a.getTime());
//        }

        Patient patient = new Patient("Juliano", "juliano@mail.com");

        System.out.println(patient);

    }


}