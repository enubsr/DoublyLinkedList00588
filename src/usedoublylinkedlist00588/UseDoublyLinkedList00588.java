/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usedoublylinkedlist00588;

/**
 *
 * @author Enubs
 */
public class UseDoublyLinkedList00588 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        DList<String> stringsList = new DList<>();
//        stringsList.addFirst("[middle node]");//[middle node]
//        stringsList.addFirst("[first node]");//[first node][middle node]
//        stringsList.addLast("[last node]");//[first node][middle node][last node]
//        
//        System.out.print(stringsList.first());
//        System.out.print(stringsList.last());
//        
//        stringsList.removeLast();
//        System.out.print("\n" + stringsList.last());//[middle node]

          Subject cc104 = new Subject(588, "Data Structures and Algorithms");
          Subject ipt101 = new Subject(233, "Integrative Programming and Technologies");
          Subject adv103 = new Subject(465, "Android and Web Technologies");
          
          DList<Subject> subjectsList = new DList<>();
          subjectsList.addFirst(cc104);
          subjectsList.addFirst(ipt101);//[233][588]
          subjectsList.addLast(adv103);//[233][588][465]
          subjectsList.removeLast();//[233][588]
          
          System.out.print(subjectsList.last().getSubjectCode());
    }
    
}
