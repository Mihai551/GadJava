package Tema.Memento;

public class Main {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        //Create a note

        Originator note = new Originator();

        //Edit the note "Edit1"
        note.setState("Edit1");

        //save the note
        caretaker.setMemento(note.save());

        //print the note
        System.out.println(note.getState());

        //edit the note "Edit2"
        note.setState("Edit2");

        //print the note
        System.out.println(note.getState());

        //restore the note (close the note editor without save changes and then open it again)
        note.restore(caretaker.getMemento());

        //print the note
        System.out.println(note.getState());


    }

}
