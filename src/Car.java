import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"brand", "model", "productionYear"})
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private String plate;
}
