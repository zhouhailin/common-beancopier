package link.thingscloud.common.beancopier.helper;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : zhouhailin
 */
@Data
@Accessors(chain = true)
public class NameValuePair<T> {
    private String name;
    private T value;
}
