package hestia.msPersons.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDTO {

    @NotBlank
    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonImg() {
        return personImg;
    }

    public void setPersonImg(String personImg) {
        this.personImg = personImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank
    @JsonProperty("personImg")
    private String personImg;

    @NotBlank @Email(message = "Email is not falited")
    @JsonProperty("email")
    private String email;

    @NotBlank @Size(min = 6, max = 8)
    @JsonProperty("password")
    private String password;

}