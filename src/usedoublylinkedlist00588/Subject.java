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
public class Subject {
    private int subjectCode;
    private String subjectDescription;

    public Subject(int subjectCode, String subjectDescription){
        this.subjectCode = subjectCode;
        this.subjectDescription = subjectDescription;
    }
    
    public int getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }
    
    
}
