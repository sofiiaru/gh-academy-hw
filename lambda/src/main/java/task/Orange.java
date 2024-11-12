package task;

import lombok.*;

@Data
@AllArgsConstructor
@Builder//generates an AllArgsConstructor unless there is anotehr constructor
public class Orange {
    private int weight;
    private Color color;

}
