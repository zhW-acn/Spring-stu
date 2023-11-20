import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @Author: acn
 * @Date: 2023/11/20/21:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Long id;
    String name;
    String pass;
}
