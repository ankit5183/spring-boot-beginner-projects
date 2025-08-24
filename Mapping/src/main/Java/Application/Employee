import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}
