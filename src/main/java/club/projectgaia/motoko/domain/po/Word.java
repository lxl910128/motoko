package club.projectgaia.motoko.domain.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Word {
    @Id
    @Column(length = 64)
    private String name;

    private String value;
}
