import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deptName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Employee> employees;

    public Long getId() { 
    return id; 
   }
    public void setId(Long id) { 
    this.id = id;
    }
    public String getDeptName() { 
    return deptName; 
}
    public void setDeptName(String deptName) { 
       this.deptName = deptName;
}
    public List<Employee> getEmployees() { 
    return employees; 
}
    public void setEmployees(List<Employee> employees) { 
    this.employees = employees; 
  }
}

