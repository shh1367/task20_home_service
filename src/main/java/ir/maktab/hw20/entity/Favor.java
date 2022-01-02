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
    private Long favorId;
    @Column
    private String favorName;
    @Column
    private String favorCategory;
    @Column
    private Long  favorBasePrice;
    @Column
    private String favorDescription;




}
