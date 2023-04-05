package ro.unibuc.hello.dto;

import java.util.function.IntFunction;

public class UserDto {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phone;

    
    public UserDto() {
    }

    public UserDto(int id, String name, String email, String address, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = addrss;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String content) {
        this.name = content;
    }
    public String getName() {
        return name;
    }


    public void setEmail(String emailString) {
        this.email = emailString;
    }
    public String getEmail() {
        return email;
    }

    public void setaddress(String addressString) {
        this.address = addressString;
    }
    public String getAddress() {
        return address;
    }

    public void setPhone(String phoneString) {
        this.phone = phoneString;
    }
    public String getPhone() {
        return phone;
    }
}