package com.example.uworthy;

public class savedata {
   public String dob ;

    public savedata(String id, String name, String emailid, String mobileno, String clnicaddress, String gender, String dob, String useername, String password, String usertype, String tempImageName, String toString) {
        this.id=id;
        this.name=name;
        this.mobileno=mobileno;
        this.emailid=emailid;
        this.gender=gender;
        this.dob=dob;
        this.healthcenter=healthcenter;
        this.clnicaddress=clnicaddress;
        this.useername=useername;
        this.password=password;
        this.usertype=usertype;
        this.imageName=tempImageName;
        this.imageURL=toString;


    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String name;
    public String mobileno;
    public String emailid;
    public String gender;
    public String healthcenter;
    public String clnicaddress;
    public String useername;
    public String password;
    public String usertype;
    public String imageName;


    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String imageURL;



    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHealthcenter() {
        return healthcenter;
    }

    public void setHealthcenter(String healthcenter) {
        this.healthcenter = healthcenter;
    }

    public String getClnicaddress() {
        return clnicaddress;
    }

    public void setClnicaddress(String clnicaddress) {
        this.clnicaddress = clnicaddress;
    }

    public String getUseername() {
        return useername;
    }

    public void setUseername(String useername) {
        this.useername = useername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }


}
