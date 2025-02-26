package FabioGilardi.U5W1D1.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pizza {
    private String nome;
    private List<Condimento> condimentoList;
    private int calorie;
    private double prezzo;
}
