package ir.maktab.hw20.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Favor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceId;
    @Column
    private String serviceName;
    @Column
    private String ServiceCategory;

}
