/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab1;

/**
 *
 * @author shoaib
 */
public class lab1 {
    
    private String Fname;
    private String Sname;
    private String Pnum; 
    private String Email;
    private String Address;

    
//    public lab1(String Fname, String Sname, String Pnum, String email) {
//        Fname = new String();
//        Sname = new String();
//        Pnum = new String();
//        email = new String();
//        
//    }
    
    public lab1(String Fname, String Sname, String Pnum, String email, String Address) {
        this.Fname = Fname;
        this.Sname = Sname;
        this.Pnum = Pnum;
        this.Email = email;
        this.Address = Address;
        
    }

    public lab1() {
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getPnum() {
        return Pnum;
    }

    public void setPnum(String Pnum) {
        this.Pnum = Pnum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

   
       
    
}//end of class
