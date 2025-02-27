package Linkedlist;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
public class Linkedlist.Main {
    public static void Main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}*/

public class Main{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertfirst(8);
        list.insertfirst(12);
        list.insertfirst(17);
        list.insertfirst(6);
        list.insertlast(99);
        list.display();
    }
}
