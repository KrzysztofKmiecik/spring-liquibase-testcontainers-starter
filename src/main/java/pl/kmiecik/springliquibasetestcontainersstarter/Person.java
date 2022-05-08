package pl.kmiecik.springliquibasetestcontainersstarter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Person {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
