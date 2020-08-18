package live.chanakancloud.chanasite;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class Contact {
    public String FirstName;
    public String LastName;
    public String Email;
    public String ContactReason;
    public String Message;
}
