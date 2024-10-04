package NgSign.src.main.java.com.testTechnique.NgSign.Model;

import java.io.Serializable;
@Entity
public class user implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;

    private String email;
    private String JobTitle;
    private String ImageUrl;
    @Column(nullable = false,updatable = false)
    private String employeeCode;
}



