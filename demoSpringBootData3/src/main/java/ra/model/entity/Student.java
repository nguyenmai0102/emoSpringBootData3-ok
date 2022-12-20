package ra.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StuentId")
    private int studentId;
    @Column(name = "StudentName", columnDefinition = "nvarchar(50)", nullable = false, unique = true)
    private String studentName;
    @Column(name = "Age")
    private int age;
    @Column(name = "BirthDate")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;
    @Column(name = "StudentStatus")
    private boolean StudentStatus;

}
