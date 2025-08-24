package net.java.College.Admission.Management.System.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "email_id")
    private String email;

    @Column(name = "student_marks")
    private Double marks;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Application application;
}
