package SOLID_PRINCIPLES.singleResponsibilty;    // Each class should perform only one responsibility.

// this class holds data of class,prints and displays as well
//does not obey Single Responsibility Principle


public class Note {
     private String text;

     public Note(String text) {
         this.text = text;
     }

     public String getText() {            //1st responsibility
         return text;
     }

     public void printNote() {
         System.out.println("Note: " + text);  //2nd responsibility
     }

    public static void main(String[] args){
        Note n = new Note("Report to School");
        n.printNote();
    }
}



